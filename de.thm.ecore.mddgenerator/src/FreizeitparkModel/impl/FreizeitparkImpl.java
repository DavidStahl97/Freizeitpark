/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.AllgemeineInformationen;
import FreizeitparkModel.Design;
import FreizeitparkModel.Eintrittskarte;
import FreizeitparkModel.Freizeitpark;
import FreizeitparkModel.FreizeitparkModelPackage;
import FreizeitparkModel.Themenwelt;

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
 * An implementation of the model object '<em><b>Freizeitpark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.impl.FreizeitparkImpl#getThemenWelten <em>Themen Welten</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.FreizeitparkImpl#getName <em>Name</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.FreizeitparkImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.FreizeitparkImpl#getEintrittskarten <em>Eintrittskarten</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.FreizeitparkImpl#getAllgemeineInformationen <em>Allgemeine Informationen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreizeitparkImpl extends MinimalEObjectImpl.Container implements Freizeitpark {
	/**
	 * The cached value of the '{@link #getThemenWelten() <em>Themen Welten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThemenWelten()
	 * @generated
	 * @ordered
	 */
	protected EList<Themenwelt> themenWelten;

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
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected Design design;

	/**
	 * The cached value of the '{@link #getEintrittskarten() <em>Eintrittskarten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEintrittskarten()
	 * @generated
	 * @ordered
	 */
	protected EList<Eintrittskarte> eintrittskarten;

	/**
	 * The cached value of the '{@link #getAllgemeineInformationen() <em>Allgemeine Informationen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllgemeineInformationen()
	 * @generated
	 * @ordered
	 */
	protected AllgemeineInformationen allgemeineInformationen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreizeitparkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreizeitparkModelPackage.Literals.FREIZEITPARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Themenwelt> getThemenWelten() {
		if (themenWelten == null) {
			themenWelten = new EObjectContainmentEList<Themenwelt>(Themenwelt.class, this, FreizeitparkModelPackage.FREIZEITPARK__THEMEN_WELTEN);
		}
		return themenWelten;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.FREIZEITPARK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Design getDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(Design newDesign, NotificationChain msgs) {
		Design oldDesign = design;
		design = newDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.FREIZEITPARK__DESIGN, oldDesign, newDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesign(Design newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FreizeitparkModelPackage.FREIZEITPARK__DESIGN, null, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FreizeitparkModelPackage.FREIZEITPARK__DESIGN, null, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.FREIZEITPARK__DESIGN, newDesign, newDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Eintrittskarte> getEintrittskarten() {
		if (eintrittskarten == null) {
			eintrittskarten = new EObjectContainmentEList<Eintrittskarte>(Eintrittskarte.class, this, FreizeitparkModelPackage.FREIZEITPARK__EINTRITTSKARTEN);
		}
		return eintrittskarten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineInformationen getAllgemeineInformationen() {
		return allgemeineInformationen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllgemeineInformationen(AllgemeineInformationen newAllgemeineInformationen, NotificationChain msgs) {
		AllgemeineInformationen oldAllgemeineInformationen = allgemeineInformationen;
		allgemeineInformationen = newAllgemeineInformationen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.FREIZEITPARK__ALLGEMEINE_INFORMATIONEN, oldAllgemeineInformationen, newAllgemeineInformationen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllgemeineInformationen(AllgemeineInformationen newAllgemeineInformationen) {
		if (newAllgemeineInformationen != allgemeineInformationen) {
			NotificationChain msgs = null;
			if (allgemeineInformationen != null)
				msgs = ((InternalEObject)allgemeineInformationen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FreizeitparkModelPackage.FREIZEITPARK__ALLGEMEINE_INFORMATIONEN, null, msgs);
			if (newAllgemeineInformationen != null)
				msgs = ((InternalEObject)newAllgemeineInformationen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FreizeitparkModelPackage.FREIZEITPARK__ALLGEMEINE_INFORMATIONEN, null, msgs);
			msgs = basicSetAllgemeineInformationen(newAllgemeineInformationen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.FREIZEITPARK__ALLGEMEINE_INFORMATIONEN, newAllgemeineInformationen, newAllgemeineInformationen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreizeitparkModelPackage.FREIZEITPARK__THEMEN_WELTEN:
				return ((InternalEList<?>)getThemenWelten()).basicRemove(otherEnd, msgs);
			case FreizeitparkModelPackage.FREIZEITPARK__DESIGN:
				return basicSetDesign(null, msgs);
			case FreizeitparkModelPackage.FREIZEITPARK__EINTRITTSKARTEN:
				return ((InternalEList<?>)getEintrittskarten()).basicRemove(otherEnd, msgs);
			case FreizeitparkModelPackage.FREIZEITPARK__ALLGEMEINE_INFORMATIONEN:
				return basicSetAllgemeineInformationen(null, msgs);
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
			case FreizeitparkModelPackage.FREIZEITPARK__THEMEN_WELTEN:
				return getThemenWelten();
			case FreizeitparkModelPackage.FREIZEITPARK__NAME:
				return getName();
			case FreizeitparkModelPackage.FREIZEITPARK__DESIGN:
				return getDesign();
			case FreizeitparkModelPackage.FREIZEITPARK__EINTRITTSKARTEN:
				return getEintrittskarten();
			case FreizeitparkModelPackage.FREIZEITPARK__ALLGEMEINE_INFORMATIONEN:
				return getAllgemeineInformationen();
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
			case FreizeitparkModelPackage.FREIZEITPARK__THEMEN_WELTEN:
				getThemenWelten().clear();
				getThemenWelten().addAll((Collection<? extends Themenwelt>)newValue);
				return;
			case FreizeitparkModelPackage.FREIZEITPARK__NAME:
				setName((String)newValue);
				return;
			case FreizeitparkModelPackage.FREIZEITPARK__DESIGN:
				setDesign((Design)newValue);
				return;
			case FreizeitparkModelPackage.FREIZEITPARK__EINTRITTSKARTEN:
				getEintrittskarten().clear();
				getEintrittskarten().addAll((Collection<? extends Eintrittskarte>)newValue);
				return;
			case FreizeitparkModelPackage.FREIZEITPARK__ALLGEMEINE_INFORMATIONEN:
				setAllgemeineInformationen((AllgemeineInformationen)newValue);
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
			case FreizeitparkModelPackage.FREIZEITPARK__THEMEN_WELTEN:
				getThemenWelten().clear();
				return;
			case FreizeitparkModelPackage.FREIZEITPARK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FreizeitparkModelPackage.FREIZEITPARK__DESIGN:
				setDesign((Design)null);
				return;
			case FreizeitparkModelPackage.FREIZEITPARK__EINTRITTSKARTEN:
				getEintrittskarten().clear();
				return;
			case FreizeitparkModelPackage.FREIZEITPARK__ALLGEMEINE_INFORMATIONEN:
				setAllgemeineInformationen((AllgemeineInformationen)null);
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
			case FreizeitparkModelPackage.FREIZEITPARK__THEMEN_WELTEN:
				return themenWelten != null && !themenWelten.isEmpty();
			case FreizeitparkModelPackage.FREIZEITPARK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FreizeitparkModelPackage.FREIZEITPARK__DESIGN:
				return design != null;
			case FreizeitparkModelPackage.FREIZEITPARK__EINTRITTSKARTEN:
				return eintrittskarten != null && !eintrittskarten.isEmpty();
			case FreizeitparkModelPackage.FREIZEITPARK__ALLGEMEINE_INFORMATIONEN:
				return allgemeineInformationen != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FreizeitparkImpl
