/**
 */
package FreitparkModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Freizeitpark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.Freizeitpark#getThemenWelten <em>Themen Welten</em>}</li>
 *   <li>{@link FreitparkModel.Freizeitpark#getName <em>Name</em>}</li>
 *   <li>{@link FreitparkModel.Freizeitpark#getDesign <em>Design</em>}</li>
 *   <li>{@link FreitparkModel.Freizeitpark#getEintrittskarten <em>Eintrittskarten</em>}</li>
 *   <li>{@link FreitparkModel.Freizeitpark#getAllgemeineInformationen <em>Allgemeine Informationen</em>}</li>
 * </ul>
 *
 * @see FreitparkModel.FreitparkModelPackage#getFreizeitpark()
 * @model
 * @generated
 */
public interface Freizeitpark extends EObject {
	/**
	 * Returns the value of the '<em><b>Themen Welten</b></em>' containment reference list.
	 * The list contents are of type {@link FreitparkModel.Themenwelt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Themen Welten</em>' containment reference list.
	 * @see FreitparkModel.FreitparkModelPackage#getFreizeitpark_ThemenWelten()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Themenwelt> getThemenWelten();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FreitparkModel.FreitparkModelPackage#getFreizeitpark_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreitparkModel.Freizeitpark#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference.
	 * @see #setDesign(Design)
	 * @see FreitparkModel.FreitparkModelPackage#getFreizeitpark_Design()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Design getDesign();

	/**
	 * Sets the value of the '{@link FreitparkModel.Freizeitpark#getDesign <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' containment reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(Design value);

	/**
	 * Returns the value of the '<em><b>Eintrittskarten</b></em>' containment reference list.
	 * The list contents are of type {@link FreitparkModel.Eintrittskarte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eintrittskarten</em>' containment reference list.
	 * @see FreitparkModel.FreitparkModelPackage#getFreizeitpark_Eintrittskarten()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Eintrittskarte> getEintrittskarten();

	/**
	 * Returns the value of the '<em><b>Allgemeine Informationen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allgemeine Informationen</em>' containment reference.
	 * @see #setAllgemeineInformationen(AllgemeineInformationen)
	 * @see FreitparkModel.FreitparkModelPackage#getFreizeitpark_AllgemeineInformationen()
	 * @model containment="true"
	 * @generated
	 */
	AllgemeineInformationen getAllgemeineInformationen();

	/**
	 * Sets the value of the '{@link FreitparkModel.Freizeitpark#getAllgemeineInformationen <em>Allgemeine Informationen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allgemeine Informationen</em>' containment reference.
	 * @see #getAllgemeineInformationen()
	 * @generated
	 */
	void setAllgemeineInformationen(AllgemeineInformationen value);

} // Freizeitpark
