/**
 */
package FreizeitparkModel.util;

import FreizeitparkModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see FreizeitparkModel.FreizeitparkModelPackage
 * @generated
 */
public class FreizeitparkModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FreizeitparkModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreizeitparkModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FreizeitparkModelPackage.eINSTANCE;
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
	protected FreizeitparkModelSwitch<Adapter> modelSwitch =
		new FreizeitparkModelSwitch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Freizeitpark <em>Freizeitpark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Freizeitpark
	 * @generated
	 */
	public Adapter createFreizeitparkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.AllgemeineInformationen <em>Allgemeine Informationen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.AllgemeineInformationen
	 * @generated
	 */
	public Adapter createAllgemeineInformationenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Design
	 * @generated
	 */
	public Adapter createDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Eintrittskarte <em>Eintrittskarte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Eintrittskarte
	 * @generated
	 */
	public Adapter createEintrittskarteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Personengruppe <em>Personengruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Personengruppe
	 * @generated
	 */
	public Adapter createPersonengruppeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Themenwelt <em>Themenwelt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Themenwelt
	 * @generated
	 */
	public Adapter createThemenweltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Attraktion <em>Attraktion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Attraktion
	 * @generated
	 */
	public Adapter createAttraktionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Fahrgeschäft <em>Fahrgeschäft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Fahrgeschäft
	 * @generated
	 */
	public Adapter createFahrgeschäftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Show <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Show
	 * @generated
	 */
	public Adapter createShowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Verkaufsladen <em>Verkaufsladen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Verkaufsladen
	 * @generated
	 */
	public Adapter createVerkaufsladenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Gastronomie <em>Gastronomie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Gastronomie
	 * @generated
	 */
	public Adapter createGastronomieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Restaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Restaurant
	 * @generated
	 */
	public Adapter createRestaurantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Imbiss <em>Imbiss</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Imbiss
	 * @generated
	 */
	public Adapter createImbissAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Geschäft <em>Geschäft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Geschäft
	 * @generated
	 */
	public Adapter createGeschäftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Übernachtungsmöglichkeit <em>Übernachtungsmöglichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Übernachtungsmöglichkeit
	 * @generated
	 */
	public Adapter createÜbernachtungsmöglichkeitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Hotel
	 * @generated
	 */
	public Adapter createHotelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreizeitparkModel.Campingplatz <em>Campingplatz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreizeitparkModel.Campingplatz
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

} //FreizeitparkModelAdapterFactory
