/**
 */
package FreitparkModel.impl;

import FreitparkModel.Attraktion;
import FreitparkModel.FreitparkModelPackage;
import FreitparkModel.Themenwelt;
import FreitparkModel.Verkaufsladen;
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
 * An implementation of the model object '<em><b>Themenwelt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.impl.ThemenweltImpl#getAttraktionen <em>Attraktionen</em>}</li>
 *   <li>{@link FreitparkModel.impl.ThemenweltImpl#getVerkaufsLäden <em>Verkaufs Läden</em>}</li>
 *   <li>{@link FreitparkModel.impl.ThemenweltImpl#getÜbernachtungensmöglichkeiten <em>Übernachtungensmöglichkeiten</em>}</li>
 *   <li>{@link FreitparkModel.impl.ThemenweltImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThemenweltImpl extends MinimalEObjectImpl.Container implements Themenwelt {
	/**
	 * The cached value of the '{@link #getAttraktionen() <em>Attraktionen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttraktionen()
	 * @generated
	 * @ordered
	 */
	protected EList<Attraktion> attraktionen;

	/**
	 * The cached value of the '{@link #getVerkaufsLäden() <em>Verkaufs Läden</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkaufsLäden()
	 * @generated
	 * @ordered
	 */
	protected EList<Verkaufsladen> verkaufsLäden;

	/**
	 * The cached value of the '{@link #getÜbernachtungensmöglichkeiten() <em>Übernachtungensmöglichkeiten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getÜbernachtungensmöglichkeiten()
	 * @generated
	 * @ordered
	 */
	protected EList<Übernachtungsmöglichkeit> übernachtungensmöglichkeiten;

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
	protected ThemenweltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreitparkModelPackage.Literals.THEMENWELT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attraktion> getAttraktionen() {
		if (attraktionen == null) {
			attraktionen = new EObjectContainmentEList<Attraktion>(Attraktion.class, this, FreitparkModelPackage.THEMENWELT__ATTRAKTIONEN);
		}
		return attraktionen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Verkaufsladen> getVerkaufsLäden() {
		if (verkaufsLäden == null) {
			verkaufsLäden = new EObjectContainmentEList<Verkaufsladen>(Verkaufsladen.class, this, FreitparkModelPackage.THEMENWELT__VERKAUFS_LÄDEN);
		}
		return verkaufsLäden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Übernachtungsmöglichkeit> getÜbernachtungensmöglichkeiten() {
		if (übernachtungensmöglichkeiten == null) {
			übernachtungensmöglichkeiten = new EObjectContainmentEList<Übernachtungsmöglichkeit>(Übernachtungsmöglichkeit.class, this, FreitparkModelPackage.THEMENWELT__ÜBERNACHTUNGENSMÖGLICHKEITEN);
		}
		return übernachtungensmöglichkeiten;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.THEMENWELT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreitparkModelPackage.THEMENWELT__ATTRAKTIONEN:
				return ((InternalEList<?>)getAttraktionen()).basicRemove(otherEnd, msgs);
			case FreitparkModelPackage.THEMENWELT__VERKAUFS_LÄDEN:
				return ((InternalEList<?>)getVerkaufsLäden()).basicRemove(otherEnd, msgs);
			case FreitparkModelPackage.THEMENWELT__ÜBERNACHTUNGENSMÖGLICHKEITEN:
				return ((InternalEList<?>)getÜbernachtungensmöglichkeiten()).basicRemove(otherEnd, msgs);
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
			case FreitparkModelPackage.THEMENWELT__ATTRAKTIONEN:
				return getAttraktionen();
			case FreitparkModelPackage.THEMENWELT__VERKAUFS_LÄDEN:
				return getVerkaufsLäden();
			case FreitparkModelPackage.THEMENWELT__ÜBERNACHTUNGENSMÖGLICHKEITEN:
				return getÜbernachtungensmöglichkeiten();
			case FreitparkModelPackage.THEMENWELT__NAME:
				return getName();
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
			case FreitparkModelPackage.THEMENWELT__ATTRAKTIONEN:
				getAttraktionen().clear();
				getAttraktionen().addAll((Collection<? extends Attraktion>)newValue);
				return;
			case FreitparkModelPackage.THEMENWELT__VERKAUFS_LÄDEN:
				getVerkaufsLäden().clear();
				getVerkaufsLäden().addAll((Collection<? extends Verkaufsladen>)newValue);
				return;
			case FreitparkModelPackage.THEMENWELT__ÜBERNACHTUNGENSMÖGLICHKEITEN:
				getÜbernachtungensmöglichkeiten().clear();
				getÜbernachtungensmöglichkeiten().addAll((Collection<? extends Übernachtungsmöglichkeit>)newValue);
				return;
			case FreitparkModelPackage.THEMENWELT__NAME:
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
			case FreitparkModelPackage.THEMENWELT__ATTRAKTIONEN:
				getAttraktionen().clear();
				return;
			case FreitparkModelPackage.THEMENWELT__VERKAUFS_LÄDEN:
				getVerkaufsLäden().clear();
				return;
			case FreitparkModelPackage.THEMENWELT__ÜBERNACHTUNGENSMÖGLICHKEITEN:
				getÜbernachtungensmöglichkeiten().clear();
				return;
			case FreitparkModelPackage.THEMENWELT__NAME:
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
			case FreitparkModelPackage.THEMENWELT__ATTRAKTIONEN:
				return attraktionen != null && !attraktionen.isEmpty();
			case FreitparkModelPackage.THEMENWELT__VERKAUFS_LÄDEN:
				return verkaufsLäden != null && !verkaufsLäden.isEmpty();
			case FreitparkModelPackage.THEMENWELT__ÜBERNACHTUNGENSMÖGLICHKEITEN:
				return übernachtungensmöglichkeiten != null && !übernachtungensmöglichkeiten.isEmpty();
			case FreitparkModelPackage.THEMENWELT__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ThemenweltImpl
