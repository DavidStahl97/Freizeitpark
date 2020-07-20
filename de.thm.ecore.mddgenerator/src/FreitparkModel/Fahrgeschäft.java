/**
 */
package FreitparkModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fahrgeschäft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.Fahrgeschäft#getMindestGröße <em>Mindest Größe</em>}</li>
 * </ul>
 *
 * @see FreitparkModel.FreitparkModelPackage#getFahrgeschäft()
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
	 * @see FreitparkModel.FreitparkModelPackage#getFahrgeschäft_MindestGröße()
	 * @model
	 * @generated
	 */
	double getMindestGröße();

	/**
	 * Sets the value of the '{@link FreitparkModel.Fahrgeschäft#getMindestGröße <em>Mindest Größe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mindest Größe</em>' attribute.
	 * @see #getMindestGröße()
	 * @generated
	 */
	void setMindestGröße(double value);

} // Fahrgeschäft
