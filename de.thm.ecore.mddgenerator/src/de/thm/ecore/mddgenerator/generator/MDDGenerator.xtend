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
import FreizeitparkModel.Freizeitpark
import FreizeitparkModel.AllgemeineInformationen
import FreizeitparkModel.Themenwelt
import FreizeitparkModel.Fahrgesch�ft
import FreizeitparkModel.Gastronomie
import FreizeitparkModel.Restaurant
import FreizeitparkModel.Hotel
import FreizeitparkModel.Imbiss
import FreizeitparkModel.Gesch�ft
import FreizeitparkModel.Eintrittskarte
import FreizeitparkModel.Design

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
			
				<!-- main unit -->
				<persistence-unit name="mainunit" transaction-type="RESOURCE_LOCAL">
					<provider>
						org.eclipse.persistence.jpa.PersistenceProvider
					</provider>
			
					<!-- entities -->
					�FOR e : resMymetamodelFile.allContents.toIterable�
						<class>�e.class�</class>
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
	//style="color: green!important;"
	//style="background-color: red!important;"
	def compileFreizeitparkHMTL() {
		'''
		�var design = resMymetamodelFile.allContents.toIterable.filter(typeof(Design)).head�
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
  </head>
  <body �IF design !== null && design.farbe4 !== null� style="background-color: �design.farbe4�!important;" �ENDIF�>       

	<header>
	  <div class="collapse bg-dark" id="navbarHeader"  �IF design !== null && design.farbe1 !== null� style="background-color: �design.farbe1�!important;" �ENDIF�>
	    <div class="container">
	      <div class="row">
	        <div class="col-sm-8 col-md-7 py-4">
	          <h4 class="text-white"�IF design !== null && design.titelFarbe1 !== null� style="color: �design.titelFarbe1�!important;" �ENDIF� >About</h4>
	          <p class="text-muted"�IF design !== null && design.textFarbe1 !== null� style="color: �design.textFarbe1�!important;" �ENDIF�>Diese Anwendung soll Ihnen einen einmaligen �berblick �ber unseren Park geben. Alle Facts auf einen Blick. Z�gern sie also nicht l�nger und lassen sie sich �berzeugen. Wir freuen uns auf sie!</p>
	        </div>
	        <div class="col-sm-4 offset-md-1 py-4">
	          <h4 class="text-white" �IF design !== null && design.titelFarbe1 !== null� style="color: �design.titelFarbe1�!important;" �ENDIF� >Contact</h4>
	          <ul class="list-unstyled">
	            <li><a href="#" class="text-white" �IF design !== null && design.titelFarbe1 !== null� style="color: �design.titelFarbe1�!important;" �ENDIF� >Follow on Twitter</a></li>
	            <li><a href="#" class="text-white" �IF design !== null && design.titelFarbe1 !== null� style="color: �design.titelFarbe1�!important;" �ENDIF� >Like on Facebook</a></li>
	            <li><a href="#" class="text-white" �IF design !== null && design.titelFarbe1 !== null� style="color: �design.titelFarbe1�!important;" �ENDIF� >Email me</a></li>
	          </ul>
	        </div>
	      </div>
	    </div>
	  </div>
	  <div class="navbar navbar-dark bg-dark shadow-sm" �IF design !== null && design.farbe1 !== null� style="background-color: �design.farbe1�!important;" �ENDIF�>
	    <div class="container d-flex justify-content-between">
	      <a href="#" class="navbar-brand d-flex align-items-center">
	        <svg �IF design !== null && design.titelFarbe1 !== null� style="color: �design.titelFarbe1�!important;" �ENDIF� xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" aria-hidden="true" class="mr-2" viewBox="0 0 24 24" focusable="false"><path d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z"/><circle cx="12" cy="13" r="4"/></svg>
	        <strong �IF design !== null && design.titelFarbe1 !== null� style="color: �design.titelFarbe1�!important;" �ENDIF� >Freizeitpark</strong>
	      </a>
	      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="navbar-toggler-icon"></span>
	      </button>
	    </div>
	  </div>
	</header>

	<main>
		
		<section class="jumbotron text-center" �IF design !== null && design.farbe2 !== null� style="background-color: �design.farbe2�!important;" �ENDIF�>
			<div class="container">
		  		<h1 �IF design !== null && design.titelFarbe2 !== null� style="color: �design.titelFarbe2�!important;" �ENDIF� >�resMymetamodelFile.allContents.toIterable.filter(typeof(Freizeitpark)).head.name�</h1>
		      	<p �IF design !== null && design.textFarbe2 !== null� style="color: �design.textFarbe2�!important;" �ENDIF� class="lead text-muted">�resMymetamodelFile.allContents.toIterable.filter(typeof(AllgemeineInformationen)).head.beschreibung�</p>
			</div>
		</section>
		
		<div class="container">
		
			<div class="accordion" id="accordionOeffungszeit" style="margin-bottom: 20px">
			  <div class="card"  �IF design !== null && design.farbe3 !== null� style="background-color: �design.farbe3� !important;" �ENDIF�>
			    <div class="card-header" id="headingOeffnungszeit">
			      <h2 class="mb-0">
			        <button �IF design !== null && design.titelFarbe3 !== null� style="color: �design.titelFarbe3�!important;" �ENDIF�  class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseOeffnungszeit" aria-expanded="true" aria-controls="collapseOeffnungszeit">
			          �ffnungszeiten
			        </button>
			      </h2>
			    </div>
			
			    <div id="collapseOeffnungszeit" class="collapse" aria-labelledby="headingOeffnungszeit" data-parent="#accordionOeffungszeit">
			      <div class="card-body">
					�generateOeffungszeiten�			        
			      </div>
			    </div>
			  </div>			  
			</div>
			
			<div class="accordion" id="accordionEintrittskarten" style="margin-bottom: 20px">
						  <div class="card" �IF design !== null && design.farbe3 !== null� style="background-color: �design.farbe3� !important;" �ENDIF�>
						    <div class="card-header" id="headingEintritt">
						      <h2 class="mb-0">
						        <button �IF design !== null && design.titelFarbe3 !== null� style="color: �design.titelFarbe3�!important;" �ENDIF� class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseEintritt" aria-expanded="true" aria-controls="collapseEintritt">
						          Eintrittskarten
						        </button>
						      </h2>
						    </div>
						
						    <div id="collapseEintritt" class="collapse" aria-labelledby="headingEintritt" data-parent="#accordionEintrittskarten">
						      <div class="card-body">
								�generateEintrittskarten�			        
						      </div>
						    </div>
						  </div>			  
						</div>
						
						
			
			�generateThemenwelt()�
		</div>
		
		
		
	</main>                	
  	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
  </body>
</html>
		'''
	}
	
	def generateEintrittskarten() {
		'''
		�var design = resMymetamodelFile.allContents.toIterable.filter(typeof(Design)).head�
<table class="table">
  <thead>
    <tr �IF design !== null && design.textFarbe3 !== null� style="color: �design.textFarbe3�!important;" �ENDIF�>
      <th scope="col">Name</th>
      <th scope="col">Preis</th>
      <th scope="col">�bernachtung in</th>     
      <th scope="col">Tage g�ltig</th>     
      <th scope="col">F�r</th>     
    </tr>
  </thead>
  <tbody>
  �FOR o : resMymetamodelFile.allContents.toIterable.filter(typeof(Eintrittskarte))�
      <tr �IF design !== null && design.textFarbe3 !== null� style="color: �design.textFarbe3�!important;" �ENDIF�>
        <th scope="row">�o.name�</th>
        <td>�o.preis� �</td>
        <td>�IF o.�bernachtungIn !== null��o.�bernachtungIn.name��ENDIF�</td>
        <td>�o.tageG�ltig�</td>
         <td>
         �FOR p : o.personenGruppen�
         <p> �p.typ� (�p.anzahl�)</p> </br>
         �ENDFOR�
         </td>
      </tr>
  �ENDFOR�
  </tbody>
</table>		
		'''
	}
	
	def generateOeffungszeiten() {
		'''
		�var design = resMymetamodelFile.allContents.toIterable.filter(typeof(Design)).head�
<table class="table">
  <thead>
    <tr �IF design !== null && design.textFarbe3 !== null� style="color: �design.textFarbe3�!important;" �ENDIF�>
      <th scope="col">Tag</th>
      <th scope="col">Von</th>
      <th scope="col">Bis</th>      
    </tr>
  </thead>
  <tbody>
  �FOR o : resMymetamodelFile.allContents.toIterable.filter(typeof(AllgemeineInformationen)).head.zeitplan�
      <tr �IF design !== null && design.textFarbe3 !== null� style="color: �design.textFarbe3�!important;" �ENDIF�>
        <th scope="row">�o.name�</th>
        <td>�o.�ffnetUm�</td>
        <td>�o.schlie�tUm�</td>
      </tr>
  �ENDFOR�
  </tbody>
</table>		
		'''
	}
	
	def generateThemenwelt() {
		'''
		�var design = resMymetamodelFile.allContents.toIterable.filter(typeof(Design)).head�
		�var themenweltCount = 0�
					<div class="accordion" id="accordionExample">
			  			
			  			�FOR t : resMymetamodelFile.allContents.toIterable.filter(typeof(Themenwelt))�
			  			<div class="card" �IF design !== null && design.farbe3 !== null� style="background-color: �design.farbe3� !important;" �ENDIF�>
			  				<div class="card-header" id="themenwelt�themenweltCount�">
			  					<h2 class="mb-0">
			  						<button �IF design !== null && design.titelFarbe3 !== null� style="color: �design.titelFarbe3�!important;" �ENDIF� class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#themenweltCollapsed�themenweltCount�" aria-expanded="true" aria-controls="themenweltCollapsed�themenweltCount�">
			  							�t.name�
			  						</button>
			  					</h2>
			  				</div>
			  						
			  				<div id="themenweltCollapsed�themenweltCount�" class="collapse" aria-labelledby="themenwelt�themenweltCount�" data-parent="#accordionExample">
			  					<div class="card-body">
			  					
			  						 �generateThemenweltInner(themenweltCount, t)�          
			  						                        
			  				    </div>
			  				</div>
			  			</div>
			  			<!--�themenweltCount++�-->
			  			�ENDFOR�
			    	</div>
		'''
	}
	
	def generateThemenweltInner(int themenweltId, Themenwelt t) {
		'''
		�var design = resMymetamodelFile.allContents.toIterable.filter(typeof(Design)).head�
		<div class="accordion" id="accordionThemenweltInner�themenweltId�">                       	
			<div class="card" �IF design !== null && design.farbe3 !== null� style="background-color: �design.farbe3� !important;" �ENDIF�>
				<div class="card-header" id="attraktionen�themenweltId�">
					<h3 class="mb-0">
						<button  �IF design !== null && design.titelFarbe3 !== null� style="color: �design.titelFarbe3�!important;" �ENDIF� class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#attraktionenCollapsed�themenweltId�" aria-expanded="true" aria-controls="attraktionenCollapsed�themenweltId�"> Attraktionen </button>
					</h3>
				</div>
		
					  						                        
				<div id="attraktionenCollapsed�themenweltId�" class="collapse" aria-labelledby="attraktionen�themenweltId�" data-parent="#accordionThemenweltInner�themenweltId�">                        
					<div class="card-body">
						�generateAttraktionen(t)�			                        				                    				                        				   			                      			                      			  						                        		
					</div>                        
				</div>
			</div>
					  						                        	
					  						                        	
			<div class="card"  �IF design !== null && design.farbe3 !== null� style="background-color: �design.farbe3� !important;" �ENDIF�>
				<div class="card-header" id="verkauf�themenweltId�">
					<h3 class="mb-0">
						<button �IF design !== null && design.titelFarbe3 !== null� style="color: �design.titelFarbe3�!important;" �ENDIF� class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#verkaufCollapsed�themenweltId�" aria-expanded="true" aria-controls="verkaufCollapsed�themenweltId�"> Verk�ufe </button>
					</h3>
				</div>
					  						                        
				<div id="verkaufCollapsed�themenweltId�" class="collapse" aria-labelledby="verkauf�themenweltId�" data-parent="#accordionThemenweltInner�themenweltId�">                        
					<div class="card-body">
						�generateVerkaufslaeden(t)�
					</div>                        
				</div>  
			</div> 
					  						                        	
			<div class="card"  �IF design !== null && design.farbe3 !== null� style="background-color: �design.farbe3� !important;" �ENDIF�>
				<div class="card-header" id="uebernachtung�themenweltId�">
					<h3 class="mb-0">
						<button �IF design !== null && design.titelFarbe3 !== null� style="color: �design.titelFarbe3�!important;" �ENDIF�  class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#uebernachtungCollapsed�themenweltId�" aria-expanded="true" aria-controls="uebernachtungCollapsed�themenweltId�"> �bernachtung </button>
					 </h3>
				</div>
					  						                        
				<div id="uebernachtungCollapsed�themenweltId�" class="collapse" aria-labelledby="uebernachtung�themenweltId�" data-parent="#accordionThemenweltInner�themenweltId�">                        
					<div class="card-body">
						�generateUebernachtung(t)�
					 </div>                        
				</div>
			</div>                                              	                     	
		</div>                             
		'''
	}
	
	def generateUebernachtung(Themenwelt themenwelt) {
		'''
		�var design = resMymetamodelFile.allContents.toIterable.filter(typeof(Design)).head�
		�var i = 0�
		�var divClosed = true�
		�FOR a : themenwelt.�bernachtungensm�glichkeiten�
			�IF i % 3 == 0�
				<div class="row" style="margin-bottom: 20px;"> <!--�divClosed = false� -->
			�ENDIF�
		<div class="col-sm">
			<div class="card" style="width: 18rem;">
				<img src="�a.image�" class="card-img-top" alt="Achterbahn"/>
				<div class="card-body">
					<h5 class="card-title" �IF design !== null && design.titelFarbe5 !== null� style="color: �design.titelFarbe5�!important;" �ENDIF�>�a.name�</h5>
					<p class="card-text" �IF design !== null && design.titelFarbe5 !== null� style="color: �design.titelFarbe5�!important;" �ENDIF�>�a.beschreibung�</p>
				</div>
				<ul class="list-group list-group-flush">
					
					<li class="list-group-item" �IF design !== null && design.textFarbe5 !== null && design.farbe5 !== null� style="color: �design.textFarbe5�!important;background-color: �design.farbe5� !important;" �ENDIF�>Kosten pro Nacht: �a.kostenProNacht�</li>
					
					�IF a instanceof Hotel�
					<li class="list-group-item" �IF design !== null && design.textFarbe5 !== null && design.farbe5 !== null� style="color: �design.textFarbe5�!important;background-color: �design.farbe5� !important;" �ENDIF�>Sternebewertung: �a.sternBewertung�</li>
					�ENDIF�
				</ul>
			</div>                          					
		</div>
			�IF i++ % 3 == 2�
				</div> <!--�divClosed = true� -->
			�ENDIF�		
		�ENDFOR�
		�IF divClosed == false�
		<div class="col-sm">
		</div>
		</div>
			
		�ENDIF�
		'''
	}
	
	def generateVerkaufslaeden(Themenwelt themenwelt) {
		'''
		�var design = resMymetamodelFile.allContents.toIterable.filter(typeof(Design)).head�
		�var i = 0�
		�var divClosed = true�
		�FOR a : themenwelt.verkaufsL�den�
			�IF i % 3 == 0�
				<div class="row" style="margin-bottom: 20px;"> <!--�divClosed = false� -->
			�ENDIF�
		<div class="col-sm">
			<div class="card" style="width: 18rem;">
				<img src="�a.image�" class="card-img-top" alt="Achterbahn"/>
				<div class="card-body">
					<h5 class="card-title" �IF design !== null && design.titelFarbe5 !== null� style="color: �design.titelFarbe5�!important;" �ENDIF� >�a.name�</h5>
					<p class="card-text" �IF design !== null && design.titelFarbe5 !== null� style="color: �design.titelFarbe5�!important;" �ENDIF� >�a.beschreibung�</p>
				</div>
				<ul class="list-group list-group-flush">
					�IF a instanceof Gastronomie�
					<li class="list-group-item" �IF design !== null && design.textFarbe5 !== null && design.farbe5 !== null� style="color: �design.textFarbe5�!important;background-color: �design.farbe5� !important;" �ENDIF� >Anzahl Pl�tz: �a.anzahlPl�tze�</li>
					�ENDIF�
					�IF a instanceof Restaurant�
					<li class="list-group-item" �IF design !== null && design.textFarbe5 !== null && design.farbe5 !== null� style="color: �design.textFarbe5�!important;background-color: �design.farbe5� !important;" �ENDIF� >Sternebewertung: �a.sterneBewertung�</li>
					�ENDIF�
					�IF a instanceof Imbiss�
					<li class="list-group-item" �IF design !== null && design.textFarbe5 !== null && design.farbe5 !== null� style="color: �design.textFarbe5�!important;background-color: �design.farbe5� !important;" �ENDIF� >Spezialgericht: �a.spezialGericht�</li>
					�ENDIF�
					�IF a instanceof Gesch�ft�
					<li class="list-group-item" �IF design !== null && design.textFarbe5 !== null && design.farbe5 !== null� style="color: �design.textFarbe5�!important;background-color: �design.farbe5� !important;" �ENDIF� >Verkaufsfl�che: �a.verkaufsFl�che�</li>
					�ENDIF�
				</ul>
			</div>                          					
		</div>
			�IF i++ % 3 == 2�
				</div> <!--�divClosed = true� -->
			�ENDIF�		
		�ENDFOR�
		�IF divClosed == false�
		<div class="col-sm">
				</div>
			</div>
		
		�ENDIF�
		'''
	}
	
	def generateAttraktionen(Themenwelt themenwelt) {
		'''
		�var design = resMymetamodelFile.allContents.toIterable.filter(typeof(Design)).head�
		�var i = 0�
		�var divClosed = true� 
		�FOR a : themenwelt.attraktionen�
			�IF i % 3 == 0�
				<div class="row" style="margin-bottom: 20px;"> <!--�divClosed = false� -->
			�ENDIF�
		<div class="col-sm">
			<div class="card" style="width: 18rem;">
				<img src="�a.image�" class="card-img-top" alt="Achterbahn"/>
				<div class="card-body">
					<h5 class="card-title" �IF design !== null && design.titelFarbe5 !== null� style="color: �design.titelFarbe5�!important;" �ENDIF� >�a.name�</h5>
					<p class="card-text" �IF design !== null && design.titelFarbe5 !== null� style="color: �design.titelFarbe5�!important;" �ENDIF� >�a.beschreibung�</p>
				</div>
				<ul class="list-group list-group-flush">
					<li class="list-group-item" �IF design !== null && design.textFarbe5 !== null && design.farbe5 !== null� style="color: �design.textFarbe5�!important;background-color: �design.farbe5� !important;" �ENDIF� >Dauer �a.dauer�</li>
					<li class="list-group-item" �IF design !== null && design.textFarbe5 !== null && design.farbe5 !== null� style="color: �design.textFarbe5�!important;background-color: �design.farbe5� !important;" �ENDIF� >Anzahl Pl�tze �a.anzahlPl�tze�</li>
					�IF a instanceof Fahrgesch�ft�
					<li class="list-group-item" �IF design !== null && design.textFarbe5 !== null && design.farbe5 !== null� style="color: �design.textFarbe5�!important;background-color: �design.farbe5� !important;" �ENDIF� >Mindestgr��e �a.mindestGr��e�</li>
					�ENDIF�
				</ul>
			</div>                          					
		</div>
			�IF i++ % 3 == 2�
				</div> <!--�divClosed = true� -->
			�ENDIF�		
		�ENDFOR�
		�IF divClosed == false�
		<div class="col-sm">
		</div>
		</div>
		
		�ENDIF�
		'''
	}
	
	def isString(EAttribute a) {
		a.EAttributeType.classifierID == EcorePackage.ESTRING
	}
	
}