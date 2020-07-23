/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.FreizeitparkModelPackage;
import FreizeitparkModel.Hotel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.impl.HotelImpl#getSternBewertung <em>Stern Bewertung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotelImpl extends ÜbernachtungsmöglichkeitImpl implements Hotel {
	/**
	 * The default value of the '{@link #getSternBewertung() <em>Stern Bewertung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSternBewertung()
	 * @generated
	 * @ordered
	 */
	protected static final int STERN_BEWERTUNG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSternBewertung() <em>Stern Bewertung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSternBewertung()
	 * @generated
	 * @ordered
	 */
	protected int sternBewertung = STERN_BEWERTUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreizeitparkModelPackage.Literals.HOTEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSternBewertung() {
		return sternBewertung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSternBewertung(int newSternBewertung) {
		int oldSternBewertung = sternBewertung;
		sternBewertung = newSternBewertung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.HOTEL__STERN_BEWERTUNG, oldSternBewertung, sternBewertung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreizeitparkModelPackage.HOTEL__STERN_BEWERTUNG:
				return getSternBewertung();
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
			case FreizeitparkModelPackage.HOTEL__STERN_BEWERTUNG:
				setSternBewertung((Integer)newValue);
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
			case FreizeitparkModelPackage.HOTEL__STERN_BEWERTUNG:
				setSternBewertung(STERN_BEWERTUNG_EDEFAULT);
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
			case FreizeitparkModelPackage.HOTEL__STERN_BEWERTUNG:
				return sternBewertung != STERN_BEWERTUNG_EDEFAULT;
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
		result.append(" (sternBewertung: ");
		result.append(sternBewertung);
		result.append(')');
		return result.toString();
	}

} //HotelImpl
