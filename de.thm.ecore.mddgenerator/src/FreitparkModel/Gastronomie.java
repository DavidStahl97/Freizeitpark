/**
 */
package FreitparkModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gastronomie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.Gastronomie#getAnzahlPl�tze <em>Anzahl Pl�tze</em>}</li>
 * </ul>
 *
 * @see FreitparkModel.FreitparkModelPackage#getGastronomie()
 * @model abstract="true"
 * @generated
 */
public interface Gastronomie extends Verkaufsladen {
	/**
	 * Returns the value of the '<em><b>Anzahl Pl�tze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Pl�tze</em>' attribute.
	 * @see #setAnzahlPl�tze(int)
	 * @see FreitparkModel.FreitparkModelPackage#getGastronomie_AnzahlPl�tze()
	 * @model
	 * @generated
	 */
	int getAnzahlPl�tze();

	/**
	 * Sets the value of the '{@link FreitparkModel.Gastronomie#getAnzahlPl�tze <em>Anzahl Pl�tze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Pl�tze</em>' attribute.
	 * @see #getAnzahlPl�tze()
	 * @generated
	 */
	void setAnzahlPl�tze(int value);

} // Gastronomie
