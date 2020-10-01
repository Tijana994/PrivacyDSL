/**
 */
package privacymodel;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complaint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.Complaint#getWhen <em>When</em>}</li>
 *   <li>{@link privacymodel.Complaint#getWho <em>Who</em>}</li>
 *   <li>{@link privacymodel.Complaint#getAction <em>Action</em>}</li>
 *   <li>{@link privacymodel.Complaint#getWhat <em>What</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getComplaint()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Complaint extends CDOObject {
	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(TimeInterval)
	 * @see privacymodel.PrivacymodelPackage#getComplaint_When()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeInterval getWhen();

	/**
	 * Sets the value of the '{@link privacymodel.Complaint#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(TimeInterval value);

	/**
	 * Returns the value of the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who</em>' reference.
	 * @see #setWho(Principal)
	 * @see privacymodel.PrivacymodelPackage#getComplaint_Who()
	 * @model required="true"
	 * @generated
	 */
	Principal getWho();

	/**
	 * Sets the value of the '{@link privacymodel.Complaint#getWho <em>Who</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Principal value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.ComplaintAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see privacymodel.ComplaintAction
	 * @see #setAction(ComplaintAction)
	 * @see privacymodel.PrivacymodelPackage#getComplaint_Action()
	 * @model
	 * @generated
	 */
	ComplaintAction getAction();

	/**
	 * Sets the value of the '{@link privacymodel.Complaint#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see privacymodel.ComplaintAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ComplaintAction value);

	/**
	 * Returns the value of the '<em><b>What</b></em>' reference list.
	 * The list contents are of type {@link privacymodel.PrivacyData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>What</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What</em>' reference list.
	 * @see privacymodel.PrivacymodelPackage#getComplaint_What()
	 * @model type="privacymodel.PrivacyData" required="true"
	 * @generated
	 */
	EList getWhat();

} // Complaint
