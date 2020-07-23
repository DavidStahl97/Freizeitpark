/**
 */
package FreizeitparkModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imbiss</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.Imbiss#getSpezialGericht <em>Spezial Gericht</em>}</li>
 * </ul>
 *
 * @see FreizeitparkModel.FreizeitparkModelPackage#getImbiss()
 * @model
 * @generated
 */
public interface Imbiss extends Gastronomie {

	/**
	 * Returns the value of the '<em><b>Spezial Gericht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spezial Gericht</em>' attribute.
	 * @see #setSpezialGericht(String)
	 * @see FreizeitparkModel.FreizeitparkModelPackage#getImbiss_SpezialGericht()
	 * @model
	 * @generated
	 */
	String getSpezialGericht();

	/**
	 * Sets the value of the '{@link FreizeitparkModel.Imbiss#getSpezialGericht <em>Spezial Gericht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spezial Gericht</em>' attribute.
	 * @see #getSpezialGericht()
	 * @generated
	 */
	void setSpezialGericht(String value);
} // Imbiss
