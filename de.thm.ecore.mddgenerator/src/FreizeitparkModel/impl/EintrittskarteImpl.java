/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.Eintrittskarte;
import FreizeitparkModel.FreizeitparkModelPackage;
import FreizeitparkModel.Personengruppe;
import FreizeitparkModel.�bernachtungsm�glichkeit;

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
 * An implementation of the model object '<em><b>Eintrittskarte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.impl.EintrittskarteImpl#getTageG�ltig <em>Tage G�ltig</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.EintrittskarteImpl#getName <em>Name</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.EintrittskarteImpl#getPreis <em>Preis</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.EintrittskarteImpl#getPersonenGruppen <em>Personen Gruppen</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.EintrittskarteImpl#get�bernachtungIn <em>�bernachtung In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EintrittskarteImpl extends MinimalEObjectImpl.Container implements Eintrittskarte {
	/**
	 * The default value of the '{@link #getTageG�ltig() <em>Tage G�ltig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTageG�ltig()
	 * @generated
	 * @ordered
	 */
	protected static final int TAGE_G�LTIG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTageG�ltig() <em>Tage G�ltig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTageG�ltig()
	 * @generated
	 * @ordered
	 */
	protected int tageG�ltig = TAGE_G�LTIG_EDEFAULT;

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
	 * The default value of the '{@link #getPreis() <em>Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreis()
	 * @generated
	 * @ordered
	 */
	protected static final double PREIS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPreis() <em>Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreis()
	 * @generated
	 * @ordered
	 */
	protected double preis = PREIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersonenGruppen() <em>Personen Gruppen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonenGruppen()
	 * @generated
	 * @ordered
	 */
	protected EList<Personengruppe> personenGruppen;

	/**
	 * The cached value of the '{@link #get�bernachtungIn() <em>�bernachtung In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get�bernachtungIn()
	 * @generated
	 * @ordered
	 */
	protected �bernachtungsm�glichkeit �bernachtungIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EintrittskarteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreizeitparkModelPackage.Literals.EINTRITTSKARTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTageG�ltig() {
		return tageG�ltig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTageG�ltig(int newTageG�ltig) {
		int oldTageG�ltig = tageG�ltig;
		tageG�ltig = newTageG�ltig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.EINTRITTSKARTE__TAGE_G�LTIG, oldTageG�ltig, tageG�ltig));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.EINTRITTSKARTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPreis() {
		return preis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreis(double newPreis) {
		double oldPreis = preis;
		preis = newPreis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.EINTRITTSKARTE__PREIS, oldPreis, preis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Personengruppe> getPersonenGruppen() {
		if (personenGruppen == null) {
			personenGruppen = new EObjectContainmentEList<Personengruppe>(Personengruppe.class, this, FreizeitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN);
		}
		return personenGruppen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public �bernachtungsm�glichkeit get�bernachtungIn() {
		if (�bernachtungIn != null && �bernachtungIn.eIsProxy()) {
			InternalEObject old�bernachtungIn = (InternalEObject)�bernachtungIn;
			�bernachtungIn = (�bernachtungsm�glichkeit)eResolveProxy(old�bernachtungIn);
			if (�bernachtungIn != old�bernachtungIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreizeitparkModelPackage.EINTRITTSKARTE__�BERNACHTUNG_IN, old�bernachtungIn, �bernachtungIn));
			}
		}
		return �bernachtungIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public �bernachtungsm�glichkeit basicGet�bernachtungIn() {
		return �bernachtungIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set�bernachtungIn(�bernachtungsm�glichkeit new�bernachtungIn) {
		�bernachtungsm�glichkeit old�bernachtungIn = �bernachtungIn;
		�bernachtungIn = new�bernachtungIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.EINTRITTSKARTE__�BERNACHTUNG_IN, old�bernachtungIn, �bernachtungIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreizeitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN:
				return ((InternalEList<?>)getPersonenGruppen()).basicRemove(otherEnd, msgs);
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
			case FreizeitparkModelPackage.EINTRITTSKARTE__TAGE_G�LTIG:
				return getTageG�ltig();
			case FreizeitparkModelPackage.EINTRITTSKARTE__NAME:
				return getName();
			case FreizeitparkModelPackage.EINTRITTSKARTE__PREIS:
				return getPreis();
			case FreizeitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN:
				return getPersonenGruppen();
			case FreizeitparkModelPackage.EINTRITTSKARTE__�BERNACHTUNG_IN:
				if (resolve) return get�bernachtungIn();
				return basicGet�bernachtungIn();
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
			case FreizeitparkModelPackage.EINTRITTSKARTE__TAGE_G�LTIG:
				setTageG�ltig((Integer)newValue);
				return;
			case FreizeitparkModelPackage.EINTRITTSKARTE__NAME:
				setName((String)newValue);
				return;
			case FreizeitparkModelPackage.EINTRITTSKARTE__PREIS:
				setPreis((Double)newValue);
				return;
			case FreizeitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN:
				getPersonenGruppen().clear();
				getPersonenGruppen().addAll((Collection<? extends Personengruppe>)newValue);
				return;
			case FreizeitparkModelPackage.EINTRITTSKARTE__�BERNACHTUNG_IN:
				set�bernachtungIn((�bernachtungsm�glichkeit)newValue);
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
			case FreizeitparkModelPackage.EINTRITTSKARTE__TAGE_G�LTIG:
				setTageG�ltig(TAGE_G�LTIG_EDEFAULT);
				return;
			case FreizeitparkModelPackage.EINTRITTSKARTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FreizeitparkModelPackage.EINTRITTSKARTE__PREIS:
				setPreis(PREIS_EDEFAULT);
				return;
			case FreizeitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN:
				getPersonenGruppen().clear();
				return;
			case FreizeitparkModelPackage.EINTRITTSKARTE__�BERNACHTUNG_IN:
				set�bernachtungIn((�bernachtungsm�glichkeit)null);
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
			case FreizeitparkModelPackage.EINTRITTSKARTE__TAGE_G�LTIG:
				return tageG�ltig != TAGE_G�LTIG_EDEFAULT;
			case FreizeitparkModelPackage.EINTRITTSKARTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FreizeitparkModelPackage.EINTRITTSKARTE__PREIS:
				return preis != PREIS_EDEFAULT;
			case FreizeitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN:
				return personenGruppen != null && !personenGruppen.isEmpty();
			case FreizeitparkModelPackage.EINTRITTSKARTE__�BERNACHTUNG_IN:
				return �bernachtungIn != null;
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
		result.append(" (tageG�ltig: ");
		result.append(tageG�ltig);
		result.append(", name: ");
		result.append(name);
		result.append(", preis: ");
		result.append(preis);
		result.append(')');
		return result.toString();
	}

} //EintrittskarteImpl
