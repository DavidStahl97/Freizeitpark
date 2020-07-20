/**
 */
package FreitparkModel.impl;

import FreitparkModel.Design;
import FreitparkModel.FreitparkModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.impl.DesignImpl#getFarbe1 <em>Farbe1</em>}</li>
 *   <li>{@link FreitparkModel.impl.DesignImpl#getFarbe2 <em>Farbe2</em>}</li>
 *   <li>{@link FreitparkModel.impl.DesignImpl#getFarbe3 <em>Farbe3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignImpl extends MinimalEObjectImpl.Container implements Design {
	/**
	 * The default value of the '{@link #getFarbe1() <em>Farbe1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarbe1()
	 * @generated
	 * @ordered
	 */
	protected static final String FARBE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFarbe1() <em>Farbe1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarbe1()
	 * @generated
	 * @ordered
	 */
	protected String farbe1 = FARBE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFarbe2() <em>Farbe2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarbe2()
	 * @generated
	 * @ordered
	 */
	protected static final String FARBE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFarbe2() <em>Farbe2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarbe2()
	 * @generated
	 * @ordered
	 */
	protected String farbe2 = FARBE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFarbe3() <em>Farbe3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarbe3()
	 * @generated
	 * @ordered
	 */
	protected static final String FARBE3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFarbe3() <em>Farbe3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarbe3()
	 * @generated
	 * @ordered
	 */
	protected String farbe3 = FARBE3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreitparkModelPackage.Literals.DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFarbe1() {
		return farbe1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFarbe1(String newFarbe1) {
		String oldFarbe1 = farbe1;
		farbe1 = newFarbe1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.DESIGN__FARBE1, oldFarbe1, farbe1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFarbe2() {
		return farbe2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFarbe2(String newFarbe2) {
		String oldFarbe2 = farbe2;
		farbe2 = newFarbe2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.DESIGN__FARBE2, oldFarbe2, farbe2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFarbe3() {
		return farbe3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFarbe3(String newFarbe3) {
		String oldFarbe3 = farbe3;
		farbe3 = newFarbe3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.DESIGN__FARBE3, oldFarbe3, farbe3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreitparkModelPackage.DESIGN__FARBE1:
				return getFarbe1();
			case FreitparkModelPackage.DESIGN__FARBE2:
				return getFarbe2();
			case FreitparkModelPackage.DESIGN__FARBE3:
				return getFarbe3();
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
			case FreitparkModelPackage.DESIGN__FARBE1:
				setFarbe1((String)newValue);
				return;
			case FreitparkModelPackage.DESIGN__FARBE2:
				setFarbe2((String)newValue);
				return;
			case FreitparkModelPackage.DESIGN__FARBE3:
				setFarbe3((String)newValue);
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
			case FreitparkModelPackage.DESIGN__FARBE1:
				setFarbe1(FARBE1_EDEFAULT);
				return;
			case FreitparkModelPackage.DESIGN__FARBE2:
				setFarbe2(FARBE2_EDEFAULT);
				return;
			case FreitparkModelPackage.DESIGN__FARBE3:
				setFarbe3(FARBE3_EDEFAULT);
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
			case FreitparkModelPackage.DESIGN__FARBE1:
				return FARBE1_EDEFAULT == null ? farbe1 != null : !FARBE1_EDEFAULT.equals(farbe1);
			case FreitparkModelPackage.DESIGN__FARBE2:
				return FARBE2_EDEFAULT == null ? farbe2 != null : !FARBE2_EDEFAULT.equals(farbe2);
			case FreitparkModelPackage.DESIGN__FARBE3:
				return FARBE3_EDEFAULT == null ? farbe3 != null : !FARBE3_EDEFAULT.equals(farbe3);
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
		result.append(" (farbe1: ");
		result.append(farbe1);
		result.append(", farbe2: ");
		result.append(farbe2);
		result.append(", farbe3: ");
		result.append(farbe3);
		result.append(')');
		return result.toString();
	}

} //DesignImpl
