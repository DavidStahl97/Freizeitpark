package de.thm.ecore.mddgenerator.generator;

import com.google.common.collect.Iterables;
import de.thm.ecore.mddgenerator.util.ImportStatementFinder;
import de.thm.ecore.mddgenerator.util.JavaFormatter;
import de.thm.ecore.mddgenerator.util.XmlFormatter;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import mymetamodel.PersistenceConfig;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * The generator for ecore files.
 * 
 * @author Marco Richter
 */
@SuppressWarnings("all")
public class MDDGenerator {
  /**
   * The path where to generate the Java files.
   */
  public static final String SOURCE_FOLDER_PATH = "src-gen/";
  
  /**
   * The base package name.
   */
  public static final String PACKAGE = "de.thm.mdd.testapp.";
  
  public static final String PACKAGE_PATH = ("/" + MDDGenerator.PACKAGE.replaceAll("\\.", "/"));
  
  public static final String COMPLETE_PATH = (MDDGenerator.SOURCE_FOLDER_PATH + MDDGenerator.PACKAGE_PATH);
  
  public static final String EXTENDED_META_DATA = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
  
  public static final String MAX_INCLUSIVE = "maxInclusive";
  
  public static final String MIN_INCLUSIVE = "minInclusive";
  
  private ImportStatementFinder importFinder = new ImportStatementFinder();
  
  private Resource resMymetamodelFile;
  
