package de.thm.ecore.mddgenerator.generator

import java.io.ByteArrayInputStream
import java.io.InputStream
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import de.thm.ecore.mddgenerator.util.ImportStatementFinder
import de.thm.ecore.mddgenerator.util.JavaFormatter
import de.thm.ecore.mddgenerator.util.XmlFormatter
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EcorePackage
import mymetamodel.PersistenceConfig

/**
 * The generator for ecore files.
 * 
 * @author Marco Richter
 */
class MDDGenerator {
	
	/**
	 * The path where to generate the Java files.
	 */
	public static final String SOURCE_FOLDER_PATH = "src-gen/";
	
	/**
	 * The base package name.
	 */
	public static final String PACKAGE = "de.thm.mdd.testapp.";
	
	public static final String PACKAGE_PATH = "/" + PACKAGE.replaceAll("\\.", "/");
	
	public static final String COMPLETE_PATH = SOURCE_FOLDER_PATH + PACKAGE_PATH;
	
	// Ecore
	public static final String EXTENDED_META_DATA = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
	public static final String MAX_INCLUSIVE = "maxInclusive";
	public static final String MIN_INCLUSIVE = "minInclusive";
	
	var ImportStatementFinder importFinder = new ImportStatementFinder()
	
	var Resource resMymetamodelFile
	
	/**
	 * Creates a file (containing the content-CharSequence) within the given IFolder.
	 */
	def void createFile(IFolder folder, String fileName, boolean overrideFile, CharSequence content, IProgressMonitor progressMonitor) {
		if (progressMonitor.canceled) {
			throw new RuntimeException("Progress canceled");
		}
		if (!folder.exists()) {
			folder.create(true, true, null);
   		}
   		var IFile iFile = folder.getFile(fileName);
   		//TODO, nur in der Testphase
		if (iFile.exists &&  true/*overrideFile*/) {
			iFile.delete(true, null);
		}	
		if (!iFile.exists) {
			// process the code
			var String formattedCode
			if (fileName.endsWith(".java")) {
				// organize imports
				var String sourceWithImports = importFinder.getWithImports(content.toString);
				// format the code
				formattedCode = JavaFormatter.format(sourceWithImports);
			} else if (fileName.endsWith(".xml")) {
				// format the code
				formattedCode = XmlFormatter.format(content.toString)
			}
			
	    	var byte[] bytes
	    	if (formattedCode !== null) { // has the code been formatted?
	    		bytes = formattedCode.getBytes();
	    	} else { // code could not be formatted
	    		bytes = content.toString.bytes;
	    		System.err.println("File " + fileName + " could not be formatted.")
	    	}
	    	// save the file
	    	var InputStream source = new ByteArrayInputStream(bytes);
			iFile.create(source, true, null);		
		}
	}
	
	/**
	 * Starts the generation of the given Resource file in the given IProject.
	 */
	def void doGenerate(Resource resourceEcore, Resource resMymetamodelFile, IProject project, IProgressMonitor progressMonitor) {
		try {
			this.resMymetamodelFile = resMymetamodelFile;
			// begin the task with the amount of work
			progressMonitor.beginTask("Generating Java code", 2);
			
			progressMonitor.subTask("Creating folders");
			
			// create deeper folders
			var IFolder folder =  project.getFolder(SOURCE_FOLDER_PATH + "de");
			if (!folder.exists()) {
	   			folder.create(true, true, null);
	   		}
	   		folder = project.getFolder(SOURCE_FOLDER_PATH + "/de/thm");
	   		if (!folder.exists()) {
	   			folder.create(true, true, null);
			}
			folder = project.getFolder(SOURCE_FOLDER_PATH + "/de/thm/mdd");
	   		if (!folder.exists()) {
	   			folder.create(true, true, null);
			}
	   		folder = project.getFolder(SOURCE_FOLDER_PATH + "/de/thm/mdd/testapp");
	   		if (!folder.exists()) {
	   			folder.create(true, true, null);	
	   		}
	   		// create entity package folder
	   		folder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "entities");
	   		if (!folder.exists()) {
	   			folder.create(true, true, null);
	   		}  
	   		makeProgressAndCheckCanceled(progressMonitor);
	   		
	   		/*
	   		 * We start to generate the classes for our application. First we create the *Gen classes, then die classes which extends the *Gen classes, in which the
	   		 * user can to customizations.
	   		 */ 			 
			
			// create Entities
			var IFolder entityFolder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "entities");
			progressMonitor.subTask("Generating Entities");
			for (EClass e : resourceEcore.allContents.toIterable.filter(typeof(EClass))) {
				// create EntityGen
				var CharSequence content = compileEntitiesGen(e);	
				createFile(entityFolder, e.name + "Gen.java", true, content, progressMonitor);	
				
				// create Entity
				content = compileEntities(e)
				createFile(entityFolder, e.name + ".java", false, content, progressMonitor);	
			}
			makeProgressAndCheckCanceled(progressMonitor);
			
