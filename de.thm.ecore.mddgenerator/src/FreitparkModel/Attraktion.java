/**
 */
package FreitparkModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attraktion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.Attraktion#getName <em>Name</em>}</li>
 *   <li>{@link FreitparkModel.Attraktion#getDauer <em>Dauer</em>}</li>
 *   <li>{@link FreitparkModel.Attraktion#getAnzahlPl�tze <em>Anzahl Pl�tze</em>}</li>
 * </ul>
 *
 * @see FreitparkModel.FreitparkModelPackage#getAttraktion()
 * @model abstract="true"
 * @generated
 */
public interface Attraktion extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FreitparkModel.FreitparkModelPackage#getAttraktion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreitparkModel.Attraktion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dauer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dauer</em>' attribute.
	 * @see #setDauer(int)
	 * @see FreitparkModel.FreitparkModelPackage#getAttraktion_Dauer()
	 * @model
	 * @generated
	 */
	int getDauer();

	/**
	 * Sets the value of the '{@link FreitparkModel.Attraktion#getDauer <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dauer</em>' attribute.
	 * @see #getDauer()
	 * @generated
	 */
	void setDauer(int value);

	/**
	 * Returns the value of the '<em><b>Anzahl Pl�tze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Pl�tze</em>' attribute.
	 * @see #setAnzahlPl�tze(int)
	 * @see FreitparkModel.FreitparkModelPackage#getAttraktion_AnzahlPl�tze()
	 * @model
	 * @generated
	 */
	int getAnzahlPl�tze();

	/**
	 * Sets the value of the '{@link FreitparkModel.Attraktion#getAnzahlPl�tze <em>Anzahl Pl�tze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Pl�tze</em>' attribute.
	 * @see #getAnzahlPl�tze()
	 * @generated
	 */
	void setAnzahlPl�tze(int value);

} // Attraktion
