/**
 */
package FreizeitparkModel;

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
 *   <li>{@link FreizeitparkModel.Freizeitpark#getThemenWelten <em>Themen Welten</em>}</li>
 *   <li>{@link FreizeitparkModel.Freizeitpark#getName <em>Name</em>}</li>
 *   <li>{@link FreizeitparkModel.Freizeitpark#getDesign <em>Design</em>}</li>
 *   <li>{@link FreizeitparkModel.Freizeitpark#getEintrittskarten <em>Eintrittskarten</em>}</li>
 *   <li>{@link FreizeitparkModel.Freizeitpark#getAllgemeineInformationen <em>Allgemeine Informationen</em>}</li>
 * </ul>
 *
 * @see FreizeitparkModel.FreizeitparkModelPackage#getFreizeitpark()
 * @model
 * @generated
 */
public interface Freizeitpark extends EObject {
	/**
	 * Returns the value of the '<em><b>Themen Welten</b></em>' containment reference list.
	 * The list contents are of type {@link FreizeitparkModel.Themenwelt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Themen Welten</em>' containment reference list.
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getFreizeitpark_ThemenWelten()
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
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getFreizeitpark_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Freizeitpark#getName <em>Name</em>}' attribute.
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
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getFreizeitpark_Design()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Design getDesign();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Freizeitpark#getDesign <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' containment reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(Design value);

	/**
	 * Returns the value of the '<em><b>Eintrittskarten</b></em>' containment reference list.
	 * The list contents are of type {@link FreizeitparkModel.Eintrittskarte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eintrittskarten</em>' containment reference list.
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getFreizeitpark_Eintrittskarten()
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
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getFreizeitpark_AllgemeineInformationen()
	 * @model containment="true"
	 * @generated
	 */
	AllgemeineInformationen getAllgemeineInformationen();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Freizeitpark#getAllgemeineInformationen <em>Allgemeine Informationen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allgemeine Informationen</em>' containment reference.
	 * @see #getAllgemeineInformationen()
	 * @generated
	 */
	void setAllgemeineInformationen(AllgemeineInformationen value);

} // Freizeitpark
