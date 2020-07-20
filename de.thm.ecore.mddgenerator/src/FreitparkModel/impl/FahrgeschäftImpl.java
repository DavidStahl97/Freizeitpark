/**
 */
package FreitparkModel.impl;

import FreitparkModel.Fahrgeschäft;
import FreitparkModel.FreitparkModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fahrgeschäft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.impl.FahrgeschäftImpl#getMindestGröße <em>Mindest Größe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FahrgeschäftImpl extends AttraktionImpl implements Fahrgeschäft {
	/**
	 * The default value of the '{@link #getMindestGröße() <em>Mindest Größe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMindestGröße()
	 * @generated
	 * @ordered
	 */
	protected static final double MINDEST_GRÖSSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMindestGröße() <em>Mindest Größe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMindestGröße()
	 * @generated
	 * @ordered
	 */
	protected double mindestGröße = MINDEST_GRÖSSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FahrgeschäftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreitparkModelPackage.Literals.FAHRGESCHÄFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMindestGröße() {
		return mindestGröße;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMindestGröße(double newMindestGröße) {
		double oldMindestGröße = mindestGröße;
		mindestGröße = newMindestGröße;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.FAHRGESCHÄFT__MINDEST_GRÖSSE, oldMindestGröße, mindestGröße));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreitparkModelPackage.FAHRGESCHÄFT__MINDEST_GRÖSSE:
				return getMindestGröße();
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
			case FreitparkModelPackage.FAHRGESCHÄFT__MINDEST_GRÖSSE:
				setMindestGröße((Double)newValue);
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
			case FreitparkModelPackage.FAHRGESCHÄFT__MINDEST_GRÖSSE:
				setMindestGröße(MINDEST_GRÖSSE_EDEFAULT);
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
			case FreitparkModelPackage.FAHRGESCHÄFT__MINDEST_GRÖSSE:
				return mindestGröße != MINDEST_GRÖSSE_EDEFAULT;
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
		result.append(" (mindestGröße: ");
		result.append(mindestGröße);
		result.append(')');
		return result.toString();
	}

} //FahrgeschäftImpl
