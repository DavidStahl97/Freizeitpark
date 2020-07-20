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
 *   <li>{@link FreitparkModel.impl.GastronomieImpl#getAnzahlPlätze <em>Anzahl Plätze</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GastronomieImpl extends VerkaufsladenImpl implements Gastronomie {
	/**
	 * The default value of the '{@link #getAnzahlPlätze() <em>Anzahl Plätze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlPlätze()
	 * @generated
	 * @ordered
	 */
	protected static final int ANZAHL_PLÄTZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnzahlPlätze() <em>Anzahl Plätze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlPlätze()
	 * @generated
	 * @ordered
	 */
	protected int anzahlPlätze = ANZAHL_PLÄTZE_EDEFAULT;

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
	public int getAnzahlPlätze() {
		return anzahlPlätze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnzahlPlätze(int newAnzahlPlätze) {
		int oldAnzahlPlätze = anzahlPlätze;
		anzahlPlätze = newAnzahlPlätze;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.GASTRONOMIE__ANZAHL_PLÄTZE, oldAnzahlPlätze, anzahlPlätze));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreitparkModelPackage.GASTRONOMIE__ANZAHL_PLÄTZE:
				return getAnzahlPlätze();
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
			case FreitparkModelPackage.GASTRONOMIE__ANZAHL_PLÄTZE:
				setAnzahlPlätze((Integer)newValue);
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
			case FreitparkModelPackage.GASTRONOMIE__ANZAHL_PLÄTZE:
				setAnzahlPlätze(ANZAHL_PLÄTZE_EDEFAULT);
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
			case FreitparkModelPackage.GASTRONOMIE__ANZAHL_PLÄTZE:
				return anzahlPlätze != ANZAHL_PLÄTZE_EDEFAULT;
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
		result.append(" (anzahlPlätze: ");
		result.append(anzahlPlätze);
		result.append(')');
		return result.toString();
	}

} //GastronomieImpl
