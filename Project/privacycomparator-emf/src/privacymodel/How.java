/**
 */
package privacymodel;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>How</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.How#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link privacymodel.How#getAttached <em>Attached</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getHow()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface How extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see #setDataSource(String)
	 * @see privacymodel.PrivacymodelPackage#getHow_DataSource()
	 * @model required="true"
	 * @generated
	 */
	String getDataSource();

	/**
	 * Sets the value of the '{@link privacymodel.How#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(String value);

	/**
	 * Returns the value of the '<em><b>Attached</b></em>' reference list.
	 * The list contents are of type {@link privacymodel.Approval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached</em>' reference list.
	 * @see privacymodel.PrivacymodelPackage#getHow_Attached()
	 * @model type="privacymodel.Approval"
	 * @generated
	 */
	EList getAttached();

} // How
