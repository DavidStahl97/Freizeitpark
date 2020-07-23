/**
 */
package FreizeitparkModel;

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
 *   <li>{@link FreizeitparkModel.Übernachtungsmöglichkeit#getKostenProNacht <em>Kosten Pro Nacht</em>}</li>
 *   <li>{@link FreizeitparkModel.Übernachtungsmöglichkeit#getName <em>Name</em>}</li>
 *   <li>{@link FreizeitparkModel.Übernachtungsmöglichkeit#getImage <em>Image</em>}</li>
 *   <li>{@link FreizeitparkModel.Übernachtungsmöglichkeit#getBeschreibung <em>Beschreibung</em>}</li>
 * </ul>
 *
 * @see FreizeitparkModel.FreizeitparkModelPackage#getÜbernachtungsmöglichkeit()
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
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getÜbernachtungsmöglichkeit_KostenProNacht()
	 * @model
	 * @generated
	 */
	double getKostenProNacht();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Übernachtungsmöglichkeit#getKostenProNacht <em>Kosten Pro Nacht</em>}' attribute.
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
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getÜbernachtungsmöglichkeit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Übernachtungsmöglichkeit#getName <em>Name</em>}' attribute.
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
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getÜbernachtungsmöglichkeit_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Übernachtungsmöglichkeit#getImage <em>Image</em>}' attribute.
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
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getÜbernachtungsmöglichkeit_Beschreibung()
	 * @model
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Übernachtungsmöglichkeit#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

} // Übernachtungsmöglichkeit
