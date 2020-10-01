/**
 */
package privacymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.Provider#getProvide <em>Provide</em>}</li>
 *   <li>{@link privacymodel.Provider#getLocated <em>Located</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Provide</b></em>' reference list.
	 * The list contents are of type {@link privacymodel.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provide</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide</em>' reference list.
	 * @see privacymodel.PrivacymodelPackage#getProvider_Provide()
	 * @model type="privacymodel.Service"
	 * @generated
	 */
	EList getProvide();

	/**
	 * Returns the value of the '<em><b>Located</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Located</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located</em>' reference.
	 * @see #setLocated(Location)
	 * @see privacymodel.PrivacymodelPackage#getProvider_Located()
	 * @model required="true"
	 * @generated
	 */
	Location getLocated();

	/**
	 * Sets the value of the '{@link privacymodel.Provider#getLocated <em>Located</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Located</em>' reference.
	 * @see #getLocated()
	 * @generated
	 */
	void setLocated(Location value);

} // Provider
