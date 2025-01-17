/**
 */
package mymetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mymetamodel.MymetamodelPackage
 * @generated
 */
public interface MymetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MymetamodelFactory eINSTANCE = mymetamodel.impl.MymetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Config</em>'.
	 * @generated
	 */
	RootConfig createRootConfig();

	/**
	 * Returns a new object of class '<em>Persistence Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistence Config</em>'.
	 * @generated
	 */
	PersistenceConfig createPersistenceConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MymetamodelPackage getMymetamodelPackage();

} //MymetamodelFactory
