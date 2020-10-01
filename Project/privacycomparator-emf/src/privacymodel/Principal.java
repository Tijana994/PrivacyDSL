/**
 */
package privacymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Principal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.Principal#getSubPrincipals <em>Sub Principals</em>}</li>
 *   <li>{@link privacymodel.Principal#getType <em>Type</em>}</li>
 *   <li>{@link privacymodel.Principal#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getPrincipal()
 * @model
 * @generated
 */
public interface Principal extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Principals</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.Principal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Principals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Principals</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getPrincipal_SubPrincipals()
	 * @model type="privacymodel.Principal" containment="true"
	 * @generated
	 */
	EList getSubPrincipals();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.PrincipalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see privacymodel.PrincipalType
	 * @see #setType(PrincipalType)
	 * @see privacymodel.PrivacymodelPackage#getPrincipal_Type()
	 * @model required="true"
	 * @generated
	 */
	PrincipalType getType();

	/**
	 * Sets the value of the '{@link privacymodel.Principal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see privacymodel.PrincipalType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrincipalType value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.PrincipalScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see privacymodel.PrincipalScope
	 * @see #setScope(PrincipalScope)
	 * @see privacymodel.PrivacymodelPackage#getPrincipal_Scope()
	 * @model required="true"
	 * @generated
	 */
	PrincipalScope getScope();

	/**
	 * Sets the value of the '{@link privacymodel.Principal#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see privacymodel.PrincipalScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(PrincipalScope value);

} // Principal
