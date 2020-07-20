/**
 */
package FreitparkModel.impl;

import FreitparkModel.Fahrgesch�ft;
import FreitparkModel.FreitparkModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fahrgesch�ft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.impl.Fahrgesch�ftImpl#getMindestGr��e <em>Mindest Gr��e</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fahrgesch�ftImpl extends AttraktionImpl implements Fahrgesch�ft {
	/**
	 * The default value of the '{@link #getMindestGr��e() <em>Mindest Gr��e</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMindestGr��e()
	 * @generated
	 * @ordered
	 */
	protected static final double MINDEST_GR�SSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMindestGr��e() <em>Mindest Gr��e</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMindestGr��e()
	 * @generated
	 * @ordered
	 */
	protected double mindestGr��e = MINDEST_GR�SSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fahrgesch�ftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreitparkModelPackage.Literals.FAHRGESCH�FT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMindestGr��e() {
		return mindestGr��e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMindestGr��e(double newMindestGr��e) {
		double oldMindestGr��e = mindestGr��e;
		mindestGr��e = newMindestGr��e;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.FAHRGESCH�FT__MINDEST_GR�SSE, oldMindestGr��e, mindestGr��e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreitparkModelPackage.FAHRGESCH�FT__MINDEST_GR�SSE:
				return getMindestGr��e();
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
			case FreitparkModelPackage.FAHRGESCH�FT__MINDEST_GR�SSE:
				setMindestGr��e((Double)newValue);
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
			case FreitparkModelPackage.FAHRGESCH�FT__MINDEST_GR�SSE:
				setMindestGr��e(MINDEST_GR�SSE_EDEFAULT);
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
			case FreitparkModelPackage.FAHRGESCH�FT__MINDEST_GR�SSE:
				return mindestGr��e != MINDEST_GR�SSE_EDEFAULT;
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
		result.append(" (mindestGr��e: ");
		result.append(mindestGr��e);
		result.append(')');
		return result.toString();
	}

} //Fahrgesch�ftImpl
