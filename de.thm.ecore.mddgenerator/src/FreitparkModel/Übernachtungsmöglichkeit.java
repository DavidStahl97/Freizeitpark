/**
 */
package FreitparkModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>�bernachtungsm�glichkeit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.�bernachtungsm�glichkeit#getKostenProNacht <em>Kosten Pro Nacht</em>}</li>
 *   <li>{@link FreitparkModel.�bernachtungsm�glichkeit#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see FreitparkModel.FreitparkModelPackage#get�bernachtungsm�glichkeit()
 * @model
 * @generated
 */
public interface �bernachtungsm�glichkeit extends EObject {
	/**
	 * Returns the value of the '<em><b>Kosten Pro Nacht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kosten Pro Nacht</em>' attribute.
	 * @see #setKostenProNacht(double)
	 * @see FreitparkModel.FreitparkModelPackage#get�bernachtungsm�glichkeit_KostenProNacht()
	 * @model
	 * @generated
	 */
	double getKostenProNacht();

	/**
	 * Sets the value of the '{@link FreitparkModel.�bernachtungsm�glichkeit#getKostenProNacht <em>Kosten Pro Nacht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kosten Pro Nacht</em>' attribute.
	 * @see #getKostenProNacht()
	 * @generated
	 */
	void setKostenProNacht(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FreitparkModel.FreitparkModelPackage#get�bernachtungsm�glichkeit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreitparkModel.�bernachtungsm�glichkeit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // �bernachtungsm�glichkeit
