/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.FreizeitparkModelPackage;
import FreizeitparkModel.Geschäft;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geschäft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.impl.GeschäftImpl#getVerkaufsFläche <em>Verkaufs Fläche</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeschäftImpl extends VerkaufsladenImpl implements Geschäft {
	/**
	 * The default value of the '{@link #getVerkaufsFläche() <em>Verkaufs Fläche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkaufsFläche()
	 * @generated
	 * @ordered
	 */
	protected static final int VERKAUFS_FLÄCHE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getVerkaufsFläche() <em>Verkaufs Fläche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkaufsFläche()
	 * @generated
	 * @ordered
	 */
	protected int verkaufsFläche = VERKAUFS_FLÄCHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeschäftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreizeitparkModelPackage.Literals.GESCHÄFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVerkaufsFläche() {
		return verkaufsFläche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerkaufsFläche(int newVerkaufsFläche) {
		int oldVerkaufsFläche = verkaufsFläche;
		verkaufsFläche = newVerkaufsFläche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.GESCHÄFT__VERKAUFS_FLÄCHE, oldVerkaufsFläche, verkaufsFläche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreizeitparkModelPackage.GESCHÄFT__VERKAUFS_FLÄCHE:
				return getVerkaufsFläche();
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
			case FreizeitparkModelPackage.GESCHÄFT__VERKAUFS_FLÄCHE:
				setVerkaufsFläche((Integer)newValue);
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
			case FreizeitparkModelPackage.GESCHÄFT__VERKAUFS_FLÄCHE:
				setVerkaufsFläche(VERKAUFS_FLÄCHE_EDEFAULT);
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
			case FreizeitparkModelPackage.GESCHÄFT__VERKAUFS_FLÄCHE:
				return verkaufsFläche != VERKAUFS_FLÄCHE_EDEFAULT;
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
		result.append(" (verkaufsFläche: ");
		result.append(verkaufsFläche);
		result.append(')');
		return result.toString();
	}

} //GeschäftImpl
