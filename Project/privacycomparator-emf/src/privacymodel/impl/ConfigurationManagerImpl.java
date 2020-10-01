/**
 */
package privacymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import privacymodel.ConfigurationManager;
import privacymodel.PrivacymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.ConfigurationManagerImpl#getProtectionControlsMethods <em>Protection Controls Methods</em>}</li>
 *   <li>{@link privacymodel.impl.ConfigurationManagerImpl#getDefinedDataSources <em>Defined Data Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationManagerImpl extends CDOObjectImpl implements ConfigurationManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.CONFIGURATION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProtectionControlsMethods() {
		return (EList)eGet(PrivacymodelPackage.Literals.CONFIGURATION_MANAGER__PROTECTION_CONTROLS_METHODS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDefinedDataSources() {
		return (EList)eGet(PrivacymodelPackage.Literals.CONFIGURATION_MANAGER__DEFINED_DATA_SOURCES, true);
	}

} //ConfigurationManagerImpl
