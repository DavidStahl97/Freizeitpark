/**
 */
package FreitparkModel.impl;

import FreitparkModel.Attraktion;
import FreitparkModel.FreitparkModelPackage;
import FreitparkModel.Themenwelt;
import FreitparkModel.Verkaufsladen;
import FreitparkModel.�bernachtungsm�glichkeit;

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
 *   <li>{@link FreitparkModel.impl.ThemenweltImpl#getVerkaufsL�den <em>Verkaufs L�den</em>}</li>
 *   <li>{@link FreitparkModel.impl.ThemenweltImpl#get�bernachtungensm�glichkeiten <em>�bernachtungensm�glichkeiten</em>}</li>
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
	 * The cached value of the '{@link #getVerkaufsL�den() <em>Verkaufs L�den</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkaufsL�den()
	 * @generated
	 * @ordered
	 */
	protected EList<Verkaufsladen> verkaufsL�den;

	/**
	 * The cached value of the '{@link #get�bernachtungensm�glichkeiten() <em>�bernachtungensm�glichkeiten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get�bernachtungensm�glichkeiten()
	 * @generated
	 * @ordered
	 */
	protected EList<�bernachtungsm�glichkeit> �bernachtungensm�glichkeiten;

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
	public EList<Verkaufsladen> getVerkaufsL�den() {
		if (verkaufsL�den == null) {
			verkaufsL�den = new EObjectContainmentEList<Verkaufsladen>(Verkaufsladen.class, this, FreitparkModelPackage.THEMENWELT__VERKAUFS_L�DEN);
		}
		return verkaufsL�den;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<�bernachtungsm�glichkeit> get�bernachtungensm�glichkeiten() {
		if (�bernachtungensm�glichkeiten == null) {
			�bernachtungensm�glichkeiten = new EObjectContainmentEList<�bernachtungsm�glichkeit>(�bernachtungsm�glichkeit.class, this, FreitparkModelPackage.THEMENWELT__�BERNACHTUNGENSM�GLICHKEITEN);
		}
		return �bernachtungensm�glichkeiten;
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
			case FreitparkModelPackage.THEMENWELT__VERKAUFS_L�DEN:
				return ((InternalEList<?>)getVerkaufsL�den()).basicRemove(otherEnd, msgs);
			case FreitparkModelPackage.THEMENWELT__�BERNACHTUNGENSM�GLICHKEITEN:
				return ((InternalEList<?>)get�bernachtungensm�glichkeiten()).basicRemove(otherEnd, msgs);
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
			case FreitparkModelPackage.THEMENWELT__VERKAUFS_L�DEN:
				return getVerkaufsL�den();
			case FreitparkModelPackage.THEMENWELT__�BERNACHTUNGENSM�GLICHKEITEN:
				return get�bernachtungensm�glichkeiten();
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
			case FreitparkModelPackage.THEMENWELT__VERKAUFS_L�DEN:
				getVerkaufsL�den().clear();
				getVerkaufsL�den().addAll((Collection<? extends Verkaufsladen>)newValue);
				return;
			case FreitparkModelPackage.THEMENWELT__�BERNACHTUNGENSM�GLICHKEITEN:
				get�bernachtungensm�glichkeiten().clear();
				get�bernachtungensm�glichkeiten().addAll((Collection<? extends �bernachtungsm�glichkeit>)newValue);
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
			case FreitparkModelPackage.THEMENWELT__VERKAUFS_L�DEN:
				getVerkaufsL�den().clear();
				return;
			case FreitparkModelPackage.THEMENWELT__�BERNACHTUNGENSM�GLICHKEITEN:
				get�bernachtungensm�glichkeiten().clear();
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
			case FreitparkModelPackage.THEMENWELT__VERKAUFS_L�DEN:
				return verkaufsL�den != null && !verkaufsL�den.isEmpty();
			case FreitparkModelPackage.THEMENWELT__�BERNACHTUNGENSM�GLICHKEITEN:
				return �bernachtungensm�glichkeiten != null && !�bernachtungensm�glichkeiten.isEmpty();
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
