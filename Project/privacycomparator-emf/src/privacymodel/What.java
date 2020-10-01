/**
 */
package privacymodel;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>What</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.What#getActions <em>Actions</em>}</li>
 *   <li>{@link privacymodel.What#getProviders <em>Providers</em>}</li>
 *   <li>{@link privacymodel.What#getDatas <em>Datas</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getWhat()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface What extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' attribute list.
	 * The list contents are of type {@link privacymodel.Action}.
	 * The literals are from the enumeration {@link privacymodel.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' attribute list.
	 * @see privacymodel.Action
	 * @see privacymodel.PrivacymodelPackage#getWhat_Actions()
	 * @model dataType="privacymodel.Action"
	 * @generated
	 */
	EList getActions();

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' reference list.
	 * The list contents are of type {@link privacymodel.Provider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' reference list.
	 * @see privacymodel.PrivacymodelPackage#getWhat_Providers()
	 * @model type="privacymodel.Provider"
	 * @generated
	 */
	EList getProviders();

	/**
	 * Returns the value of the '<em><b>Datas</b></em>' reference list.
	 * The list contents are of type {@link privacymodel.PrivacyData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datas</em>' reference list.
	 * @see privacymodel.PrivacymodelPackage#getWhat_Datas()
	 * @model type="privacymodel.PrivacyData"
	 * @generated
	 */
	EList getDatas();

} // What
