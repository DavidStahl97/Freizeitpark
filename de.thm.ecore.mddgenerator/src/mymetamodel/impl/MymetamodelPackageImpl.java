/**
 */
package mymetamodel.impl;

import mymetamodel.MymetamodelFactory;
import mymetamodel.MymetamodelPackage;
import mymetamodel.PersistenceConfig;
import mymetamodel.RootConfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MymetamodelPackageImpl extends EPackageImpl implements MymetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceConfigEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mymetamodel.MymetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MymetamodelPackageImpl() {
		super(eNS_URI, MymetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MymetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MymetamodelPackage init() {
		if (isInited) return (MymetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(MymetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMymetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MymetamodelPackageImpl theMymetamodelPackage = registeredMymetamodelPackage instanceof MymetamodelPackageImpl ? (MymetamodelPackageImpl)registeredMymetamodelPackage : new MymetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMymetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theMymetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMymetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MymetamodelPackage.eNS_URI, theMymetamodelPackage);
		return theMymetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootConfig() {
		return rootConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRootConfig_PersistenceConfig() {
		return (EReference)rootConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistenceConfig() {
		return persistenceConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceConfig_Dbscheme() {
		return (EAttribute)persistenceConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceConfig_JdbcUserName() {
		return (EAttribute)persistenceConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MymetamodelFactory getMymetamodelFactory() {
		return (MymetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootConfigEClass = createEClass(ROOT_CONFIG);
		createEReference(rootConfigEClass, ROOT_CONFIG__PERSISTENCE_CONFIG);

		persistenceConfigEClass = createEClass(PERSISTENCE_CONFIG);
		createEAttribute(persistenceConfigEClass, PERSISTENCE_CONFIG__DBSCHEME);
		createEAttribute(persistenceConfigEClass, PERSISTENCE_CONFIG__JDBC_USER_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rootConfigEClass, RootConfig.class, "RootConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootConfig_PersistenceConfig(), this.getPersistenceConfig(), null, "persistenceConfig", null, 0, 1, RootConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceConfigEClass, PersistenceConfig.class, "PersistenceConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceConfig_Dbscheme(), ecorePackage.getEString(), "dbscheme", null, 0, 1, PersistenceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceConfig_JdbcUserName(), ecorePackage.getEString(), "jdbcUserName", null, 0, 1, PersistenceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MymetamodelPackageImpl
