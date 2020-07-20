/**
 */
package FreitparkModel.util;

import FreitparkModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see FreitparkModel.FreitparkModelPackage
 * @generated
 */
public class FreitparkModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FreitparkModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreitparkModelSwitch() {
		if (modelPackage == null) {
			modelPackage = FreitparkModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FreitparkModelPackage.FREIZEITPARK: {
				Freizeitpark freizeitpark = (Freizeitpark)theEObject;
				T result = caseFreizeitpark(freizeitpark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.ALLGEMEINE_INFORMATIONEN: {
				AllgemeineInformationen allgemeineInformationen = (AllgemeineInformationen)theEObject;
				T result = caseAllgemeineInformationen(allgemeineInformationen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.DESIGN: {
				Design design = (Design)theEObject;
				T result = caseDesign(design);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.EINTRITTSKARTE: {
				Eintrittskarte eintrittskarte = (Eintrittskarte)theEObject;
				T result = caseEintrittskarte(eintrittskarte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.PERSONENGRUPPE: {
				Personengruppe personengruppe = (Personengruppe)theEObject;
				T result = casePersonengruppe(personengruppe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.THEMENWELT: {
				Themenwelt themenwelt = (Themenwelt)theEObject;
				T result = caseThemenwelt(themenwelt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.ATTRAKTION: {
				Attraktion attraktion = (Attraktion)theEObject;
				T result = caseAttraktion(attraktion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.FAHRGESCH�FT: {
				Fahrgesch�ft fahrgesch�ft = (Fahrgesch�ft)theEObject;
				T result = caseFahrgesch�ft(fahrgesch�ft);
				if (result == null) result = caseAttraktion(fahrgesch�ft);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.SHOW: {
				Show show = (Show)theEObject;
				T result = caseShow(show);
				if (result == null) result = caseAttraktion(show);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.VERKAUFSLADEN: {
				Verkaufsladen verkaufsladen = (Verkaufsladen)theEObject;
				T result = caseVerkaufsladen(verkaufsladen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.GASTRONOMIE: {
				Gastronomie gastronomie = (Gastronomie)theEObject;
				T result = caseGastronomie(gastronomie);
				if (result == null) result = caseVerkaufsladen(gastronomie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.RESTAURANT: {
				Restaurant restaurant = (Restaurant)theEObject;
				T result = caseRestaurant(restaurant);
				if (result == null) result = caseGastronomie(restaurant);
				if (result == null) result = caseVerkaufsladen(restaurant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.IMBISS: {
				Imbiss imbiss = (Imbiss)theEObject;
				T result = caseImbiss(imbiss);
				if (result == null) result = caseGastronomie(imbiss);
				if (result == null) result = caseVerkaufsladen(imbiss);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.GESCH�FT: {
				Gesch�ft gesch�ft = (Gesch�ft)theEObject;
				T result = caseGesch�ft(gesch�ft);
				if (result == null) result = caseVerkaufsladen(gesch�ft);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.�BERNACHTUNGSM�GLICHKEIT: {
				�bernachtungsm�glichkeit �bernachtungsm�glichkeit = (�bernachtungsm�glichkeit)theEObject;
				T result = case�bernachtungsm�glichkeit(�bernachtungsm�glichkeit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.HOTEL: {
				Hotel hotel = (Hotel)theEObject;
				T result = caseHotel(hotel);
				if (result == null) result = case�bernachtungsm�glichkeit(hotel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FreitparkModelPackage.CAMPINGPLATZ: {
				Campingplatz campingplatz = (Campingplatz)theEObject;
				T result = caseCampingplatz(campingplatz);
				if (result == null) result = case�bernachtungsm�glichkeit(campingplatz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freizeitpark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freizeitpark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreizeitpark(Freizeitpark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allgemeine Informationen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allgemeine Informationen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllgemeineInformationen(AllgemeineInformationen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesign(Design object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eintrittskarte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eintrittskarte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEintrittskarte(Eintrittskarte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personengruppe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personengruppe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonengruppe(Personengruppe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Themenwelt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Themenwelt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThemenwelt(Themenwelt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attraktion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attraktion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttraktion(Attraktion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fahrgesch�ft</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fahrgesch�ft</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFahrgesch�ft(Fahrgesch�ft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Show</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Show</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShow(Show object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verkaufsladen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verkaufsladen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerkaufsladen(Verkaufsladen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gastronomie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gastronomie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGastronomie(Gastronomie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restaurant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restaurant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestaurant(Restaurant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imbiss</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imbiss</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImbiss(Imbiss object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gesch�ft</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gesch�ft</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGesch�ft(Gesch�ft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>�bernachtungsm�glichkeit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>�bernachtungsm�glichkeit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case�bernachtungsm�glichkeit(�bernachtungsm�glichkeit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel(Hotel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campingplatz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campingplatz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampingplatz(Campingplatz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FreitparkModelSwitch
