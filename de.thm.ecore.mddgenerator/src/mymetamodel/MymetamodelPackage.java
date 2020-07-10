/**
 */
package mymetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mymetamodel.MymetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MymetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mymetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de/thm/mymetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.thm.mymetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MymetamodelPackage eINSTANCE = mymetamodel.impl.MymetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link mymetamodel.impl.RootConfigImpl <em>Root Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.RootConfigImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getRootConfig()
	 * @generated
	 */
	int ROOT_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Persistence Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONFIG__PERSISTENCE_CONFIG = 0;

	/**
	 * The number of structural features of the '<em>Root Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.PersistenceConfigImpl <em>Persistence Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.PersistenceConfigImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getPersistenceConfig()
	 * @generated
	 */
	int PERSISTENCE_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Dbscheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONFIG__DBSCHEME = 0;

	/**
	 * The feature id for the '<em><b>Jdbc User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONFIG__JDBC_USER_NAME = 1;

	/**
	 * The number of structural features of the '<em>Persistence Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Persistence Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONFIG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mymetamodel.RootConfig <em>Root Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Config</em>'.
	 * @see mymetamodel.RootConfig
	 * @generated
	 */
	EClass getRootConfig();

	/**
	 * Returns the meta object for the containment reference '{@link mymetamodel.RootConfig#getPersistenceConfig <em>Persistence Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Config</em>'.
	 * @see mymetamodel.RootConfig#getPersistenceConfig()
	 * @see #getRootConfig()
	 * @generated
	 */
	EReference getRootConfig_PersistenceConfig();

	/**
	 * Returns the meta object for class '{@link mymetamodel.PersistenceConfig <em>Persistence Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Config</em>'.
	 * @see mymetamodel.PersistenceConfig
	 * @generated
	 */
	EClass getPersistenceConfig();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.PersistenceConfig#getDbscheme <em>Dbscheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbscheme</em>'.
	 * @see mymetamodel.PersistenceConfig#getDbscheme()
	 * @see #getPersistenceConfig()
	 * @generated
	 */
	EAttribute getPersistenceConfig_Dbscheme();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.PersistenceConfig#getJdbcUserName <em>Jdbc User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc User Name</em>'.
	 * @see mymetamodel.PersistenceConfig#getJdbcUserName()
	 * @see #getPersistenceConfig()
	 * @generated
	 */
	EAttribute getPersistenceConfig_JdbcUserName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MymetamodelFactory getMymetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mymetamodel.impl.RootConfigImpl <em>Root Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.RootConfigImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getRootConfig()
		 * @generated
		 */
		EClass ROOT_CONFIG = eINSTANCE.getRootConfig();

		/**
		 * The meta object literal for the '<em><b>Persistence Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_CONFIG__PERSISTENCE_CONFIG = eINSTANCE.getRootConfig_PersistenceConfig();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.PersistenceConfigImpl <em>Persistence Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.PersistenceConfigImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getPersistenceConfig()
		 * @generated
		 */
		EClass PERSISTENCE_CONFIG = eINSTANCE.getPersistenceConfig();

		/**
		 * The meta object literal for the '<em><b>Dbscheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_CONFIG__DBSCHEME = eINSTANCE.getPersistenceConfig_Dbscheme();

		/**
		 * The meta object literal for the '<em><b>Jdbc User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_CONFIG__JDBC_USER_NAME = eINSTANCE.getPersistenceConfig_JdbcUserName();

	}

} //MymetamodelPackage
