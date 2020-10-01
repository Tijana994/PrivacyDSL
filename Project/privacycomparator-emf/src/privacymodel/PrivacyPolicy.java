/**
 */
package privacymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.PrivacyPolicy#getPolicyStatements <em>Policy Statements</em>}</li>
 *   <li>{@link privacymodel.PrivacyPolicy#getOwner <em>Owner</em>}</li>
 *   <li>{@link privacymodel.PrivacyPolicy#getAllPrincipals <em>All Principals</em>}</li>
 *   <li>{@link privacymodel.PrivacyPolicy#getLocations <em>Locations</em>}</li>
 *   <li>{@link privacymodel.PrivacyPolicy#getDefaultProtectionControls <em>Default Protection Controls</em>}</li>
 *   <li>{@link privacymodel.PrivacyPolicy#getAllServices <em>All Services</em>}</li>
 *   <li>{@link privacymodel.PrivacyPolicy#getAllProviders <em>All Providers</em>}</li>
 *   <li>{@link privacymodel.PrivacyPolicy#getConfigurationManager <em>Configuration Manager</em>}</li>
 *   <li>{@link privacymodel.PrivacyPolicy#getAllDatas <em>All Datas</em>}</li>
 *   <li>{@link privacymodel.PrivacyPolicy#getDataSubjectComplaints <em>Data Subject Complaints</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getPrivacyPolicy()
 * @model
 * @generated
 */
public interface PrivacyPolicy extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Policy Statements</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.PolicyStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Statements</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getPrivacyPolicy_PolicyStatements()
	 * @model type="privacymodel.PolicyStatement" containment="true"
	 * @generated
	 */
	EList getPolicyStatements();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Principal)
	 * @see privacymodel.PrivacymodelPackage#getPrivacyPolicy_Owner()
	 * @model
	 * @generated
	 */
	Principal getOwner();

	/**
	 * Sets the value of the '{@link privacymodel.PrivacyPolicy#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Principal value);

	/**
	 * Returns the value of the '<em><b>All Principals</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.Principal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Principals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Principals</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getPrivacyPolicy_AllPrincipals()
	 * @model type="privacymodel.Principal" containment="true"
	 * @generated
	 */
	EList getAllPrincipals();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getPrivacyPolicy_Locations()
	 * @model type="privacymodel.Location" containment="true"
	 * @generated
	 */
	EList getLocations();

	/**
	 * Returns the value of the '<em><b>Default Protection Controls</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Protection Controls</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Protection Controls</em>' attribute list.
	 * @see privacymodel.PrivacymodelPackage#getPrivacyPolicy_DefaultProtectionControls()
	 * @model
	 * @generated
	 */
	EList getDefaultProtectionControls();

	/**
	 * Returns the value of the '<em><b>All Services</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Services</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getPrivacyPolicy_AllServices()
	 * @model type="privacymodel.Service" containment="true"
	 * @generated
	 */
	EList getAllServices();

	/**
	 * Returns the value of the '<em><b>All Providers</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.Provider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Providers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Providers</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getPrivacyPolicy_AllProviders()
	 * @model type="privacymodel.Provider" containment="true"
	 * @generated
	 */
	EList getAllProviders();

	/**
	 * Returns the value of the '<em><b>Configuration Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Manager</em>' containment reference.
	 * @see #setConfigurationManager(ConfigurationManager)
	 * @see privacymodel.PrivacymodelPackage#getPrivacyPolicy_ConfigurationManager()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConfigurationManager getConfigurationManager();

	/**
	 * Sets the value of the '{@link privacymodel.PrivacyPolicy#getConfigurationManager <em>Configuration Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Manager</em>' containment reference.
	 * @see #getConfigurationManager()
	 * @generated
	 */
	void setConfigurationManager(ConfigurationManager value);

	/**
	 * Returns the value of the '<em><b>All Datas</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.PrivacyData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Datas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Datas</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getPrivacyPolicy_AllDatas()
	 * @model type="privacymodel.PrivacyData" containment="true"
	 * @generated
	 */
	EList getAllDatas();

	/**
	 * Returns the value of the '<em><b>Data Subject Complaints</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.Complaint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Subject Complaints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Subject Complaints</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getPrivacyPolicy_DataSubjectComplaints()
	 * @model type="privacymodel.Complaint" containment="true"
	 * @generated
	 */
	EList getDataSubjectComplaints();

} // PrivacyPolicy
