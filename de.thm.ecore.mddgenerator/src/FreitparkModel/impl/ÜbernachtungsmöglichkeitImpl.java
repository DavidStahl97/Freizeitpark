/**
 */
package FreitparkModel.impl;

import FreitparkModel.FreitparkModelPackage;
import FreitparkModel.Übernachtungsmöglichkeit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Übernachtungsmöglichkeit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.impl.ÜbernachtungsmöglichkeitImpl#getKostenProNacht <em>Kosten Pro Nacht</em>}</li>
 *   <li>{@link FreitparkModel.impl.ÜbernachtungsmöglichkeitImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ÜbernachtungsmöglichkeitImpl extends MinimalEObjectImpl.Container implements Übernachtungsmöglichkeit {
	/**
	 * The default value of the '{@link #getKostenProNacht() <em>Kosten Pro Nacht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKostenProNacht()
	 * @generated
	 * @ordered
	 */
	protected static final double KOSTEN_PRO_NACHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getKostenProNacht() <em>Kosten Pro Nacht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKostenProNacht()
	 * @generated
	 * @ordered
	 */
	protected double kostenProNacht = KOSTEN_PRO_NACHT_EDEFAULT;

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
	protected ÜbernachtungsmöglichkeitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreitparkModelPackage.Literals.ÜBERNACHTUNGSMÖGLICHKEIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getKostenProNacht() {
		return kostenProNacht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKostenProNacht(double newKostenProNacht) {
		double oldKostenProNacht = kostenProNacht;
		kostenProNacht = newKostenProNacht;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT, oldKostenProNacht, kostenProNacht));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT:
				return getKostenProNacht();
			case FreitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__NAME:
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
			case FreitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT:
				setKostenProNacht((Double)newValue);
				return;
			case FreitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__NAME:
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
			case FreitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT:
				setKostenProNacht(KOSTEN_PRO_NACHT_EDEFAULT);
				return;
			case FreitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__NAME:
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
			case FreitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT:
				return kostenProNacht != KOSTEN_PRO_NACHT_EDEFAULT;
			case FreitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__NAME:
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
		result.append(" (kostenProNacht: ");
		result.append(kostenProNacht);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ÜbernachtungsmöglichkeitImpl
