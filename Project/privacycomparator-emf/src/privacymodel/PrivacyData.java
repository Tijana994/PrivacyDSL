/**
 */
package privacymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.PrivacyData#getAccessConstraints <em>Access Constraints</em>}</li>
 *   <li>{@link privacymodel.PrivacyData#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getPrivacyData()
 * @model
 * @generated
 */
public interface PrivacyData extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Access Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Constraints</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Constraints</em>' reference.
	 * @see #setAccessConstraints(DataConstraint)
	 * @see privacymodel.PrivacymodelPackage#getPrivacyData_AccessConstraints()
	 * @model keys="key"
	 *        extendedMetaData="kind='attribute' processing='skip'"
	 * @generated
	 */
	DataConstraint getAccessConstraints();

	/**
	 * Sets the value of the '{@link privacymodel.PrivacyData#getAccessConstraints <em>Access Constraints</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Constraints</em>' reference.
	 * @see #getAccessConstraints()
	 * @generated
	 */
	void setAccessConstraints(DataConstraint value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see privacymodel.DataType
	 * @see #setType(DataType)
	 * @see privacymodel.PrivacymodelPackage#getPrivacyData_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link privacymodel.PrivacyData#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see privacymodel.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // PrivacyData
