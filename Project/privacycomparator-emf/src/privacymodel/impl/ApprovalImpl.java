/**
 */
package privacymodel.impl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import privacymodel.Approval;
import privacymodel.PrivacymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Approval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.ApprovalImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link privacymodel.impl.ApprovalImpl#getTerminationDate <em>Termination Date</em>}</li>
 *   <li>{@link privacymodel.impl.ApprovalImpl#getTerminationExplanation <em>Termination Explanation</em>}</li>
 *   <li>{@link privacymodel.impl.ApprovalImpl#getNotAllowed <em>Not Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApprovalImpl extends RestrictionImpl implements Approval {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApprovalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.APPROVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return (Date)eGet(PrivacymodelPackage.Literals.APPROVAL__START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		eSet(PrivacymodelPackage.Literals.APPROVAL__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTerminationDate() {
		return (Date)eGet(PrivacymodelPackage.Literals.APPROVAL__TERMINATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminationDate(Date newTerminationDate) {
		eSet(PrivacymodelPackage.Literals.APPROVAL__TERMINATION_DATE, newTerminationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerminationExplanation() {
		return (String)eGet(PrivacymodelPackage.Literals.APPROVAL__TERMINATION_EXPLANATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminationExplanation(String newTerminationExplanation) {
		eSet(PrivacymodelPackage.Literals.APPROVAL__TERMINATION_EXPLANATION, newTerminationExplanation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNotAllowed() {
		return (EList)eGet(PrivacymodelPackage.Literals.APPROVAL__NOT_ALLOWED, true);
	}

} //ApprovalImpl
