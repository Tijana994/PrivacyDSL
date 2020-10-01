/**
 */
package privacymodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import privacymodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrivacymodelFactoryImpl extends EFactoryImpl implements PrivacymodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrivacymodelFactory init() {
		try {
			PrivacymodelFactory thePrivacymodelFactory = (PrivacymodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://privacymodel/1.0"); 
			if (thePrivacymodelFactory != null) {
				return thePrivacymodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PrivacymodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacymodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PrivacymodelPackage.NAMED_ELEMENT: return (EObject)createNamedElement();
			case PrivacymodelPackage.PRIVACY_POLICY: return (EObject)createPrivacyPolicy();
			case PrivacymodelPackage.POLICY_STATEMENT: return (EObject)createPolicyStatement();
			case PrivacymodelPackage.PRIVACY_DATA: return (EObject)createPrivacyData();
			case PrivacymodelPackage.SERVICE: return (EObject)createService();
			case PrivacymodelPackage.PROVIDER: return (EObject)createProvider();
			case PrivacymodelPackage.PRINCIPAL: return (EObject)createPrincipal();
			case PrivacymodelPackage.LOCATION: return (EObject)createLocation();
			case PrivacymodelPackage.CONSTRAINT: return (EObject)createConstraint();
			case PrivacymodelPackage.TIME_INTERVAL: return (EObject)createTimeInterval();
			case PrivacymodelPackage.TIME_STATEMENT: return (EObject)createTimeStatement();
			case PrivacymodelPackage.PURPOSE: return (EObject)createPurpose();
			case PrivacymodelPackage.WHAT: return (EObject)createWhat();
			case PrivacymodelPackage.DATA_CONSTRAINT: return (EObject)createDataConstraint();
			case PrivacymodelPackage.RESTRICTION: return (EObject)createRestriction();
			case PrivacymodelPackage.HOW: return (EObject)createHow();
			case PrivacymodelPackage.APPROVAL: return (EObject)createApproval();
			case PrivacymodelPackage.PROTECTION_CONTROL: return (EObject)createProtectionControl();
			case PrivacymodelPackage.CONFIGURATION_MANAGER: return (EObject)createConfigurationManager();
			case PrivacymodelPackage.DATA_SOURCE: return (EObject)createDataSource();
			case PrivacymodelPackage.COMPLAINT: return (EObject)createComplaint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PrivacymodelPackage.PRIVACY_STATEMENT_TYPE:
				return createPrivacyStatementTypeFromString(eDataType, initialValue);
			case PrivacymodelPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case PrivacymodelPackage.RESTRICTION_TYPE:
				return createRestrictionTypeFromString(eDataType, initialValue);
			case PrivacymodelPackage.TIME_PREPOSITION:
				return createTimePrepositionFromString(eDataType, initialValue);
			case PrivacymodelPackage.PRINCIPAL_TYPE:
				return createPrincipalTypeFromString(eDataType, initialValue);
			case PrivacymodelPackage.PRINCIPAL_SCOPE:
				return createPrincipalScopeFromString(eDataType, initialValue);
			case PrivacymodelPackage.ACTION:
				return createActionFromString(eDataType, initialValue);
			case PrivacymodelPackage.LOCATION_TYPE:
				return createLocationTypeFromString(eDataType, initialValue);
			case PrivacymodelPackage.PROCESSING_REASON:
				return createProcessingReasonFromString(eDataType, initialValue);
			case PrivacymodelPackage.PROCESSING_REASON_SUBTYPE:
				return createProcessingReasonSubtypeFromString(eDataType, initialValue);
			case PrivacymodelPackage.CONSTRAINT_SCOPE:
				return createConstraintScopeFromString(eDataType, initialValue);
			case PrivacymodelPackage.COMPLAINT_ACTION:
				return createComplaintActionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PrivacymodelPackage.PRIVACY_STATEMENT_TYPE:
				return convertPrivacyStatementTypeToString(eDataType, instanceValue);
			case PrivacymodelPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case PrivacymodelPackage.RESTRICTION_TYPE:
				return convertRestrictionTypeToString(eDataType, instanceValue);
			case PrivacymodelPackage.TIME_PREPOSITION:
				return convertTimePrepositionToString(eDataType, instanceValue);
			case PrivacymodelPackage.PRINCIPAL_TYPE:
				return convertPrincipalTypeToString(eDataType, instanceValue);
			case PrivacymodelPackage.PRINCIPAL_SCOPE:
				return convertPrincipalScopeToString(eDataType, instanceValue);
			case PrivacymodelPackage.ACTION:
				return convertActionToString(eDataType, instanceValue);
			case PrivacymodelPackage.LOCATION_TYPE:
				return convertLocationTypeToString(eDataType, instanceValue);
			case PrivacymodelPackage.PROCESSING_REASON:
				return convertProcessingReasonToString(eDataType, instanceValue);
			case PrivacymodelPackage.PROCESSING_REASON_SUBTYPE:
				return convertProcessingReasonSubtypeToString(eDataType, instanceValue);
			case PrivacymodelPackage.CONSTRAINT_SCOPE:
				return convertConstraintScopeToString(eDataType, instanceValue);
			case PrivacymodelPackage.COMPLAINT_ACTION:
				return convertComplaintActionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyPolicy createPrivacyPolicy() {
		PrivacyPolicyImpl privacyPolicy = new PrivacyPolicyImpl();
		return privacyPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyStatement createPolicyStatement() {
		PolicyStatementImpl policyStatement = new PolicyStatementImpl();
		return policyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyData createPrivacyData() {
		PrivacyDataImpl privacyData = new PrivacyDataImpl();
		return privacyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal createPrincipal() {
		PrincipalImpl principal = new PrincipalImpl();
		return principal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createTimeInterval() {
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStatement createTimeStatement() {
		TimeStatementImpl timeStatement = new TimeStatementImpl();
		return timeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purpose createPurpose() {
		PurposeImpl purpose = new PurposeImpl();
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public What createWhat() {
		WhatImpl what = new WhatImpl();
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstraint createDataConstraint() {
		DataConstraintImpl dataConstraint = new DataConstraintImpl();
		return dataConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restriction createRestriction() {
		RestrictionImpl restriction = new RestrictionImpl();
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public How createHow() {
		HowImpl how = new HowImpl();
		return how;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Approval createApproval() {
		ApprovalImpl approval = new ApprovalImpl();
		return approval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionControl createProtectionControl() {
		ProtectionControlImpl protectionControl = new ProtectionControlImpl();
		return protectionControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationManager createConfigurationManager() {
		ConfigurationManagerImpl configurationManager = new ConfigurationManagerImpl();
		return configurationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource createDataSource() {
		DataSourceImpl dataSource = new DataSourceImpl();
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complaint createComplaint() {
		ComplaintImpl complaint = new ComplaintImpl();
		return complaint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyStatementType createPrivacyStatementTypeFromString(EDataType eDataType, String initialValue) {
		PrivacyStatementType result = PrivacyStatementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrivacyStatementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionType createRestrictionTypeFromString(EDataType eDataType, String initialValue) {
		RestrictionType result = RestrictionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestrictionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePreposition createTimePrepositionFromString(EDataType eDataType, String initialValue) {
		TimePreposition result = TimePreposition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimePrepositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrincipalType createPrincipalTypeFromString(EDataType eDataType, String initialValue) {
		PrincipalType result = PrincipalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrincipalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrincipalScope createPrincipalScopeFromString(EDataType eDataType, String initialValue) {
		PrincipalScope result = PrincipalScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrincipalScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createActionFromString(EDataType eDataType, String initialValue) {
		Action result = Action.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationTypeFromString(EDataType eDataType, String initialValue) {
		LocationType result = LocationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingReason createProcessingReasonFromString(EDataType eDataType, String initialValue) {
		ProcessingReason result = ProcessingReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingReasonSubtype createProcessingReasonSubtypeFromString(EDataType eDataType, String initialValue) {
		ProcessingReasonSubtype result = ProcessingReasonSubtype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingReasonSubtypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintScope createConstraintScopeFromString(EDataType eDataType, String initialValue) {
		ConstraintScope result = ConstraintScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintAction createComplaintActionFromString(EDataType eDataType, String initialValue) {
		ComplaintAction result = ComplaintAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComplaintActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacymodelPackage getPrivacymodelPackage() {
		return (PrivacymodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static PrivacymodelPackage getPackage() {
		return PrivacymodelPackage.eINSTANCE;
	}

} //PrivacymodelFactoryImpl
