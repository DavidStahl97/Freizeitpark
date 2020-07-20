/**
 */
package FreitparkModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eintrittskarte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.Eintrittskarte#getTageGültig <em>Tage Gültig</em>}</li>
 *   <li>{@link FreitparkModel.Eintrittskarte#getName <em>Name</em>}</li>
 *   <li>{@link FreitparkModel.Eintrittskarte#getPreis <em>Preis</em>}</li>
 *   <li>{@link FreitparkModel.Eintrittskarte#getPersonenGruppen <em>Personen Gruppen</em>}</li>
 *   <li>{@link FreitparkModel.Eintrittskarte#getÜbernachtungIn <em>Übernachtung In</em>}</li>
 * </ul>
 *
 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte()
 * @model
 * @generated
 */
public interface Eintrittskarte extends EObject {
	/**
	 * Returns the value of the '<em><b>Tage Gültig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tage Gültig</em>' attribute.
	 * @see #setTageGültig(int)
	 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte_TageGültig()
	 * @model
	 * @generated
	 */
	int getTageGültig();

	/**
	 * Sets the value of the '{@link FreitparkModel.Eintrittskarte#getTageGültig <em>Tage Gültig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tage Gültig</em>' attribute.
	 * @see #getTageGültig()
	 * @generated
	 */
	void setTageGültig(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreitparkModel.Eintrittskarte#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Preis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preis</em>' attribute.
	 * @see #setPreis(double)
	 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte_Preis()
	 * @model
	 * @generated
	 */
	double getPreis();

	/**
	 * Sets the value of the '{@link FreitparkModel.Eintrittskarte#getPreis <em>Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preis</em>' attribute.
	 * @see #getPreis()
	 * @generated
	 */
	void setPreis(double value);

	/**
	 * Returns the value of the '<em><b>Personen Gruppen</b></em>' containment reference list.
	 * The list contents are of type {@link FreitparkModel.Personengruppe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personen Gruppen</em>' containment reference list.
	 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte_PersonenGruppen()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Personengruppe> getPersonenGruppen();

	/**
	 * Returns the value of the '<em><b>Übernachtung In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Übernachtung In</em>' reference.
	 * @see #setÜbernachtungIn(Übernachtungsmöglichkeit)
	 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte_ÜbernachtungIn()
	 * @model
	 * @generated
	 */
	Übernachtungsmöglichkeit getÜbernachtungIn();

	/**
	 * Sets the value of the '{@link FreitparkModel.Eintrittskarte#getÜbernachtungIn <em>Übernachtung In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Übernachtung In</em>' reference.
	 * @see #getÜbernachtungIn()
	 * @generated
	 */
	void setÜbernachtungIn(Übernachtungsmöglichkeit value);

} // Eintrittskarte
