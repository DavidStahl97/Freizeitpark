/**
 */
package FreizeitparkModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.Hotel#getSternBewertung <em>Stern Bewertung</em>}</li>
 * </ul>
 *
 * @see FreizeitparkModel.FreizeitparkModelPackage#getHotel()
 * @model
 * @generated
 */
public interface Hotel extends Übernachtungsmöglichkeit {
	/**
	 * Returns the value of the '<em><b>Stern Bewertung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stern Bewertung</em>' attribute.
	 * @see #setSternBewertung(int)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getHotel_SternBewertung()
	 * @model
	 * @generated
	 */
	int getSternBewertung();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Hotel#getSternBewertung <em>Stern Bewertung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stern Bewertung</em>' attribute.
	 * @see #getSternBewertung()
	 * @generated
	 */
	void setSternBewertung(int value);

} // Hotel
