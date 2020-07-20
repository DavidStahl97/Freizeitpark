/**
 */
package FreitparkModel.impl;

import FreitparkModel.FreitparkModelPackage;
import FreitparkModel.Gastronomie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gastronomie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.impl.GastronomieImpl#getAnzahlPl�tze <em>Anzahl Pl�tze</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GastronomieImpl extends VerkaufsladenImpl implements Gastronomie {
	/**
	 * The default value of the '{@link #getAnzahlPl�tze() <em>Anzahl Pl�tze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlPl�tze()
	 * @generated
	 * @ordered
	 */
	protected static final int ANZAHL_PL�TZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnzahlPl�tze() <em>Anzahl Pl�tze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlPl�tze()
	 * @generated
	 * @ordered
	 */
	protected int anzahlPl�tze = ANZAHL_PL�TZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GastronomieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreitparkModelPackage.Literals.GASTRONOMIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAnzahlPl�tze() {
		return anzahlPl�tze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnzahlPl�tze(int newAnzahlPl�tze) {
		int oldAnzahlPl�tze = anzahlPl�tze;
		anzahlPl�tze = newAnzahlPl�tze;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.GASTRONOMIE__ANZAHL_PL�TZE, oldAnzahlPl�tze, anzahlPl�tze));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreitparkModelPackage.GASTRONOMIE__ANZAHL_PL�TZE:
				return getAnzahlPl�tze();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FreitparkModelPackage.GASTRONOMIE__ANZAHL_PL�TZE:
				setAnzahlPl�tze((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FreitparkModelPackage.GASTRONOMIE__ANZAHL_PL�TZE:
				setAnzahlPl�tze(ANZAHL_PL�TZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FreitparkModelPackage.GASTRONOMIE__ANZAHL_PL�TZE:
				return anzahlPl�tze != ANZAHL_PL�TZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (anzahlPl�tze: ");
		result.append(anzahlPl�tze);
		result.append(')');
		return result.toString();
	}

} //GastronomieImpl
