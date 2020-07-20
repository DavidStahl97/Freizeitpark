/**
 */
package FreitparkModel.impl;

import FreitparkModel.FreitparkModelPackage;
import FreitparkModel.Tag;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.impl.TagImpl#get�ffnetUm <em>�ffnet Um</em>}</li>
 *   <li>{@link FreitparkModel.impl.TagImpl#getSchlie�tUm <em>Schlie�t Um</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends MinimalEObjectImpl.Container implements Tag {
	/**
	 * The default value of the '{@link #get�ffnetUm() <em>�ffnet Um</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get�ffnetUm()
	 * @generated
	 * @ordered
	 */
	protected static final String �FFNET_UM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get�ffnetUm() <em>�ffnet Um</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get�ffnetUm()
	 * @generated
	 * @ordered
	 */
	protected String �ffnetUm = �FFNET_UM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchlie�tUm() <em>Schlie�t Um</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlie�tUm()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHLIESST_UM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchlie�tUm() <em>Schlie�t Um</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlie�tUm()
	 * @generated
	 * @ordered
	 */
	protected String schlie�tUm = SCHLIESST_UM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreitparkModelPackage.Literals.TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String get�ffnetUm() {
		return �ffnetUm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set�ffnetUm(String new�ffnetUm) {
		String old�ffnetUm = �ffnetUm;
		�ffnetUm = new�ffnetUm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.TAG__�FFNET_UM, old�ffnetUm, �ffnetUm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchlie�tUm() {
		return schlie�tUm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchlie�tUm(String newSchlie�tUm) {
		String oldSchlie�tUm = schlie�tUm;
		schlie�tUm = newSchlie�tUm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.TAG__SCHLIESST_UM, oldSchlie�tUm, schlie�tUm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreitparkModelPackage.TAG__�FFNET_UM:
				return get�ffnetUm();
			case FreitparkModelPackage.TAG__SCHLIESST_UM:
				return getSchlie�tUm();
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
			case FreitparkModelPackage.TAG__�FFNET_UM:
				set�ffnetUm((String)newValue);
				return;
			case FreitparkModelPackage.TAG__SCHLIESST_UM:
				setSchlie�tUm((String)newValue);
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
			case FreitparkModelPackage.TAG__�FFNET_UM:
				set�ffnetUm(�FFNET_UM_EDEFAULT);
				return;
			case FreitparkModelPackage.TAG__SCHLIESST_UM:
				setSchlie�tUm(SCHLIESST_UM_EDEFAULT);
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
			case FreitparkModelPackage.TAG__�FFNET_UM:
				return �FFNET_UM_EDEFAULT == null ? �ffnetUm != null : !�FFNET_UM_EDEFAULT.equals(�ffnetUm);
			case FreitparkModelPackage.TAG__SCHLIESST_UM:
				return SCHLIESST_UM_EDEFAULT == null ? schlie�tUm != null : !SCHLIESST_UM_EDEFAULT.equals(schlie�tUm);
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
		result.append(" (�ffnetUm: ");
		result.append(�ffnetUm);
		result.append(", schlie�tUm: ");
		result.append(schlie�tUm);
		result.append(')');
		return result.toString();
	}

} //TagImpl
