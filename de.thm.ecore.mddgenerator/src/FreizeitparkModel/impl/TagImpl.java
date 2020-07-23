/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.FreizeitparkModelPackage;
import FreizeitparkModel.Tag;

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
 *   <li>{@link FreizeitparkModel.impl.TagImpl#get÷ffnetUm <em>÷ffnet Um</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.TagImpl#getSchlieﬂtUm <em>Schlieﬂt Um</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.TagImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends MinimalEObjectImpl.Container implements Tag {
	/**
	 * The default value of the '{@link #get÷ffnetUm() <em>÷ffnet Um</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get÷ffnetUm()
	 * @generated
	 * @ordered
	 */
	protected static final String ÷FFNET_UM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get÷ffnetUm() <em>÷ffnet Um</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get÷ffnetUm()
	 * @generated
	 * @ordered
	 */
	protected String ˆffnetUm = ÷FFNET_UM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchlieﬂtUm() <em>Schlieﬂt Um</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlieﬂtUm()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHLIESST_UM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchlieﬂtUm() <em>Schlieﬂt Um</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlieﬂtUm()
	 * @generated
	 * @ordered
	 */
	protected String schlieﬂtUm = SCHLIESST_UM_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
		return FreizeitparkModelPackage.Literals.TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String get÷ffnetUm() {
		return ˆffnetUm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set÷ffnetUm(String new÷ffnetUm) {
		String old÷ffnetUm = ˆffnetUm;
		ˆffnetUm = new÷ffnetUm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.TAG__÷FFNET_UM, old÷ffnetUm, ˆffnetUm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchlieﬂtUm() {
		return schlieﬂtUm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchlieﬂtUm(String newSchlieﬂtUm) {
		String oldSchlieﬂtUm = schlieﬂtUm;
		schlieﬂtUm = newSchlieﬂtUm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.TAG__SCHLIESST_UM, oldSchlieﬂtUm, schlieﬂtUm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.TAG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreizeitparkModelPackage.TAG__÷FFNET_UM:
				return get÷ffnetUm();
			case FreizeitparkModelPackage.TAG__SCHLIESST_UM:
				return getSchlieﬂtUm();
			case FreizeitparkModelPackage.TAG__NAME:
				return getName();
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
			case FreizeitparkModelPackage.TAG__÷FFNET_UM:
				set÷ffnetUm((String)newValue);
				return;
			case FreizeitparkModelPackage.TAG__SCHLIESST_UM:
				setSchlieﬂtUm((String)newValue);
				return;
			case FreizeitparkModelPackage.TAG__NAME:
				setName((String)newValue);
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
			case FreizeitparkModelPackage.TAG__÷FFNET_UM:
				set÷ffnetUm(÷FFNET_UM_EDEFAULT);
				return;
			case FreizeitparkModelPackage.TAG__SCHLIESST_UM:
				setSchlieﬂtUm(SCHLIESST_UM_EDEFAULT);
				return;
			case FreizeitparkModelPackage.TAG__NAME:
				setName(NAME_EDEFAULT);
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
			case FreizeitparkModelPackage.TAG__÷FFNET_UM:
				return ÷FFNET_UM_EDEFAULT == null ? ˆffnetUm != null : !÷FFNET_UM_EDEFAULT.equals(ˆffnetUm);
			case FreizeitparkModelPackage.TAG__SCHLIESST_UM:
				return SCHLIESST_UM_EDEFAULT == null ? schlieﬂtUm != null : !SCHLIESST_UM_EDEFAULT.equals(schlieﬂtUm);
			case FreizeitparkModelPackage.TAG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (ˆffnetUm: ");
		result.append(ˆffnetUm);
		result.append(", schlieﬂtUm: ");
		result.append(schlieﬂtUm);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TagImpl
