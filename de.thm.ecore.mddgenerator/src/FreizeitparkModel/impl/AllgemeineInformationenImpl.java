/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.AllgemeineInformationen;
import FreizeitparkModel.FreizeitparkModelPackage;
import FreizeitparkModel.Tag;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allgemeine Informationen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.impl.AllgemeineInformationenImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.AllgemeineInformationenImpl#getZeitplan <em>Zeitplan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllgemeineInformationenImpl extends MinimalEObjectImpl.Container implements AllgemeineInformationen {
	/**
	 * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZeitplan() <em>Zeitplan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitplan()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> zeitplan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllgemeineInformationenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreizeitparkModelPackage.Literals.ALLGEMEINE_INFORMATIONEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeschreibung(String newBeschreibung) {
		String oldBeschreibung = beschreibung;
		beschreibung = newBeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN__BESCHREIBUNG, oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getZeitplan() {
		if (zeitplan == null) {
			zeitplan = new EObjectContainmentEList<Tag>(Tag.class, this, FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN__ZEITPLAN);
		}
		return zeitplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN__ZEITPLAN:
				return ((InternalEList<?>)getZeitplan()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN__BESCHREIBUNG:
				return getBeschreibung();
			case FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN__ZEITPLAN:
				return getZeitplan();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN__BESCHREIBUNG:
				setBeschreibung((String)newValue);
				return;
			case FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN__ZEITPLAN:
				getZeitplan().clear();
				getZeitplan().addAll((Collection<? extends Tag>)newValue);
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
			case FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN__BESCHREIBUNG:
				setBeschreibung(BESCHREIBUNG_EDEFAULT);
				return;
			case FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN__ZEITPLAN:
				getZeitplan().clear();
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
			case FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN__BESCHREIBUNG:
				return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
			case FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN__ZEITPLAN:
				return zeitplan != null && !zeitplan.isEmpty();
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
		result.append(" (beschreibung: ");
		result.append(beschreibung);
		result.append(')');
		return result.toString();
	}

} //AllgemeineInformationenImpl
