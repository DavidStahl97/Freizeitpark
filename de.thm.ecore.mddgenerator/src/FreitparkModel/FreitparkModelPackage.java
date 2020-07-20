/**
 */
package FreitparkModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see FreitparkModel.FreitparkModelFactory
 * @model kind="package"
 * @generated
 */
public interface FreitparkModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FreitparkModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de/thm/freizeitparkmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.thm.freizeitparkmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FreitparkModelPackage eINSTANCE = FreitparkModel.impl.FreitparkModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.FreizeitparkImpl <em>Freizeitpark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.FreizeitparkImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getFreizeitpark()
	 * @generated
	 */
	int FREIZEITPARK = 0;

	/**
	 * The feature id for the '<em><b>Themen Welten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIZEITPARK__THEMEN_WELTEN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIZEITPARK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIZEITPARK__DESIGN = 2;

	/**
	 * The feature id for the '<em><b>Eintrittskarten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIZEITPARK__EINTRITTSKARTEN = 3;

	/**
	 * The feature id for the '<em><b>Allgemeine Informationen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIZEITPARK__ALLGEMEINE_INFORMATIONEN = 4;

	/**
	 * The number of structural features of the '<em>Freizeitpark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIZEITPARK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Freizeitpark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIZEITPARK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.AllgemeineInformationenImpl <em>Allgemeine Informationen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.AllgemeineInformationenImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getAllgemeineInformationen()
	 * @generated
	 */
	int ALLGEMEINE_INFORMATIONEN = 1;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_INFORMATIONEN__BESCHREIBUNG = 0;

	/**
	 * The feature id for the '<em><b>Zeitplan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_INFORMATIONEN__ZEITPLAN = 1;

	/**
	 * The number of structural features of the '<em>Allgemeine Informationen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_INFORMATIONEN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Allgemeine Informationen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_INFORMATIONEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.TagImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 2;

	/**
	 * The feature id for the '<em><b>Öffnet Um</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ÖFFNET_UM = 0;

	/**
	 * The feature id for the '<em><b>Schließt Um</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__SCHLIESST_UM = 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.DesignImpl <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.DesignImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getDesign()
	 * @generated
	 */
	int DESIGN = 3;

	/**
	 * The feature id for the '<em><b>Farbe1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__FARBE1 = 0;

	/**
	 * The feature id for the '<em><b>Farbe2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__FARBE2 = 1;

	/**
	 * The feature id for the '<em><b>Farbe3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__FARBE3 = 2;

	/**
	 * The number of structural features of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.EintrittskarteImpl <em>Eintrittskarte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.EintrittskarteImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getEintrittskarte()
	 * @generated
	 */
	int EINTRITTSKARTE = 4;

	/**
	 * The feature id for the '<em><b>Tage Gültig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRITTSKARTE__TAGE_GÜLTIG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRITTSKARTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Preis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRITTSKARTE__PREIS = 2;

	/**
	 * The feature id for the '<em><b>Personen Gruppen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRITTSKARTE__PERSONEN_GRUPPEN = 3;

	/**
	 * The feature id for the '<em><b>Übernachtung In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRITTSKARTE__ÜBERNACHTUNG_IN = 4;

	/**
	 * The number of structural features of the '<em>Eintrittskarte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRITTSKARTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Eintrittskarte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRITTSKARTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.PersonengruppeImpl <em>Personengruppe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.PersonengruppeImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getPersonengruppe()
	 * @generated
	 */
	int PERSONENGRUPPE = 5;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENGRUPPE__TYP = 0;

	/**
	 * The feature id for the '<em><b>Anzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENGRUPPE__ANZAHL = 1;

	/**
	 * The number of structural features of the '<em>Personengruppe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENGRUPPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Personengruppe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENGRUPPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.ThemenweltImpl <em>Themenwelt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.ThemenweltImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getThemenwelt()
	 * @generated
	 */
	int THEMENWELT = 6;

	/**
	 * The feature id for the '<em><b>Attraktionen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMENWELT__ATTRAKTIONEN = 0;

	/**
	 * The feature id for the '<em><b>Verkaufs Läden</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMENWELT__VERKAUFS_LÄDEN = 1;

	/**
	 * The feature id for the '<em><b>Übernachtungensmöglichkeiten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMENWELT__ÜBERNACHTUNGENSMÖGLICHKEITEN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMENWELT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Themenwelt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMENWELT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Themenwelt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMENWELT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.AttraktionImpl <em>Attraktion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.AttraktionImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getAttraktion()
	 * @generated
	 */
	int ATTRAKTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRAKTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dauer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRAKTION__DAUER = 1;

	/**
	 * The feature id for the '<em><b>Anzahl Plätze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRAKTION__ANZAHL_PLÄTZE = 2;

	/**
	 * The number of structural features of the '<em>Attraktion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRAKTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attraktion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRAKTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.FahrgeschäftImpl <em>Fahrgeschäft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.FahrgeschäftImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getFahrgeschäft()
	 * @generated
	 */
	int FAHRGESCHÄFT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCHÄFT__NAME = ATTRAKTION__NAME;

	/**
	 * The feature id for the '<em><b>Dauer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCHÄFT__DAUER = ATTRAKTION__DAUER;

	/**
	 * The feature id for the '<em><b>Anzahl Plätze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCHÄFT__ANZAHL_PLÄTZE = ATTRAKTION__ANZAHL_PLÄTZE;

	/**
	 * The feature id for the '<em><b>Mindest Größe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCHÄFT__MINDEST_GRÖSSE = ATTRAKTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fahrgeschäft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCHÄFT_FEATURE_COUNT = ATTRAKTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fahrgeschäft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCHÄFT_OPERATION_COUNT = ATTRAKTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.ShowImpl <em>Show</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.ShowImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getShow()
	 * @generated
	 */
	int SHOW = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__NAME = ATTRAKTION__NAME;

	/**
	 * The feature id for the '<em><b>Dauer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__DAUER = ATTRAKTION__DAUER;

	/**
	 * The feature id for the '<em><b>Anzahl Plätze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__ANZAHL_PLÄTZE = ATTRAKTION__ANZAHL_PLÄTZE;

	/**
	 * The number of structural features of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_FEATURE_COUNT = ATTRAKTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_OPERATION_COUNT = ATTRAKTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.VerkaufsladenImpl <em>Verkaufsladen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.VerkaufsladenImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getVerkaufsladen()
	 * @generated
	 */
	int VERKAUFSLADEN = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKAUFSLADEN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Verkaufsladen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKAUFSLADEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Verkaufsladen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKAUFSLADEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.GastronomieImpl <em>Gastronomie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.GastronomieImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getGastronomie()
	 * @generated
	 */
	int GASTRONOMIE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTRONOMIE__NAME = VERKAUFSLADEN__NAME;

	/**
	 * The feature id for the '<em><b>Anzahl Plätze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTRONOMIE__ANZAHL_PLÄTZE = VERKAUFSLADEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gastronomie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTRONOMIE_FEATURE_COUNT = VERKAUFSLADEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gastronomie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTRONOMIE_OPERATION_COUNT = VERKAUFSLADEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.RestaurantImpl <em>Restaurant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.RestaurantImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getRestaurant()
	 * @generated
	 */
	int RESTAURANT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__NAME = GASTRONOMIE__NAME;

	/**
	 * The feature id for the '<em><b>Anzahl Plätze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__ANZAHL_PLÄTZE = GASTRONOMIE__ANZAHL_PLÄTZE;

	/**
	 * The feature id for the '<em><b>Sterne Bewertung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__STERNE_BEWERTUNG = GASTRONOMIE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_FEATURE_COUNT = GASTRONOMIE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_OPERATION_COUNT = GASTRONOMIE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.ImbissImpl <em>Imbiss</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.ImbissImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getImbiss()
	 * @generated
	 */
	int IMBISS = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMBISS__NAME = GASTRONOMIE__NAME;

	/**
	 * The feature id for the '<em><b>Anzahl Plätze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMBISS__ANZAHL_PLÄTZE = GASTRONOMIE__ANZAHL_PLÄTZE;

	/**
	 * The number of structural features of the '<em>Imbiss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMBISS_FEATURE_COUNT = GASTRONOMIE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Imbiss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMBISS_OPERATION_COUNT = GASTRONOMIE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.GeschäftImpl <em>Geschäft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.GeschäftImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getGeschäft()
	 * @generated
	 */
	int GESCHÄFT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHÄFT__NAME = VERKAUFSLADEN__NAME;

	/**
	 * The number of structural features of the '<em>Geschäft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHÄFT_FEATURE_COUNT = VERKAUFSLADEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Geschäft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHÄFT_OPERATION_COUNT = VERKAUFSLADEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.ÜbernachtungsmöglichkeitImpl <em>Übernachtungsmöglichkeit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.ÜbernachtungsmöglichkeitImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getÜbernachtungsmöglichkeit()
	 * @generated
	 */
	int ÜBERNACHTUNGSMÖGLICHKEIT = 15;

	/**
	 * The feature id for the '<em><b>Kosten Pro Nacht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ÜBERNACHTUNGSMÖGLICHKEIT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Übernachtungsmöglichkeit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ÜBERNACHTUNGSMÖGLICHKEIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Übernachtungsmöglichkeit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ÜBERNACHTUNGSMÖGLICHKEIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.HotelImpl <em>Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.HotelImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getHotel()
	 * @generated
	 */
	int HOTEL = 16;

	/**
	 * The feature id for the '<em><b>Kosten Pro Nacht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__KOSTEN_PRO_NACHT = ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__NAME = ÜBERNACHTUNGSMÖGLICHKEIT__NAME;

	/**
	 * The feature id for the '<em><b>Stern Bewertung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__STERN_BEWERTUNG = ÜBERNACHTUNGSMÖGLICHKEIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FEATURE_COUNT = ÜBERNACHTUNGSMÖGLICHKEIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OPERATION_COUNT = ÜBERNACHTUNGSMÖGLICHKEIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FreitparkModel.impl.CampingplatzImpl <em>Campingplatz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreitparkModel.impl.CampingplatzImpl
	 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getCampingplatz()
	 * @generated
	 */
	int CAMPINGPLATZ = 17;

	/**
	 * The feature id for the '<em><b>Kosten Pro Nacht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPINGPLATZ__KOSTEN_PRO_NACHT = ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPINGPLATZ__NAME = ÜBERNACHTUNGSMÖGLICHKEIT__NAME;

	/**
	 * The number of structural features of the '<em>Campingplatz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPINGPLATZ_FEATURE_COUNT = ÜBERNACHTUNGSMÖGLICHKEIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Campingplatz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPINGPLATZ_OPERATION_COUNT = ÜBERNACHTUNGSMÖGLICHKEIT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link FreitparkModel.Freizeitpark <em>Freizeitpark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Freizeitpark</em>'.
	 * @see FreitparkModel.Freizeitpark
	 * @generated
	 */
	EClass getFreizeitpark();

	/**
	 * Returns the meta object for the containment reference list '{@link FreitparkModel.Freizeitpark#getThemenWelten <em>Themen Welten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Themen Welten</em>'.
	 * @see FreitparkModel.Freizeitpark#getThemenWelten()
	 * @see #getFreizeitpark()
	 * @generated
	 */
	EReference getFreizeitpark_ThemenWelten();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Freizeitpark#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreitparkModel.Freizeitpark#getName()
	 * @see #getFreizeitpark()
	 * @generated
	 */
	EAttribute getFreizeitpark_Name();

	/**
	 * Returns the meta object for the containment reference '{@link FreitparkModel.Freizeitpark#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design</em>'.
	 * @see FreitparkModel.Freizeitpark#getDesign()
	 * @see #getFreizeitpark()
	 * @generated
	 */
	EReference getFreizeitpark_Design();

	/**
	 * Returns the meta object for the containment reference list '{@link FreitparkModel.Freizeitpark#getEintrittskarten <em>Eintrittskarten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eintrittskarten</em>'.
	 * @see FreitparkModel.Freizeitpark#getEintrittskarten()
	 * @see #getFreizeitpark()
	 * @generated
	 */
	EReference getFreizeitpark_Eintrittskarten();

	/**
	 * Returns the meta object for the containment reference '{@link FreitparkModel.Freizeitpark#getAllgemeineInformationen <em>Allgemeine Informationen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allgemeine Informationen</em>'.
	 * @see FreitparkModel.Freizeitpark#getAllgemeineInformationen()
	 * @see #getFreizeitpark()
	 * @generated
	 */
	EReference getFreizeitpark_AllgemeineInformationen();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.AllgemeineInformationen <em>Allgemeine Informationen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeine Informationen</em>'.
	 * @see FreitparkModel.AllgemeineInformationen
	 * @generated
	 */
	EClass getAllgemeineInformationen();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.AllgemeineInformationen#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see FreitparkModel.AllgemeineInformationen#getBeschreibung()
	 * @see #getAllgemeineInformationen()
	 * @generated
	 */
	EAttribute getAllgemeineInformationen_Beschreibung();

	/**
	 * Returns the meta object for the containment reference list '{@link FreitparkModel.AllgemeineInformationen#getZeitplan <em>Zeitplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitplan</em>'.
	 * @see FreitparkModel.AllgemeineInformationen#getZeitplan()
	 * @see #getAllgemeineInformationen()
	 * @generated
	 */
	EReference getAllgemeineInformationen_Zeitplan();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see FreitparkModel.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Tag#getÖffnetUm <em>Öffnet Um</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Öffnet Um</em>'.
	 * @see FreitparkModel.Tag#getÖffnetUm()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_ÖffnetUm();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Tag#getSchließtUm <em>Schließt Um</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schließt Um</em>'.
	 * @see FreitparkModel.Tag#getSchließtUm()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_SchließtUm();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see FreitparkModel.Design
	 * @generated
	 */
	EClass getDesign();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Design#getFarbe1 <em>Farbe1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farbe1</em>'.
	 * @see FreitparkModel.Design#getFarbe1()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_Farbe1();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Design#getFarbe2 <em>Farbe2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farbe2</em>'.
	 * @see FreitparkModel.Design#getFarbe2()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_Farbe2();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Design#getFarbe3 <em>Farbe3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farbe3</em>'.
	 * @see FreitparkModel.Design#getFarbe3()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_Farbe3();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Eintrittskarte <em>Eintrittskarte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eintrittskarte</em>'.
	 * @see FreitparkModel.Eintrittskarte
	 * @generated
	 */
	EClass getEintrittskarte();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Eintrittskarte#getTageGültig <em>Tage Gültig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tage Gültig</em>'.
	 * @see FreitparkModel.Eintrittskarte#getTageGültig()
	 * @see #getEintrittskarte()
	 * @generated
	 */
	EAttribute getEintrittskarte_TageGültig();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Eintrittskarte#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreitparkModel.Eintrittskarte#getName()
	 * @see #getEintrittskarte()
	 * @generated
	 */
	EAttribute getEintrittskarte_Name();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Eintrittskarte#getPreis <em>Preis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preis</em>'.
	 * @see FreitparkModel.Eintrittskarte#getPreis()
	 * @see #getEintrittskarte()
	 * @generated
	 */
	EAttribute getEintrittskarte_Preis();

	/**
	 * Returns the meta object for the containment reference list '{@link FreitparkModel.Eintrittskarte#getPersonenGruppen <em>Personen Gruppen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personen Gruppen</em>'.
	 * @see FreitparkModel.Eintrittskarte#getPersonenGruppen()
	 * @see #getEintrittskarte()
	 * @generated
	 */
	EReference getEintrittskarte_PersonenGruppen();

	/**
	 * Returns the meta object for the reference '{@link FreitparkModel.Eintrittskarte#getÜbernachtungIn <em>Übernachtung In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Übernachtung In</em>'.
	 * @see FreitparkModel.Eintrittskarte#getÜbernachtungIn()
	 * @see #getEintrittskarte()
	 * @generated
	 */
	EReference getEintrittskarte_ÜbernachtungIn();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Personengruppe <em>Personengruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personengruppe</em>'.
	 * @see FreitparkModel.Personengruppe
	 * @generated
	 */
	EClass getPersonengruppe();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Personengruppe#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see FreitparkModel.Personengruppe#getTyp()
	 * @see #getPersonengruppe()
	 * @generated
	 */
	EAttribute getPersonengruppe_Typ();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Personengruppe#getAnzahl <em>Anzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl</em>'.
	 * @see FreitparkModel.Personengruppe#getAnzahl()
	 * @see #getPersonengruppe()
	 * @generated
	 */
	EAttribute getPersonengruppe_Anzahl();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Themenwelt <em>Themenwelt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Themenwelt</em>'.
	 * @see FreitparkModel.Themenwelt
	 * @generated
	 */
	EClass getThemenwelt();

	/**
	 * Returns the meta object for the containment reference list '{@link FreitparkModel.Themenwelt#getAttraktionen <em>Attraktionen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attraktionen</em>'.
	 * @see FreitparkModel.Themenwelt#getAttraktionen()
	 * @see #getThemenwelt()
	 * @generated
	 */
	EReference getThemenwelt_Attraktionen();

	/**
	 * Returns the meta object for the containment reference list '{@link FreitparkModel.Themenwelt#getVerkaufsLäden <em>Verkaufs Läden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verkaufs Läden</em>'.
	 * @see FreitparkModel.Themenwelt#getVerkaufsLäden()
	 * @see #getThemenwelt()
	 * @generated
	 */
	EReference getThemenwelt_VerkaufsLäden();

	/**
	 * Returns the meta object for the containment reference list '{@link FreitparkModel.Themenwelt#getÜbernachtungensmöglichkeiten <em>Übernachtungensmöglichkeiten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Übernachtungensmöglichkeiten</em>'.
	 * @see FreitparkModel.Themenwelt#getÜbernachtungensmöglichkeiten()
	 * @see #getThemenwelt()
	 * @generated
	 */
	EReference getThemenwelt_Übernachtungensmöglichkeiten();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Themenwelt#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreitparkModel.Themenwelt#getName()
	 * @see #getThemenwelt()
	 * @generated
	 */
	EAttribute getThemenwelt_Name();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Attraktion <em>Attraktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attraktion</em>'.
	 * @see FreitparkModel.Attraktion
	 * @generated
	 */
	EClass getAttraktion();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Attraktion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreitparkModel.Attraktion#getName()
	 * @see #getAttraktion()
	 * @generated
	 */
	EAttribute getAttraktion_Name();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Attraktion#getDauer <em>Dauer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dauer</em>'.
	 * @see FreitparkModel.Attraktion#getDauer()
	 * @see #getAttraktion()
	 * @generated
	 */
	EAttribute getAttraktion_Dauer();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Attraktion#getAnzahlPlätze <em>Anzahl Plätze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Plätze</em>'.
	 * @see FreitparkModel.Attraktion#getAnzahlPlätze()
	 * @see #getAttraktion()
	 * @generated
	 */
	EAttribute getAttraktion_AnzahlPlätze();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Fahrgeschäft <em>Fahrgeschäft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fahrgeschäft</em>'.
	 * @see FreitparkModel.Fahrgeschäft
	 * @generated
	 */
	EClass getFahrgeschäft();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Fahrgeschäft#getMindestGröße <em>Mindest Größe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mindest Größe</em>'.
	 * @see FreitparkModel.Fahrgeschäft#getMindestGröße()
	 * @see #getFahrgeschäft()
	 * @generated
	 */
	EAttribute getFahrgeschäft_MindestGröße();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Show <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show</em>'.
	 * @see FreitparkModel.Show
	 * @generated
	 */
	EClass getShow();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Verkaufsladen <em>Verkaufsladen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verkaufsladen</em>'.
	 * @see FreitparkModel.Verkaufsladen
	 * @generated
	 */
	EClass getVerkaufsladen();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Verkaufsladen#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreitparkModel.Verkaufsladen#getName()
	 * @see #getVerkaufsladen()
	 * @generated
	 */
	EAttribute getVerkaufsladen_Name();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Gastronomie <em>Gastronomie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gastronomie</em>'.
	 * @see FreitparkModel.Gastronomie
	 * @generated
	 */
	EClass getGastronomie();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Gastronomie#getAnzahlPlätze <em>Anzahl Plätze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Plätze</em>'.
	 * @see FreitparkModel.Gastronomie#getAnzahlPlätze()
	 * @see #getGastronomie()
	 * @generated
	 */
	EAttribute getGastronomie_AnzahlPlätze();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Restaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant</em>'.
	 * @see FreitparkModel.Restaurant
	 * @generated
	 */
	EClass getRestaurant();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Restaurant#getSterneBewertung <em>Sterne Bewertung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sterne Bewertung</em>'.
	 * @see FreitparkModel.Restaurant#getSterneBewertung()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_SterneBewertung();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Imbiss <em>Imbiss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imbiss</em>'.
	 * @see FreitparkModel.Imbiss
	 * @generated
	 */
	EClass getImbiss();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Geschäft <em>Geschäft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschäft</em>'.
	 * @see FreitparkModel.Geschäft
	 * @generated
	 */
	EClass getGeschäft();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Übernachtungsmöglichkeit <em>Übernachtungsmöglichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Übernachtungsmöglichkeit</em>'.
	 * @see FreitparkModel.Übernachtungsmöglichkeit
	 * @generated
	 */
	EClass getÜbernachtungsmöglichkeit();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Übernachtungsmöglichkeit#getKostenProNacht <em>Kosten Pro Nacht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kosten Pro Nacht</em>'.
	 * @see FreitparkModel.Übernachtungsmöglichkeit#getKostenProNacht()
	 * @see #getÜbernachtungsmöglichkeit()
	 * @generated
	 */
	EAttribute getÜbernachtungsmöglichkeit_KostenProNacht();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Übernachtungsmöglichkeit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreitparkModel.Übernachtungsmöglichkeit#getName()
	 * @see #getÜbernachtungsmöglichkeit()
	 * @generated
	 */
	EAttribute getÜbernachtungsmöglichkeit_Name();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel</em>'.
	 * @see FreitparkModel.Hotel
	 * @generated
	 */
	EClass getHotel();

	/**
	 * Returns the meta object for the attribute '{@link FreitparkModel.Hotel#getSternBewertung <em>Stern Bewertung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stern Bewertung</em>'.
	 * @see FreitparkModel.Hotel#getSternBewertung()
	 * @see #getHotel()
	 * @generated
	 */
	EAttribute getHotel_SternBewertung();

	/**
	 * Returns the meta object for class '{@link FreitparkModel.Campingplatz <em>Campingplatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campingplatz</em>'.
	 * @see FreitparkModel.Campingplatz
	 * @generated
	 */
	EClass getCampingplatz();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FreitparkModelFactory getFreitparkModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.FreizeitparkImpl <em>Freizeitpark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.FreizeitparkImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getFreizeitpark()
		 * @generated
		 */
		EClass FREIZEITPARK = eINSTANCE.getFreizeitpark();

		/**
		 * The meta object literal for the '<em><b>Themen Welten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREIZEITPARK__THEMEN_WELTEN = eINSTANCE.getFreizeitpark_ThemenWelten();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREIZEITPARK__NAME = eINSTANCE.getFreizeitpark_Name();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREIZEITPARK__DESIGN = eINSTANCE.getFreizeitpark_Design();

		/**
		 * The meta object literal for the '<em><b>Eintrittskarten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREIZEITPARK__EINTRITTSKARTEN = eINSTANCE.getFreizeitpark_Eintrittskarten();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Informationen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREIZEITPARK__ALLGEMEINE_INFORMATIONEN = eINSTANCE.getFreizeitpark_AllgemeineInformationen();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.AllgemeineInformationenImpl <em>Allgemeine Informationen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.AllgemeineInformationenImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getAllgemeineInformationen()
		 * @generated
		 */
		EClass ALLGEMEINE_INFORMATIONEN = eINSTANCE.getAllgemeineInformationen();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_INFORMATIONEN__BESCHREIBUNG = eINSTANCE.getAllgemeineInformationen_Beschreibung();

		/**
		 * The meta object literal for the '<em><b>Zeitplan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_INFORMATIONEN__ZEITPLAN = eINSTANCE.getAllgemeineInformationen_Zeitplan();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.TagImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Öffnet Um</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__ÖFFNET_UM = eINSTANCE.getTag_ÖffnetUm();

		/**
		 * The meta object literal for the '<em><b>Schließt Um</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__SCHLIESST_UM = eINSTANCE.getTag_SchließtUm();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.DesignImpl <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.DesignImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getDesign()
		 * @generated
		 */
		EClass DESIGN = eINSTANCE.getDesign();

		/**
		 * The meta object literal for the '<em><b>Farbe1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__FARBE1 = eINSTANCE.getDesign_Farbe1();

		/**
		 * The meta object literal for the '<em><b>Farbe2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__FARBE2 = eINSTANCE.getDesign_Farbe2();

		/**
		 * The meta object literal for the '<em><b>Farbe3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__FARBE3 = eINSTANCE.getDesign_Farbe3();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.EintrittskarteImpl <em>Eintrittskarte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.EintrittskarteImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getEintrittskarte()
		 * @generated
		 */
		EClass EINTRITTSKARTE = eINSTANCE.getEintrittskarte();

		/**
		 * The meta object literal for the '<em><b>Tage Gültig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTRITTSKARTE__TAGE_GÜLTIG = eINSTANCE.getEintrittskarte_TageGültig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTRITTSKARTE__NAME = eINSTANCE.getEintrittskarte_Name();

		/**
		 * The meta object literal for the '<em><b>Preis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTRITTSKARTE__PREIS = eINSTANCE.getEintrittskarte_Preis();

		/**
		 * The meta object literal for the '<em><b>Personen Gruppen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTRITTSKARTE__PERSONEN_GRUPPEN = eINSTANCE.getEintrittskarte_PersonenGruppen();

		/**
		 * The meta object literal for the '<em><b>Übernachtung In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTRITTSKARTE__ÜBERNACHTUNG_IN = eINSTANCE.getEintrittskarte_ÜbernachtungIn();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.PersonengruppeImpl <em>Personengruppe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.PersonengruppeImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getPersonengruppe()
		 * @generated
		 */
		EClass PERSONENGRUPPE = eINSTANCE.getPersonengruppe();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONENGRUPPE__TYP = eINSTANCE.getPersonengruppe_Typ();

		/**
		 * The meta object literal for the '<em><b>Anzahl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONENGRUPPE__ANZAHL = eINSTANCE.getPersonengruppe_Anzahl();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.ThemenweltImpl <em>Themenwelt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.ThemenweltImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getThemenwelt()
		 * @generated
		 */
		EClass THEMENWELT = eINSTANCE.getThemenwelt();

		/**
		 * The meta object literal for the '<em><b>Attraktionen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEMENWELT__ATTRAKTIONEN = eINSTANCE.getThemenwelt_Attraktionen();

		/**
		 * The meta object literal for the '<em><b>Verkaufs Läden</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEMENWELT__VERKAUFS_LÄDEN = eINSTANCE.getThemenwelt_VerkaufsLäden();

		/**
		 * The meta object literal for the '<em><b>Übernachtungensmöglichkeiten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEMENWELT__ÜBERNACHTUNGENSMÖGLICHKEITEN = eINSTANCE.getThemenwelt_Übernachtungensmöglichkeiten();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEMENWELT__NAME = eINSTANCE.getThemenwelt_Name();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.AttraktionImpl <em>Attraktion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.AttraktionImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getAttraktion()
		 * @generated
		 */
		EClass ATTRAKTION = eINSTANCE.getAttraktion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRAKTION__NAME = eINSTANCE.getAttraktion_Name();

		/**
		 * The meta object literal for the '<em><b>Dauer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRAKTION__DAUER = eINSTANCE.getAttraktion_Dauer();

		/**
		 * The meta object literal for the '<em><b>Anzahl Plätze</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRAKTION__ANZAHL_PLÄTZE = eINSTANCE.getAttraktion_AnzahlPlätze();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.FahrgeschäftImpl <em>Fahrgeschäft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.FahrgeschäftImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getFahrgeschäft()
		 * @generated
		 */
		EClass FAHRGESCHÄFT = eINSTANCE.getFahrgeschäft();

		/**
		 * The meta object literal for the '<em><b>Mindest Größe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAHRGESCHÄFT__MINDEST_GRÖSSE = eINSTANCE.getFahrgeschäft_MindestGröße();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.ShowImpl <em>Show</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.ShowImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getShow()
		 * @generated
		 */
		EClass SHOW = eINSTANCE.getShow();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.VerkaufsladenImpl <em>Verkaufsladen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.VerkaufsladenImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getVerkaufsladen()
		 * @generated
		 */
		EClass VERKAUFSLADEN = eINSTANCE.getVerkaufsladen();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERKAUFSLADEN__NAME = eINSTANCE.getVerkaufsladen_Name();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.GastronomieImpl <em>Gastronomie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.GastronomieImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getGastronomie()
		 * @generated
		 */
		EClass GASTRONOMIE = eINSTANCE.getGastronomie();

		/**
		 * The meta object literal for the '<em><b>Anzahl Plätze</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GASTRONOMIE__ANZAHL_PLÄTZE = eINSTANCE.getGastronomie_AnzahlPlätze();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.RestaurantImpl <em>Restaurant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.RestaurantImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getRestaurant()
		 * @generated
		 */
		EClass RESTAURANT = eINSTANCE.getRestaurant();

		/**
		 * The meta object literal for the '<em><b>Sterne Bewertung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__STERNE_BEWERTUNG = eINSTANCE.getRestaurant_SterneBewertung();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.ImbissImpl <em>Imbiss</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.ImbissImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getImbiss()
		 * @generated
		 */
		EClass IMBISS = eINSTANCE.getImbiss();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.GeschäftImpl <em>Geschäft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.GeschäftImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getGeschäft()
		 * @generated
		 */
		EClass GESCHÄFT = eINSTANCE.getGeschäft();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.ÜbernachtungsmöglichkeitImpl <em>Übernachtungsmöglichkeit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.ÜbernachtungsmöglichkeitImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getÜbernachtungsmöglichkeit()
		 * @generated
		 */
		EClass ÜBERNACHTUNGSMÖGLICHKEIT = eINSTANCE.getÜbernachtungsmöglichkeit();

		/**
		 * The meta object literal for the '<em><b>Kosten Pro Nacht</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ÜBERNACHTUNGSMÖGLICHKEIT__KOSTEN_PRO_NACHT = eINSTANCE.getÜbernachtungsmöglichkeit_KostenProNacht();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ÜBERNACHTUNGSMÖGLICHKEIT__NAME = eINSTANCE.getÜbernachtungsmöglichkeit_Name();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.HotelImpl <em>Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.HotelImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getHotel()
		 * @generated
		 */
		EClass HOTEL = eINSTANCE.getHotel();

		/**
		 * The meta object literal for the '<em><b>Stern Bewertung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL__STERN_BEWERTUNG = eINSTANCE.getHotel_SternBewertung();

		/**
		 * The meta object literal for the '{@link FreitparkModel.impl.CampingplatzImpl <em>Campingplatz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreitparkModel.impl.CampingplatzImpl
		 * @see FreitparkModel.impl.FreitparkModelPackageImpl#getCampingplatz()
		 * @generated
		 */
		EClass CAMPINGPLATZ = eINSTANCE.getCampingplatz();

	}

} //FreitparkModelPackage
