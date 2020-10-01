/**
 */
package privacymodel;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.Purpose#getAdditionalProtectionControls <em>Additional Protection Controls</em>}</li>
 *   <li>{@link privacymodel.Purpose#getProcessingReason <em>Processing Reason</em>}</li>
 *   <li>{@link privacymodel.Purpose#getProcessingReasonSubtype <em>Processing Reason Subtype</em>}</li>
 *   <li>{@link privacymodel.Purpose#getSubPurposes <em>Sub Purposes</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getPurpose()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Purpose extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Additional Protection Controls</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Protection Controls</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Protection Controls</em>' attribute list.
	 * @see privacymodel.PrivacymodelPackage#getPurpose_AdditionalProtectionControls()
	 * @model
	 * @generated
	 */
	EList getAdditionalProtectionControls();

	/**
	 * Returns the value of the '<em><b>Processing Reason</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.ProcessingReason}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Reason</em>' attribute.
	 * @see privacymodel.ProcessingReason
	 * @see #setProcessingReason(ProcessingReason)
	 * @see privacymodel.PrivacymodelPackage#getPurpose_ProcessingReason()
	 * @model
	 * @generated
	 */
	ProcessingReason getProcessingReason();

	/**
	 * Sets the value of the '{@link privacymodel.Purpose#getProcessingReason <em>Processing Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Reason</em>' attribute.
	 * @see privacymodel.ProcessingReason
	 * @see #getProcessingReason()
	 * @generated
	 */
	void setProcessingReason(ProcessingReason value);

	/**
	 * Returns the value of the '<em><b>Processing Reason Subtype</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.ProcessingReasonSubtype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Reason Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Reason Subtype</em>' attribute.
	 * @see privacymodel.ProcessingReasonSubtype
	 * @see #setProcessingReasonSubtype(ProcessingReasonSubtype)
	 * @see privacymodel.PrivacymodelPackage#getPurpose_ProcessingReasonSubtype()
	 * @model
	 * @generated
	 */
	ProcessingReasonSubtype getProcessingReasonSubtype();

	/**
	 * Sets the value of the '{@link privacymodel.Purpose#getProcessingReasonSubtype <em>Processing Reason Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Reason Subtype</em>' attribute.
	 * @see privacymodel.ProcessingReasonSubtype
	 * @see #getProcessingReasonSubtype()
	 * @generated
	 */
	void setProcessingReasonSubtype(ProcessingReasonSubtype value);

	/**
	 * Returns the value of the '<em><b>Sub Purposes</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.Purpose}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Purposes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Purposes</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getPurpose_SubPurposes()
	 * @model type="privacymodel.Purpose" containment="true"
	 * @generated
	 */
	EList getSubPurposes();

} // Purpose
