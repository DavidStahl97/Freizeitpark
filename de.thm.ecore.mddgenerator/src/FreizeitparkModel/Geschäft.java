/**
 */
package FreizeitparkModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geschäft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.Geschäft#getVerkaufsFläche <em>Verkaufs Fläche</em>}</li>
 * </ul>
 *
 * @see FreizeitparkModel.FreizeitparkModelPackage#getGeschäft()
 * @model
 * @generated
 */
public interface Geschäft extends Verkaufsladen {

	/**
	 * Returns the value of the '<em><b>Verkaufs Fläche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verkaufs Fläche</em>' attribute.
	 * @see #setVerkaufsFläche(int)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getGeschäft_VerkaufsFläche()
	 * @model
	 * @generated
	 */
	int getVerkaufsFläche();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Geschäft#getVerkaufsFläche <em>Verkaufs Fläche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verkaufs Fläche</em>' attribute.
	 * @see #getVerkaufsFläche()
	 * @generated
	 */
	void setVerkaufsFläche(int value);
} // Geschäft
