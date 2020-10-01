/**
 */
package privacymodel;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.Constraint#getDataOwnerScope <em>Data Owner Scope</em>}</li>
 *   <li>{@link privacymodel.Constraint#getDataControllerScope <em>Data Controller Scope</em>}</li>
 *   <li>{@link privacymodel.Constraint#getRequired <em>Required</em>}</li>
 *   <li>{@link privacymodel.Constraint#getDataRecipientScope <em>Data Recipient Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getConstraint()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Constraint extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Data Owner Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.ConstraintScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Owner Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Owner Scope</em>' attribute.
	 * @see privacymodel.ConstraintScope
	 * @see #setDataOwnerScope(ConstraintScope)
	 * @see privacymodel.PrivacymodelPackage#getConstraint_DataOwnerScope()
	 * @model
	 * @generated
	 */
	ConstraintScope getDataOwnerScope();

	/**
	 * Sets the value of the '{@link privacymodel.Constraint#getDataOwnerScope <em>Data Owner Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Owner Scope</em>' attribute.
	 * @see privacymodel.ConstraintScope
	 * @see #getDataOwnerScope()
	 * @generated
	 */
	void setDataOwnerScope(ConstraintScope value);

	/**
	 * Returns the value of the '<em><b>Data Controller Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.ConstraintScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Controller Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Controller Scope</em>' attribute.
	 * @see privacymodel.ConstraintScope
	 * @see #setDataControllerScope(ConstraintScope)
	 * @see privacymodel.PrivacymodelPackage#getConstraint_DataControllerScope()
	 * @model
	 * @generated
	 */
	ConstraintScope getDataControllerScope();

	/**
	 * Sets the value of the '{@link privacymodel.Constraint#getDataControllerScope <em>Data Controller Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Controller Scope</em>' attribute.
	 * @see privacymodel.ConstraintScope
	 * @see #getDataControllerScope()
	 * @generated
	 */
	void setDataControllerScope(ConstraintScope value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link privacymodel.Restriction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see privacymodel.PrivacymodelPackage#getConstraint_Required()
	 * @model type="privacymodel.Restriction"
	 * @generated
	 */
	EList getRequired();

	/**
	 * Returns the value of the '<em><b>Data Recipient Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.ConstraintScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Recipient Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Recipient Scope</em>' attribute.
	 * @see privacymodel.ConstraintScope
	 * @see #setDataRecipientScope(ConstraintScope)
	 * @see privacymodel.PrivacymodelPackage#getConstraint_DataRecipientScope()
	 * @model
	 * @generated
	 */
	ConstraintScope getDataRecipientScope();

	/**
	 * Sets the value of the '{@link privacymodel.Constraint#getDataRecipientScope <em>Data Recipient Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Recipient Scope</em>' attribute.
	 * @see privacymodel.ConstraintScope
	 * @see #getDataRecipientScope()
	 * @generated
	 */
	void setDataRecipientScope(ConstraintScope value);

} // Constraint
