/**
 */
package FreitparkModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eintrittskarte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.Eintrittskarte#getTageG�ltig <em>Tage G�ltig</em>}</li>
 *   <li>{@link FreitparkModel.Eintrittskarte#getName <em>Name</em>}</li>
 *   <li>{@link FreitparkModel.Eintrittskarte#getPreis <em>Preis</em>}</li>
 *   <li>{@link FreitparkModel.Eintrittskarte#getPersonenGruppen <em>Personen Gruppen</em>}</li>
 *   <li>{@link FreitparkModel.Eintrittskarte#get�bernachtungIn <em>�bernachtung In</em>}</li>
 * </ul>
 *
 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte()
 * @model
 * @generated
 */
public interface Eintrittskarte extends EObject {
	/**
	 * Returns the value of the '<em><b>Tage G�ltig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tage G�ltig</em>' attribute.
	 * @see #setTageG�ltig(int)
	 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte_TageG�ltig()
	 * @model
	 * @generated
	 */
	int getTageG�ltig();

	/**
	 * Sets the value of the '{@link FreitparkModel.Eintrittskarte#getTageG�ltig <em>Tage G�ltig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tage G�ltig</em>' attribute.
	 * @see #getTageG�ltig()
	 * @generated
	 */
	void setTageG�ltig(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreitparkModel.Eintrittskarte#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Preis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preis</em>' attribute.
	 * @see #setPreis(double)
	 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte_Preis()
	 * @model
	 * @generated
	 */
	double getPreis();

	/**
	 * Sets the value of the '{@link FreitparkModel.Eintrittskarte#getPreis <em>Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preis</em>' attribute.
	 * @see #getPreis()
	 * @generated
	 */
	void setPreis(double value);

	/**
	 * Returns the value of the '<em><b>Personen Gruppen</b></em>' containment reference list.
	 * The list contents are of type {@link FreitparkModel.Personengruppe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personen Gruppen</em>' containment reference list.
	 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte_PersonenGruppen()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Personengruppe> getPersonenGruppen();

	/**
	 * Returns the value of the '<em><b>�bernachtung In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>�bernachtung In</em>' reference.
	 * @see #set�bernachtungIn(�bernachtungsm�glichkeit)
	 * @see FreitparkModel.FreitparkModelPackage#getEintrittskarte_�bernachtungIn()
	 * @model
	 * @generated
	 */
	�bernachtungsm�glichkeit get�bernachtungIn();

	/**
	 * Sets the value of the '{@link FreitparkModel.Eintrittskarte#get�bernachtungIn <em>�bernachtung In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>�bernachtung In</em>' reference.
	 * @see #get�bernachtungIn()
	 * @generated
	 */
	void set�bernachtungIn(�bernachtungsm�glichkeit value);

} // Eintrittskarte
