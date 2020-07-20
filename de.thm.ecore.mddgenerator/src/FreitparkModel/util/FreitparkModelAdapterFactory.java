/**
 */
package FreitparkModel.util;

import FreitparkModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see FreitparkModel.FreitparkModelPackage
 * @generated
 */
public class FreitparkModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FreitparkModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreitparkModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FreitparkModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreitparkModelSwitch<Adapter> modelSwitch =
		new FreitparkModelSwitch<Adapter>() {
			@Override
			public Adapter caseFreizeitpark(Freizeitpark object) {
				return createFreizeitparkAdapter();
			}
			@Override
			public Adapter caseAllgemeineInformationen(AllgemeineInformationen object) {
				return createAllgemeineInformationenAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseDesign(Design object) {
				return createDesignAdapter();
			}
			@Override
			public Adapter caseEintrittskarte(Eintrittskarte object) {
				return createEintrittskarteAdapter();
			}
			@Override
			public Adapter casePersonengruppe(Personengruppe object) {
				return createPersonengruppeAdapter();
			}
			@Override
			public Adapter caseThemenwelt(Themenwelt object) {
				return createThemenweltAdapter();
			}
			@Override
			public Adapter caseAttraktion(Attraktion object) {
				return createAttraktionAdapter();
			}
			@Override
			public Adapter caseFahrgeschäft(Fahrgeschäft object) {
				return createFahrgeschäftAdapter();
			}
			@Override
			public Adapter caseShow(Show object) {
				return createShowAdapter();
			}
			@Override
			public Adapter caseVerkaufsladen(Verkaufsladen object) {
				return createVerkaufsladenAdapter();
			}
			@Override
			public Adapter caseGastronomie(Gastronomie object) {
				return createGastronomieAdapter();
			}
			@Override
			public Adapter caseRestaurant(Restaurant object) {
				return createRestaurantAdapter();
			}
			@Override
			public Adapter caseImbiss(Imbiss object) {
				return createImbissAdapter();
			}
			@Override
			public Adapter caseGeschäft(Geschäft object) {
				return createGeschäftAdapter();
			}
			@Override
			public Adapter caseÜbernachtungsmöglichkeit(Übernachtungsmöglichkeit object) {
				return createÜbernachtungsmöglichkeitAdapter();
			}
			@Override
			public Adapter caseHotel(Hotel object) {
				return createHotelAdapter();
			}
			@Override
			public Adapter caseCampingplatz(Campingplatz object) {
				return createCampingplatzAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Freizeitpark <em>Freizeitpark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Freizeitpark
	 * @generated
	 */
	public Adapter createFreizeitparkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.AllgemeineInformationen <em>Allgemeine Informationen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.AllgemeineInformationen
	 * @generated
	 */
	public Adapter createAllgemeineInformationenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Design
	 * @generated
	 */
	public Adapter createDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Eintrittskarte <em>Eintrittskarte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Eintrittskarte
	 * @generated
	 */
	public Adapter createEintrittskarteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Personengruppe <em>Personengruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Personengruppe
	 * @generated
	 */
	public Adapter createPersonengruppeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Themenwelt <em>Themenwelt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Themenwelt
	 * @generated
	 */
	public Adapter createThemenweltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Attraktion <em>Attraktion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Attraktion
	 * @generated
	 */
	public Adapter createAttraktionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Fahrgeschäft <em>Fahrgeschäft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Fahrgeschäft
	 * @generated
	 */
	public Adapter createFahrgeschäftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Show <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Show
	 * @generated
	 */
	public Adapter createShowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Verkaufsladen <em>Verkaufsladen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Verkaufsladen
	 * @generated
	 */
	public Adapter createVerkaufsladenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Gastronomie <em>Gastronomie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Gastronomie
	 * @generated
	 */
	public Adapter createGastronomieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Restaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Restaurant
	 * @generated
	 */
	public Adapter createRestaurantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Imbiss <em>Imbiss</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Imbiss
	 * @generated
	 */
	public Adapter createImbissAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Geschäft <em>Geschäft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Geschäft
	 * @generated
	 */
	public Adapter createGeschäftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Übernachtungsmöglichkeit <em>Übernachtungsmöglichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Übernachtungsmöglichkeit
	 * @generated
	 */
	public Adapter createÜbernachtungsmöglichkeitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Hotel
	 * @generated
	 */
	public Adapter createHotelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreitparkModel.Campingplatz <em>Campingplatz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreitparkModel.Campingplatz
	 * @generated
	 */
	public Adapter createCampingplatzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FreitparkModelAdapterFactory
