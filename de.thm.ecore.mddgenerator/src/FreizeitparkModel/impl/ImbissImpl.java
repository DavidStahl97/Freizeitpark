/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.FreizeitparkModelPackage;
import FreizeitparkModel.Imbiss;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imbiss</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.impl.ImbissImpl#getSpezialGericht <em>Spezial Gericht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImbissImpl extends GastronomieImpl implements Imbiss {
	/**
	 * The default value of the '{@link #getSpezialGericht() <em>Spezial Gericht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpezialGericht()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEZIAL_GERICHT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSpezialGericht() <em>Spezial Gericht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpezialGericht()
	 * @generated
	 * @ordered
	 */
	protected String spezialGericht = SPEZIAL_GERICHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImbissImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreizeitparkModelPackage.Literals.IMBISS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpezialGericht() {
		return spezialGericht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpezialGericht(String newSpezialGericht) {
		String oldSpezialGericht = spezialGericht;
		spezialGericht = newSpezialGericht;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.IMBISS__SPEZIAL_GERICHT, oldSpezialGericht, spezialGericht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreizeitparkModelPackage.IMBISS__SPEZIAL_GERICHT:
				return getSpezialGericht();
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
			case FreizeitparkModelPackage.IMBISS__SPEZIAL_GERICHT:
				setSpezialGericht((String)newValue);
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
			case FreizeitparkModelPackage.IMBISS__SPEZIAL_GERICHT:
				setSpezialGericht(SPEZIAL_GERICHT_EDEFAULT);
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
			case FreizeitparkModelPackage.IMBISS__SPEZIAL_GERICHT:
				return SPEZIAL_GERICHT_EDEFAULT == null ? spezialGericht != null : !SPEZIAL_GERICHT_EDEFAULT.equals(spezialGericht);
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
		result.append(" (spezialGericht: ");
		result.append(spezialGericht);
		result.append(')');
		return result.toString();
	}

} //ImbissImpl
