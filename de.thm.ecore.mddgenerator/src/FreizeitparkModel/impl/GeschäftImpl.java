/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.FreizeitparkModelPackage;
import FreizeitparkModel.Gesch�ft;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gesch�ft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.impl.Gesch�ftImpl#getVerkaufsFl�che <em>Verkaufs Fl�che</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Gesch�ftImpl extends VerkaufsladenImpl implements Gesch�ft {
	/**
	 * The default value of the '{@link #getVerkaufsFl�che() <em>Verkaufs Fl�che</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkaufsFl�che()
	 * @generated
	 * @ordered
	 */
	protected static final int VERKAUFS_FL�CHE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getVerkaufsFl�che() <em>Verkaufs Fl�che</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkaufsFl�che()
	 * @generated
	 * @ordered
	 */
	protected int verkaufsFl�che = VERKAUFS_FL�CHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gesch�ftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreizeitparkModelPackage.Literals.GESCH�FT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVerkaufsFl�che() {
		return verkaufsFl�che;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerkaufsFl�che(int newVerkaufsFl�che) {
		int oldVerkaufsFl�che = verkaufsFl�che;
		verkaufsFl�che = newVerkaufsFl�che;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.GESCH�FT__VERKAUFS_FL�CHE, oldVerkaufsFl�che, verkaufsFl�che));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreizeitparkModelPackage.GESCH�FT__VERKAUFS_FL�CHE:
				return getVerkaufsFl�che();
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
			case FreizeitparkModelPackage.GESCH�FT__VERKAUFS_FL�CHE:
				setVerkaufsFl�che((Integer)newValue);
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
			case FreizeitparkModelPackage.GESCH�FT__VERKAUFS_FL�CHE:
				setVerkaufsFl�che(VERKAUFS_FL�CHE_EDEFAULT);
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
			case FreizeitparkModelPackage.GESCH�FT__VERKAUFS_FL�CHE:
				return verkaufsFl�che != VERKAUFS_FL�CHE_EDEFAULT;
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
		result.append(" (verkaufsFl�che: ");
		result.append(verkaufsFl�che);
		result.append(')');
		return result.toString();
	}

} //Gesch�ftImpl
