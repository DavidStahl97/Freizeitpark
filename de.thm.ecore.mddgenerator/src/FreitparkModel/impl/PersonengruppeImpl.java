/**
 */
package FreitparkModel.impl;

import FreitparkModel.FreitparkModelPackage;
import FreitparkModel.Personengruppe;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personengruppe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreitparkModel.impl.PersonengruppeImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link FreitparkModel.impl.PersonengruppeImpl#getAnzahl <em>Anzahl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonengruppeImpl extends MinimalEObjectImpl.Container implements Personengruppe {
	/**
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final String TYP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected String typ = TYP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnzahl() <em>Anzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahl()
	 * @generated
	 * @ordered
	 */
	protected static final int ANZAHL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnzahl() <em>Anzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahl()
	 * @generated
	 * @ordered
	 */
	protected int anzahl = ANZAHL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonengruppeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreitparkModelPackage.Literals.PERSONENGRUPPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTyp(String newTyp) {
		String oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.PERSONENGRUPPE__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAnzahl() {
		return anzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnzahl(int newAnzahl) {
		int oldAnzahl = anzahl;
		anzahl = newAnzahl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreitparkModelPackage.PERSONENGRUPPE__ANZAHL, oldAnzahl, anzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreitparkModelPackage.PERSONENGRUPPE__TYP:
				return getTyp();
			case FreitparkModelPackage.PERSONENGRUPPE__ANZAHL:
				return getAnzahl();
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
			case FreitparkModelPackage.PERSONENGRUPPE__TYP:
				setTyp((String)newValue);
				return;
			case FreitparkModelPackage.PERSONENGRUPPE__ANZAHL:
				setAnzahl((Integer)newValue);
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
			case FreitparkModelPackage.PERSONENGRUPPE__TYP:
				setTyp(TYP_EDEFAULT);
				return;
			case FreitparkModelPackage.PERSONENGRUPPE__ANZAHL:
				setAnzahl(ANZAHL_EDEFAULT);
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
			case FreitparkModelPackage.PERSONENGRUPPE__TYP:
				return TYP_EDEFAULT == null ? typ != null : !TYP_EDEFAULT.equals(typ);
			case FreitparkModelPackage.PERSONENGRUPPE__ANZAHL:
				return anzahl != ANZAHL_EDEFAULT;
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
		result.append(" (typ: ");
		result.append(typ);
		result.append(", anzahl: ");
		result.append(anzahl);
		result.append(')');
		return result.toString();
	}

} //PersonengruppeImpl
