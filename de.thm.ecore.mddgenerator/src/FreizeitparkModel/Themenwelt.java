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
 *   <li>{@link FreizeitparkModel.Themenwelt#getVerkaufsL�den <em>Verkaufs L�den</em>}</li>
 *   <li>{@link FreizeitparkModel.Themenwelt#get�bernachtungensm�glichkeiten <em>�bernachtungensm�glichkeiten</em>}</li>
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
	 * Returns the value of the '<em><b>Verkaufs L�den</b></em>' containment reference list.
	 * The list contents are of type {@link FreizeitparkModel.Verkaufsladen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verkaufs L�den</em>' containment reference list.
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getThemenwelt_VerkaufsL�den()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Verkaufsladen> getVerkaufsL�den();

	/**
	 * Returns the value of the '<em><b>�bernachtungensm�glichkeiten</b></em>' containment reference list.
	 * The list contents are of type {@link FreizeitparkModel.�bernachtungsm�glichkeit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>�bernachtungensm�glichkeiten</em>' containment reference list.
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getThemenwelt_�bernachtungensm�glichkeiten()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<�bernachtungsm�glichkeit> get�bernachtungensm�glichkeiten();

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