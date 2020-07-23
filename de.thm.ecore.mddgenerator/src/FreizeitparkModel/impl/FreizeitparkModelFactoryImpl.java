/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.*;

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
public class FreizeitparkModelFactoryImpl extends EFactoryImpl implements FreizeitparkModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FreizeitparkModelFactory init() {
		try {
			FreizeitparkModelFactory theFreizeitparkModelFactory = (FreizeitparkModelFactory)EPackage.Registry.INSTANCE.getEFactory(FreizeitparkModelPackage.eNS_URI);
			if (theFreizeitparkModelFactory != null) {
				return theFreizeitparkModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FreizeitparkModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreizeitparkModelFactoryImpl() {
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
			case FreizeitparkModelPackage.FREIZEITPARK: return createFreizeitpark();
			case FreizeitparkModelPackage.ALLGEMEINE_INFORMATIONEN: return createAllgemeineInformationen();
			case FreizeitparkModelPackage.TAG: return createTag();
			case FreizeitparkModelPackage.DESIGN: return createDesign();
			case FreizeitparkModelPackage.EINTRITTSKARTE: return createEintrittskarte();
			case FreizeitparkModelPackage.PERSONENGRUPPE: return createPersonengruppe();
			case FreizeitparkModelPackage.THEMENWELT: return createThemenwelt();
			case FreizeitparkModelPackage.FAHRGESCHÄFT: return createFahrgeschäft();
			case FreizeitparkModelPackage.SHOW: return createShow();
			case FreizeitparkModelPackage.VERKAUFSLADEN: return createVerkaufsladen();
			case FreizeitparkModelPackage.RESTAURANT: return createRestaurant();
			case FreizeitparkModelPackage.IMBISS: return createImbiss();
			case FreizeitparkModelPackage.GESCHÄFT: return createGeschäft();
			case FreizeitparkModelPackage.ÜBERNACHTUNGSMÖGLICHKEIT: return createÜbernachtungsmöglichkeit();
			case FreizeitparkModelPackage.HOTEL: return createHotel();
			case FreizeitparkModelPackage.CAMPINGPLATZ: return createCampingplatz();
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
	public FreizeitparkModelPackage getFreizeitparkModelPackage() {
		return (FreizeitparkModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FreizeitparkModelPackage getPackage() {
		return FreizeitparkModelPackage.eINSTANCE;
	}

} //FreizeitparkModelFactoryImpl
