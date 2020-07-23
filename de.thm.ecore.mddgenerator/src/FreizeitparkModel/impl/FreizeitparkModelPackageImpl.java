/**
 */
package FreizeitparkModel.impl;

import FreizeitparkModel.AllgemeineInformationen;
import FreizeitparkModel.Attraktion;
import FreizeitparkModel.Campingplatz;
import FreizeitparkModel.Design;
import FreizeitparkModel.Eintrittskarte;
import FreizeitparkModel.Fahrgesch�ft;
import FreizeitparkModel.Freizeitpark;
import FreizeitparkModel.FreizeitparkModelFactory;
import FreizeitparkModel.FreizeitparkModelPackage;
import FreizeitparkModel.Gastronomie;
import FreizeitparkModel.Gesch�ft;
import FreizeitparkModel.Hotel;
import FreizeitparkModel.Imbiss;
import FreizeitparkModel.Personengruppe;
import FreizeitparkModel.Restaurant;
import FreizeitparkModel.Show;
import FreizeitparkModel.Tag;
import FreizeitparkModel.Themenwelt;
import FreizeitparkModel.Verkaufsladen;
import FreizeitparkModel.�bernachtungsm�glichkeit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FreizeitparkModelPackageImpl extends EPackageImpl implements FreizeitparkModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freizeitparkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allgemeineInformationenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eintrittskarteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personengruppeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass themenweltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attraktionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fahrgesch�ftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verkaufsladenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gastronomieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restaurantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imbissEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gesch�ftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass �bernachtungsm�glichkeitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campingplatzEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see FreizeitparkModel.FreizeitparkModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FreizeitparkModelPackageImpl() {
		super(eNS_URI, FreizeitparkModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FreizeitparkModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FreizeitparkModelPackage init() {
		if (isInited) return (FreizeitparkModelPackage)EPackage.Registry.INSTANCE.getEPackage(FreizeitparkModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFreizeitparkModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FreizeitparkModelPackageImpl theFreizeitparkModelPackage = registeredFreizeitparkModelPackage instanceof FreizeitparkModelPackageImpl ? (FreizeitparkModelPackageImpl)registeredFreizeitparkModelPackage : new FreizeitparkModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFreizeitparkModelPackage.createPackageContents();

		// Initialize created meta-data
		theFreizeitparkModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFreizeitparkModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FreizeitparkModelPackage.eNS_URI, theFreizeitparkModelPackage);
		return theFreizeitparkModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFreizeitpark() {
		return freizeitparkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFreizeitpark_ThemenWelten() {
		return (EReference)freizeitparkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreizeitpark_Name() {
		return (EAttribute)freizeitparkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFreizeitpark_Design() {
		return (EReference)freizeitparkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFreizeitpark_Eintrittskarten() {
		return (EReference)freizeitparkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFreizeitpark_AllgemeineInformationen() {
		return (EReference)freizeitparkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllgemeineInformationen() {
		return allgemeineInformationenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineInformationen_Beschreibung() {
		return (EAttribute)allgemeineInformationenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineInformationen_Zeitplan() {
		return (EReference)allgemeineInformationenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_�ffnetUm() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Schlie�tUm() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesign() {
		return designEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_Farbe1() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_TitelFarbe1() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_TextFarbe1() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_Farbe2() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_TitelFarbe2() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_TextFarbe2() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_Farbe3() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_TitelFarbe3() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_TextFarbe3() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_Farbe4() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_Farbe5() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_TitelFarbe5() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesign_TextFarbe5() {
		return (EAttribute)designEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEintrittskarte() {
		return eintrittskarteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEintrittskarte_TageG�ltig() {
		return (EAttribute)eintrittskarteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEintrittskarte_Name() {
		return (EAttribute)eintrittskarteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEintrittskarte_Preis() {
		return (EAttribute)eintrittskarteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEintrittskarte_PersonenGruppen() {
		return (EReference)eintrittskarteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEintrittskarte_�bernachtungIn() {
		return (EReference)eintrittskarteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonengruppe() {
		return personengruppeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonengruppe_Typ() {
		return (EAttribute)personengruppeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonengruppe_Anzahl() {
		return (EAttribute)personengruppeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThemenwelt() {
		return themenweltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThemenwelt_Attraktionen() {
		return (EReference)themenweltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThemenwelt_VerkaufsL�den() {
		return (EReference)themenweltEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThemenwelt_�bernachtungensm�glichkeiten() {
		return (EReference)themenweltEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThemenwelt_Name() {
		return (EAttribute)themenweltEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttraktion() {
		return attraktionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttraktion_Name() {
		return (EAttribute)attraktionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttraktion_Dauer() {
		return (EAttribute)attraktionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttraktion_AnzahlPl�tze() {
		return (EAttribute)attraktionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttraktion_Image() {
		return (EAttribute)attraktionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttraktion_Beschreibung() {
		return (EAttribute)attraktionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFahrgesch�ft() {
		return fahrgesch�ftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFahrgesch�ft_MindestGr��e() {
		return (EAttribute)fahrgesch�ftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShow() {
		return showEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerkaufsladen() {
		return verkaufsladenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerkaufsladen_Name() {
		return (EAttribute)verkaufsladenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerkaufsladen_Image() {
		return (EAttribute)verkaufsladenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerkaufsladen_Beschreibung() {
		return (EAttribute)verkaufsladenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGastronomie() {
		return gastronomieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGastronomie_AnzahlPl�tze() {
		return (EAttribute)gastronomieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestaurant() {
		return restaurantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestaurant_SterneBewertung() {
		return (EAttribute)restaurantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImbiss() {
		return imbissEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImbiss_SpezialGericht() {
		return (EAttribute)imbissEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGesch�ft() {
		return gesch�ftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGesch�ft_VerkaufsFl�che() {
		return (EAttribute)gesch�ftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get�bernachtungsm�glichkeit() {
		return �bernachtungsm�glichkeitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get�bernachtungsm�glichkeit_KostenProNacht() {
		return (EAttribute)�bernachtungsm�glichkeitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get�bernachtungsm�glichkeit_Name() {
		return (EAttribute)�bernachtungsm�glichkeitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get�bernachtungsm�glichkeit_Image() {
		return (EAttribute)�bernachtungsm�glichkeitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get�bernachtungsm�glichkeit_Beschreibung() {
		return (EAttribute)�bernachtungsm�glichkeitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHotel() {
		return hotelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHotel_SternBewertung() {
		return (EAttribute)hotelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCampingplatz() {
		return campingplatzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreizeitparkModelFactory getFreizeitparkModelFactory() {
		return (FreizeitparkModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		freizeitparkEClass = createEClass(FREIZEITPARK);
		createEReference(freizeitparkEClass, FREIZEITPARK__THEMEN_WELTEN);
		createEAttribute(freizeitparkEClass, FREIZEITPARK__NAME);
		createEReference(freizeitparkEClass, FREIZEITPARK__DESIGN);
		createEReference(freizeitparkEClass, FREIZEITPARK__EINTRITTSKARTEN);
		createEReference(freizeitparkEClass, FREIZEITPARK__ALLGEMEINE_INFORMATIONEN);

		allgemeineInformationenEClass = createEClass(ALLGEMEINE_INFORMATIONEN);
		createEAttribute(allgemeineInformationenEClass, ALLGEMEINE_INFORMATIONEN__BESCHREIBUNG);
		createEReference(allgemeineInformationenEClass, ALLGEMEINE_INFORMATIONEN__ZEITPLAN);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__�FFNET_UM);
		createEAttribute(tagEClass, TAG__SCHLIESST_UM);
		createEAttribute(tagEClass, TAG__NAME);

		designEClass = createEClass(DESIGN);
		createEAttribute(designEClass, DESIGN__FARBE1);
		createEAttribute(designEClass, DESIGN__TITEL_FARBE1);
		createEAttribute(designEClass, DESIGN__TEXT_FARBE1);
		createEAttribute(designEClass, DESIGN__FARBE2);
		createEAttribute(designEClass, DESIGN__TITEL_FARBE2);
		createEAttribute(designEClass, DESIGN__TEXT_FARBE2);
		createEAttribute(designEClass, DESIGN__FARBE3);
		createEAttribute(designEClass, DESIGN__TITEL_FARBE3);
		createEAttribute(designEClass, DESIGN__TEXT_FARBE3);
		createEAttribute(designEClass, DESIGN__FARBE4);
		createEAttribute(designEClass, DESIGN__FARBE5);
		createEAttribute(designEClass, DESIGN__TITEL_FARBE5);
		createEAttribute(designEClass, DESIGN__TEXT_FARBE5);

		eintrittskarteEClass = createEClass(EINTRITTSKARTE);
		createEAttribute(eintrittskarteEClass, EINTRITTSKARTE__TAGE_G�LTIG);
		createEAttribute(eintrittskarteEClass, EINTRITTSKARTE__NAME);
		createEAttribute(eintrittskarteEClass, EINTRITTSKARTE__PREIS);
		createEReference(eintrittskarteEClass, EINTRITTSKARTE__PERSONEN_GRUPPEN);
		createEReference(eintrittskarteEClass, EINTRITTSKARTE__�BERNACHTUNG_IN);

		personengruppeEClass = createEClass(PERSONENGRUPPE);
		createEAttribute(personengruppeEClass, PERSONENGRUPPE__TYP);
		createEAttribute(personengruppeEClass, PERSONENGRUPPE__ANZAHL);

		themenweltEClass = createEClass(THEMENWELT);
		createEReference(themenweltEClass, THEMENWELT__ATTRAKTIONEN);
		createEReference(themenweltEClass, THEMENWELT__VERKAUFS_L�DEN);
		createEReference(themenweltEClass, THEMENWELT__�BERNACHTUNGENSM�GLICHKEITEN);
		createEAttribute(themenweltEClass, THEMENWELT__NAME);

		attraktionEClass = createEClass(ATTRAKTION);
		createEAttribute(attraktionEClass, ATTRAKTION__NAME);
		createEAttribute(attraktionEClass, ATTRAKTION__DAUER);
		createEAttribute(attraktionEClass, ATTRAKTION__ANZAHL_PL�TZE);
		createEAttribute(attraktionEClass, ATTRAKTION__IMAGE);
		createEAttribute(attraktionEClass, ATTRAKTION__BESCHREIBUNG);

		fahrgesch�ftEClass = createEClass(FAHRGESCH�FT);
		createEAttribute(fahrgesch�ftEClass, FAHRGESCH�FT__MINDEST_GR�SSE);

		showEClass = createEClass(SHOW);

		verkaufsladenEClass = createEClass(VERKAUFSLADEN);
		createEAttribute(verkaufsladenEClass, VERKAUFSLADEN__NAME);
		createEAttribute(verkaufsladenEClass, VERKAUFSLADEN__IMAGE);
		createEAttribute(verkaufsladenEClass, VERKAUFSLADEN__BESCHREIBUNG);

		gastronomieEClass = createEClass(GASTRONOMIE);
		createEAttribute(gastronomieEClass, GASTRONOMIE__ANZAHL_PL�TZE);

		restaurantEClass = createEClass(RESTAURANT);
		createEAttribute(restaurantEClass, RESTAURANT__STERNE_BEWERTUNG);

		imbissEClass = createEClass(IMBISS);
		createEAttribute(imbissEClass, IMBISS__SPEZIAL_GERICHT);

		gesch�ftEClass = createEClass(GESCH�FT);
		createEAttribute(gesch�ftEClass, GESCH�FT__VERKAUFS_FL�CHE);

		�bernachtungsm�glichkeitEClass = createEClass(�BERNACHTUNGSM�GLICHKEIT);
		createEAttribute(�bernachtungsm�glichkeitEClass, �BERNACHTUNGSM�GLICHKEIT__KOSTEN_PRO_NACHT);
		createEAttribute(�bernachtungsm�glichkeitEClass, �BERNACHTUNGSM�GLICHKEIT__NAME);
		createEAttribute(�bernachtungsm�glichkeitEClass, �BERNACHTUNGSM�GLICHKEIT__IMAGE);
		createEAttribute(�bernachtungsm�glichkeitEClass, �BERNACHTUNGSM�GLICHKEIT__BESCHREIBUNG);

		hotelEClass = createEClass(HOTEL);
		createEAttribute(hotelEClass, HOTEL__STERN_BEWERTUNG);

		campingplatzEClass = createEClass(CAMPINGPLATZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fahrgesch�ftEClass.getESuperTypes().add(this.getAttraktion());
		showEClass.getESuperTypes().add(this.getAttraktion());
		gastronomieEClass.getESuperTypes().add(this.getVerkaufsladen());
		restaurantEClass.getESuperTypes().add(this.getGastronomie());
		imbissEClass.getESuperTypes().add(this.getGastronomie());
		gesch�ftEClass.getESuperTypes().add(this.getVerkaufsladen());
		hotelEClass.getESuperTypes().add(this.get�bernachtungsm�glichkeit());
		campingplatzEClass.getESuperTypes().add(this.get�bernachtungsm�glichkeit());

		// Initialize classes, features, and operations; add parameters
		initEClass(freizeitparkEClass, Freizeitpark.class, "Freizeitpark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFreizeitpark_ThemenWelten(), this.getThemenwelt(), null, "themenWelten", null, 1, -1, Freizeitpark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreizeitpark_Name(), ecorePackage.getEString(), "name", null, 0, 1, Freizeitpark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFreizeitpark_Design(), this.getDesign(), null, "design", null, 1, 1, Freizeitpark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFreizeitpark_Eintrittskarten(), this.getEintrittskarte(), null, "eintrittskarten", null, 1, -1, Freizeitpark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFreizeitpark_AllgemeineInformationen(), this.getAllgemeineInformationen(), null, "allgemeineInformationen", null, 0, 1, Freizeitpark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allgemeineInformationenEClass, AllgemeineInformationen.class, "AllgemeineInformationen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllgemeineInformationen_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 0, 1, AllgemeineInformationen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineInformationen_Zeitplan(), this.getTag(), null, "zeitplan", null, 7, -1, AllgemeineInformationen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_�ffnetUm(), ecorePackage.getEString(), "�ffnetUm", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Schlie�tUm(), ecorePackage.getEString(), "schlie�tUm", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(designEClass, Design.class, "Design", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDesign_Farbe1(), ecorePackage.getEString(), "farbe1", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_TitelFarbe1(), ecorePackage.getEString(), "titelFarbe1", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_TextFarbe1(), ecorePackage.getEString(), "textFarbe1", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_Farbe2(), ecorePackage.getEString(), "farbe2", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_TitelFarbe2(), ecorePackage.getEString(), "titelFarbe2", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_TextFarbe2(), ecorePackage.getEString(), "textFarbe2", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_Farbe3(), ecorePackage.getEString(), "farbe3", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_TitelFarbe3(), ecorePackage.getEString(), "titelFarbe3", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_TextFarbe3(), ecorePackage.getEString(), "textFarbe3", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_Farbe4(), ecorePackage.getEString(), "farbe4", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_Farbe5(), ecorePackage.getEString(), "farbe5", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_TitelFarbe5(), ecorePackage.getEString(), "titelFarbe5", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesign_TextFarbe5(), ecorePackage.getEString(), "textFarbe5", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eintrittskarteEClass, Eintrittskarte.class, "Eintrittskarte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEintrittskarte_TageG�ltig(), ecorePackage.getEInt(), "tageG�ltig", null, 0, 1, Eintrittskarte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEintrittskarte_Name(), ecorePackage.getEString(), "name", null, 0, 1, Eintrittskarte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEintrittskarte_Preis(), ecorePackage.getEDouble(), "preis", null, 0, 1, Eintrittskarte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEintrittskarte_PersonenGruppen(), this.getPersonengruppe(), null, "personenGruppen", null, 1, -1, Eintrittskarte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEintrittskarte_�bernachtungIn(), this.get�bernachtungsm�glichkeit(), null, "�bernachtungIn", null, 0, 1, Eintrittskarte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personengruppeEClass, Personengruppe.class, "Personengruppe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonengruppe_Typ(), ecorePackage.getEString(), "typ", null, 0, 1, Personengruppe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonengruppe_Anzahl(), ecorePackage.getEInt(), "anzahl", null, 0, 1, Personengruppe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(themenweltEClass, Themenwelt.class, "Themenwelt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThemenwelt_Attraktionen(), this.getAttraktion(), null, "attraktionen", null, 1, -1, Themenwelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThemenwelt_VerkaufsL�den(), this.getVerkaufsladen(), null, "verkaufsL�den", null, 1, -1, Themenwelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThemenwelt_�bernachtungensm�glichkeiten(), this.get�bernachtungsm�glichkeit(), null, "�bernachtungensm�glichkeiten", null, 1, -1, Themenwelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThemenwelt_Name(), ecorePackage.getEString(), "name", null, 0, 1, Themenwelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attraktionEClass, Attraktion.class, "Attraktion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttraktion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attraktion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttraktion_Dauer(), ecorePackage.getEInt(), "dauer", null, 0, 1, Attraktion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttraktion_AnzahlPl�tze(), ecorePackage.getEInt(), "anzahlPl�tze", null, 0, 1, Attraktion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttraktion_Image(), ecorePackage.getEString(), "image", null, 0, 1, Attraktion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttraktion_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 0, 1, Attraktion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fahrgesch�ftEClass, Fahrgesch�ft.class, "Fahrgesch�ft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFahrgesch�ft_MindestGr��e(), ecorePackage.getEDouble(), "mindestGr��e", null, 0, 1, Fahrgesch�ft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(showEClass, Show.class, "Show", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verkaufsladenEClass, Verkaufsladen.class, "Verkaufsladen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerkaufsladen_Name(), ecorePackage.getEString(), "name", null, 0, 1, Verkaufsladen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerkaufsladen_Image(), ecorePackage.getEString(), "image", null, 0, 1, Verkaufsladen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerkaufsladen_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 0, 1, Verkaufsladen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gastronomieEClass, Gastronomie.class, "Gastronomie", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGastronomie_AnzahlPl�tze(), ecorePackage.getEInt(), "anzahlPl�tze", null, 0, 1, Gastronomie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restaurantEClass, Restaurant.class, "Restaurant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestaurant_SterneBewertung(), ecorePackage.getEInt(), "sterneBewertung", null, 0, 1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imbissEClass, Imbiss.class, "Imbiss", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImbiss_SpezialGericht(), ecorePackage.getEString(), "spezialGericht", null, 0, 1, Imbiss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gesch�ftEClass, Gesch�ft.class, "Gesch�ft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGesch�ft_VerkaufsFl�che(), ecorePackage.getEInt(), "verkaufsFl�che", null, 0, 1, Gesch�ft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(�bernachtungsm�glichkeitEClass, �bernachtungsm�glichkeit.class, "�bernachtungsm�glichkeit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get�bernachtungsm�glichkeit_KostenProNacht(), ecorePackage.getEDouble(), "kostenProNacht", null, 0, 1, �bernachtungsm�glichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(get�bernachtungsm�glichkeit_Name(), ecorePackage.getEString(), "name", null, 0, 1, �bernachtungsm�glichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(get�bernachtungsm�glichkeit_Image(), ecorePackage.getEString(), "image", null, 0, 1, �bernachtungsm�glichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(get�bernachtungsm�glichkeit_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 0, 1, �bernachtungsm�glichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hotelEClass, Hotel.class, "Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_SternBewertung(), ecorePackage.getEInt(), "sternBewertung", null, 0, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campingplatzEClass, Campingplatz.class, "Campingplatz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FreizeitparkModelPackageImpl
