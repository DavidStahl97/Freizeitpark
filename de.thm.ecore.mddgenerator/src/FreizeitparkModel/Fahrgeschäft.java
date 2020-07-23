/**
 */
package FreizeitparkModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fahrgeschäft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.Fahrgeschäft#getMindestGröße <em>Mindest Größe</em>}</li>
 * </ul>
 *
 * @see FreizeitparkModel.FreizeitparkModelPackage#getFahrgeschäft()
 * @model
 * @generated
 */
public interface Fahrgeschäft extends Attraktion {
	/**
	 * Returns the value of the '<em><b>Mindest Größe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mindest Größe</em>' attribute.
	 * @see #setMindestGröße(double)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getFahrgeschäft_MindestGröße()
	 * @model
	 * @generated
	 */
	double getMindestGröße();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Fahrgeschäft#getMindestGröße <em>Mindest Größe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mindest Größe</em>' attribute.
	 * @see #getMindestGröße()
	 * @generated
	 */
	void setMindestGröße(double value);

} // Fahrgeschäft
