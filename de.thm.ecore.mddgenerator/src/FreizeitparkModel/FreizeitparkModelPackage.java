/**
 */
package FreizeitparkModel;

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
 * @see FreizeitparkModel.FreizeitparkModelFactory
 * @model kind="package"
 * @generated
 */
public interface FreizeitparkModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FreizeitparkModel";

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
	FreizeitparkModelPackage eINSTANCE = FreizeitparkModel.impl.FreizeitparkModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link FreizeitparkModel.impl.FreizeitparkImpl <em>Freizeitpark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.FreizeitparkImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getFreizeitpark()
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
	 * The meta object id for the '{@link FreizeitparkModel.impl.AllgemeineInformationenImpl <em>Allgemeine Informationen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.AllgemeineInformationenImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getAllgemeineInformationen()
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
	 * The meta object id for the '{@link FreizeitparkModel.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.TagImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 2;

	/**
	 * The feature id for the '<em><b>�ffnet Um</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__�FFNET_UM = 0;

	/**
	 * The feature id for the '<em><b>Schlie�t Um</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__SCHLIESST_UM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 2;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreizeitparkModel.impl.DesignImpl <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.DesignImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getDesign()
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
	 * The feature id for the '<em><b>Titel Farbe1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__TITEL_FARBE1 = 1;

	/**
	 * The feature id for the '<em><b>Text Farbe1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__TEXT_FARBE1 = 2;

	/**
	 * The feature id for the '<em><b>Farbe2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__FARBE2 = 3;

	/**
	 * The feature id for the '<em><b>Titel Farbe2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__TITEL_FARBE2 = 4;

	/**
	 * The feature id for the '<em><b>Text Farbe2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__TEXT_FARBE2 = 5;

	/**
	 * The feature id for the '<em><b>Farbe3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__FARBE3 = 6;

	/**
	 * The feature id for the '<em><b>Titel Farbe3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__TITEL_FARBE3 = 7;

	/**
	 * The feature id for the '<em><b>Text Farbe3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__TEXT_FARBE3 = 8;

	/**
	 * The feature id for the '<em><b>Farbe4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__FARBE4 = 9;

	/**
	 * The feature id for the '<em><b>Farbe5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__FARBE5 = 10;

	/**
	 * The feature id for the '<em><b>Titel Farbe5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__TITEL_FARBE5 = 11;

	/**
	 * The feature id for the '<em><b>Text Farbe5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__TEXT_FARBE5 = 12;

	/**
	 * The number of structural features of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreizeitparkModel.impl.EintrittskarteImpl <em>Eintrittskarte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.EintrittskarteImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getEintrittskarte()
	 * @generated
	 */
	int EINTRITTSKARTE = 4;

	/**
	 * The feature id for the '<em><b>Tage G�ltig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRITTSKARTE__TAGE_G�LTIG = 0;

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
	 * The feature id for the '<em><b>�bernachtung In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRITTSKARTE__�BERNACHTUNG_IN = 4;

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
	 * The meta object id for the '{@link FreizeitparkModel.impl.PersonengruppeImpl <em>Personengruppe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.PersonengruppeImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getPersonengruppe()
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
	 * The meta object id for the '{@link FreizeitparkModel.impl.ThemenweltImpl <em>Themenwelt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.ThemenweltImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getThemenwelt()
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
	 * The feature id for the '<em><b>Verkaufs L�den</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMENWELT__VERKAUFS_L�DEN = 1;

	/**
	 * The feature id for the '<em><b>�bernachtungensm�glichkeiten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMENWELT__�BERNACHTUNGENSM�GLICHKEITEN = 2;

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
	 * The meta object id for the '{@link FreizeitparkModel.impl.AttraktionImpl <em>Attraktion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.AttraktionImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getAttraktion()
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
	 * The feature id for the '<em><b>Anzahl Pl�tze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRAKTION__ANZAHL_PL�TZE = 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRAKTION__IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRAKTION__BESCHREIBUNG = 4;

	/**
	 * The number of structural features of the '<em>Attraktion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRAKTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Attraktion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRAKTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreizeitparkModel.impl.Fahrgesch�ftImpl <em>Fahrgesch�ft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.Fahrgesch�ftImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getFahrgesch�ft()
	 * @generated
	 */
	int FAHRGESCH�FT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCH�FT__NAME = ATTRAKTION__NAME;

	/**
	 * The feature id for the '<em><b>Dauer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCH�FT__DAUER = ATTRAKTION__DAUER;

	/**
	 * The feature id for the '<em><b>Anzahl Pl�tze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCH�FT__ANZAHL_PL�TZE = ATTRAKTION__ANZAHL_PL�TZE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCH�FT__IMAGE = ATTRAKTION__IMAGE;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCH�FT__BESCHREIBUNG = ATTRAKTION__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Mindest Gr��e</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCH�FT__MINDEST_GR�SSE = ATTRAKTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fahrgesch�ft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCH�FT_FEATURE_COUNT = ATTRAKTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fahrgesch�ft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRGESCH�FT_OPERATION_COUNT = ATTRAKTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FreizeitparkModel.impl.ShowImpl <em>Show</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.ShowImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getShow()
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
	 * The feature id for the '<em><b>Anzahl Pl�tze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__ANZAHL_PL�TZE = ATTRAKTION__ANZAHL_PL�TZE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__IMAGE = ATTRAKTION__IMAGE;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__BESCHREIBUNG = ATTRAKTION__BESCHREIBUNG;

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
	 * The meta object id for the '{@link FreizeitparkModel.impl.VerkaufsladenImpl <em>Verkaufsladen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.VerkaufsladenImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getVerkaufsladen()
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
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKAUFSLADEN__IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKAUFSLADEN__BESCHREIBUNG = 2;

	/**
	 * The number of structural features of the '<em>Verkaufsladen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKAUFSLADEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Verkaufsladen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKAUFSLADEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreizeitparkModel.impl.GastronomieImpl <em>Gastronomie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.GastronomieImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getGastronomie()
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
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTRONOMIE__IMAGE = VERKAUFSLADEN__IMAGE;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTRONOMIE__BESCHREIBUNG = VERKAUFSLADEN__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Anzahl Pl�tze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GASTRONOMIE__ANZAHL_PL�TZE = VERKAUFSLADEN_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link FreizeitparkModel.impl.RestaurantImpl <em>Restaurant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.RestaurantImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getRestaurant()
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
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__IMAGE = GASTRONOMIE__IMAGE;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__BESCHREIBUNG = GASTRONOMIE__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Anzahl Pl�tze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__ANZAHL_PL�TZE = GASTRONOMIE__ANZAHL_PL�TZE;

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
	 * The meta object id for the '{@link FreizeitparkModel.impl.ImbissImpl <em>Imbiss</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.ImbissImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getImbiss()
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
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMBISS__IMAGE = GASTRONOMIE__IMAGE;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMBISS__BESCHREIBUNG = GASTRONOMIE__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Anzahl Pl�tze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMBISS__ANZAHL_PL�TZE = GASTRONOMIE__ANZAHL_PL�TZE;

	/**
	 * The feature id for the '<em><b>Spezial Gericht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMBISS__SPEZIAL_GERICHT = GASTRONOMIE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imbiss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMBISS_FEATURE_COUNT = GASTRONOMIE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Imbiss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMBISS_OPERATION_COUNT = GASTRONOMIE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FreizeitparkModel.impl.Gesch�ftImpl <em>Gesch�ft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.Gesch�ftImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getGesch�ft()
	 * @generated
	 */
	int GESCH�FT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCH�FT__NAME = VERKAUFSLADEN__NAME;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCH�FT__IMAGE = VERKAUFSLADEN__IMAGE;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCH�FT__BESCHREIBUNG = VERKAUFSLADEN__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Verkaufs Fl�che</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCH�FT__VERKAUFS_FL�CHE = VERKAUFSLADEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gesch�ft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCH�FT_FEATURE_COUNT = VERKAUFSLADEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gesch�ft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCH�FT_OPERATION_COUNT = VERKAUFSLADEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FreizeitparkModel.impl.�bernachtungsm�glichkeitImpl <em>�bernachtungsm�glichkeit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.�bernachtungsm�glichkeitImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#get�bernachtungsm�glichkeit()
	 * @generated
	 */
	int �BERNACHTUNGSM�GLICHKEIT = 15;

	/**
	 * The feature id for the '<em><b>Kosten Pro Nacht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int �BERNACHTUNGSM�GLICHKEIT__KOSTEN_PRO_NACHT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int �BERNACHTUNGSM�GLICHKEIT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int �BERNACHTUNGSM�GLICHKEIT__IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int �BERNACHTUNGSM�GLICHKEIT__BESCHREIBUNG = 3;

	/**
	 * The number of structural features of the '<em>�bernachtungsm�glichkeit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int �BERNACHTUNGSM�GLICHKEIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>�bernachtungsm�glichkeit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int �BERNACHTUNGSM�GLICHKEIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FreizeitparkModel.impl.HotelImpl <em>Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.HotelImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getHotel()
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
	int HOTEL__KOSTEN_PRO_NACHT = �BERNACHTUNGSM�GLICHKEIT__KOSTEN_PRO_NACHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__NAME = �BERNACHTUNGSM�GLICHKEIT__NAME;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__IMAGE = �BERNACHTUNGSM�GLICHKEIT__IMAGE;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__BESCHREIBUNG = �BERNACHTUNGSM�GLICHKEIT__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Stern Bewertung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__STERN_BEWERTUNG = �BERNACHTUNGSM�GLICHKEIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FEATURE_COUNT = �BERNACHTUNGSM�GLICHKEIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OPERATION_COUNT = �BERNACHTUNGSM�GLICHKEIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FreizeitparkModel.impl.CampingplatzImpl <em>Campingplatz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreizeitparkModel.impl.CampingplatzImpl
	 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getCampingplatz()
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
	int CAMPINGPLATZ__KOSTEN_PRO_NACHT = �BERNACHTUNGSM�GLICHKEIT__KOSTEN_PRO_NACHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPINGPLATZ__NAME = �BERNACHTUNGSM�GLICHKEIT__NAME;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPINGPLATZ__IMAGE = �BERNACHTUNGSM�GLICHKEIT__IMAGE;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPINGPLATZ__BESCHREIBUNG = �BERNACHTUNGSM�GLICHKEIT__BESCHREIBUNG;

	/**
	 * The number of structural features of the '<em>Campingplatz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPINGPLATZ_FEATURE_COUNT = �BERNACHTUNGSM�GLICHKEIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Campingplatz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPINGPLATZ_OPERATION_COUNT = �BERNACHTUNGSM�GLICHKEIT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Freizeitpark <em>Freizeitpark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Freizeitpark</em>'.
	 * @see FreizeitparkModel.Freizeitpark
	 * @generated
	 */
	EClass getFreizeitpark();

	/**
	 * Returns the meta object for the containment reference list '{@link FreizeitparkModel.Freizeitpark#getThemenWelten <em>Themen Welten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Themen Welten</em>'.
	 * @see FreizeitparkModel.Freizeitpark#getThemenWelten()
	 * @see #getFreizeitpark()
	 * @generated
	 */
	EReference getFreizeitpark_ThemenWelten();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Freizeitpark#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreizeitparkModel.Freizeitpark#getName()
	 * @see #getFreizeitpark()
	 * @generated
	 */
	EAttribute getFreizeitpark_Name();

	/**
	 * Returns the meta object for the containment reference '{@link FreizeitparkModel.Freizeitpark#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design</em>'.
	 * @see FreizeitparkModel.Freizeitpark#getDesign()
	 * @see #getFreizeitpark()
	 * @generated
	 */
	EReference getFreizeitpark_Design();

	/**
	 * Returns the meta object for the containment reference list '{@link FreizeitparkModel.Freizeitpark#getEintrittskarten <em>Eintrittskarten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eintrittskarten</em>'.
	 * @see FreizeitparkModel.Freizeitpark#getEintrittskarten()
	 * @see #getFreizeitpark()
	 * @generated
	 */
	EReference getFreizeitpark_Eintrittskarten();

	/**
	 * Returns the meta object for the containment reference '{@link FreizeitparkModel.Freizeitpark#getAllgemeineInformationen <em>Allgemeine Informationen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allgemeine Informationen</em>'.
	 * @see FreizeitparkModel.Freizeitpark#getAllgemeineInformationen()
	 * @see #getFreizeitpark()
	 * @generated
	 */
	EReference getFreizeitpark_AllgemeineInformationen();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.AllgemeineInformationen <em>Allgemeine Informationen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeine Informationen</em>'.
	 * @see FreizeitparkModel.AllgemeineInformationen
	 * @generated
	 */
	EClass getAllgemeineInformationen();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.AllgemeineInformationen#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see FreizeitparkModel.AllgemeineInformationen#getBeschreibung()
	 * @see #getAllgemeineInformationen()
	 * @generated
	 */
	EAttribute getAllgemeineInformationen_Beschreibung();

	/**
	 * Returns the meta object for the containment reference list '{@link FreizeitparkModel.AllgemeineInformationen#getZeitplan <em>Zeitplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitplan</em>'.
	 * @see FreizeitparkModel.AllgemeineInformationen#getZeitplan()
	 * @see #getAllgemeineInformationen()
	 * @generated
	 */
	EReference getAllgemeineInformationen_Zeitplan();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see FreizeitparkModel.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Tag#get�ffnetUm <em>�ffnet Um</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>�ffnet Um</em>'.
	 * @see FreizeitparkModel.Tag#get�ffnetUm()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_�ffnetUm();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Tag#getSchlie�tUm <em>Schlie�t Um</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schlie�t Um</em>'.
	 * @see FreizeitparkModel.Tag#getSchlie�tUm()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Schlie�tUm();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreizeitparkModel.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see FreizeitparkModel.Design
	 * @generated
	 */
	EClass getDesign();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getFarbe1 <em>Farbe1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farbe1</em>'.
	 * @see FreizeitparkModel.Design#getFarbe1()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_Farbe1();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getTitelFarbe1 <em>Titel Farbe1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titel Farbe1</em>'.
	 * @see FreizeitparkModel.Design#getTitelFarbe1()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_TitelFarbe1();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getTextFarbe1 <em>Text Farbe1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Farbe1</em>'.
	 * @see FreizeitparkModel.Design#getTextFarbe1()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_TextFarbe1();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getFarbe2 <em>Farbe2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farbe2</em>'.
	 * @see FreizeitparkModel.Design#getFarbe2()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_Farbe2();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getTitelFarbe2 <em>Titel Farbe2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titel Farbe2</em>'.
	 * @see FreizeitparkModel.Design#getTitelFarbe2()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_TitelFarbe2();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getTextFarbe2 <em>Text Farbe2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Farbe2</em>'.
	 * @see FreizeitparkModel.Design#getTextFarbe2()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_TextFarbe2();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getFarbe3 <em>Farbe3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farbe3</em>'.
	 * @see FreizeitparkModel.Design#getFarbe3()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_Farbe3();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getTitelFarbe3 <em>Titel Farbe3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titel Farbe3</em>'.
	 * @see FreizeitparkModel.Design#getTitelFarbe3()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_TitelFarbe3();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getTextFarbe3 <em>Text Farbe3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Farbe3</em>'.
	 * @see FreizeitparkModel.Design#getTextFarbe3()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_TextFarbe3();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getFarbe4 <em>Farbe4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farbe4</em>'.
	 * @see FreizeitparkModel.Design#getFarbe4()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_Farbe4();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getFarbe5 <em>Farbe5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farbe5</em>'.
	 * @see FreizeitparkModel.Design#getFarbe5()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_Farbe5();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getTitelFarbe5 <em>Titel Farbe5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titel Farbe5</em>'.
	 * @see FreizeitparkModel.Design#getTitelFarbe5()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_TitelFarbe5();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Design#getTextFarbe5 <em>Text Farbe5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Farbe5</em>'.
	 * @see FreizeitparkModel.Design#getTextFarbe5()
	 * @see #getDesign()
	 * @generated
	 */
	EAttribute getDesign_TextFarbe5();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Eintrittskarte <em>Eintrittskarte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eintrittskarte</em>'.
	 * @see FreizeitparkModel.Eintrittskarte
	 * @generated
	 */
	EClass getEintrittskarte();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Eintrittskarte#getTageG�ltig <em>Tage G�ltig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tage G�ltig</em>'.
	 * @see FreizeitparkModel.Eintrittskarte#getTageG�ltig()
	 * @see #getEintrittskarte()
	 * @generated
	 */
	EAttribute getEintrittskarte_TageG�ltig();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Eintrittskarte#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreizeitparkModel.Eintrittskarte#getName()
	 * @see #getEintrittskarte()
	 * @generated
	 */
	EAttribute getEintrittskarte_Name();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Eintrittskarte#getPreis <em>Preis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preis</em>'.
	 * @see FreizeitparkModel.Eintrittskarte#getPreis()
	 * @see #getEintrittskarte()
	 * @generated
	 */
	EAttribute getEintrittskarte_Preis();

	/**
	 * Returns the meta object for the containment reference list '{@link FreizeitparkModel.Eintrittskarte#getPersonenGruppen <em>Personen Gruppen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personen Gruppen</em>'.
	 * @see FreizeitparkModel.Eintrittskarte#getPersonenGruppen()
	 * @see #getEintrittskarte()
	 * @generated
	 */
	EReference getEintrittskarte_PersonenGruppen();

	/**
	 * Returns the meta object for the reference '{@link FreizeitparkModel.Eintrittskarte#get�bernachtungIn <em>�bernachtung In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>�bernachtung In</em>'.
	 * @see FreizeitparkModel.Eintrittskarte#get�bernachtungIn()
	 * @see #getEintrittskarte()
	 * @generated
	 */
	EReference getEintrittskarte_�bernachtungIn();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Personengruppe <em>Personengruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personengruppe</em>'.
	 * @see FreizeitparkModel.Personengruppe
	 * @generated
	 */
	EClass getPersonengruppe();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Personengruppe#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see FreizeitparkModel.Personengruppe#getTyp()
	 * @see #getPersonengruppe()
	 * @generated
	 */
	EAttribute getPersonengruppe_Typ();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Personengruppe#getAnzahl <em>Anzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl</em>'.
	 * @see FreizeitparkModel.Personengruppe#getAnzahl()
	 * @see #getPersonengruppe()
	 * @generated
	 */
	EAttribute getPersonengruppe_Anzahl();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Themenwelt <em>Themenwelt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Themenwelt</em>'.
	 * @see FreizeitparkModel.Themenwelt
	 * @generated
	 */
	EClass getThemenwelt();

	/**
	 * Returns the meta object for the containment reference list '{@link FreizeitparkModel.Themenwelt#getAttraktionen <em>Attraktionen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attraktionen</em>'.
	 * @see FreizeitparkModel.Themenwelt#getAttraktionen()
	 * @see #getThemenwelt()
	 * @generated
	 */
	EReference getThemenwelt_Attraktionen();

	/**
	 * Returns the meta object for the containment reference list '{@link FreizeitparkModel.Themenwelt#getVerkaufsL�den <em>Verkaufs L�den</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verkaufs L�den</em>'.
	 * @see FreizeitparkModel.Themenwelt#getVerkaufsL�den()
	 * @see #getThemenwelt()
	 * @generated
	 */
	EReference getThemenwelt_VerkaufsL�den();

	/**
	 * Returns the meta object for the containment reference list '{@link FreizeitparkModel.Themenwelt#get�bernachtungensm�glichkeiten <em>�bernachtungensm�glichkeiten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>�bernachtungensm�glichkeiten</em>'.
	 * @see FreizeitparkModel.Themenwelt#get�bernachtungensm�glichkeiten()
	 * @see #getThemenwelt()
	 * @generated
	 */
	EReference getThemenwelt_�bernachtungensm�glichkeiten();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Themenwelt#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreizeitparkModel.Themenwelt#getName()
	 * @see #getThemenwelt()
	 * @generated
	 */
	EAttribute getThemenwelt_Name();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Attraktion <em>Attraktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attraktion</em>'.
	 * @see FreizeitparkModel.Attraktion
	 * @generated
	 */
	EClass getAttraktion();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Attraktion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreizeitparkModel.Attraktion#getName()
	 * @see #getAttraktion()
	 * @generated
	 */
	EAttribute getAttraktion_Name();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Attraktion#getDauer <em>Dauer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dauer</em>'.
	 * @see FreizeitparkModel.Attraktion#getDauer()
	 * @see #getAttraktion()
	 * @generated
	 */
	EAttribute getAttraktion_Dauer();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Attraktion#getAnzahlPl�tze <em>Anzahl Pl�tze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Pl�tze</em>'.
	 * @see FreizeitparkModel.Attraktion#getAnzahlPl�tze()
	 * @see #getAttraktion()
	 * @generated
	 */
	EAttribute getAttraktion_AnzahlPl�tze();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Attraktion#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see FreizeitparkModel.Attraktion#getImage()
	 * @see #getAttraktion()
	 * @generated
	 */
	EAttribute getAttraktion_Image();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Attraktion#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see FreizeitparkModel.Attraktion#getBeschreibung()
	 * @see #getAttraktion()
	 * @generated
	 */
	EAttribute getAttraktion_Beschreibung();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Fahrgesch�ft <em>Fahrgesch�ft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fahrgesch�ft</em>'.
	 * @see FreizeitparkModel.Fahrgesch�ft
	 * @generated
	 */
	EClass getFahrgesch�ft();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Fahrgesch�ft#getMindestGr��e <em>Mindest Gr��e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mindest Gr��e</em>'.
	 * @see FreizeitparkModel.Fahrgesch�ft#getMindestGr��e()
	 * @see #getFahrgesch�ft()
	 * @generated
	 */
	EAttribute getFahrgesch�ft_MindestGr��e();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Show <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show</em>'.
	 * @see FreizeitparkModel.Show
	 * @generated
	 */
	EClass getShow();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Verkaufsladen <em>Verkaufsladen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verkaufsladen</em>'.
	 * @see FreizeitparkModel.Verkaufsladen
	 * @generated
	 */
	EClass getVerkaufsladen();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Verkaufsladen#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreizeitparkModel.Verkaufsladen#getName()
	 * @see #getVerkaufsladen()
	 * @generated
	 */
	EAttribute getVerkaufsladen_Name();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Verkaufsladen#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see FreizeitparkModel.Verkaufsladen#getImage()
	 * @see #getVerkaufsladen()
	 * @generated
	 */
	EAttribute getVerkaufsladen_Image();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Verkaufsladen#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see FreizeitparkModel.Verkaufsladen#getBeschreibung()
	 * @see #getVerkaufsladen()
	 * @generated
	 */
	EAttribute getVerkaufsladen_Beschreibung();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Gastronomie <em>Gastronomie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gastronomie</em>'.
	 * @see FreizeitparkModel.Gastronomie
	 * @generated
	 */
	EClass getGastronomie();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Gastronomie#getAnzahlPl�tze <em>Anzahl Pl�tze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Pl�tze</em>'.
	 * @see FreizeitparkModel.Gastronomie#getAnzahlPl�tze()
	 * @see #getGastronomie()
	 * @generated
	 */
	EAttribute getGastronomie_AnzahlPl�tze();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Restaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant</em>'.
	 * @see FreizeitparkModel.Restaurant
	 * @generated
	 */
	EClass getRestaurant();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Restaurant#getSterneBewertung <em>Sterne Bewertung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sterne Bewertung</em>'.
	 * @see FreizeitparkModel.Restaurant#getSterneBewertung()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_SterneBewertung();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Imbiss <em>Imbiss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imbiss</em>'.
	 * @see FreizeitparkModel.Imbiss
	 * @generated
	 */
	EClass getImbiss();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Imbiss#getSpezialGericht <em>Spezial Gericht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spezial Gericht</em>'.
	 * @see FreizeitparkModel.Imbiss#getSpezialGericht()
	 * @see #getImbiss()
	 * @generated
	 */
	EAttribute getImbiss_SpezialGericht();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Gesch�ft <em>Gesch�ft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gesch�ft</em>'.
	 * @see FreizeitparkModel.Gesch�ft
	 * @generated
	 */
	EClass getGesch�ft();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Gesch�ft#getVerkaufsFl�che <em>Verkaufs Fl�che</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verkaufs Fl�che</em>'.
	 * @see FreizeitparkModel.Gesch�ft#getVerkaufsFl�che()
	 * @see #getGesch�ft()
	 * @generated
	 */
	EAttribute getGesch�ft_VerkaufsFl�che();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.�bernachtungsm�glichkeit <em>�bernachtungsm�glichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>�bernachtungsm�glichkeit</em>'.
	 * @see FreizeitparkModel.�bernachtungsm�glichkeit
	 * @generated
	 */
	EClass get�bernachtungsm�glichkeit();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.�bernachtungsm�glichkeit#getKostenProNacht <em>Kosten Pro Nacht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kosten Pro Nacht</em>'.
	 * @see FreizeitparkModel.�bernachtungsm�glichkeit#getKostenProNacht()
	 * @see #get�bernachtungsm�glichkeit()
	 * @generated
	 */
	EAttribute get�bernachtungsm�glichkeit_KostenProNacht();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.�bernachtungsm�glichkeit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreizeitparkModel.�bernachtungsm�glichkeit#getName()
	 * @see #get�bernachtungsm�glichkeit()
	 * @generated
	 */
	EAttribute get�bernachtungsm�glichkeit_Name();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.�bernachtungsm�glichkeit#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see FreizeitparkModel.�bernachtungsm�glichkeit#getImage()
	 * @see #get�bernachtungsm�glichkeit()
	 * @generated
	 */
	EAttribute get�bernachtungsm�glichkeit_Image();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.�bernachtungsm�glichkeit#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see FreizeitparkModel.�bernachtungsm�glichkeit#getBeschreibung()
	 * @see #get�bernachtungsm�glichkeit()
	 * @generated
	 */
	EAttribute get�bernachtungsm�glichkeit_Beschreibung();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel</em>'.
	 * @see FreizeitparkModel.Hotel
	 * @generated
	 */
	EClass getHotel();

	/**
	 * Returns the meta object for the attribute '{@link FreizeitparkModel.Hotel#getSternBewertung <em>Stern Bewertung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stern Bewertung</em>'.
	 * @see FreizeitparkModel.Hotel#getSternBewertung()
	 * @see #getHotel()
	 * @generated
	 */
	EAttribute getHotel_SternBewertung();

	/**
	 * Returns the meta object for class '{@link FreizeitparkModel.Campingplatz <em>Campingplatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campingplatz</em>'.
	 * @see FreizeitparkModel.Campingplatz
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
	FreizeitparkModelFactory getFreizeitparkModelFactory();

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
		 * The meta object literal for the '{@link FreizeitparkModel.impl.FreizeitparkImpl <em>Freizeitpark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.FreizeitparkImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getFreizeitpark()
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
		 * The meta object literal for the '{@link FreizeitparkModel.impl.AllgemeineInformationenImpl <em>Allgemeine Informationen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.AllgemeineInformationenImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getAllgemeineInformationen()
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
		 * The meta object literal for the '{@link FreizeitparkModel.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.TagImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>�ffnet Um</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__�FFNET_UM = eINSTANCE.getTag_�ffnetUm();

		/**
		 * The meta object literal for the '<em><b>Schlie�t Um</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__SCHLIESST_UM = eINSTANCE.getTag_Schlie�tUm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.DesignImpl <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.DesignImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getDesign()
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
		 * The meta object literal for the '<em><b>Titel Farbe1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__TITEL_FARBE1 = eINSTANCE.getDesign_TitelFarbe1();

		/**
		 * The meta object literal for the '<em><b>Text Farbe1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__TEXT_FARBE1 = eINSTANCE.getDesign_TextFarbe1();

		/**
		 * The meta object literal for the '<em><b>Farbe2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__FARBE2 = eINSTANCE.getDesign_Farbe2();

		/**
		 * The meta object literal for the '<em><b>Titel Farbe2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__TITEL_FARBE2 = eINSTANCE.getDesign_TitelFarbe2();

		/**
		 * The meta object literal for the '<em><b>Text Farbe2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__TEXT_FARBE2 = eINSTANCE.getDesign_TextFarbe2();

		/**
		 * The meta object literal for the '<em><b>Farbe3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__FARBE3 = eINSTANCE.getDesign_Farbe3();

		/**
		 * The meta object literal for the '<em><b>Titel Farbe3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__TITEL_FARBE3 = eINSTANCE.getDesign_TitelFarbe3();

		/**
		 * The meta object literal for the '<em><b>Text Farbe3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__TEXT_FARBE3 = eINSTANCE.getDesign_TextFarbe3();

		/**
		 * The meta object literal for the '<em><b>Farbe4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__FARBE4 = eINSTANCE.getDesign_Farbe4();

		/**
		 * The meta object literal for the '<em><b>Farbe5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__FARBE5 = eINSTANCE.getDesign_Farbe5();

		/**
		 * The meta object literal for the '<em><b>Titel Farbe5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__TITEL_FARBE5 = eINSTANCE.getDesign_TitelFarbe5();

		/**
		 * The meta object literal for the '<em><b>Text Farbe5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN__TEXT_FARBE5 = eINSTANCE.getDesign_TextFarbe5();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.EintrittskarteImpl <em>Eintrittskarte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.EintrittskarteImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getEintrittskarte()
		 * @generated
		 */
		EClass EINTRITTSKARTE = eINSTANCE.getEintrittskarte();

		/**
		 * The meta object literal for the '<em><b>Tage G�ltig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTRITTSKARTE__TAGE_G�LTIG = eINSTANCE.getEintrittskarte_TageG�ltig();

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
		 * The meta object literal for the '<em><b>�bernachtung In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTRITTSKARTE__�BERNACHTUNG_IN = eINSTANCE.getEintrittskarte_�bernachtungIn();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.PersonengruppeImpl <em>Personengruppe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.PersonengruppeImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getPersonengruppe()
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
		 * The meta object literal for the '{@link FreizeitparkModel.impl.ThemenweltImpl <em>Themenwelt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.ThemenweltImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getThemenwelt()
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
		 * The meta object literal for the '<em><b>Verkaufs L�den</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEMENWELT__VERKAUFS_L�DEN = eINSTANCE.getThemenwelt_VerkaufsL�den();

		/**
		 * The meta object literal for the '<em><b>�bernachtungensm�glichkeiten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEMENWELT__�BERNACHTUNGENSM�GLICHKEITEN = eINSTANCE.getThemenwelt_�bernachtungensm�glichkeiten();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEMENWELT__NAME = eINSTANCE.getThemenwelt_Name();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.AttraktionImpl <em>Attraktion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.AttraktionImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getAttraktion()
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
		 * The meta object literal for the '<em><b>Anzahl Pl�tze</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRAKTION__ANZAHL_PL�TZE = eINSTANCE.getAttraktion_AnzahlPl�tze();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRAKTION__IMAGE = eINSTANCE.getAttraktion_Image();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRAKTION__BESCHREIBUNG = eINSTANCE.getAttraktion_Beschreibung();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.Fahrgesch�ftImpl <em>Fahrgesch�ft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.Fahrgesch�ftImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getFahrgesch�ft()
		 * @generated
		 */
		EClass FAHRGESCH�FT = eINSTANCE.getFahrgesch�ft();

		/**
		 * The meta object literal for the '<em><b>Mindest Gr��e</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAHRGESCH�FT__MINDEST_GR�SSE = eINSTANCE.getFahrgesch�ft_MindestGr��e();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.ShowImpl <em>Show</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.ShowImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getShow()
		 * @generated
		 */
		EClass SHOW = eINSTANCE.getShow();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.VerkaufsladenImpl <em>Verkaufsladen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.VerkaufsladenImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getVerkaufsladen()
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
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERKAUFSLADEN__IMAGE = eINSTANCE.getVerkaufsladen_Image();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERKAUFSLADEN__BESCHREIBUNG = eINSTANCE.getVerkaufsladen_Beschreibung();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.GastronomieImpl <em>Gastronomie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.GastronomieImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getGastronomie()
		 * @generated
		 */
		EClass GASTRONOMIE = eINSTANCE.getGastronomie();

		/**
		 * The meta object literal for the '<em><b>Anzahl Pl�tze</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GASTRONOMIE__ANZAHL_PL�TZE = eINSTANCE.getGastronomie_AnzahlPl�tze();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.RestaurantImpl <em>Restaurant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.RestaurantImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getRestaurant()
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
		 * The meta object literal for the '{@link FreizeitparkModel.impl.ImbissImpl <em>Imbiss</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.ImbissImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getImbiss()
		 * @generated
		 */
		EClass IMBISS = eINSTANCE.getImbiss();

		/**
		 * The meta object literal for the '<em><b>Spezial Gericht</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMBISS__SPEZIAL_GERICHT = eINSTANCE.getImbiss_SpezialGericht();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.Gesch�ftImpl <em>Gesch�ft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.Gesch�ftImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getGesch�ft()
		 * @generated
		 */
		EClass GESCH�FT = eINSTANCE.getGesch�ft();

		/**
		 * The meta object literal for the '<em><b>Verkaufs Fl�che</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GESCH�FT__VERKAUFS_FL�CHE = eINSTANCE.getGesch�ft_VerkaufsFl�che();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.�bernachtungsm�glichkeitImpl <em>�bernachtungsm�glichkeit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.�bernachtungsm�glichkeitImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#get�bernachtungsm�glichkeit()
		 * @generated
		 */
		EClass �BERNACHTUNGSM�GLICHKEIT = eINSTANCE.get�bernachtungsm�glichkeit();

		/**
		 * The meta object literal for the '<em><b>Kosten Pro Nacht</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute �BERNACHTUNGSM�GLICHKEIT__KOSTEN_PRO_NACHT = eINSTANCE.get�bernachtungsm�glichkeit_KostenProNacht();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute �BERNACHTUNGSM�GLICHKEIT__NAME = eINSTANCE.get�bernachtungsm�glichkeit_Name();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute �BERNACHTUNGSM�GLICHKEIT__IMAGE = eINSTANCE.get�bernachtungsm�glichkeit_Image();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute �BERNACHTUNGSM�GLICHKEIT__BESCHREIBUNG = eINSTANCE.get�bernachtungsm�glichkeit_Beschreibung();

		/**
		 * The meta object literal for the '{@link FreizeitparkModel.impl.HotelImpl <em>Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.HotelImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getHotel()
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
		 * The meta object literal for the '{@link FreizeitparkModel.impl.CampingplatzImpl <em>Campingplatz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreizeitparkModel.impl.CampingplatzImpl
		 * @see FreizeitparkModel.impl.FreizeitparkModelPackageImpl#getCampingplatz()
		 * @generated
		 */
		EClass CAMPINGPLATZ = eINSTANCE.getCampingplatz();

	}

} //FreizeitparkModelPackage
