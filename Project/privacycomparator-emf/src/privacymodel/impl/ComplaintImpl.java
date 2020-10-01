/**
 */
package privacymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import privacymodel.Complaint;
import privacymodel.ComplaintAction;
import privacymodel.Principal;
import privacymodel.PrivacymodelPackage;
import privacymodel.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complaint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.ComplaintImpl#getWhen <em>When</em>}</li>
 *   <li>{@link privacymodel.impl.ComplaintImpl#getWho <em>Who</em>}</li>
 *   <li>{@link privacymodel.impl.ComplaintImpl#getAction <em>Action</em>}</li>
 *   <li>{@link privacymodel.impl.ComplaintImpl#getWhat <em>What</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplaintImpl extends CDOObjectImpl implements Complaint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplaintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.COMPLAINT;
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
	public TimeInterval getWhen() {
		return (TimeInterval)eGet(PrivacymodelPackage.Literals.COMPLAINT__WHEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(TimeInterval newWhen) {
		eSet(PrivacymodelPackage.Literals.COMPLAINT__WHEN, newWhen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal getWho() {
		return (Principal)eGet(PrivacymodelPackage.Literals.COMPLAINT__WHO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWho(Principal newWho) {
		eSet(PrivacymodelPackage.Literals.COMPLAINT__WHO, newWho);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintAction getAction() {
		return (ComplaintAction)eGet(PrivacymodelPackage.Literals.COMPLAINT__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ComplaintAction newAction) {
		eSet(PrivacymodelPackage.Literals.COMPLAINT__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWhat() {
		return (EList)eGet(PrivacymodelPackage.Literals.COMPLAINT__WHAT, true);
	}

} //ComplaintImpl
