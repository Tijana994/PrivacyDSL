/**
 */
package privacymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import privacymodel.ConfigurationManager;
import privacymodel.Principal;
import privacymodel.PrivacyPolicy;
import privacymodel.PrivacymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.PrivacyPolicyImpl#getPolicyStatements <em>Policy Statements</em>}</li>
 *   <li>{@link privacymodel.impl.PrivacyPolicyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link privacymodel.impl.PrivacyPolicyImpl#getAllPrincipals <em>All Principals</em>}</li>
 *   <li>{@link privacymodel.impl.PrivacyPolicyImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link privacymodel.impl.PrivacyPolicyImpl#getDefaultProtectionControls <em>Default Protection Controls</em>}</li>
 *   <li>{@link privacymodel.impl.PrivacyPolicyImpl#getAllServices <em>All Services</em>}</li>
 *   <li>{@link privacymodel.impl.PrivacyPolicyImpl#getAllProviders <em>All Providers</em>}</li>
 *   <li>{@link privacymodel.impl.PrivacyPolicyImpl#getConfigurationManager <em>Configuration Manager</em>}</li>
 *   <li>{@link privacymodel.impl.PrivacyPolicyImpl#getAllDatas <em>All Datas</em>}</li>
 *   <li>{@link privacymodel.impl.PrivacyPolicyImpl#getDataSubjectComplaints <em>Data Subject Complaints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivacyPolicyImpl extends NamedElementImpl implements PrivacyPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.PRIVACY_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPolicyStatements() {
		return (EList)eGet(PrivacymodelPackage.Literals.PRIVACY_POLICY__POLICY_STATEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal getOwner() {
		return (Principal)eGet(PrivacymodelPackage.Literals.PRIVACY_POLICY__OWNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Principal newOwner) {
		eSet(PrivacymodelPackage.Literals.PRIVACY_POLICY__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllPrincipals() {
		return (EList)eGet(PrivacymodelPackage.Literals.PRIVACY_POLICY__ALL_PRINCIPALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocations() {
		return (EList)eGet(PrivacymodelPackage.Literals.PRIVACY_POLICY__LOCATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDefaultProtectionControls() {
		return (EList)eGet(PrivacymodelPackage.Literals.PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllServices() {
		return (EList)eGet(PrivacymodelPackage.Literals.PRIVACY_POLICY__ALL_SERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllProviders() {
		return (EList)eGet(PrivacymodelPackage.Literals.PRIVACY_POLICY__ALL_PROVIDERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationManager getConfigurationManager() {
		return (ConfigurationManager)eGet(PrivacymodelPackage.Literals.PRIVACY_POLICY__CONFIGURATION_MANAGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationManager(ConfigurationManager newConfigurationManager) {
		eSet(PrivacymodelPackage.Literals.PRIVACY_POLICY__CONFIGURATION_MANAGER, newConfigurationManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllDatas() {
		return (EList)eGet(PrivacymodelPackage.Literals.PRIVACY_POLICY__ALL_DATAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataSubjectComplaints() {
		return (EList)eGet(PrivacymodelPackage.Literals.PRIVACY_POLICY__DATA_SUBJECT_COMPLAINTS, true);
	}

} //PrivacyPolicyImpl