			createFile(project.getFolder("/META-INF"), "persistence.xml", true, compilePersistenceXML(resourceEcore), progressMonitor);	
			createFile(project.getFolder("/html-gen"), "Freizeitpark.html", true, compileFreizeitparkHMTL, progressMonitor);	
			
			// finish the progress monitor
			progressMonitor.done;
		
		} catch (Exception ex) {
			ex.printStackTrace;
		}
	}
	
	def void makeProgressAndCheckCanceled(IProgressMonitor monitor) {
		monitor.worked(1);
		if (monitor.canceled) {
			throw new RuntimeException("Progress canceled");
		}
	}
	
	def compileEntitiesGen(EClass e) {
		'''
			package �PACKAGE�entities;
			
			/**
			* This is the {@link �e.name�} entity class.
			*
			*@generated
			*/
			public class �e.name�Gen �IF !e.EAllSuperTypes.empty� extends �e.EAllSuperTypes.head.name� �ENDIF� {
			
				// attributes
				�FOR a : e.EAllAttributes�
					private �a.EType.instanceTypeName� �a.name�;
				�ENDFOR�
				
				// references
				�FOR a : e.EAllReferences.filter[!many]�
					private �a.EReferenceType.name� �a.name�;
				�ENDFOR�
				�FOR a : e.EAllReferences.filter[many]�
					private java.util.ArrayList<�a.EReferenceType.name�> �a.name�;
				�ENDFOR�
				
				/**
				* Default constructor.
				*/
				public �e.name�Gen() {
				}
				
				�IF !e.EAllAttributes.empty�
					/**
					* Constructor for all attributes.
					*/
					public �e.name�Gen(�FOR a : e.EAllAttributes SEPARATOR ', '� �a.EType.instanceTypeName� �a.name� �ENDFOR�) {
						�FOR a : e.EAllAttributes�
							this.�a.name� = �a.name�;
						�ENDFOR�
					}
				�ENDIF�
				
				�IF !e.EAllAttributes.empty && !e.EAllReferences.empty�
					/**
					* Full constructor.
					*/
					public �e.name�Gen(
					�FOR a : e.EAllAttributes SEPARATOR ', '� �a.EType.instanceTypeName� �a.name� �ENDFOR� 
					�FOR a : e.EAllReferences.filter[!many] BEFORE ', ' SEPARATOR ', '� �a.EReferenceType.name� �a.name� �ENDFOR�
					�FOR a : e.EAllReferences.filter[many] BEFORE ', ' SEPARATOR ', '� java.util.ArrayList<�a.EReferenceType.name�> �a.name� �ENDFOR�) {
					�FOR a : e.EAllAttributes + e.EAllReferences�
						this.�a.name� = �a.name�;
					�ENDFOR�
					}
				�ENDIF�
				
				//TODO getter setter
				
				@Override
				public String toString() {
					�IF e.EAllAttributes.exists[string]�
						StringBuilder builder = new StringBuilder();
						�FOR a : e.EAllAttributes.filter[string]�
							builder.append(�a.name�);
							builder.append(" - ");
						�ENDFOR�
						return builder.toString();
					�ELSE�
						return null; //TODO
					�ENDIF�
				}
			
			}
		'''
	}
	
	def compileEntities(EClass e) {
		'''
			package �PACKAGE�entities;
			
			public class �e.name� extends �e.name�Gen {
				
			}
		'''
	}
	
	def compilePersistenceXML(Resource r) {
		'''
			<?xml version="1.0" encoding="UTF-8"?><persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence" version="2.1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence       http://www.oracle.com/webfolder/technetwork/jsc/xml/ns/persistence/persistence_2_1.xsd">
			
			<persistence>

				<!-- main unit -->
				<persistence-unit name="mainunit" transaction-type="RESOURCE_LOCAL">
					<provider>
						org.eclipse.persistence.jpa.PersistenceProvider
					</provider>
			
					<!-- entities -->
					�FOR e : r.allContents.toIterable.filter(typeof(EClass))�
						<class>�PACKAGE�entities.�e.name�</class>
					�ENDFOR�
					
					<properties>
						<!-- SQL print on console -->
						<!--<property name="eclipselink.logging.level.sql" value="FINEST"/> <property 
							name="eclipselink.logging.parameters" value="true"/> -->
			
						<property name="eclipselink.weaving" value="static"/>
						<property name="javax.persistence.lock.timeout" value="5000"/>
						<property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>
						<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/�getDBScheme�"/>
						<property name="javax.persistence.jdbc.user" value="�jdbcUserName�"/>
						<property name="javax.persistence.jdbc.password" value=""/>
						<property name="eclipselink.cache.shared.default" value="false"/>
						<!-- <property name="eclipselink.ddl-generation" value="create-tables"/>
						<property name="eclipselink.ddl-generation.output-mode" value="database"/> -->
					</properties>
				</persistence-unit>
			
			</persistence>
		'''
	}
	
	def getDBScheme() {
		var persistenceConfig = resMymetamodelFile.allContents.toIterable.filter(typeof(PersistenceConfig)).head
		if (persistenceConfig !== null) {
			return persistenceConfig.dbscheme
		}
		return "default_scheme"
	}
	
	def getJdbcUserName() {
		var persistenceConfig = resMymetamodelFile.allContents.toIterable.filter(typeof(PersistenceConfig)).head
		if (persistenceConfig !== null) {
			return persistenceConfig.jdbcUserName
		}
		return "root"
	}
	
	def compileFreizeitparkHMTL() {
		'''
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
  </head>
  <body>       
  	<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
    	<a class="navbar-brand" href="#">Freizeitpark</a>      
	</nav>

	<div style="margin-top: 70px" class="container">
		�generateThemenwelt(1)�
	</div>               
  
  
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
  </body>
</html>
		'''
	}
	
	def generateThemenwelt(int count) {
		'''
			�FOR i : (1..count).toList�
					<div class="accordion" id="accordionExample">
			  			
			            <div class="card">
			    			<div class="card-header" id="headingOne">
			      				<h2 class="mb-0">
			        				<button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
			          					Themenwelt 1
			        				</button>
			      				</h2>
			    			</div>
			
			    			<div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
			      				<div class="card-body">
			                    	
			                        <div class="accordion" id="accordionThemenwelt">
			                           	
			                           	<div class="card">
			                        		<div class="card-header" id="attraktionenOne">
			                            		<h3 class="mb-0">
			                                		<button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#attraktionenCollapsedOne" aria-expanded="true" aria-controls="attraktionenCollapsedOne"> Attraktionen </button>
			                                	</h3>
			                            	</div>
			                        	</div>
			                        
			                        	<div id="attraktionenCollapsedOne" class="collapse show" aria-labelledby="attraktionenOne" data-parent="#accordionThemenwelt">                        
			                        		<div class="card-body">
			                        			
			                        			<div class="row">
			                        				�generateAttraktionen(3)�			                        				                    				                        				   			                      			                      
			                        			</div>
			                        		</div>                        
			                        	</div>
			                        	
										<div class="card">
			                        		<div class="card-header" id="verkaufOne">
			                            		<h3 class="mb-0">
			                                		<button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#verkaufCollapsedOne" aria-expanded="true" aria-controls="verkaufCollapsedOne"> Verk�ufe </button>
			                                	</h3>
			                            	</div>
			                        	</div>
			                        
			                        	<div id="verkaufCollapsedOne" class="collapse" aria-labelledby="verkaufOne" data-parent="#accordionThemenwelt">                        
			                        		<div class="card-body">
			                        			Verkauf test
			                        		</div>                        
			                        	</div>   
			                        	
										<div class="card">
			                        		<div class="card-header" id="uebernachtungOne">
			                            		<h3 class="mb-0">
			                                		<button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#uebernachtungCollapsedOne" aria-expanded="true" aria-controls="uebernachtungCollapsedOne"> �bernachtung </button>
			                                	</h3>
			                            	</div>
			                        	</div>
			                        
			                        	<div id="uebernachtungCollapsedOne" class="collapse" aria-labelledby="uebernachtungOne" data-parent="#accordionThemenwelt">                        
			                        		<div class="card-body">
			                        			�bernachtung test
			                        		</div>                        
			                        	</div>                           	                     	
			                        </div>                                            
			                        
			                    </div>
			    			</div>
			  			</div>
			            
			    	</div>
			�ENDFOR�
		'''
	}
	
	def generateAttraktionen(int count) {
		'''
		�FOR i : (1..count).toList�
		<div class="col-sm">
			<div class="card" style="width: 18rem;">
				<img src="https://img.welt.de/img/vermischtes/mobile115834903/2842500137-ci102l-w1024/zgbdc5-5prhz8vjj8oyiv9b13b-original-jpg.jpg" class="card-img-top" alt="Achterbahn"/>
				<div class="card-body">
					<h5 class="card-title">Achterbahn 1</h5>
					<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
				</div>
				<ul class="list-group list-group-flush">
					<li class="list-group-item">Dauer</li>
					<li class="list-group-item">Anzahl Pl�tze</li>
					<li class="list-group-item">Vestibulum at eros</li>
				</ul>
				<div class="card-body">
					<a href="#" class="card-link">Card link</a>
					<a href="#" class="card-link">Another link</a>
				</div>
			</div>                          					
		</div>			
		�ENDFOR�
		'''
	}
	
	def isString(EAttribute a) {
		a.EAttributeType.classifierID == EcorePackage.ESTRING
	}
	
}