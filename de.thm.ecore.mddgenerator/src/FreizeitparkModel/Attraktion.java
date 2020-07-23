/**
 */
package FreizeitparkModel;

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
 *   <li>{@link FreizeitparkModel.Attraktion#getName <em>Name</em>}</li>
 *   <li>{@link FreizeitparkModel.Attraktion#getDauer <em>Dauer</em>}</li>
 *   <li>{@link FreizeitparkModel.Attraktion#getAnzahlPlätze <em>Anzahl Plätze</em>}</li>
 *   <li>{@link FreizeitparkModel.Attraktion#getImage <em>Image</em>}</li>
 *   <li>{@link FreizeitparkModel.Attraktion#getBeschreibung <em>Beschreibung</em>}</li>
 * </ul>
 *
 * @see FreizeitparkModel.FreizeitparkModelPackage#getAttraktion()
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
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getAttraktion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Attraktion#getName <em>Name</em>}' attribute.
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
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getAttraktion_Dauer()
	 * @model
	 * @generated
	 */
	int getDauer();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Attraktion#getDauer <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dauer</em>' attribute.
	 * @see #getDauer()
	 * @generated
	 */
	void setDauer(int value);

	/**
	 * Returns the value of the '<em><b>Anzahl Plätze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Plätze</em>' attribute.
	 * @see #setAnzahlPlätze(int)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getAttraktion_AnzahlPlätze()
	 * @model
	 * @generated
	 */
	int getAnzahlPlätze();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Attraktion#getAnzahlPlätze <em>Anzahl Plätze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Plätze</em>' attribute.
	 * @see #getAnzahlPlätze()
	 * @generated
	 */
	void setAnzahlPlätze(int value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getAttraktion_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Attraktion#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beschreibung</em>' attribute.
	 * @see #setBeschreibung(String)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getAttraktion_Beschreibung()
	 * @model
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Attraktion#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

} // Attraktion
