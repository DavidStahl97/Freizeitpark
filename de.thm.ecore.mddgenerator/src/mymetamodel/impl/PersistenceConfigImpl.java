/**
 */
package mymetamodel.impl;

import mymetamodel.MymetamodelPackage;
import mymetamodel.PersistenceConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.impl.PersistenceConfigImpl#getDbscheme <em>Dbscheme</em>}</li>
 *   <li>{@link mymetamodel.impl.PersistenceConfigImpl#getJdbcUserName <em>Jdbc User Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistenceConfigImpl extends MinimalEObjectImpl.Container implements PersistenceConfig {
	/**
	 * The default value of the '{@link #getDbscheme() <em>Dbscheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbscheme()
	 * @generated
	 * @ordered
	 */
	protected static final String DBSCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbscheme() <em>Dbscheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbscheme()
	 * @generated
	 * @ordered
	 */
	protected String dbscheme = DBSCHEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdbcUserName() <em>Jdbc User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdbcUserName() <em>Jdbc User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUserName()
	 * @generated
	 * @ordered
	 */
	protected String jdbcUserName = JDBC_USER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MymetamodelPackage.Literals.PERSISTENCE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbscheme() {
		return dbscheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbscheme(String newDbscheme) {
		String oldDbscheme = dbscheme;
		dbscheme = newDbscheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PERSISTENCE_CONFIG__DBSCHEME, oldDbscheme, dbscheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJdbcUserName() {
		return jdbcUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJdbcUserName(String newJdbcUserName) {
		String oldJdbcUserName = jdbcUserName;
		jdbcUserName = newJdbcUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PERSISTENCE_CONFIG__JDBC_USER_NAME, oldJdbcUserName, jdbcUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MymetamodelPackage.PERSISTENCE_CONFIG__DBSCHEME:
				return getDbscheme();
			case MymetamodelPackage.PERSISTENCE_CONFIG__JDBC_USER_NAME:
				return getJdbcUserName();
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
			case MymetamodelPackage.PERSISTENCE_CONFIG__DBSCHEME:
				setDbscheme((String)newValue);
				return;
			case MymetamodelPackage.PERSISTENCE_CONFIG__JDBC_USER_NAME:
				setJdbcUserName((String)newValue);
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
			case MymetamodelPackage.PERSISTENCE_CONFIG__DBSCHEME:
				setDbscheme(DBSCHEME_EDEFAULT);
				return;
			case MymetamodelPackage.PERSISTENCE_CONFIG__JDBC_USER_NAME:
				setJdbcUserName(JDBC_USER_NAME_EDEFAULT);
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
			case MymetamodelPackage.PERSISTENCE_CONFIG__DBSCHEME:
				return DBSCHEME_EDEFAULT == null ? dbscheme != null : !DBSCHEME_EDEFAULT.equals(dbscheme);
			case MymetamodelPackage.PERSISTENCE_CONFIG__JDBC_USER_NAME:
				return JDBC_USER_NAME_EDEFAULT == null ? jdbcUserName != null : !JDBC_USER_NAME_EDEFAULT.equals(jdbcUserName);
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
		result.append(" (dbscheme: ");
		result.append(dbscheme);
		result.append(", jdbcUserName: ");
		result.append(jdbcUserName);
		result.append(')');
		return result.toString();
	}

} //PersistenceConfigImpl
