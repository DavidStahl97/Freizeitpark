/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.FreizeitparkModelPackage;
import FreizeitparkModel.Übernachtungsmöglichkeit;

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
 *   <li>{@link FreizeitparkModel.impl.ÜbernachtungsmöglichkeitImpl#getKostenProNacht <em>Kosten Pro Nacht</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.ÜbernachtungsmöglichkeitImpl#getName <em>Name</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.ÜbernachtungsmöglichkeitImpl#getImage <em>Image</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.ÜbernachtungsmöglichkeitImpl#getBeschreibung <em>Beschreibung</em>}</li>
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
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

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
		return FreizeitparkModelPackage.Literals.ÜBERNACHTUNGSMÖGLICHKEIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT, oldKostenProNacht, kostenProNacht));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__IMAGE, oldImage, image));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__BESCHREIBUNG, oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT:
				return getKostenProNacht();
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__NAME:
				return getName();
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__IMAGE:
				return getImage();
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__BESCHREIBUNG:
				return getBeschreibung();
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
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT:
				setKostenProNacht((Double)newValue);
				return;
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__NAME:
				setName((String)newValue);
				return;
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__IMAGE:
				setImage((String)newValue);
				return;
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__BESCHREIBUNG:
				setBeschreibung((String)newValue);
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
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT:
				setKostenProNacht(KOSTEN_PRO_NACHT_EDEFAULT);
				return;
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__BESCHREIBUNG:
				setBeschreibung(BESCHREIBUNG_EDEFAULT);
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
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT:
				return kostenProNacht != KOSTEN_PRO_NACHT_EDEFAULT;
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT__BESCHREIBUNG:
				return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
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
		result.append(", image: ");
		result.append(image);
		result.append(", beschreibung: ");
		result.append(beschreibung);
		result.append(')');
		return result.toString();
	}

} //ÜbernachtungsmöglichkeitImpl
