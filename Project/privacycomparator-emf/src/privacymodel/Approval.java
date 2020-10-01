/**
 */
package privacymodel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.Approval#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link privacymodel.Approval#getTerminationDate <em>Termination Date</em>}</li>
 *   <li>{@link privacymodel.Approval#getTerminationExplanation <em>Termination Explanation</em>}</li>
 *   <li>{@link privacymodel.Approval#getNotAllowed <em>Not Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getApproval()
 * @model
 * @generated
 */
public interface Approval extends Restriction {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see privacymodel.PrivacymodelPackage#getApproval_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link privacymodel.Approval#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termination Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination Date</em>' attribute.
	 * @see #setTerminationDate(Date)
	 * @see privacymodel.PrivacymodelPackage#getApproval_TerminationDate()
	 * @model
	 * @generated
	 */
	Date getTerminationDate();

	/**
	 * Sets the value of the '{@link privacymodel.Approval#getTerminationDate <em>Termination Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Date</em>' attribute.
	 * @see #getTerminationDate()
	 * @generated
	 */
	void setTerminationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Termination Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termination Explanation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination Explanation</em>' attribute.
	 * @see #setTerminationExplanation(String)
	 * @see privacymodel.PrivacymodelPackage#getApproval_TerminationExplanation()
	 * @model
	 * @generated
	 */
	String getTerminationExplanation();

	/**
	 * Sets the value of the '{@link privacymodel.Approval#getTerminationExplanation <em>Termination Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Explanation</em>' attribute.
	 * @see #getTerminationExplanation()
	 * @generated
	 */
	void setTerminationExplanation(String value);

	/**
	 * Returns the value of the '<em><b>Not Allowed</b></em>' reference list.
	 * The list contents are of type {@link privacymodel.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Allowed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Allowed</em>' reference list.
	 * @see privacymodel.PrivacymodelPackage#getApproval_NotAllowed()
	 * @model type="privacymodel.Location"
	 * @generated
	 */
	EList getNotAllowed();

} // Approval
