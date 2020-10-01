/**
 */
package privacymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.Service#getSubservices <em>Subservices</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subservices</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subservices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subservices</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getService_Subservices()
	 * @model type="privacymodel.Service" containment="true"
	 * @generated
	 */
	EList getSubservices();

} // Service
