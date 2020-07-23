/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.FreizeitparkModelPackage;
import FreizeitparkModel.Restaurant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.impl.RestaurantImpl#getSterneBewertung <em>Sterne Bewertung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestaurantImpl extends GastronomieImpl implements Restaurant {
	/**
	 * The default value of the '{@link #getSterneBewertung() <em>Sterne Bewertung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSterneBewertung()
	 * @generated
	 * @ordered
	 */
	protected static final int STERNE_BEWERTUNG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSterneBewertung() <em>Sterne Bewertung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSterneBewertung()
	 * @generated
	 * @ordered
	 */
	protected int sterneBewertung = STERNE_BEWERTUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreizeitparkModelPackage.Literals.RESTAURANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSterneBewertung() {
		return sterneBewertung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSterneBewertung(int newSterneBewertung) {
		int oldSterneBewertung = sterneBewertung;
		sterneBewertung = newSterneBewertung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.RESTAURANT__STERNE_BEWERTUNG, oldSterneBewertung, sterneBewertung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreizeitparkModelPackage.RESTAURANT__STERNE_BEWERTUNG:
				return getSterneBewertung();
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
			case FreizeitparkModelPackage.RESTAURANT__STERNE_BEWERTUNG:
				setSterneBewertung((Integer)newValue);
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
			case FreizeitparkModelPackage.RESTAURANT__STERNE_BEWERTUNG:
				setSterneBewertung(STERNE_BEWERTUNG_EDEFAULT);
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
			case FreizeitparkModelPackage.RESTAURANT__STERNE_BEWERTUNG:
				return sterneBewertung != STERNE_BEWERTUNG_EDEFAULT;
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
		result.append(" (sterneBewertung: ");
		result.append(sterneBewertung);
		result.append(')');
		return result.toString();
	}

} //RestaurantImpl
