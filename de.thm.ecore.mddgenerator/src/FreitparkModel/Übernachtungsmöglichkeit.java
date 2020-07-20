/**
 */
package FreitparkModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Übernachtungsmöglichkeit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.Übernachtungsmöglichkeit#getKostenProNacht <em>Kosten Pro Nacht</em>}</li>
 *   <li>{@link FreitparkModel.Übernachtungsmöglichkeit#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see FreitparkModel.FreitparkModelPackage#getÜbernachtungsmöglichkeit()
 * @model
 * @generated
 */
public interface Übernachtungsmöglichkeit extends EObject {
	/**
	 * Returns the value of the '<em><b>Kosten Pro Nacht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kosten Pro Nacht</em>' attribute.
	 * @see #setKostenProNacht(double)
	 * @see FreitparkModel.FreitparkModelPackage#getÜbernachtungsmöglichkeit_KostenProNacht()
	 * @model
	 * @generated
	 */
	double getKostenProNacht();

	/**
	 * Sets the value of the '{@link FreitparkModel.Übernachtungsmöglichkeit#getKostenProNacht <em>Kosten Pro Nacht</em>}' attribute.
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
	 * @see FreitparkModel.FreitparkModelPackage#getÜbernachtungsmöglichkeit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreitparkModel.Übernachtungsmöglichkeit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Übernachtungsmöglichkeit
