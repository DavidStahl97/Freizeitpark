/**
 */
package FreitparkModel.impl;

import FreitparkModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FreitparkModelFactoryImpl extends EFactoryImpl implements FreitparkModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FreitparkModelFactory init() {
		try {
			FreitparkModelFactory theFreitparkModelFactory = (FreitparkModelFactory)EPackage.Registry.INSTANCE.getEFactory(FreitparkModelPackage.eNS_URI);
			if (theFreitparkModelFactory != null) {
				return theFreitparkModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FreitparkModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreitparkModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FreitparkModelPackage.FREIZEITPARK: return createFreizeitpark();
			case FreitparkModelPackage.ALLGEMEINE_INFORMATIONEN: return createAllgemeineInformationen();
			case FreitparkModelPackage.TAG: return createTag();
			case FreitparkModelPackage.DESIGN: return createDesign();
			case FreitparkModelPackage.EINTRITTSKARTE: return createEintrittskarte();
			case FreitparkModelPackage.PERSONENGRUPPE: return createPersonengruppe();
			case FreitparkModelPackage.THEMENWELT: return createThemenwelt();
			case FreitparkModelPackage.FAHRGESCHÄFT: return createFahrgeschäft();
			case FreitparkModelPackage.SHOW: return createShow();
			case FreitparkModelPackage.VERKAUFSLADEN: return createVerkaufsladen();
			case FreitparkModelPackage.RESTAURANT: return createRestaurant();
			case FreitparkModelPackage.IMBISS: return createImbiss();
			case FreitparkModelPackage.GESCHÄFT: return createGeschäft();
			case FreitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT: return createÜbernachtungsmöglichkeit();
			case FreitparkModelPackage.HOTEL: return createHotel();
			case FreitparkModelPackage.CAMPINGPLATZ: return createCampingplatz();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Freizeitpark createFreizeitpark() {
		FreizeitparkImpl freizeitpark = new FreizeitparkImpl();
		return freizeitpark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineInformationen createAllgemeineInformationen() {
		AllgemeineInformationenImpl allgemeineInformationen = new AllgemeineInformationenImpl();
		return allgemeineInformationen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Design createDesign() {
		DesignImpl design = new DesignImpl();
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eintrittskarte createEintrittskarte() {
		EintrittskarteImpl eintrittskarte = new EintrittskarteImpl();
		return eintrittskarte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Personengruppe createPersonengruppe() {
		PersonengruppeImpl personengruppe = new PersonengruppeImpl();
		return personengruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Themenwelt createThemenwelt() {
		ThemenweltImpl themenwelt = new ThemenweltImpl();
		return themenwelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fahrgeschäft createFahrgeschäft() {
		FahrgeschäftImpl fahrgeschäft = new FahrgeschäftImpl();
		return fahrgeschäft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Show createShow() {
		ShowImpl show = new ShowImpl();
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkaufsladen createVerkaufsladen() {
		VerkaufsladenImpl verkaufsladen = new VerkaufsladenImpl();
		return verkaufsladen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Restaurant createRestaurant() {
		RestaurantImpl restaurant = new RestaurantImpl();
		return restaurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imbiss createImbiss() {
		ImbissImpl imbiss = new ImbissImpl();
		return imbiss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschäft createGeschäft() {
		GeschäftImpl geschäft = new GeschäftImpl();
		return geschäft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Übernachtungsmöglichkeit createÜbernachtungsmöglichkeit() {
		ÜbernachtungsmöglichkeitImpl übernachtungsmöglichkeit = new ÜbernachtungsmöglichkeitImpl();
		return übernachtungsmöglichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hotel createHotel() {
		HotelImpl hotel = new HotelImpl();
		return hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Campingplatz createCampingplatz() {
		CampingplatzImpl campingplatz = new CampingplatzImpl();
		return campingplatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreitparkModelPackage getFreitparkModelPackage() {
		return (FreitparkModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FreitparkModelPackage getPackage() {
		return FreitparkModelPackage.eINSTANCE;
	}

} //FreitparkModelFactoryImpl
