/**
 */
package FreizeitparkModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verkaufsladen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.Verkaufsladen#getName <em>Name</em>}</li>
 *   <li>{@link FreizeitparkModel.Verkaufsladen#getImage <em>Image</em>}</li>
 *   <li>{@link FreizeitparkModel.Verkaufsladen#getBeschreibung <em>Beschreibung</em>}</li>
 * </ul>
 *
 * @see FreizeitparkModel.FreizeitparkModelPackage#getVerkaufsladen()
 * @model
 * @generated
 */
public interface Verkaufsladen extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getVerkaufsladen_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Verkaufsladen#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getVerkaufsladen_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Verkaufsladen#getImage <em>Image</em>}' attribute.
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
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getVerkaufsladen_Beschreibung()
	 * @model
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Verkaufsladen#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

} // Verkaufsladen
