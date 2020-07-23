/**
 */
package FreizeitparkModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Themenwelt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.Themenwelt#getAttraktionen <em>Attraktionen</em>}</li>
 *   <li>{@link FreizeitparkModel.Themenwelt#getVerkaufsLäden <em>Verkaufs Läden</em>}</li>
 *   <li>{@link FreizeitparkModel.Themenwelt#getÜbernachtungensmöglichkeiten <em>Übernachtungensmöglichkeiten</em>}</li>
 *   <li>{@link FreizeitparkModel.Themenwelt#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see FreizeitparkModel.FreizeitparkModelPackage#getThemenwelt()
 * @model
 * @generated
 */
public interface Themenwelt extends EObject {
	/**
	 * Returns the value of the '<em><b>Attraktionen</b></em>' containment reference list.
	 * The list contents are of type {@link FreizeitparkModel.Attraktion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attraktionen</em>' containment reference list.
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getThemenwelt_Attraktionen()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attraktion> getAttraktionen();

	/**
	 * Returns the value of the '<em><b>Verkaufs Läden</b></em>' containment reference list.
	 * The list contents are of type {@link FreizeitparkModel.Verkaufsladen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verkaufs Läden</em>' containment reference list.
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getThemenwelt_VerkaufsLäden()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Verkaufsladen> getVerkaufsLäden();

	/**
	 * Returns the value of the '<em><b>Übernachtungensmöglichkeiten</b></em>' containment reference list.
	 * The list contents are of type {@link FreizeitparkModel.Übernachtungsmöglichkeit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Übernachtungensmöglichkeiten</em>' containment reference list.
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getThemenwelt_Übernachtungensmöglichkeiten()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Übernachtungsmöglichkeit> getÜbernachtungensmöglichkeiten();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getThemenwelt_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Themenwelt#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Themenwelt
