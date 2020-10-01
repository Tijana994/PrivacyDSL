/**
 */
package privacymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import privacymodel.Location;
import privacymodel.PolicyStatement;
import privacymodel.Principal;
import privacymodel.PrivacyData;
import privacymodel.PrivacyStatementType;
import privacymodel.PrivacymodelPackage;
import privacymodel.Purpose;
import privacymodel.TimeInterval;
import privacymodel.What;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getType <em>Type</em>}</li>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getWhen <em>When</em>}</li>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getWho <em>Who</em>}</li>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getWhy <em>Why</em>}</li>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getFrom <em>From</em>}</li>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getWhat <em>What</em>}</li>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getHow <em>How</em>}</li>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getWhose <em>Whose</em>}</li>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getWhom <em>Whom</em>}</li>
 *   <li>{@link privacymodel.impl.PolicyStatementImpl#getCause <em>Cause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyStatementImpl extends NamedElementImpl implements PolicyStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.POLICY_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyData getEReference0() {
		return (PrivacyData)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__EREFERENCE0, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(PrivacyData newEReference0) {
		eSet(PrivacymodelPackage.Literals.POLICY_STATEMENT__EREFERENCE0, newEReference0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyStatementType getType() {
		return (PrivacyStatementType)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrivacyStatementType newType) {
		eSet(PrivacymodelPackage.Literals.POLICY_STATEMENT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getWhen() {
		return (TimeInterval)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(TimeInterval newWhen) {
		eSet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHEN, newWhen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal getWho() {
		return (Principal)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWho(Principal newWho) {
		eSet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHO, newWho);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purpose getWhy() {
		return (Purpose)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhy(Purpose newWhy) {
		eSet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHY, newWhy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getFrom() {
		return (Location)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Location newFrom) {
		eSet(PrivacymodelPackage.Literals.POLICY_STATEMENT__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getWhere() {
		return (Location)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHERE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Location newWhere) {
		eSet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHERE, newWhere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public What getWhat() {
		return (What)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhat(What newWhat) {
		eSet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHAT, newWhat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHow() {
		return (EList)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__HOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal getWhose() {
		return (Principal)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHOSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhose(Principal newWhose) {
		eSet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHOSE, newWhose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWhom() {
		return (EList)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__WHOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyStatement getCause() {
		return (PolicyStatement)eGet(PrivacymodelPackage.Literals.POLICY_STATEMENT__CAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(PolicyStatement newCause) {
		eSet(PrivacymodelPackage.Literals.POLICY_STATEMENT__CAUSE, newCause);
	}

} //PolicyStatementImpl
