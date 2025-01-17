/**
 */
package FreizeitparkModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.Tag#getÖffnetUm <em>Öffnet Um</em>}</li>
 *   <li>{@link FreizeitparkModel.Tag#getSchließtUm <em>Schließt Um</em>}</li>
 *   <li>{@link FreizeitparkModel.Tag#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see FreizeitparkModel.FreizeitparkModelPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject {
	/**
	 * Returns the value of the '<em><b>Öffnet Um</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Öffnet Um</em>' attribute.
	 * @see #setÖffnetUm(String)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getTag_ÖffnetUm()
	 * @model
	 * @generated
	 */
	String getÖffnetUm();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Tag#getÖffnetUm <em>Öffnet Um</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Öffnet Um</em>' attribute.
	 * @see #getÖffnetUm()
	 * @generated
	 */
	void setÖffnetUm(String value);

	/**
	 * Returns the value of the '<em><b>Schließt Um</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schließt Um</em>' attribute.
	 * @see #setSchließtUm(String)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getTag_SchließtUm()
	 * @model
	 * @generated
	 */
	String getSchließtUm();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Tag#getSchließtUm <em>Schließt Um</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schließt Um</em>' attribute.
	 * @see #getSchließtUm()
	 * @generated
	 */
	void setSchließtUm(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getTag_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Tag
