/**
 */
package FreitparkModel.impl;

import FreitparkModel.Eintrittskarte;
import FreitparkModel.FreitparkModelPackage;
import FreitparkModel.Personengruppe;
import FreitparkModel.Übernachtungsmöglichkeit;

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
 *   <li>{@link FreitparkModel.impl.EintrittskarteImpl#getTageGültig <em>Tage Gültig</em>}</li>
 *   <li>{@link FreitparkModel.impl.EintrittskarteImpl#getName <em>Name</em>}</li>
 *   <li>{@link FreitparkModel.impl.EintrittskarteImpl#getPreis <em>Preis</em>}</li>
 *   <li>{@link FreitparkModel.impl.EintrittskarteImpl#getPersonenGruppen <em>Personen Gruppen</em>}</li>
 *   <li>{@link FreitparkModel.impl.EintrittskarteImpl#getÜbernachtungIn <em>Übernachtung In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EintrittskarteImpl extends MinimalEObjectImpl.Container implements Eintrittskarte {
	/**
	 * The default value of the '{@link #getTageGültig() <em>Tage Gültig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTageGültig()
	 * @generated
	 * @ordered
	 */
	protected static final int TAGE_GÜLTIG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTageGültig() <em>Tage Gültig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTageGültig()
	 * @generated
	 * @ordered
	 */
	protected int tageGültig = TAGE_GÜLTIG_EDEFAULT;

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
	 * The cached value of the '{@link #getÜbernachtungIn() <em>Übernachtung In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getÜbernachtungIn()
	 * @generated
	 * @ordered
	 */
	protected Übernachtungsmöglichkeit übernachtungIn;

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
		return FreitparkModelPackage.Literals.EINTRITTSKARTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTageGültig() {
		return tageGültig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTageGültig(int newTageGültig) {
		int oldTageGültig = tageGültig;
		tageGültig = newTageGültig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.EINTRITTSKARTE__TAGE_GÜLTIG, oldTageGültig, tageGültig));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.EINTRITTSKARTE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.EINTRITTSKARTE__PREIS, oldPreis, preis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Personengruppe> getPersonenGruppen() {
		if (personenGruppen == null) {
			personenGruppen = new EObjectContainmentEList<Personengruppe>(Personengruppe.class, this, FreitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN);
		}
		return personenGruppen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Übernachtungsmöglichkeit getÜbernachtungIn() {
		if (übernachtungIn != null && übernachtungIn.eIsProxy()) {
			InternalEObject oldÜbernachtungIn = (InternalEObject)übernachtungIn;
			übernachtungIn = (Übernachtungsmöglichkeit)eResolveProxy(oldÜbernachtungIn);
			if (übernachtungIn != oldÜbernachtungIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreitparkModelPackage.EINTRITTSKARTE__ÜBERNACHTUNG_IN, oldÜbernachtungIn, übernachtungIn));
			}
		}
		return übernachtungIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Übernachtungsmöglichkeit basicGetÜbernachtungIn() {
		return übernachtungIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setÜbernachtungIn(Übernachtungsmöglichkeit newÜbernachtungIn) {
		Übernachtungsmöglichkeit oldÜbernachtungIn = übernachtungIn;
		übernachtungIn = newÜbernachtungIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.EINTRITTSKARTE__ÜBERNACHTUNG_IN, oldÜbernachtungIn, übernachtungIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN:
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
			case FreitparkModelPackage.EINTRITTSKARTE__TAGE_GÜLTIG:
				return getTageGültig();
			case FreitparkModelPackage.EINTRITTSKARTE__NAME:
				return getName();
			case FreitparkModelPackage.EINTRITTSKARTE__PREIS:
				return getPreis();
			case FreitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN:
				return getPersonenGruppen();
			case FreitparkModelPackage.EINTRITTSKARTE__ÜBERNACHTUNG_IN:
				if (resolve) return getÜbernachtungIn();
				return basicGetÜbernachtungIn();
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
			case FreitparkModelPackage.EINTRITTSKARTE__TAGE_GÜLTIG:
				setTageGültig((Integer)newValue);
				return;
			case FreitparkModelPackage.EINTRITTSKARTE__NAME:
				setName((String)newValue);
				return;
			case FreitparkModelPackage.EINTRITTSKARTE__PREIS:
				setPreis((Double)newValue);
				return;
			case FreitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN:
				getPersonenGruppen().clear();
				getPersonenGruppen().addAll((Collection<? extends Personengruppe>)newValue);
				return;
			case FreitparkModelPackage.EINTRITTSKARTE__ÜBERNACHTUNG_IN:
				setÜbernachtungIn((Übernachtungsmöglichkeit)newValue);
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
			case FreitparkModelPackage.EINTRITTSKARTE__TAGE_GÜLTIG:
				setTageGültig(TAGE_GÜLTIG_EDEFAULT);
				return;
			case FreitparkModelPackage.EINTRITTSKARTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FreitparkModelPackage.EINTRITTSKARTE__PREIS:
				setPreis(PREIS_EDEFAULT);
				return;
			case FreitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN:
				getPersonenGruppen().clear();
				return;
			case FreitparkModelPackage.EINTRITTSKARTE__ÜBERNACHTUNG_IN:
				setÜbernachtungIn((Übernachtungsmöglichkeit)null);
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
			case FreitparkModelPackage.EINTRITTSKARTE__TAGE_GÜLTIG:
				return tageGültig != TAGE_GÜLTIG_EDEFAULT;
			case FreitparkModelPackage.EINTRITTSKARTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FreitparkModelPackage.EINTRITTSKARTE__PREIS:
				return preis != PREIS_EDEFAULT;
			case FreitparkModelPackage.EINTRITTSKARTE__PERSONEN_GRUPPEN:
				return personenGruppen != null && !personenGruppen.isEmpty();
			case FreitparkModelPackage.EINTRITTSKARTE__ÜBERNACHTUNG_IN:
				return übernachtungIn != null;
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
		result.append(" (tageGültig: ");
		result.append(tageGültig);
		result.append(", name: ");
		result.append(name);
		result.append(", preis: ");
		result.append(preis);
		result.append(')');
		return result.toString();
	}

} //EintrittskarteImpl
