/**
 */
package FreitparkModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allgemeine Informationen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.AllgemeineInformationen#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link FreitparkModel.AllgemeineInformationen#getZeitplan <em>Zeitplan</em>}</li>
 * </ul>
 *
 * @see FreitparkModel.FreitparkModelPackage#getAllgemeineInformationen()
 * @model
 * @generated
 */
public interface AllgemeineInformationen extends EObject {
	/**
	 * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beschreibung</em>' attribute.
	 * @see #setBeschreibung(String)
	 * @see FreitparkModel.FreitparkModelPackage#getAllgemeineInformationen_Beschreibung()
	 * @model
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link FreitparkModel.AllgemeineInformationen#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

	/**
	 * Returns the value of the '<em><b>Zeitplan</b></em>' containment reference list.
	 * The list contents are of type {@link FreitparkModel.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zeitplan</em>' containment reference list.
	 * @see FreitparkModel.FreitparkModelPackage#getAllgemeineInformationen_Zeitplan()
	 * @model containment="true" lower="7"
	 * @generated
	 */
	EList<Tag> getZeitplan();

} // AllgemeineInformationen
