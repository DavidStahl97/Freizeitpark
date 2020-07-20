/**
 */
package FreitparkModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personengruppe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.Personengruppe#getTyp <em>Typ</em>}</li>
 *   <li>{@link FreitparkModel.Personengruppe#getAnzahl <em>Anzahl</em>}</li>
 * </ul>
 *
 * @see FreitparkModel.FreitparkModelPackage#getPersonengruppe()
 * @model
 * @generated
 */
public interface Personengruppe extends EObject {
	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see #setTyp(String)
	 * @see FreitparkModel.FreitparkModelPackage#getPersonengruppe_Typ()
	 * @model
	 * @generated
	 */
	String getTyp();

	/**
	 * Sets the value of the '{@link FreitparkModel.Personengruppe#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(String value);

	/**
	 * Returns the value of the '<em><b>Anzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl</em>' attribute.
	 * @see #setAnzahl(int)
	 * @see FreitparkModel.FreitparkModelPackage#getPersonengruppe_Anzahl()
	 * @model
	 * @generated
	 */
	int getAnzahl();

	/**
	 * Sets the value of the '{@link FreitparkModel.Personengruppe#getAnzahl <em>Anzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl</em>' attribute.
	 * @see #getAnzahl()
	 * @generated
	 */
	void setAnzahl(int value);

} // Personengruppe
