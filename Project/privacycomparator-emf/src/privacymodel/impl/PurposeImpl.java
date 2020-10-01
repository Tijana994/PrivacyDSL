/**
 */
package privacymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import privacymodel.PrivacymodelPackage;
import privacymodel.ProcessingReason;
import privacymodel.ProcessingReasonSubtype;
import privacymodel.Purpose;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.PurposeImpl#getAdditionalProtectionControls <em>Additional Protection Controls</em>}</li>
 *   <li>{@link privacymodel.impl.PurposeImpl#getProcessingReason <em>Processing Reason</em>}</li>
 *   <li>{@link privacymodel.impl.PurposeImpl#getProcessingReasonSubtype <em>Processing Reason Subtype</em>}</li>
 *   <li>{@link privacymodel.impl.PurposeImpl#getSubPurposes <em>Sub Purposes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurposeImpl extends CDOObjectImpl implements Purpose {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.PURPOSE;
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
	public EList getAdditionalProtectionControls() {
		return (EList)eGet(PrivacymodelPackage.Literals.PURPOSE__ADDITIONAL_PROTECTION_CONTROLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingReason getProcessingReason() {
		return (ProcessingReason)eGet(PrivacymodelPackage.Literals.PURPOSE__PROCESSING_REASON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingReason(ProcessingReason newProcessingReason) {
		eSet(PrivacymodelPackage.Literals.PURPOSE__PROCESSING_REASON, newProcessingReason);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingReasonSubtype getProcessingReasonSubtype() {
		return (ProcessingReasonSubtype)eGet(PrivacymodelPackage.Literals.PURPOSE__PROCESSING_REASON_SUBTYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingReasonSubtype(ProcessingReasonSubtype newProcessingReasonSubtype) {
		eSet(PrivacymodelPackage.Literals.PURPOSE__PROCESSING_REASON_SUBTYPE, newProcessingReasonSubtype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubPurposes() {
		return (EList)eGet(PrivacymodelPackage.Literals.PURPOSE__SUB_PURPOSES, true);
	}

} //PurposeImpl
