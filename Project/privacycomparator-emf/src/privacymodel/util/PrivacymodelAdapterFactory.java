/**
 */
package privacymodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import privacymodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see privacymodel.PrivacymodelPackage
 * @generated
 */
public class PrivacymodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PrivacymodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacymodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PrivacymodelPackage.eINSTANCE;
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
	protected PrivacymodelSwitch modelSwitch =
		new PrivacymodelSwitch() {
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object casePrivacyPolicy(PrivacyPolicy object) {
				return createPrivacyPolicyAdapter();
			}
			public Object casePolicyStatement(PolicyStatement object) {
				return createPolicyStatementAdapter();
			}
			public Object casePrivacyData(PrivacyData object) {
				return createPrivacyDataAdapter();
			}
			public Object caseService(Service object) {
				return createServiceAdapter();
			}
			public Object caseProvider(Provider object) {
				return createProviderAdapter();
			}
			public Object casePrincipal(Principal object) {
				return createPrincipalAdapter();
			}
			public Object caseLocation(Location object) {
				return createLocationAdapter();
			}
			public Object caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			public Object caseTimeInterval(TimeInterval object) {
				return createTimeIntervalAdapter();
			}
			public Object caseTimeStatement(TimeStatement object) {
				return createTimeStatementAdapter();
			}
			public Object casePurpose(Purpose object) {
				return createPurposeAdapter();
			}
			public Object caseWhat(What object) {
				return createWhatAdapter();
			}
			public Object caseDataConstraint(DataConstraint object) {
				return createDataConstraintAdapter();
			}
			public Object caseRestriction(Restriction object) {
				return createRestrictionAdapter();
			}
			public Object caseHow(How object) {
				return createHowAdapter();
			}
			public Object caseApproval(Approval object) {
				return createApprovalAdapter();
			}
			public Object caseProtectionControl(ProtectionControl object) {
				return createProtectionControlAdapter();
			}
			public Object caseConfigurationManager(ConfigurationManager object) {
				return createConfigurationManagerAdapter();
			}
			public Object caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			public Object caseComplaint(Complaint object) {
				return createComplaintAdapter();
			}
			public Object defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.PrivacyPolicy <em>Privacy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.PrivacyPolicy
	 * @generated
	 */
	public Adapter createPrivacyPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.PolicyStatement <em>Policy Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.PolicyStatement
	 * @generated
	 */
	public Adapter createPolicyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.PrivacyData <em>Privacy Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.PrivacyData
	 * @generated
	 */
	public Adapter createPrivacyDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.Principal
	 * @generated
	 */
	public Adapter createPrincipalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.TimeInterval
	 * @generated
	 */
	public Adapter createTimeIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.TimeStatement <em>Time Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.TimeStatement
	 * @generated
	 */
	public Adapter createTimeStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.Purpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.Purpose
	 * @generated
	 */
	public Adapter createPurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.What <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.What
	 * @generated
	 */
	public Adapter createWhatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.DataConstraint <em>Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.DataConstraint
	 * @generated
	 */
	public Adapter createDataConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.Restriction
	 * @generated
	 */
	public Adapter createRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.How <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.How
	 * @generated
	 */
	public Adapter createHowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.Approval <em>Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.Approval
	 * @generated
	 */
	public Adapter createApprovalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.ProtectionControl <em>Protection Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.ProtectionControl
	 * @generated
	 */
	public Adapter createProtectionControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.ConfigurationManager <em>Configuration Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.ConfigurationManager
	 * @generated
	 */
	public Adapter createConfigurationManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link privacymodel.Complaint <em>Complaint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see privacymodel.Complaint
	 * @generated
	 */
	public Adapter createComplaintAdapter() {
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

} //PrivacymodelAdapterFactory
