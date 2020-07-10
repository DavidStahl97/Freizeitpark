/**
 */
package mymetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.RootConfig#getPersistenceConfig <em>Persistence Config</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getRootConfig()
 * @model
 * @generated
 */
public interface RootConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Persistence Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Config</em>' containment reference.
	 * @see #setPersistenceConfig(PersistenceConfig)
	 * @see mymetamodel.MymetamodelPackage#getRootConfig_PersistenceConfig()
	 * @model containment="true"
	 * @generated
	 */
	PersistenceConfig getPersistenceConfig();

	/**
	 * Sets the value of the '{@link mymetamodel.RootConfig#getPersistenceConfig <em>Persistence Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Config</em>' containment reference.
	 * @see #getPersistenceConfig()
	 * @generated
	 */
	void setPersistenceConfig(PersistenceConfig value);

} // RootConfig
