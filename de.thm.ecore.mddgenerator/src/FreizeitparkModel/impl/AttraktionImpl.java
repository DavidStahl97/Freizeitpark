/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.Attraktion;
import FreizeitparkModel.FreizeitparkModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attraktion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreizeitparkModel.impl.AttraktionImpl#getName <em>Name</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.AttraktionImpl#getDauer <em>Dauer</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.AttraktionImpl#getAnzahlPlätze <em>Anzahl Plätze</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.AttraktionImpl#getImage <em>Image</em>}</li>
 *   <li>{@link FreizeitparkModel.impl.AttraktionImpl#getBeschreibung <em>Beschreibung</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AttraktionImpl extends MinimalEObjectImpl.Container implements Attraktion {
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
	 * The default value of the '{@link #getDauer() <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauer()
	 * @generated
	 * @ordered
	 */
	protected static final int DAUER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDauer() <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauer()
	 * @generated
	 * @ordered
	 */
	protected int dauer = DAUER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnzahlPlätze() <em>Anzahl Plätze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlPlätze()
	 * @generated
	 * @ordered
	 */
	protected static final int ANZAHL_PLÄTZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnzahlPlätze() <em>Anzahl Plätze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlPlätze()
	 * @generated
	 * @ordered
	 */
	protected int anzahlPlätze = ANZAHL_PLÄTZE_EDEFAULT;

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
	protected AttraktionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreizeitparkModelPackage.Literals.ATTRAKTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.ATTRAKTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDauer() {
		return dauer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDauer(int newDauer) {
		int oldDauer = dauer;
		dauer = newDauer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.ATTRAKTION__DAUER, oldDauer, dauer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAnzahlPlätze() {
		return anzahlPlätze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnzahlPlätze(int newAnzahlPlätze) {
		int oldAnzahlPlätze = anzahlPlätze;
		anzahlPlätze = newAnzahlPlätze;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.ATTRAKTION__ANZAHL_PLÄTZE, oldAnzahlPlätze, anzahlPlätze));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.ATTRAKTION__IMAGE, oldImage, image));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreizeitparkModelPackage.ATTRAKTION__BESCHREIBUNG, oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreizeitparkModelPackage.ATTRAKTION__NAME:
				return getName();
			case FreizeitparkModelPackage.ATTRAKTION__DAUER:
				return getDauer();
			case FreizeitparkModelPackage.ATTRAKTION__ANZAHL_PLÄTZE:
				return getAnzahlPlätze();
			case FreizeitparkModelPackage.ATTRAKTION__IMAGE:
				return getImage();
			case FreizeitparkModelPackage.ATTRAKTION__BESCHREIBUNG:
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
			case FreizeitparkModelPackage.ATTRAKTION__NAME:
				setName((String)newValue);
				return;
			case FreizeitparkModelPackage.ATTRAKTION__DAUER:
				setDauer((Integer)newValue);
				return;
			case FreizeitparkModelPackage.ATTRAKTION__ANZAHL_PLÄTZE:
				setAnzahlPlätze((Integer)newValue);
				return;
			case FreizeitparkModelPackage.ATTRAKTION__IMAGE:
				setImage((String)newValue);
				return;
			case FreizeitparkModelPackage.ATTRAKTION__BESCHREIBUNG:
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
			case FreizeitparkModelPackage.ATTRAKTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FreizeitparkModelPackage.ATTRAKTION__DAUER:
				setDauer(DAUER_EDEFAULT);
				return;
			case FreizeitparkModelPackage.ATTRAKTION__ANZAHL_PLÄTZE:
				setAnzahlPlätze(ANZAHL_PLÄTZE_EDEFAULT);
				return;
			case FreizeitparkModelPackage.ATTRAKTION__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case FreizeitparkModelPackage.ATTRAKTION__BESCHREIBUNG:
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
			case FreizeitparkModelPackage.ATTRAKTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FreizeitparkModelPackage.ATTRAKTION__DAUER:
				return dauer != DAUER_EDEFAULT;
			case FreizeitparkModelPackage.ATTRAKTION__ANZAHL_PLÄTZE:
				return anzahlPlätze != ANZAHL_PLÄTZE_EDEFAULT;
			case FreizeitparkModelPackage.ATTRAKTION__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case FreizeitparkModelPackage.ATTRAKTION__BESCHREIBUNG:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", dauer: ");
		result.append(dauer);
		result.append(", anzahlPlätze: ");
		result.append(anzahlPlätze);
		result.append(", image: ");
		result.append(image);
		result.append(", beschreibung: ");
		result.append(beschreibung);
		result.append(')');
		return result.toString();
	}

} //AttraktionImpl
