/**
 */
package mymetamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mymetamodel.MymetamodelFactory;
import mymetamodel.PersistenceConfig;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Persistence Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceConfigTest extends TestCase {

	/**
	 * The fixture for this Persistence Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceConfig fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PersistenceConfigTest.class);
	}

	/**
	 * Constructs a new Persistence Config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceConfigTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Persistence Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PersistenceConfig fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Persistence Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceConfig getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MymetamodelFactory.eINSTANCE.createPersistenceConfig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PersistenceConfigTest
