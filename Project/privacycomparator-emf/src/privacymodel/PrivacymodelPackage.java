/**
 */
package privacymodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see privacymodel.PrivacymodelFactory
 * @model kind="package"
 * @generated
 */
public interface PrivacymodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "privacymodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://privacymodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "privacymodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrivacymodelPackage eINSTANCE = privacymodel.impl.PrivacymodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link privacymodel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.NamedElementImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link privacymodel.impl.PrivacyPolicyImpl <em>Privacy Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.PrivacyPolicyImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrivacyPolicy()
	 * @generated
	 */
	int PRIVACY_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Policy Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__POLICY_STATEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Principals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_PRINCIPALS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__LOCATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Protection Controls</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_SERVICES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_PROVIDERS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Configuration Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__CONFIGURATION_MANAGER = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>All Datas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_DATAS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Data Subject Complaints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__DATA_SUBJECT_COMPLAINTS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Privacy Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link privacymodel.impl.PolicyStatementImpl <em>Policy Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.PolicyStatementImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getPolicyStatement()
	 * @generated
	 */
	int POLICY_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__EREFERENCE0 = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHEN = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHO = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Why</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__FROM = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHERE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>What</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHAT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__HOW = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Whose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHOSE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Whom</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHOM = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__CAUSE = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Policy Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link privacymodel.impl.PrivacyDataImpl <em>Privacy Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.PrivacyDataImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrivacyData()
	 * @generated
	 */
	int PRIVACY_DATA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_DATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Access Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_DATA__ACCESS_CONSTRAINTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_DATA__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Privacy Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link privacymodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.ServiceImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SUBSERVICES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link privacymodel.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.ProviderImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Provide</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__PROVIDE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Located</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__LOCATED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link privacymodel.impl.PrincipalImpl <em>Principal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.PrincipalImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrincipal()
	 * @generated
	 */
	int PRINCIPAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Principals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__SUB_PRINCIPALS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__SCOPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link privacymodel.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.LocationImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is EU Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__IS_EU_MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAttribute0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__EATTRIBUTE0 = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__SUB_LOCATIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link privacymodel.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.ConstraintImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Data Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DATA_OWNER_SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Data Controller Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DATA_CONTROLLER_SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Data Recipient Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DATA_RECIPIENT_SCOPE = 3;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link privacymodel.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.TimeIntervalImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getTimeInterval()
	 * @generated
	 */
	int TIME_INTERVAL = 9;

	/**
	 * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__INTERVALS = 0;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link privacymodel.impl.TimeStatementImpl <em>Time Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.TimeStatementImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getTimeStatement()
	 * @generated
	 */
	int TIME_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATEMENT__DATE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Preposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATEMENT__PREPOSITION = 1;

	/**
	 * The number of structural features of the '<em>Time Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link privacymodel.impl.PurposeImpl <em>Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.PurposeImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getPurpose()
	 * @generated
	 */
	int PURPOSE = 11;

	/**
	 * The feature id for the '<em><b>Additional Protection Controls</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__ADDITIONAL_PROTECTION_CONTROLS = 0;

	/**
	 * The feature id for the '<em><b>Processing Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__PROCESSING_REASON = 1;

	/**
	 * The feature id for the '<em><b>Processing Reason Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__PROCESSING_REASON_SUBTYPE = 2;

	/**
	 * The feature id for the '<em><b>Sub Purposes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__SUB_PURPOSES = 3;

	/**
	 * The number of structural features of the '<em>Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link privacymodel.impl.WhatImpl <em>What</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.WhatImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getWhat()
	 * @generated
	 */
	int WHAT = 12;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT__PROVIDERS = 1;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT__DATAS = 2;

	/**
	 * The number of structural features of the '<em>What</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link privacymodel.impl.DataConstraintImpl <em>Data Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.DataConstraintImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getDataConstraint()
	 * @generated
	 */
	int DATA_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link privacymodel.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.RestrictionImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 14;

	/**
	 * The feature id for the '<em><b>Restriction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__RESTRICTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link privacymodel.impl.HowImpl <em>How</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.HowImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getHow()
	 * @generated
	 */
	int HOW = 15;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW__DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Attached</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW__ATTACHED = 1;

	/**
	 * The number of structural features of the '<em>How</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link privacymodel.impl.ApprovalImpl <em>Approval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.ApprovalImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getApproval()
	 * @generated
	 */
	int APPROVAL = 16;

	/**
	 * The feature id for the '<em><b>Restriction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__RESTRICTION_TYPE = RESTRICTION__RESTRICTION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__VALUE = RESTRICTION__VALUE;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__START_DATE = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__TERMINATION_DATE = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Termination Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__TERMINATION_EXPLANATION = RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not Allowed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__NOT_ALLOWED = RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Approval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link privacymodel.impl.ProtectionControlImpl <em>Protection Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.ProtectionControlImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getProtectionControl()
	 * @generated
	 */
	int PROTECTION_CONTROL = 17;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_CONTROL__METHOD = 0;

	/**
	 * The number of structural features of the '<em>Protection Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_CONTROL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link privacymodel.impl.ConfigurationManagerImpl <em>Configuration Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.ConfigurationManagerImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getConfigurationManager()
	 * @generated
	 */
	int CONFIGURATION_MANAGER = 18;

	/**
	 * The feature id for the '<em><b>Protection Controls Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_MANAGER__PROTECTION_CONTROLS_METHODS = 0;

	/**
	 * The feature id for the '<em><b>Defined Data Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_MANAGER__DEFINED_DATA_SOURCES = 1;

	/**
	 * The number of structural features of the '<em>Configuration Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link privacymodel.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.DataSourceImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__SOURCE = 0;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link privacymodel.impl.ComplaintImpl <em>Complaint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.impl.ComplaintImpl
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getComplaint()
	 * @generated
	 */
	int COMPLAINT = 20;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT__WHEN = 0;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT__WHO = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT__ACTION = 2;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT__WHAT = 3;

	/**
	 * The number of structural features of the '<em>Complaint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link privacymodel.PrivacyStatementType <em>Privacy Statement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.PrivacyStatementType
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrivacyStatementType()
	 * @generated
	 */
	int PRIVACY_STATEMENT_TYPE = 21;

	/**
	 * The meta object id for the '{@link privacymodel.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.DataType
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 22;

	/**
	 * The meta object id for the '{@link privacymodel.RestrictionType <em>Restriction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.RestrictionType
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getRestrictionType()
	 * @generated
	 */
	int RESTRICTION_TYPE = 23;

	/**
	 * The meta object id for the '{@link privacymodel.TimePreposition <em>Time Preposition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.TimePreposition
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getTimePreposition()
	 * @generated
	 */
	int TIME_PREPOSITION = 24;

	/**
	 * The meta object id for the '{@link privacymodel.PrincipalType <em>Principal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.PrincipalType
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrincipalType()
	 * @generated
	 */
	int PRINCIPAL_TYPE = 25;

	/**
	 * The meta object id for the '{@link privacymodel.PrincipalScope <em>Principal Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.PrincipalScope
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrincipalScope()
	 * @generated
	 */
	int PRINCIPAL_SCOPE = 26;

	/**
	 * The meta object id for the '{@link privacymodel.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.Action
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 27;

	/**
	 * The meta object id for the '{@link privacymodel.LocationType <em>Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.LocationType
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 28;

	/**
	 * The meta object id for the '{@link privacymodel.ProcessingReason <em>Processing Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.ProcessingReason
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getProcessingReason()
	 * @generated
	 */
	int PROCESSING_REASON = 29;

	/**
	 * The meta object id for the '{@link privacymodel.ProcessingReasonSubtype <em>Processing Reason Subtype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.ProcessingReasonSubtype
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getProcessingReasonSubtype()
	 * @generated
	 */
	int PROCESSING_REASON_SUBTYPE = 30;

	/**
	 * The meta object id for the '{@link privacymodel.ConstraintScope <em>Constraint Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.ConstraintScope
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getConstraintScope()
	 * @generated
	 */
	int CONSTRAINT_SCOPE = 31;

	/**
	 * The meta object id for the '{@link privacymodel.ComplaintAction <em>Complaint Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacymodel.ComplaintAction
	 * @see privacymodel.impl.PrivacymodelPackageImpl#getComplaintAction()
	 * @generated
	 */
	int COMPLAINT_ACTION = 32;


	/**
	 * Returns the meta object for class '{@link privacymodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see privacymodel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see privacymodel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link privacymodel.PrivacyPolicy <em>Privacy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privacy Policy</em>'.
	 * @see privacymodel.PrivacyPolicy
	 * @generated
	 */
	EClass getPrivacyPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.PrivacyPolicy#getPolicyStatements <em>Policy Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Statements</em>'.
	 * @see privacymodel.PrivacyPolicy#getPolicyStatements()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_PolicyStatements();

	/**
	 * Returns the meta object for the reference '{@link privacymodel.PrivacyPolicy#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see privacymodel.PrivacyPolicy#getOwner()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.PrivacyPolicy#getAllPrincipals <em>All Principals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Principals</em>'.
	 * @see privacymodel.PrivacyPolicy#getAllPrincipals()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllPrincipals();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.PrivacyPolicy#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see privacymodel.PrivacyPolicy#getLocations()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_Locations();

	/**
	 * Returns the meta object for the attribute list '{@link privacymodel.PrivacyPolicy#getDefaultProtectionControls <em>Default Protection Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Protection Controls</em>'.
	 * @see privacymodel.PrivacyPolicy#getDefaultProtectionControls()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EAttribute getPrivacyPolicy_DefaultProtectionControls();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.PrivacyPolicy#getAllServices <em>All Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Services</em>'.
	 * @see privacymodel.PrivacyPolicy#getAllServices()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllServices();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.PrivacyPolicy#getAllProviders <em>All Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Providers</em>'.
	 * @see privacymodel.PrivacyPolicy#getAllProviders()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllProviders();

	/**
	 * Returns the meta object for the containment reference '{@link privacymodel.PrivacyPolicy#getConfigurationManager <em>Configuration Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Manager</em>'.
	 * @see privacymodel.PrivacyPolicy#getConfigurationManager()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_ConfigurationManager();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.PrivacyPolicy#getAllDatas <em>All Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Datas</em>'.
	 * @see privacymodel.PrivacyPolicy#getAllDatas()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllDatas();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.PrivacyPolicy#getDataSubjectComplaints <em>Data Subject Complaints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Subject Complaints</em>'.
	 * @see privacymodel.PrivacyPolicy#getDataSubjectComplaints()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_DataSubjectComplaints();

	/**
	 * Returns the meta object for class '{@link privacymodel.PolicyStatement <em>Policy Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Statement</em>'.
	 * @see privacymodel.PolicyStatement
	 * @generated
	 */
	EClass getPolicyStatement();

	/**
	 * Returns the meta object for the reference '{@link privacymodel.PolicyStatement#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see privacymodel.PolicyStatement#getEReference0()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_EReference0();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.PolicyStatement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see privacymodel.PolicyStatement#getType()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EAttribute getPolicyStatement_Type();

	/**
	 * Returns the meta object for the containment reference '{@link privacymodel.PolicyStatement#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see privacymodel.PolicyStatement#getWhen()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_When();

	/**
	 * Returns the meta object for the reference '{@link privacymodel.PolicyStatement#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Who</em>'.
	 * @see privacymodel.PolicyStatement#getWho()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_Who();

	/**
	 * Returns the meta object for the containment reference '{@link privacymodel.PolicyStatement#getWhy <em>Why</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Why</em>'.
	 * @see privacymodel.PolicyStatement#getWhy()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_Why();

	/**
	 * Returns the meta object for the reference '{@link privacymodel.PolicyStatement#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see privacymodel.PolicyStatement#getFrom()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_From();

	/**
	 * Returns the meta object for the reference '{@link privacymodel.PolicyStatement#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Where</em>'.
	 * @see privacymodel.PolicyStatement#getWhere()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_Where();

	/**
	 * Returns the meta object for the containment reference '{@link privacymodel.PolicyStatement#getWhat <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>What</em>'.
	 * @see privacymodel.PolicyStatement#getWhat()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_What();

	/**
	 * Returns the meta object for the reference list '{@link privacymodel.PolicyStatement#getHow <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>How</em>'.
	 * @see privacymodel.PolicyStatement#getHow()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_How();

	/**
	 * Returns the meta object for the reference '{@link privacymodel.PolicyStatement#getWhose <em>Whose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whose</em>'.
	 * @see privacymodel.PolicyStatement#getWhose()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_Whose();

	/**
	 * Returns the meta object for the reference list '{@link privacymodel.PolicyStatement#getWhom <em>Whom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Whom</em>'.
	 * @see privacymodel.PolicyStatement#getWhom()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_Whom();

	/**
	 * Returns the meta object for the reference '{@link privacymodel.PolicyStatement#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cause</em>'.
	 * @see privacymodel.PolicyStatement#getCause()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_Cause();

	/**
	 * Returns the meta object for class '{@link privacymodel.PrivacyData <em>Privacy Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privacy Data</em>'.
	 * @see privacymodel.PrivacyData
	 * @generated
	 */
	EClass getPrivacyData();

	/**
	 * Returns the meta object for the reference '{@link privacymodel.PrivacyData#getAccessConstraints <em>Access Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Constraints</em>'.
	 * @see privacymodel.PrivacyData#getAccessConstraints()
	 * @see #getPrivacyData()
	 * @generated
	 */
	EReference getPrivacyData_AccessConstraints();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.PrivacyData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see privacymodel.PrivacyData#getType()
	 * @see #getPrivacyData()
	 * @generated
	 */
	EAttribute getPrivacyData_Type();

	/**
	 * Returns the meta object for class '{@link privacymodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see privacymodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.Service#getSubservices <em>Subservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subservices</em>'.
	 * @see privacymodel.Service#getSubservices()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Subservices();

	/**
	 * Returns the meta object for class '{@link privacymodel.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see privacymodel.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the reference list '{@link privacymodel.Provider#getProvide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provide</em>'.
	 * @see privacymodel.Provider#getProvide()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Provide();

	/**
	 * Returns the meta object for the reference '{@link privacymodel.Provider#getLocated <em>Located</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Located</em>'.
	 * @see privacymodel.Provider#getLocated()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Located();

	/**
	 * Returns the meta object for class '{@link privacymodel.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principal</em>'.
	 * @see privacymodel.Principal
	 * @generated
	 */
	EClass getPrincipal();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.Principal#getSubPrincipals <em>Sub Principals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Principals</em>'.
	 * @see privacymodel.Principal#getSubPrincipals()
	 * @see #getPrincipal()
	 * @generated
	 */
	EReference getPrincipal_SubPrincipals();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Principal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see privacymodel.Principal#getType()
	 * @see #getPrincipal()
	 * @generated
	 */
	EAttribute getPrincipal_Type();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Principal#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see privacymodel.Principal#getScope()
	 * @see #getPrincipal()
	 * @generated
	 */
	EAttribute getPrincipal_Scope();

	/**
	 * Returns the meta object for class '{@link privacymodel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see privacymodel.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Location#isIsEUMember <em>Is EU Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is EU Member</em>'.
	 * @see privacymodel.Location#isIsEUMember()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_IsEUMember();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Location#getEAttribute0 <em>EAttribute0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute0</em>'.
	 * @see privacymodel.Location#getEAttribute0()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_EAttribute0();

	/**
	 * Returns the meta object for the reference list '{@link privacymodel.Location#getSubLocations <em>Sub Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Locations</em>'.
	 * @see privacymodel.Location#getSubLocations()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_SubLocations();

	/**
	 * Returns the meta object for class '{@link privacymodel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see privacymodel.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Constraint#getDataOwnerScope <em>Data Owner Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Owner Scope</em>'.
	 * @see privacymodel.Constraint#getDataOwnerScope()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_DataOwnerScope();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Constraint#getDataControllerScope <em>Data Controller Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Controller Scope</em>'.
	 * @see privacymodel.Constraint#getDataControllerScope()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_DataControllerScope();

	/**
	 * Returns the meta object for the reference list '{@link privacymodel.Constraint#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required</em>'.
	 * @see privacymodel.Constraint#getRequired()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Required();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Constraint#getDataRecipientScope <em>Data Recipient Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Recipient Scope</em>'.
	 * @see privacymodel.Constraint#getDataRecipientScope()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_DataRecipientScope();

	/**
	 * Returns the meta object for class '{@link privacymodel.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see privacymodel.TimeInterval
	 * @generated
	 */
	EClass getTimeInterval();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.TimeInterval#getIntervals <em>Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intervals</em>'.
	 * @see privacymodel.TimeInterval#getIntervals()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EReference getTimeInterval_Intervals();

	/**
	 * Returns the meta object for class '{@link privacymodel.TimeStatement <em>Time Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Statement</em>'.
	 * @see privacymodel.TimeStatement
	 * @generated
	 */
	EClass getTimeStatement();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.TimeStatement#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see privacymodel.TimeStatement#getDateTime()
	 * @see #getTimeStatement()
	 * @generated
	 */
	EAttribute getTimeStatement_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.TimeStatement#getPreposition <em>Preposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preposition</em>'.
	 * @see privacymodel.TimeStatement#getPreposition()
	 * @see #getTimeStatement()
	 * @generated
	 */
	EAttribute getTimeStatement_Preposition();

	/**
	 * Returns the meta object for class '{@link privacymodel.Purpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose</em>'.
	 * @see privacymodel.Purpose
	 * @generated
	 */
	EClass getPurpose();

	/**
	 * Returns the meta object for the attribute list '{@link privacymodel.Purpose#getAdditionalProtectionControls <em>Additional Protection Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Additional Protection Controls</em>'.
	 * @see privacymodel.Purpose#getAdditionalProtectionControls()
	 * @see #getPurpose()
	 * @generated
	 */
	EAttribute getPurpose_AdditionalProtectionControls();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Purpose#getProcessingReason <em>Processing Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Reason</em>'.
	 * @see privacymodel.Purpose#getProcessingReason()
	 * @see #getPurpose()
	 * @generated
	 */
	EAttribute getPurpose_ProcessingReason();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Purpose#getProcessingReasonSubtype <em>Processing Reason Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Reason Subtype</em>'.
	 * @see privacymodel.Purpose#getProcessingReasonSubtype()
	 * @see #getPurpose()
	 * @generated
	 */
	EAttribute getPurpose_ProcessingReasonSubtype();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.Purpose#getSubPurposes <em>Sub Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Purposes</em>'.
	 * @see privacymodel.Purpose#getSubPurposes()
	 * @see #getPurpose()
	 * @generated
	 */
	EReference getPurpose_SubPurposes();

	/**
	 * Returns the meta object for class '{@link privacymodel.What <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What</em>'.
	 * @see privacymodel.What
	 * @generated
	 */
	EClass getWhat();

	/**
	 * Returns the meta object for the attribute list '{@link privacymodel.What#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actions</em>'.
	 * @see privacymodel.What#getActions()
	 * @see #getWhat()
	 * @generated
	 */
	EAttribute getWhat_Actions();

	/**
	 * Returns the meta object for the reference list '{@link privacymodel.What#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providers</em>'.
	 * @see privacymodel.What#getProviders()
	 * @see #getWhat()
	 * @generated
	 */
	EReference getWhat_Providers();

	/**
	 * Returns the meta object for the reference list '{@link privacymodel.What#getDatas <em>Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datas</em>'.
	 * @see privacymodel.What#getDatas()
	 * @see #getWhat()
	 * @generated
	 */
	EReference getWhat_Datas();

	/**
	 * Returns the meta object for class '{@link privacymodel.DataConstraint <em>Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Constraint</em>'.
	 * @see privacymodel.DataConstraint
	 * @generated
	 */
	EClass getDataConstraint();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.DataConstraint#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see privacymodel.DataConstraint#getKey()
	 * @see #getDataConstraint()
	 * @generated
	 */
	EAttribute getDataConstraint_Key();

	/**
	 * Returns the meta object for the reference list '{@link privacymodel.DataConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see privacymodel.DataConstraint#getValue()
	 * @see #getDataConstraint()
	 * @generated
	 */
	EReference getDataConstraint_Value();

	/**
	 * Returns the meta object for class '{@link privacymodel.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see privacymodel.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Restriction#getRestrictionType <em>Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restriction Type</em>'.
	 * @see privacymodel.Restriction#getRestrictionType()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_RestrictionType();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Restriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see privacymodel.Restriction#getValue()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_Value();

	/**
	 * Returns the meta object for class '{@link privacymodel.How <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>How</em>'.
	 * @see privacymodel.How
	 * @generated
	 */
	EClass getHow();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.How#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see privacymodel.How#getDataSource()
	 * @see #getHow()
	 * @generated
	 */
	EAttribute getHow_DataSource();

	/**
	 * Returns the meta object for the reference list '{@link privacymodel.How#getAttached <em>Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attached</em>'.
	 * @see privacymodel.How#getAttached()
	 * @see #getHow()
	 * @generated
	 */
	EReference getHow_Attached();

	/**
	 * Returns the meta object for class '{@link privacymodel.Approval <em>Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approval</em>'.
	 * @see privacymodel.Approval
	 * @generated
	 */
	EClass getApproval();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Approval#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see privacymodel.Approval#getStartDate()
	 * @see #getApproval()
	 * @generated
	 */
	EAttribute getApproval_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Approval#getTerminationDate <em>Termination Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Date</em>'.
	 * @see privacymodel.Approval#getTerminationDate()
	 * @see #getApproval()
	 * @generated
	 */
	EAttribute getApproval_TerminationDate();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Approval#getTerminationExplanation <em>Termination Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Explanation</em>'.
	 * @see privacymodel.Approval#getTerminationExplanation()
	 * @see #getApproval()
	 * @generated
	 */
	EAttribute getApproval_TerminationExplanation();

	/**
	 * Returns the meta object for the reference list '{@link privacymodel.Approval#getNotAllowed <em>Not Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Not Allowed</em>'.
	 * @see privacymodel.Approval#getNotAllowed()
	 * @see #getApproval()
	 * @generated
	 */
	EReference getApproval_NotAllowed();

	/**
	 * Returns the meta object for class '{@link privacymodel.ProtectionControl <em>Protection Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Control</em>'.
	 * @see privacymodel.ProtectionControl
	 * @generated
	 */
	EClass getProtectionControl();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.ProtectionControl#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see privacymodel.ProtectionControl#getMethod()
	 * @see #getProtectionControl()
	 * @generated
	 */
	EAttribute getProtectionControl_Method();

	/**
	 * Returns the meta object for class '{@link privacymodel.ConfigurationManager <em>Configuration Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Manager</em>'.
	 * @see privacymodel.ConfigurationManager
	 * @generated
	 */
	EClass getConfigurationManager();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.ConfigurationManager#getProtectionControlsMethods <em>Protection Controls Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protection Controls Methods</em>'.
	 * @see privacymodel.ConfigurationManager#getProtectionControlsMethods()
	 * @see #getConfigurationManager()
	 * @generated
	 */
	EReference getConfigurationManager_ProtectionControlsMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link privacymodel.ConfigurationManager#getDefinedDataSources <em>Defined Data Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defined Data Sources</em>'.
	 * @see privacymodel.ConfigurationManager#getDefinedDataSources()
	 * @see #getConfigurationManager()
	 * @generated
	 */
	EReference getConfigurationManager_DefinedDataSources();

	/**
	 * Returns the meta object for class '{@link privacymodel.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see privacymodel.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.DataSource#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see privacymodel.DataSource#getSource()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Source();

	/**
	 * Returns the meta object for class '{@link privacymodel.Complaint <em>Complaint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complaint</em>'.
	 * @see privacymodel.Complaint
	 * @generated
	 */
	EClass getComplaint();

	/**
	 * Returns the meta object for the containment reference '{@link privacymodel.Complaint#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see privacymodel.Complaint#getWhen()
	 * @see #getComplaint()
	 * @generated
	 */
	EReference getComplaint_When();

	/**
	 * Returns the meta object for the reference '{@link privacymodel.Complaint#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Who</em>'.
	 * @see privacymodel.Complaint#getWho()
	 * @see #getComplaint()
	 * @generated
	 */
	EReference getComplaint_Who();

	/**
	 * Returns the meta object for the attribute '{@link privacymodel.Complaint#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see privacymodel.Complaint#getAction()
	 * @see #getComplaint()
	 * @generated
	 */
	EAttribute getComplaint_Action();

	/**
	 * Returns the meta object for the reference list '{@link privacymodel.Complaint#getWhat <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>What</em>'.
	 * @see privacymodel.Complaint#getWhat()
	 * @see #getComplaint()
	 * @generated
	 */
	EReference getComplaint_What();

	/**
	 * Returns the meta object for enum '{@link privacymodel.PrivacyStatementType <em>Privacy Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Privacy Statement Type</em>'.
	 * @see privacymodel.PrivacyStatementType
	 * @generated
	 */
	EEnum getPrivacyStatementType();

	/**
	 * Returns the meta object for enum '{@link privacymodel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see privacymodel.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link privacymodel.RestrictionType <em>Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restriction Type</em>'.
	 * @see privacymodel.RestrictionType
	 * @generated
	 */
	EEnum getRestrictionType();

	/**
	 * Returns the meta object for enum '{@link privacymodel.TimePreposition <em>Time Preposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Preposition</em>'.
	 * @see privacymodel.TimePreposition
	 * @generated
	 */
	EEnum getTimePreposition();

	/**
	 * Returns the meta object for enum '{@link privacymodel.PrincipalType <em>Principal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Principal Type</em>'.
	 * @see privacymodel.PrincipalType
	 * @generated
	 */
	EEnum getPrincipalType();

	/**
	 * Returns the meta object for enum '{@link privacymodel.PrincipalScope <em>Principal Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Principal Scope</em>'.
	 * @see privacymodel.PrincipalScope
	 * @generated
	 */
	EEnum getPrincipalScope();

	/**
	 * Returns the meta object for enum '{@link privacymodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see privacymodel.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the meta object for enum '{@link privacymodel.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Type</em>'.
	 * @see privacymodel.LocationType
	 * @generated
	 */
	EEnum getLocationType();

	/**
	 * Returns the meta object for enum '{@link privacymodel.ProcessingReason <em>Processing Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing Reason</em>'.
	 * @see privacymodel.ProcessingReason
	 * @generated
	 */
	EEnum getProcessingReason();

	/**
	 * Returns the meta object for enum '{@link privacymodel.ProcessingReasonSubtype <em>Processing Reason Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing Reason Subtype</em>'.
	 * @see privacymodel.ProcessingReasonSubtype
	 * @generated
	 */
	EEnum getProcessingReasonSubtype();

	/**
	 * Returns the meta object for enum '{@link privacymodel.ConstraintScope <em>Constraint Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Scope</em>'.
	 * @see privacymodel.ConstraintScope
	 * @generated
	 */
	EEnum getConstraintScope();

	/**
	 * Returns the meta object for enum '{@link privacymodel.ComplaintAction <em>Complaint Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Complaint Action</em>'.
	 * @see privacymodel.ComplaintAction
	 * @generated
	 */
	EEnum getComplaintAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrivacymodelFactory getPrivacymodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link privacymodel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.NamedElementImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.PrivacyPolicyImpl <em>Privacy Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.PrivacyPolicyImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrivacyPolicy()
		 * @generated
		 */
		EClass PRIVACY_POLICY = eINSTANCE.getPrivacyPolicy();

		/**
		 * The meta object literal for the '<em><b>Policy Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__POLICY_STATEMENTS = eINSTANCE.getPrivacyPolicy_PolicyStatements();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__OWNER = eINSTANCE.getPrivacyPolicy_Owner();

		/**
		 * The meta object literal for the '<em><b>All Principals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_PRINCIPALS = eINSTANCE.getPrivacyPolicy_AllPrincipals();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__LOCATIONS = eINSTANCE.getPrivacyPolicy_Locations();

		/**
		 * The meta object literal for the '<em><b>Default Protection Controls</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS = eINSTANCE.getPrivacyPolicy_DefaultProtectionControls();

		/**
		 * The meta object literal for the '<em><b>All Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_SERVICES = eINSTANCE.getPrivacyPolicy_AllServices();

		/**
		 * The meta object literal for the '<em><b>All Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_PROVIDERS = eINSTANCE.getPrivacyPolicy_AllProviders();

		/**
		 * The meta object literal for the '<em><b>Configuration Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__CONFIGURATION_MANAGER = eINSTANCE.getPrivacyPolicy_ConfigurationManager();

		/**
		 * The meta object literal for the '<em><b>All Datas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_DATAS = eINSTANCE.getPrivacyPolicy_AllDatas();

		/**
		 * The meta object literal for the '<em><b>Data Subject Complaints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__DATA_SUBJECT_COMPLAINTS = eINSTANCE.getPrivacyPolicy_DataSubjectComplaints();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.PolicyStatementImpl <em>Policy Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.PolicyStatementImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getPolicyStatement()
		 * @generated
		 */
		EClass POLICY_STATEMENT = eINSTANCE.getPolicyStatement();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__EREFERENCE0 = eINSTANCE.getPolicyStatement_EReference0();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_STATEMENT__TYPE = eINSTANCE.getPolicyStatement_Type();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHEN = eINSTANCE.getPolicyStatement_When();

		/**
		 * The meta object literal for the '<em><b>Who</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHO = eINSTANCE.getPolicyStatement_Who();

		/**
		 * The meta object literal for the '<em><b>Why</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHY = eINSTANCE.getPolicyStatement_Why();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__FROM = eINSTANCE.getPolicyStatement_From();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHERE = eINSTANCE.getPolicyStatement_Where();

		/**
		 * The meta object literal for the '<em><b>What</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHAT = eINSTANCE.getPolicyStatement_What();

		/**
		 * The meta object literal for the '<em><b>How</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__HOW = eINSTANCE.getPolicyStatement_How();

		/**
		 * The meta object literal for the '<em><b>Whose</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHOSE = eINSTANCE.getPolicyStatement_Whose();

		/**
		 * The meta object literal for the '<em><b>Whom</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHOM = eINSTANCE.getPolicyStatement_Whom();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__CAUSE = eINSTANCE.getPolicyStatement_Cause();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.PrivacyDataImpl <em>Privacy Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.PrivacyDataImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrivacyData()
		 * @generated
		 */
		EClass PRIVACY_DATA = eINSTANCE.getPrivacyData();

		/**
		 * The meta object literal for the '<em><b>Access Constraints</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_DATA__ACCESS_CONSTRAINTS = eINSTANCE.getPrivacyData_AccessConstraints();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVACY_DATA__TYPE = eINSTANCE.getPrivacyData_Type();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.ServiceImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Subservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SUBSERVICES = eINSTANCE.getService_Subservices();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.ProviderImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Provide</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__PROVIDE = eINSTANCE.getProvider_Provide();

		/**
		 * The meta object literal for the '<em><b>Located</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__LOCATED = eINSTANCE.getProvider_Located();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.PrincipalImpl <em>Principal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.PrincipalImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrincipal()
		 * @generated
		 */
		EClass PRINCIPAL = eINSTANCE.getPrincipal();

		/**
		 * The meta object literal for the '<em><b>Sub Principals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINCIPAL__SUB_PRINCIPALS = eINSTANCE.getPrincipal_SubPrincipals();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPAL__TYPE = eINSTANCE.getPrincipal_Type();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPAL__SCOPE = eINSTANCE.getPrincipal_Scope();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.LocationImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Is EU Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__IS_EU_MEMBER = eINSTANCE.getLocation_IsEUMember();

		/**
		 * The meta object literal for the '<em><b>EAttribute0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__EATTRIBUTE0 = eINSTANCE.getLocation_EAttribute0();

		/**
		 * The meta object literal for the '<em><b>Sub Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__SUB_LOCATIONS = eINSTANCE.getLocation_SubLocations();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.ConstraintImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Data Owner Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__DATA_OWNER_SCOPE = eINSTANCE.getConstraint_DataOwnerScope();

		/**
		 * The meta object literal for the '<em><b>Data Controller Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__DATA_CONTROLLER_SCOPE = eINSTANCE.getConstraint_DataControllerScope();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__REQUIRED = eINSTANCE.getConstraint_Required();

		/**
		 * The meta object literal for the '<em><b>Data Recipient Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__DATA_RECIPIENT_SCOPE = eINSTANCE.getConstraint_DataRecipientScope();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.TimeIntervalImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getTimeInterval()
		 * @generated
		 */
		EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Intervals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL__INTERVALS = eINSTANCE.getTimeInterval_Intervals();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.TimeStatementImpl <em>Time Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.TimeStatementImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getTimeStatement()
		 * @generated
		 */
		EClass TIME_STATEMENT = eINSTANCE.getTimeStatement();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STATEMENT__DATE_TIME = eINSTANCE.getTimeStatement_DateTime();

		/**
		 * The meta object literal for the '<em><b>Preposition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STATEMENT__PREPOSITION = eINSTANCE.getTimeStatement_Preposition();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.PurposeImpl <em>Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.PurposeImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getPurpose()
		 * @generated
		 */
		EClass PURPOSE = eINSTANCE.getPurpose();

		/**
		 * The meta object literal for the '<em><b>Additional Protection Controls</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURPOSE__ADDITIONAL_PROTECTION_CONTROLS = eINSTANCE.getPurpose_AdditionalProtectionControls();

		/**
		 * The meta object literal for the '<em><b>Processing Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURPOSE__PROCESSING_REASON = eINSTANCE.getPurpose_ProcessingReason();

		/**
		 * The meta object literal for the '<em><b>Processing Reason Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURPOSE__PROCESSING_REASON_SUBTYPE = eINSTANCE.getPurpose_ProcessingReasonSubtype();

		/**
		 * The meta object literal for the '<em><b>Sub Purposes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURPOSE__SUB_PURPOSES = eINSTANCE.getPurpose_SubPurposes();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.WhatImpl <em>What</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.WhatImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getWhat()
		 * @generated
		 */
		EClass WHAT = eINSTANCE.getWhat();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHAT__ACTIONS = eINSTANCE.getWhat_Actions();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHAT__PROVIDERS = eINSTANCE.getWhat_Providers();

		/**
		 * The meta object literal for the '<em><b>Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHAT__DATAS = eINSTANCE.getWhat_Datas();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.DataConstraintImpl <em>Data Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.DataConstraintImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getDataConstraint()
		 * @generated
		 */
		EClass DATA_CONSTRAINT = eINSTANCE.getDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONSTRAINT__KEY = eINSTANCE.getDataConstraint_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONSTRAINT__VALUE = eINSTANCE.getDataConstraint_Value();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.RestrictionImpl <em>Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.RestrictionImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getRestriction()
		 * @generated
		 */
		EClass RESTRICTION = eINSTANCE.getRestriction();

		/**
		 * The meta object literal for the '<em><b>Restriction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__RESTRICTION_TYPE = eINSTANCE.getRestriction_RestrictionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__VALUE = eINSTANCE.getRestriction_Value();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.HowImpl <em>How</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.HowImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getHow()
		 * @generated
		 */
		EClass HOW = eINSTANCE.getHow();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOW__DATA_SOURCE = eINSTANCE.getHow_DataSource();

		/**
		 * The meta object literal for the '<em><b>Attached</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOW__ATTACHED = eINSTANCE.getHow_Attached();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.ApprovalImpl <em>Approval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.ApprovalImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getApproval()
		 * @generated
		 */
		EClass APPROVAL = eINSTANCE.getApproval();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL__START_DATE = eINSTANCE.getApproval_StartDate();

		/**
		 * The meta object literal for the '<em><b>Termination Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL__TERMINATION_DATE = eINSTANCE.getApproval_TerminationDate();

		/**
		 * The meta object literal for the '<em><b>Termination Explanation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL__TERMINATION_EXPLANATION = eINSTANCE.getApproval_TerminationExplanation();

		/**
		 * The meta object literal for the '<em><b>Not Allowed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVAL__NOT_ALLOWED = eINSTANCE.getApproval_NotAllowed();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.ProtectionControlImpl <em>Protection Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.ProtectionControlImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getProtectionControl()
		 * @generated
		 */
		EClass PROTECTION_CONTROL = eINSTANCE.getProtectionControl();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_CONTROL__METHOD = eINSTANCE.getProtectionControl_Method();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.ConfigurationManagerImpl <em>Configuration Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.ConfigurationManagerImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getConfigurationManager()
		 * @generated
		 */
		EClass CONFIGURATION_MANAGER = eINSTANCE.getConfigurationManager();

		/**
		 * The meta object literal for the '<em><b>Protection Controls Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_MANAGER__PROTECTION_CONTROLS_METHODS = eINSTANCE.getConfigurationManager_ProtectionControlsMethods();

		/**
		 * The meta object literal for the '<em><b>Defined Data Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_MANAGER__DEFINED_DATA_SOURCES = eINSTANCE.getConfigurationManager_DefinedDataSources();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.DataSourceImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__SOURCE = eINSTANCE.getDataSource_Source();

		/**
		 * The meta object literal for the '{@link privacymodel.impl.ComplaintImpl <em>Complaint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.impl.ComplaintImpl
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getComplaint()
		 * @generated
		 */
		EClass COMPLAINT = eINSTANCE.getComplaint();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLAINT__WHEN = eINSTANCE.getComplaint_When();

		/**
		 * The meta object literal for the '<em><b>Who</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLAINT__WHO = eINSTANCE.getComplaint_Who();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLAINT__ACTION = eINSTANCE.getComplaint_Action();

		/**
		 * The meta object literal for the '<em><b>What</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLAINT__WHAT = eINSTANCE.getComplaint_What();

		/**
		 * The meta object literal for the '{@link privacymodel.PrivacyStatementType <em>Privacy Statement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.PrivacyStatementType
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrivacyStatementType()
		 * @generated
		 */
		EEnum PRIVACY_STATEMENT_TYPE = eINSTANCE.getPrivacyStatementType();

		/**
		 * The meta object literal for the '{@link privacymodel.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.DataType
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link privacymodel.RestrictionType <em>Restriction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.RestrictionType
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getRestrictionType()
		 * @generated
		 */
		EEnum RESTRICTION_TYPE = eINSTANCE.getRestrictionType();

		/**
		 * The meta object literal for the '{@link privacymodel.TimePreposition <em>Time Preposition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.TimePreposition
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getTimePreposition()
		 * @generated
		 */
		EEnum TIME_PREPOSITION = eINSTANCE.getTimePreposition();

		/**
		 * The meta object literal for the '{@link privacymodel.PrincipalType <em>Principal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.PrincipalType
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrincipalType()
		 * @generated
		 */
		EEnum PRINCIPAL_TYPE = eINSTANCE.getPrincipalType();

		/**
		 * The meta object literal for the '{@link privacymodel.PrincipalScope <em>Principal Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.PrincipalScope
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getPrincipalScope()
		 * @generated
		 */
		EEnum PRINCIPAL_SCOPE = eINSTANCE.getPrincipalScope();

		/**
		 * The meta object literal for the '{@link privacymodel.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.Action
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link privacymodel.LocationType <em>Location Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.LocationType
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getLocationType()
		 * @generated
		 */
		EEnum LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '{@link privacymodel.ProcessingReason <em>Processing Reason</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.ProcessingReason
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getProcessingReason()
		 * @generated
		 */
		EEnum PROCESSING_REASON = eINSTANCE.getProcessingReason();

		/**
		 * The meta object literal for the '{@link privacymodel.ProcessingReasonSubtype <em>Processing Reason Subtype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.ProcessingReasonSubtype
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getProcessingReasonSubtype()
		 * @generated
		 */
		EEnum PROCESSING_REASON_SUBTYPE = eINSTANCE.getProcessingReasonSubtype();

		/**
		 * The meta object literal for the '{@link privacymodel.ConstraintScope <em>Constraint Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.ConstraintScope
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getConstraintScope()
		 * @generated
		 */
		EEnum CONSTRAINT_SCOPE = eINSTANCE.getConstraintScope();

		/**
		 * The meta object literal for the '{@link privacymodel.ComplaintAction <em>Complaint Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacymodel.ComplaintAction
		 * @see privacymodel.impl.PrivacymodelPackageImpl#getComplaintAction()
		 * @generated
		 */
		EEnum COMPLAINT_ACTION = eINSTANCE.getComplaintAction();

	}

} //PrivacymodelPackage
