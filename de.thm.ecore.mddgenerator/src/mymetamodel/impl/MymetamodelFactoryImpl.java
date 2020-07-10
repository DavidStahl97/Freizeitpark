/**
 */
package mymetamodel.impl;

import mymetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MymetamodelFactoryImpl extends EFactoryImpl implements MymetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MymetamodelFactory init() {
		try {
			MymetamodelFactory theMymetamodelFactory = (MymetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(MymetamodelPackage.eNS_URI);
			if (theMymetamodelFactory != null) {
				return theMymetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MymetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MymetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MymetamodelPackage.ROOT_CONFIG: return createRootConfig();
			case MymetamodelPackage.PERSISTENCE_CONFIG: return createPersistenceConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootConfig createRootConfig() {
		RootConfigImpl rootConfig = new RootConfigImpl();
		return rootConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistenceConfig createPersistenceConfig() {
		PersistenceConfigImpl persistenceConfig = new PersistenceConfigImpl();
		return persistenceConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MymetamodelPackage getMymetamodelPackage() {
		return (MymetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MymetamodelPackage getPackage() {
		return MymetamodelPackage.eINSTANCE;
	}

} //MymetamodelFactoryImpl