  /**
   * Creates a file (containing the content-CharSequence) within the given IFolder.
   */
  public void createFile(final IFolder folder, final String fileName, final boolean overrideFile, final CharSequence content, final IProgressMonitor progressMonitor) {
    try {
      boolean _isCanceled = progressMonitor.isCanceled();
      if (_isCanceled) {
        throw new RuntimeException("Progress canceled");
      }
      boolean _exists = folder.exists();
      boolean _not = (!_exists);
      if (_not) {
        folder.create(true, true, null);
      }
      IFile iFile = folder.getFile(fileName);
      if ((iFile.exists() && true)) {
        iFile.delete(true, null);
      }
      boolean _exists_1 = iFile.exists();
      boolean _not_1 = (!_exists_1);
      if (_not_1) {
        String formattedCode = null;
        boolean _endsWith = fileName.endsWith(".java");
        if (_endsWith) {
          String sourceWithImports = this.importFinder.getWithImports(content.toString());
          formattedCode = JavaFormatter.format(sourceWithImports);
        } else {
          boolean _endsWith_1 = fileName.endsWith(".xml");
          if (_endsWith_1) {
            formattedCode = XmlFormatter.format(content.toString());
          }
        }
        byte[] bytes = null;
        if ((formattedCode != null)) {
          bytes = formattedCode.getBytes();
        } else {
          bytes = content.toString().getBytes();
          System.err.println((("File " + fileName) + " could not be formatted."));
        }
        InputStream source = new ByteArrayInputStream(bytes);
        iFile.create(source, true, null);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Starts the generation of the given Resource file in the given IProject.
   */
  public void doGenerate(final Resource resourceEcore, final Resource resMymetamodelFile, final IProject project, final IProgressMonitor progressMonitor) {
    try {
      this.resMymetamodelFile = resMymetamodelFile;
      progressMonitor.beginTask("Generating Java code", 2);
      progressMonitor.subTask("Creating folders");
      IFolder folder = project.getFolder((MDDGenerator.SOURCE_FOLDER_PATH + "de"));
      boolean _exists = folder.exists();
      boolean _not = (!_exists);
      if (_not) {
        folder.create(true, true, null);
      }
      folder = project.getFolder((MDDGenerator.SOURCE_FOLDER_PATH + "/de/thm"));
      boolean _exists_1 = folder.exists();
      boolean _not_1 = (!_exists_1);
      if (_not_1) {
        folder.create(true, true, null);
      }
      folder = project.getFolder((MDDGenerator.SOURCE_FOLDER_PATH + "/de/thm/mdd"));
      boolean _exists_2 = folder.exists();
      boolean _not_2 = (!_exists_2);
      if (_not_2) {
        folder.create(true, true, null);
      }
      folder = project.getFolder((MDDGenerator.SOURCE_FOLDER_PATH + "/de/thm/mdd/testapp"));
      boolean _exists_3 = folder.exists();
      boolean _not_3 = (!_exists_3);
      if (_not_3) {
        folder.create(true, true, null);
      }
      folder = project.getFolder(((MDDGenerator.SOURCE_FOLDER_PATH + MDDGenerator.PACKAGE_PATH) + "entities"));
      boolean _exists_4 = folder.exists();
      boolean _not_4 = (!_exists_4);
      if (_not_4) {
        folder.create(true, true, null);
      }
      this.makeProgressAndCheckCanceled(progressMonitor);
      IFolder entityFolder = project.getFolder(((MDDGenerator.SOURCE_FOLDER_PATH + MDDGenerator.PACKAGE_PATH) + "entities"));
      progressMonitor.subTask("Generating Entities");
      Iterable<EClass> _filter = Iterables.<EClass>filter(IteratorExtensions.<EObject>toIterable(resourceEcore.getAllContents()), EClass.class);
      for (final EClass e : _filter) {
        {
          CharSequence content = this.compileEntitiesGen(e);
          String _name = e.getName();
          String _plus = (_name + "Gen.java");
          this.createFile(entityFolder, _plus, true, content, progressMonitor);
          content = this.compileEntities(e);
          String _name_1 = e.getName();
          String _plus_1 = (_name_1 + ".java");
          this.createFile(entityFolder, _plus_1, false, content, progressMonitor);
        }
      }
      this.makeProgressAndCheckCanceled(progressMonitor);
      this.createFile(project.getFolder("/META-INF"), "persistence.xml", true, this.compilePersistenceXML(resourceEcore), progressMonitor);
      this.createFile(project.getFolder("/html-gen"), "Freizeitpark.html", true, this.compileFreizeitparkHMTL(), progressMonitor);
      progressMonitor.done();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        ex.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public void makeProgressAndCheckCanceled(final IProgressMonitor monitor) {
    monitor.worked(1);
    boolean _isCanceled = monitor.isCanceled();
    if (_isCanceled) {
      throw new RuntimeException("Progress canceled");
    }
  }
  
  public CharSequence compileEntitiesGen(final EClass e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(MDDGenerator.PACKAGE);
    _builder.append("entities;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* This is the {@link ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append("} entity class.");
    _builder.newLineIfNotEmpty();
    _builder.append("*");
    _builder.newLine();
    _builder.append("*@generated");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = e.getName();
    _builder.append(_name_1);
    _builder.append("Gen ");
    {
      boolean _isEmpty = e.getEAllSuperTypes().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(" extends ");
        String _name_2 = IterableExtensions.<EClass>head(e.getEAllSuperTypes()).getName();
        _builder.append(_name_2);
        _builder.append(" ");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// attributes");
    _builder.newLine();
    {
      EList<EAttribute> _eAllAttributes = e.getEAllAttributes();
      for(final EAttribute a : _eAllAttributes) {
        _builder.append("\t");
        _builder.append("private ");
        String _instanceTypeName = a.getEType().getInstanceTypeName();
        _builder.append(_instanceTypeName, "\t");
        _builder.append(" ");
        String _name_3 = a.getName();
        _builder.append(_name_3, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// references");
    _builder.newLine();
    {
      final Function1<EReference, Boolean> _function = (EReference it) -> {
        boolean _isMany = it.isMany();
        return Boolean.valueOf((!_isMany));
      };
      Iterable<EReference> _filter = IterableExtensions.<EReference>filter(e.getEAllReferences(), _function);
      for(final EReference a_1 : _filter) {
        _builder.append("\t");
        _builder.append("private ");
        String _name_4 = a_1.getEReferenceType().getName();
        _builder.append(_name_4, "\t");
        _builder.append(" ");
        String _name_5 = a_1.getName();
        _builder.append(_name_5, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      final Function1<EReference, Boolean> _function_1 = (EReference it) -> {
        return Boolean.valueOf(it.isMany());
      };
      Iterable<EReference> _filter_1 = IterableExtensions.<EReference>filter(e.getEAllReferences(), _function_1);
      for(final EReference a_2 : _filter_1) {
        _builder.append("\t");
        _builder.append("private java.util.ArrayList<");
        String _name_6 = a_2.getEReferenceType().getName();
        _builder.append(_name_6, "\t");
        _builder.append("> ");
        String _name_7 = a_2.getName();
        _builder.append(_name_7, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* Default constructor.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_8 = e.getName();
    _builder.append(_name_8, "\t");
    _builder.append("Gen() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _isEmpty_1 = e.getEAllAttributes().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("* Constructor for all attributes.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _name_9 = e.getName();
        _builder.append(_name_9, "\t");
        _builder.append("Gen(");
        {
          EList<EAttribute> _eAllAttributes_1 = e.getEAllAttributes();
          boolean _hasElements = false;
          for(final EAttribute a_3 : _eAllAttributes_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            _builder.append(" ");
            String _instanceTypeName_1 = a_3.getEType().getInstanceTypeName();
            _builder.append(_instanceTypeName_1, "\t");
            _builder.append(" ");
            String _name_10 = a_3.getName();
            _builder.append(_name_10, "\t");
            _builder.append(" ");
          }
        }
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        {
          EList<EAttribute> _eAllAttributes_2 = e.getEAllAttributes();
          for(final EAttribute a_4 : _eAllAttributes_2) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            String _name_11 = a_4.getName();
            _builder.append(_name_11, "\t\t");
            _builder.append(" = ");
            String _name_12 = a_4.getName();
            _builder.append(_name_12, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      if (((!e.getEAllAttributes().isEmpty()) && (!e.getEAllReferences().isEmpty()))) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("* Full constructor.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _name_13 = e.getName();
        _builder.append(_name_13, "\t");
        _builder.append("Gen(");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          EList<EAttribute> _eAllAttributes_3 = e.getEAllAttributes();
          boolean _hasElements_1 = false;
          for(final EAttribute a_5 : _eAllAttributes_3) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            _builder.append(" ");
            String _instanceTypeName_2 = a_5.getEType().getInstanceTypeName();
            _builder.append(_instanceTypeName_2, "\t");
            _builder.append(" ");
            String _name_14 = a_5.getName();
            _builder.append(_name_14, "\t");
            _builder.append(" ");
          }
        }
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          final Function1<EReference, Boolean> _function_2 = (EReference it) -> {
            boolean _isMany = it.isMany();
            return Boolean.valueOf((!_isMany));
          };
          Iterable<EReference> _filter_2 = IterableExtensions.<EReference>filter(e.getEAllReferences(), _function_2);
          boolean _hasElements_2 = false;
          for(final EReference a_6 : _filter_2) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
              _builder.append(", ", "\t");
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            _builder.append(" ");
            String _name_15 = a_6.getEReferenceType().getName();
            _builder.append(_name_15, "\t");
            _builder.append(" ");
            String _name_16 = a_6.getName();
            _builder.append(_name_16, "\t");
            _builder.append(" ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          final Function1<EReference, Boolean> _function_3 = (EReference it) -> {
            return Boolean.valueOf(it.isMany());
          };
          Iterable<EReference> _filter_3 = IterableExtensions.<EReference>filter(e.getEAllReferences(), _function_3);
          boolean _hasElements_3 = false;
          for(final EReference a_7 : _filter_3) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
              _builder.append(", ", "\t");
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            _builder.append(" java.util.ArrayList<");
            String _name_17 = a_7.getEReferenceType().getName();
            _builder.append(_name_17, "\t");
            _builder.append("> ");
            String _name_18 = a_7.getName();
            _builder.append(_name_18, "\t");
            _builder.append(" ");
          }
        }
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        {
          EList<EAttribute> _eAllAttributes_4 = e.getEAllAttributes();
          EList<EReference> _eAllReferences = e.getEAllReferences();
          Iterable<EStructuralFeature> _plus = Iterables.<EStructuralFeature>concat(_eAllAttributes_4, _eAllReferences);
          for(final EStructuralFeature a_8 : _plus) {
            _builder.append("\t");
            _builder.append("this.");
            String _name_19 = a_8.getName();
            _builder.append(_name_19, "\t");
            _builder.append(" = ");
            String _name_20 = a_8.getName();
            _builder.append(_name_20, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//TODO getter setter");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String toString() {");
    _builder.newLine();
    {
      final Function1<EAttribute, Boolean> _function_4 = (EAttribute it) -> {
        return Boolean.valueOf(this.isString(it));
      };
      boolean _exists = IterableExtensions.<EAttribute>exists(e.getEAllAttributes(), _function_4);
      if (_exists) {
        _builder.append("\t\t");
        _builder.append("StringBuilder builder = new StringBuilder();");
        _builder.newLine();
        {
          final Function1<EAttribute, Boolean> _function_5 = (EAttribute it) -> {
            return Boolean.valueOf(this.isString(it));
          };
          Iterable<EAttribute> _filter_4 = IterableExtensions.<EAttribute>filter(e.getEAllAttributes(), _function_5);
          for(final EAttribute a_9 : _filter_4) {
            _builder.append("\t\t");
            _builder.append("builder.append(");
            String _name_21 = a_9.getName();
            _builder.append(_name_21, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("builder.append(\" - \");");
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
        _builder.append("return builder.toString();");
        _builder.newLine();
      } else {
        _builder.append("\t\t");
        _builder.append("return null; //TODO");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileEntities(final EClass e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(MDDGenerator.PACKAGE);
    _builder.append("entities;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" extends ");
    String _name_1 = e.getName();
    _builder.append(_name_1);
    _builder.append("Gen {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilePersistenceXML(final Resource r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><persistence xmlns=\"http://xmlns.jcp.org/xml/ns/persistence\" version=\"2.1\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://xmlns.jcp.org/xml/ns/persistence       http://www.oracle.com/webfolder/technetwork/jsc/xml/ns/persistence/persistence_2_1.xsd\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<persistence>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- main unit -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<persistence-unit name=\"mainunit\" transaction-type=\"RESOURCE_LOCAL\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<provider>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("org.eclipse.persistence.jpa.PersistenceProvider");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</provider>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<!-- entities -->");
    _builder.newLine();
    {
      Iterable<EClass> _filter = Iterables.<EClass>filter(IteratorExtensions.<EObject>toIterable(r.getAllContents()), EClass.class);
      for(final EClass e : _filter) {
        _builder.append("\t\t");
        _builder.append("<class>");
        _builder.append(MDDGenerator.PACKAGE, "\t\t");
        _builder.append("entities.");
        String _name = e.getName();
        _builder.append(_name, "\t\t");
        _builder.append("</class>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<properties>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!-- SQL print on console -->");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!--<property name=\"eclipselink.logging.level.sql\" value=\"FINEST\"/> <property ");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("name=\"eclipselink.logging.parameters\" value=\"true\"/> -->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<property name=\"eclipselink.weaving\" value=\"static\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<property name=\"javax.persistence.lock.timeout\" value=\"5000\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<property name=\"javax.persistence.jdbc.driver\" value=\"com.mysql.jdbc.Driver\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<property name=\"javax.persistence.jdbc.url\" value=\"jdbc:mysql://localhost:3306/");
    String _dBScheme = this.getDBScheme();
    _builder.append(_dBScheme, "\t\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<property name=\"javax.persistence.jdbc.user\" value=\"");
    String _jdbcUserName = this.getJdbcUserName();
    _builder.append(_jdbcUserName, "\t\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<property name=\"javax.persistence.jdbc.password\" value=\"\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<property name=\"eclipselink.cache.shared.default\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!-- <property name=\"eclipselink.ddl-generation\" value=\"create-tables\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<property name=\"eclipselink.ddl-generation.output-mode\" value=\"database\"/> -->");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</properties>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</persistence-unit>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</persistence>");
    _builder.newLine();
    return _builder;
  }
  
  public String getDBScheme() {
    PersistenceConfig persistenceConfig = IterableExtensions.<PersistenceConfig>head(Iterables.<PersistenceConfig>filter(IteratorExtensions.<EObject>toIterable(this.resMymetamodelFile.getAllContents()), PersistenceConfig.class));
    if ((persistenceConfig != null)) {
      return persistenceConfig.getDbscheme();
    }
    return "default_scheme";
  }
  
  public String getJdbcUserName() {
    PersistenceConfig persistenceConfig = IterableExtensions.<PersistenceConfig>head(Iterables.<PersistenceConfig>filter(IteratorExtensions.<EObject>toIterable(this.resMymetamodelFile.getAllContents()), PersistenceConfig.class));
    if ((persistenceConfig != null)) {
      return persistenceConfig.getJdbcUserName();
    }
    return "root";
  }
  
  public CharSequence compileFreizeitparkHMTL() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"description\" content=\"Webshop\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"author\" content=\"David\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>Freizeitpark</title>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<!--Template based on URL below-->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link rel=\"canonical\" href=\"https://getbootstrap.com/docs/4.3/examples/starter-template/\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<!-- Bootstrap core CSS -->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<!-- Place your stylesheet here-->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<p>Hallo Welt</p>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Bootstrap core JavaScript");
    _builder.newLine();
    _builder.append("================================================== -->");
    _builder.newLine();
    _builder.append("<!-- Placed at the end of the document so the pages load faster -->");
    _builder.newLine();
    _builder.append("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>");
    _builder.newLine();
    _builder.append("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>");
    _builder.newLine();
    _builder.append("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public boolean isString(final EAttribute a) {
    int _classifierID = a.getEAttributeType().getClassifierID();
    return (_classifierID == EcorePackage.ESTRING);
  }
}
