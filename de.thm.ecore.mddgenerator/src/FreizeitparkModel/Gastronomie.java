/**
 */
package FreizeitparkModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gastronomie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.Gastronomie#getAnzahlPlätze <em>Anzahl Plätze</em>}</li>
 * </ul>
 *
 * @see FreizeitparkModel.FreizeitparkModelPackage#getGastronomie()
 * @model abstract="true"
 * @generated
 */
public interface Gastronomie extends Verkaufsladen {
	/**
	 * Returns the value of the '<em><b>Anzahl Plätze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Plätze</em>' attribute.
	 * @see #setAnzahlPlätze(int)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getGastronomie_AnzahlPlätze()
	 * @model
	 * @generated
	 */
	int getAnzahlPlätze();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Gastronomie#getAnzahlPlätze <em>Anzahl Plätze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Plätze</em>' attribute.
	 * @see #getAnzahlPlätze()
	 * @generated
	 */
	void setAnzahlPlätze(int value);

} // Gastronomie
