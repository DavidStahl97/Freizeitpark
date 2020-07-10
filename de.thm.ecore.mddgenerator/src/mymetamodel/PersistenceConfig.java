/**
 */
package mymetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.PersistenceConfig#getDbscheme <em>Dbscheme</em>}</li>
 *   <li>{@link mymetamodel.PersistenceConfig#getJdbcUserName <em>Jdbc User Name</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getPersistenceConfig()
 * @model
 * @generated
 */
public interface PersistenceConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Dbscheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbscheme</em>' attribute.
	 * @see #setDbscheme(String)
	 * @see mymetamodel.MymetamodelPackage#getPersistenceConfig_Dbscheme()
	 * @model
	 * @generated
	 */
	String getDbscheme();

	/**
	 * Sets the value of the '{@link mymetamodel.PersistenceConfig#getDbscheme <em>Dbscheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbscheme</em>' attribute.
	 * @see #getDbscheme()
	 * @generated
	 */
	void setDbscheme(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc User Name</em>' attribute.
	 * @see #setJdbcUserName(String)
	 * @see mymetamodel.MymetamodelPackage#getPersistenceConfig_JdbcUserName()
	 * @model
	 * @generated
	 */
	String getJdbcUserName();

	/**
	 * Sets the value of the '{@link mymetamodel.PersistenceConfig#getJdbcUserName <em>Jdbc User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc User Name</em>' attribute.
	 * @see #getJdbcUserName()
	 * @generated
	 */
	void setJdbcUserName(String value);

} // PersistenceConfig
