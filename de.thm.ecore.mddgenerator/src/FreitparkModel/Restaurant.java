/**
 */
package FreitparkModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.Restaurant#getSterneBewertung <em>Sterne Bewertung</em>}</li>
 * </ul>
 *
 * @see FreitparkModel.FreitparkModelPackage#getRestaurant()
 * @model
 * @generated
 */
public interface Restaurant extends Gastronomie {
	/**
	 * Returns the value of the '<em><b>Sterne Bewertung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sterne Bewertung</em>' attribute.
	 * @see #setSterneBewertung(int)
	 * @see FreitparkModel.FreitparkModelPackage#getRestaurant_SterneBewertung()
	 * @model
	 * @generated
	 */
	int getSterneBewertung();

	/**
	 * Sets the value of the '{@link FreitparkModel.Restaurant#getSterneBewertung <em>Sterne Bewertung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sterne Bewertung</em>' attribute.
	 * @see #getSterneBewertung()
	 * @generated
	 */
	void setSterneBewertung(int value);

} // Restaurant