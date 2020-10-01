/**
 */
package privacymodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import privacymodel.Action;
import privacymodel.Approval;
import privacymodel.Complaint;
import privacymodel.ComplaintAction;
import privacymodel.ConfigurationManager;
import privacymodel.Constraint;
import privacymodel.ConstraintScope;
import privacymodel.DataConstraint;
import privacymodel.DataSource;
import privacymodel.DataType;
import privacymodel.How;
import privacymodel.Location;
import privacymodel.LocationType;
import privacymodel.NamedElement;
import privacymodel.PolicyStatement;
import privacymodel.Principal;
import privacymodel.PrincipalScope;
import privacymodel.PrincipalType;
import privacymodel.PrivacyData;
import privacymodel.PrivacyPolicy;
import privacymodel.PrivacyStatementType;
import privacymodel.PrivacymodelFactory;
import privacymodel.PrivacymodelPackage;
import privacymodel.ProcessingReason;
import privacymodel.ProcessingReasonSubtype;
import privacymodel.ProtectionControl;
import privacymodel.Provider;
import privacymodel.Purpose;
import privacymodel.Restriction;
import privacymodel.RestrictionType;
import privacymodel.Service;
import privacymodel.TimeInterval;
import privacymodel.TimePreposition;
import privacymodel.TimeStatement;
import privacymodel.What;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrivacymodelPackageImpl extends EPackageImpl implements PrivacymodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass principalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass howEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approvalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectionControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complaintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum privacyStatementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restrictionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timePrepositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum principalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum principalScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processingReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processingReasonSubtypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum complaintActionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see privacymodel.PrivacymodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrivacymodelPackageImpl() {
		super(eNS_URI, PrivacymodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PrivacymodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrivacymodelPackage init() {
		if (isInited) return (PrivacymodelPackage)EPackage.Registry.INSTANCE.getEPackage(PrivacymodelPackage.eNS_URI);

		// Obtain or create and register package
		PrivacymodelPackageImpl thePrivacymodelPackage = (PrivacymodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrivacymodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrivacymodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePrivacymodelPackage.createPackageContents();

		// Initialize created meta-data
		thePrivacymodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrivacymodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrivacymodelPackage.eNS_URI, thePrivacymodelPackage);
		return thePrivacymodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivacyPolicy() {
		return privacyPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_PolicyStatements() {
		return (EReference)privacyPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_Owner() {
		return (EReference)privacyPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllPrincipals() {
		return (EReference)privacyPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_Locations() {
		return (EReference)privacyPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivacyPolicy_DefaultProtectionControls() {
		return (EAttribute)privacyPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllServices() {
		return (EReference)privacyPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllProviders() {
		return (EReference)privacyPolicyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_ConfigurationManager() {
		return (EReference)privacyPolicyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllDatas() {
		return (EReference)privacyPolicyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_DataSubjectComplaints() {
		return (EReference)privacyPolicyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyStatement() {
		return policyStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_EReference0() {
		return (EReference)policyStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyStatement_Type() {
		return (EAttribute)policyStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_When() {
		return (EReference)policyStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_Who() {
		return (EReference)policyStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_Why() {
		return (EReference)policyStatementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_From() {
		return (EReference)policyStatementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_Where() {
		return (EReference)policyStatementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_What() {
		return (EReference)policyStatementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_How() {
		return (EReference)policyStatementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_Whose() {
		return (EReference)policyStatementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_Whom() {
		return (EReference)policyStatementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_Cause() {
		return (EReference)policyStatementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivacyData() {
		return privacyDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyData_AccessConstraints() {
		return (EReference)privacyDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivacyData_Type() {
		return (EAttribute)privacyDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Subservices() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_Provide() {
		return (EReference)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_Located() {
		return (EReference)providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrincipal() {
		return principalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrincipal_SubPrincipals() {
		return (EReference)principalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrincipal_Type() {
		return (EAttribute)principalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrincipal_Scope() {
		return (EAttribute)principalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_IsEUMember() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_EAttribute0() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_SubLocations() {
		return (EReference)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_DataOwnerScope() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_DataControllerScope() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Required() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_DataRecipientScope() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInterval_Intervals() {
		return (EReference)timeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeStatement() {
		return timeStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStatement_DateTime() {
		return (EAttribute)timeStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStatement_Preposition() {
		return (EAttribute)timeStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurpose() {
		return purposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurpose_AdditionalProtectionControls() {
		return (EAttribute)purposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurpose_ProcessingReason() {
		return (EAttribute)purposeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurpose_ProcessingReasonSubtype() {
		return (EAttribute)purposeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPurpose_SubPurposes() {
		return (EReference)purposeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhat() {
		return whatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhat_Actions() {
		return (EAttribute)whatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhat_Providers() {
		return (EReference)whatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhat_Datas() {
		return (EReference)whatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConstraint() {
		return dataConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataConstraint_Key() {
		return (EAttribute)dataConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConstraint_Value() {
		return (EReference)dataConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestriction() {
		return restrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestriction_RestrictionType() {
		return (EAttribute)restrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestriction_Value() {
		return (EAttribute)restrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHow() {
		return howEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHow_DataSource() {
		return (EAttribute)howEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHow_Attached() {
		return (EReference)howEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApproval() {
		return approvalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApproval_StartDate() {
		return (EAttribute)approvalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApproval_TerminationDate() {
		return (EAttribute)approvalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApproval_TerminationExplanation() {
		return (EAttribute)approvalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApproval_NotAllowed() {
		return (EReference)approvalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtectionControl() {
		return protectionControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtectionControl_Method() {
		return (EAttribute)protectionControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationManager() {
		return configurationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationManager_ProtectionControlsMethods() {
		return (EReference)configurationManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationManager_DefinedDataSources() {
		return (EReference)configurationManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_Source() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplaint() {
		return complaintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplaint_When() {
		return (EReference)complaintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplaint_Who() {
		return (EReference)complaintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplaint_Action() {
		return (EAttribute)complaintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplaint_What() {
		return (EReference)complaintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrivacyStatementType() {
		return privacyStatementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestrictionType() {
		return restrictionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimePreposition() {
		return timePrepositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrincipalType() {
		return principalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrincipalScope() {
		return principalScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAction() {
		return actionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationType() {
		return locationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessingReason() {
		return processingReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessingReasonSubtype() {
		return processingReasonSubtypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintScope() {
		return constraintScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComplaintAction() {
		return complaintActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacymodelFactory getPrivacymodelFactory() {
		return (PrivacymodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		privacyPolicyEClass = createEClass(PRIVACY_POLICY);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__POLICY_STATEMENTS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__OWNER);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_PRINCIPALS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__LOCATIONS);
		createEAttribute(privacyPolicyEClass, PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_SERVICES);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_PROVIDERS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__CONFIGURATION_MANAGER);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_DATAS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__DATA_SUBJECT_COMPLAINTS);

		policyStatementEClass = createEClass(POLICY_STATEMENT);
		createEReference(policyStatementEClass, POLICY_STATEMENT__EREFERENCE0);
		createEAttribute(policyStatementEClass, POLICY_STATEMENT__TYPE);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHEN);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHO);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHY);
		createEReference(policyStatementEClass, POLICY_STATEMENT__FROM);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHERE);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHAT);
		createEReference(policyStatementEClass, POLICY_STATEMENT__HOW);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHOSE);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHOM);
		createEReference(policyStatementEClass, POLICY_STATEMENT__CAUSE);

		privacyDataEClass = createEClass(PRIVACY_DATA);
		createEReference(privacyDataEClass, PRIVACY_DATA__ACCESS_CONSTRAINTS);
		createEAttribute(privacyDataEClass, PRIVACY_DATA__TYPE);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__SUBSERVICES);

		providerEClass = createEClass(PROVIDER);
		createEReference(providerEClass, PROVIDER__PROVIDE);
		createEReference(providerEClass, PROVIDER__LOCATED);

		principalEClass = createEClass(PRINCIPAL);
		createEReference(principalEClass, PRINCIPAL__SUB_PRINCIPALS);
		createEAttribute(principalEClass, PRINCIPAL__TYPE);
		createEAttribute(principalEClass, PRINCIPAL__SCOPE);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__IS_EU_MEMBER);
		createEAttribute(locationEClass, LOCATION__EATTRIBUTE0);
		createEReference(locationEClass, LOCATION__SUB_LOCATIONS);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__DATA_OWNER_SCOPE);
		createEAttribute(constraintEClass, CONSTRAINT__DATA_CONTROLLER_SCOPE);
		createEReference(constraintEClass, CONSTRAINT__REQUIRED);
		createEAttribute(constraintEClass, CONSTRAINT__DATA_RECIPIENT_SCOPE);

		timeIntervalEClass = createEClass(TIME_INTERVAL);
		createEReference(timeIntervalEClass, TIME_INTERVAL__INTERVALS);

		timeStatementEClass = createEClass(TIME_STATEMENT);
		createEAttribute(timeStatementEClass, TIME_STATEMENT__DATE_TIME);
		createEAttribute(timeStatementEClass, TIME_STATEMENT__PREPOSITION);

		purposeEClass = createEClass(PURPOSE);
		createEAttribute(purposeEClass, PURPOSE__ADDITIONAL_PROTECTION_CONTROLS);
		createEAttribute(purposeEClass, PURPOSE__PROCESSING_REASON);
		createEAttribute(purposeEClass, PURPOSE__PROCESSING_REASON_SUBTYPE);
		createEReference(purposeEClass, PURPOSE__SUB_PURPOSES);

		whatEClass = createEClass(WHAT);
		createEAttribute(whatEClass, WHAT__ACTIONS);
		createEReference(whatEClass, WHAT__PROVIDERS);
		createEReference(whatEClass, WHAT__DATAS);

		dataConstraintEClass = createEClass(DATA_CONSTRAINT);
		createEAttribute(dataConstraintEClass, DATA_CONSTRAINT__KEY);
		createEReference(dataConstraintEClass, DATA_CONSTRAINT__VALUE);

		restrictionEClass = createEClass(RESTRICTION);
		createEAttribute(restrictionEClass, RESTRICTION__RESTRICTION_TYPE);
		createEAttribute(restrictionEClass, RESTRICTION__VALUE);

		howEClass = createEClass(HOW);
		createEAttribute(howEClass, HOW__DATA_SOURCE);
		createEReference(howEClass, HOW__ATTACHED);

		approvalEClass = createEClass(APPROVAL);
		createEAttribute(approvalEClass, APPROVAL__START_DATE);
		createEAttribute(approvalEClass, APPROVAL__TERMINATION_DATE);
		createEAttribute(approvalEClass, APPROVAL__TERMINATION_EXPLANATION);
		createEReference(approvalEClass, APPROVAL__NOT_ALLOWED);

		protectionControlEClass = createEClass(PROTECTION_CONTROL);
		createEAttribute(protectionControlEClass, PROTECTION_CONTROL__METHOD);

		configurationManagerEClass = createEClass(CONFIGURATION_MANAGER);
		createEReference(configurationManagerEClass, CONFIGURATION_MANAGER__PROTECTION_CONTROLS_METHODS);
		createEReference(configurationManagerEClass, CONFIGURATION_MANAGER__DEFINED_DATA_SOURCES);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__SOURCE);

		complaintEClass = createEClass(COMPLAINT);
		createEReference(complaintEClass, COMPLAINT__WHEN);
		createEReference(complaintEClass, COMPLAINT__WHO);
		createEAttribute(complaintEClass, COMPLAINT__ACTION);
		createEReference(complaintEClass, COMPLAINT__WHAT);

		// Create enums
		privacyStatementTypeEEnum = createEEnum(PRIVACY_STATEMENT_TYPE);
		dataTypeEEnum = createEEnum(DATA_TYPE);
		restrictionTypeEEnum = createEEnum(RESTRICTION_TYPE);
		timePrepositionEEnum = createEEnum(TIME_PREPOSITION);
		principalTypeEEnum = createEEnum(PRINCIPAL_TYPE);
		principalScopeEEnum = createEEnum(PRINCIPAL_SCOPE);
		actionEEnum = createEEnum(ACTION);
		locationTypeEEnum = createEEnum(LOCATION_TYPE);
		processingReasonEEnum = createEEnum(PROCESSING_REASON);
		processingReasonSubtypeEEnum = createEEnum(PROCESSING_REASON_SUBTYPE);
		constraintScopeEEnum = createEEnum(CONSTRAINT_SCOPE);
		complaintActionEEnum = createEEnum(COMPLAINT_ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		privacyPolicyEClass.getESuperTypes().add(this.getNamedElement());
		policyStatementEClass.getESuperTypes().add(this.getNamedElement());
		privacyDataEClass.getESuperTypes().add(this.getNamedElement());
		serviceEClass.getESuperTypes().add(this.getNamedElement());
		providerEClass.getESuperTypes().add(this.getNamedElement());
		principalEClass.getESuperTypes().add(this.getNamedElement());
		locationEClass.getESuperTypes().add(this.getNamedElement());
		approvalEClass.getESuperTypes().add(this.getRestriction());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privacyPolicyEClass, PrivacyPolicy.class, "PrivacyPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrivacyPolicy_PolicyStatements(), this.getPolicyStatement(), null, "policyStatements", null, 0, -1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_Owner(), this.getPrincipal(), null, "owner", null, 0, 1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllPrincipals(), this.getPrincipal(), null, "allPrincipals", null, 0, -1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_Locations(), this.getLocation(), null, "locations", null, 0, -1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivacyPolicy_DefaultProtectionControls(), ecorePackage.getEString(), "defaultProtectionControls", null, 0, -1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllServices(), this.getService(), null, "allServices", null, 0, -1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllProviders(), this.getProvider(), null, "allProviders", null, 0, -1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_ConfigurationManager(), this.getConfigurationManager(), null, "configurationManager", null, 1, 1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllDatas(), this.getPrivacyData(), null, "allDatas", null, 0, -1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_DataSubjectComplaints(), this.getComplaint(), null, "DataSubjectComplaints", null, 0, -1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyStatementEClass, PolicyStatement.class, "PolicyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyStatement_EReference0(), this.getPrivacyData(), null, "EReference0", null, 0, 1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyStatement_Type(), this.getPrivacyStatementType(), "type", null, 1, 1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_When(), this.getTimeInterval(), null, "when", null, 0, 1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_Who(), this.getPrincipal(), null, "who", null, 0, 1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_Why(), this.getPurpose(), null, "why", null, 0, 1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_From(), this.getLocation(), null, "from", null, 0, 1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_Where(), this.getLocation(), null, "where", null, 0, 1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_What(), this.getWhat(), null, "what", null, 0, 1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_How(), this.getHow(), null, "how", null, 0, -1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_Whose(), this.getPrincipal(), null, "whose", null, 0, 1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_Whom(), this.getPrincipal(), null, "whom", null, 0, -1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_Cause(), this.getPolicyStatement(), null, "cause", null, 0, 1, PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privacyDataEClass, PrivacyData.class, "PrivacyData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrivacyData_AccessConstraints(), this.getDataConstraint(), null, "accessConstraints", null, 0, 1, PrivacyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPrivacyData_AccessConstraints().getEKeys().add(this.getDataConstraint_Key());
		initEAttribute(getPrivacyData_Type(), this.getDataType(), "type", null, 0, 1, PrivacyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Subservices(), this.getService(), null, "subservices", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvider_Provide(), this.getService(), null, "provide", null, 0, -1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvider_Located(), this.getLocation(), null, "located", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(principalEClass, Principal.class, "Principal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrincipal_SubPrincipals(), this.getPrincipal(), null, "subPrincipals", null, 0, -1, Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrincipal_Type(), this.getPrincipalType(), "type", null, 1, 1, Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrincipal_Scope(), this.getPrincipalScope(), "scope", null, 1, 1, Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_IsEUMember(), ecorePackage.getEBoolean(), "isEUMember", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_EAttribute0(), this.getLocationType(), "EAttribute0", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_SubLocations(), this.getLocation(), null, "subLocations", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_DataOwnerScope(), this.getConstraintScope(), "dataOwnerScope", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_DataControllerScope(), this.getConstraintScope(), "dataControllerScope", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Required(), this.getRestriction(), null, "required", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_DataRecipientScope(), this.getConstraintScope(), "dataRecipientScope", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeInterval_Intervals(), this.getTimeStatement(), null, "intervals", null, 0, -1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeStatementEClass, TimeStatement.class, "TimeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeStatement_DateTime(), ecorePackage.getEDate(), "dateTime", null, 0, 1, TimeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStatement_Preposition(), this.getTimePreposition(), "preposition", null, 1, 1, TimeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(purposeEClass, Purpose.class, "Purpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPurpose_AdditionalProtectionControls(), ecorePackage.getEString(), "additionalProtectionControls", null, 0, -1, Purpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPurpose_ProcessingReason(), this.getProcessingReason(), "processingReason", null, 0, 1, Purpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPurpose_ProcessingReasonSubtype(), this.getProcessingReasonSubtype(), "processingReasonSubtype", null, 0, 1, Purpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPurpose_SubPurposes(), this.getPurpose(), null, "subPurposes", null, 0, -1, Purpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whatEClass, What.class, "What", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhat_Actions(), this.getAction(), "actions", null, 0, -1, What.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhat_Providers(), this.getProvider(), null, "providers", null, 0, -1, What.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhat_Datas(), this.getPrivacyData(), null, "datas", null, 0, -1, What.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataConstraintEClass, DataConstraint.class, "DataConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataConstraint_Key(), this.getAction(), "key", null, 0, 1, DataConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataConstraint_Value(), this.getConstraint(), null, "value", null, 0, -1, DataConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionEClass, Restriction.class, "Restriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestriction_RestrictionType(), this.getRestrictionType(), "restrictionType", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestriction_Value(), ecorePackage.getEString(), "value", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(howEClass, How.class, "How", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHow_DataSource(), ecorePackage.getEString(), "dataSource", null, 1, 1, How.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHow_Attached(), this.getApproval(), null, "attached", null, 0, -1, How.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(approvalEClass, Approval.class, "Approval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApproval_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Approval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApproval_TerminationDate(), ecorePackage.getEDate(), "terminationDate", null, 0, 1, Approval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApproval_TerminationExplanation(), ecorePackage.getEString(), "terminationExplanation", null, 0, 1, Approval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApproval_NotAllowed(), this.getLocation(), null, "notAllowed", null, 0, -1, Approval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protectionControlEClass, ProtectionControl.class, "ProtectionControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtectionControl_Method(), ecorePackage.getEString(), "method", null, 1, 1, ProtectionControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationManagerEClass, ConfigurationManager.class, "ConfigurationManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationManager_ProtectionControlsMethods(), this.getProtectionControl(), null, "protectionControlsMethods", null, 0, -1, ConfigurationManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationManager_DefinedDataSources(), this.getDataSource(), null, "definedDataSources", null, 0, -1, ConfigurationManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_Source(), ecorePackage.getEString(), "source", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complaintEClass, Complaint.class, "Complaint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplaint_When(), this.getTimeInterval(), null, "when", null, 1, 1, Complaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplaint_Who(), this.getPrincipal(), null, "who", null, 1, 1, Complaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplaint_Action(), this.getComplaintAction(), "Action", null, 0, 1, Complaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplaint_What(), this.getPrivacyData(), null, "what", null, 1, -1, Complaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(privacyStatementTypeEEnum, PrivacyStatementType.class, "PrivacyStatementType");
		addEEnumLiteral(privacyStatementTypeEEnum, PrivacyStatementType.PERMISSION_LITERAL);
		addEEnumLiteral(privacyStatementTypeEEnum, PrivacyStatementType.OBLIGATION_LITERAL);
		addEEnumLiteral(privacyStatementTypeEEnum, PrivacyStatementType.INFORMATION_LITERAL);
		addEEnumLiteral(privacyStatementTypeEEnum, PrivacyStatementType.OPTIONAL_LITERAL);
		addEEnumLiteral(privacyStatementTypeEEnum, PrivacyStatementType.PROHIBITION_LITERAL);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.BIOMETRIC_LITERAL);
		addEEnumLiteral(dataTypeEEnum, DataType.GENERAL_LITERAL);
		addEEnumLiteral(dataTypeEEnum, DataType.GENETIC_LITERAL);
		addEEnumLiteral(dataTypeEEnum, DataType.POLITICAL_OPINION_LITERAL);
		addEEnumLiteral(dataTypeEEnum, DataType.RACIAL_ETHNIC_ORIGIN_LITERAL);
		addEEnumLiteral(dataTypeEEnum, DataType.BELIEFS_LITERAL);
		addEEnumLiteral(dataTypeEEnum, DataType.SEX_LIFE_LITERAL);

		initEEnum(restrictionTypeEEnum, RestrictionType.class, "RestrictionType");
		addEEnumLiteral(restrictionTypeEEnum, RestrictionType.JUVENILE_LITERAL);
		addEEnumLiteral(restrictionTypeEEnum, RestrictionType.EXPLICIT_CONSENT_LITERAL);

		initEEnum(timePrepositionEEnum, TimePreposition.class, "TimePreposition");
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.FROM_LITERAL);
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.TO_LITERAL);
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.AT_LITERAL);
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.UNTIL_LITERAL);
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.BEFORE_LITERAL);
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.AFTER_LITERAL);

		initEEnum(principalTypeEEnum, PrincipalType.class, "PrincipalType");
		addEEnumLiteral(principalTypeEEnum, PrincipalType.ORGANIZATION_LITERAL);
		addEEnumLiteral(principalTypeEEnum, PrincipalType.GROUP_LITERAL);
		addEEnumLiteral(principalTypeEEnum, PrincipalType.INDIVIDUAL_LITERAL);

		initEEnum(principalScopeEEnum, PrincipalScope.class, "PrincipalScope");
		addEEnumLiteral(principalScopeEEnum, PrincipalScope.IN_LITERAL);
		addEEnumLiteral(principalScopeEEnum, PrincipalScope.OUT_LITERAL);
		addEEnumLiteral(principalScopeEEnum, PrincipalScope.UNKNOWN_LITERAL);

		initEEnum(actionEEnum, Action.class, "Action");
		addEEnumLiteral(actionEEnum, Action.STORE_LITERAL);
		addEEnumLiteral(actionEEnum, Action.ACCESS_LITERAL);
		addEEnumLiteral(actionEEnum, Action.COLLECTING_LITERAL);
		addEEnumLiteral(actionEEnum, Action.RETRIEVAL_LITERAL);
		addEEnumLiteral(actionEEnum, Action.NOTIFY_ABOUT_ERASURE_LITERAL);
		addEEnumLiteral(actionEEnum, Action.NOTIFY_ABOUT_RECTIFICATION_LITERAL);

		initEEnum(locationTypeEEnum, LocationType.class, "LocationType");
		addEEnumLiteral(locationTypeEEnum, LocationType.UNION_LITERAL);
		addEEnumLiteral(locationTypeEEnum, LocationType.COUNTRY_LITERAL);
		addEEnumLiteral(locationTypeEEnum, LocationType.REGION_LITERAL);

		initEEnum(processingReasonEEnum, ProcessingReason.class, "ProcessingReason");
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.RESEARCH_LITERAL);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.PUBLIC_HEALTH_LITERAL);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.OUT_OF_SCOPE_LITERAL);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.PUBLIC_INTEREST_LITERAL);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.STATISTICAL_PURPOSES_LITERAL);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.EXERCISING_SPECIFIC_RIGHTS_LITERAL);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.MARKETING_LITERAL);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.TESTING_LITERAL);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.PROFILING_LITERAL);

		initEEnum(processingReasonSubtypeEEnum, ProcessingReasonSubtype.class, "ProcessingReasonSubtype");
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.PREVENTION_LITERAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.INVESTIGATION_LITERAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.DETECTION_LITERAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.PROSECUTION_LITERAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.PREVENTION_OF_THREATS_LITERAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.OUT_OF_EU_LITERAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.PERSONAL_ACTIVITY_LITERAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.SPECIAL_SCOPE_OF_ACTIVITY_LITERAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.EMPLOYMENT_LITERAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.SOCIAL_SECURITY_LITERAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.SOCIAL_PROTECTION_LITERAL);

		initEEnum(constraintScopeEEnum, ConstraintScope.class, "ConstraintScope");
		addEEnumLiteral(constraintScopeEEnum, ConstraintScope.IN_LITERAL);
		addEEnumLiteral(constraintScopeEEnum, ConstraintScope.OUT_LITERAL);
		addEEnumLiteral(constraintScopeEEnum, ConstraintScope.ALL_LITERAL);

		initEEnum(complaintActionEEnum, ComplaintAction.class, "ComplaintAction");
		addEEnumLiteral(complaintActionEEnum, ComplaintAction.ERASURE_LITERAL);
		addEEnumLiteral(complaintActionEEnum, ComplaintAction.RECTIFICATION_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (getPolicyStatement_When(), 
		   source, 
		   new String[] {
			 "name", "when"
		   });		
		addAnnotation
		  (getPrivacyData_AccessConstraints(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "processing", "skip"
		   });
	}

} //PrivacymodelPackageImpl
