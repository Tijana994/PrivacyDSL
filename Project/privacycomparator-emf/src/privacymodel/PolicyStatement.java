/**
 */
package privacymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.PolicyStatement#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link privacymodel.PolicyStatement#getType <em>Type</em>}</li>
 *   <li>{@link privacymodel.PolicyStatement#getWhen <em>When</em>}</li>
 *   <li>{@link privacymodel.PolicyStatement#getWho <em>Who</em>}</li>
 *   <li>{@link privacymodel.PolicyStatement#getWhy <em>Why</em>}</li>
 *   <li>{@link privacymodel.PolicyStatement#getFrom <em>From</em>}</li>
 *   <li>{@link privacymodel.PolicyStatement#getWhere <em>Where</em>}</li>
 *   <li>{@link privacymodel.PolicyStatement#getWhat <em>What</em>}</li>
 *   <li>{@link privacymodel.PolicyStatement#getHow <em>How</em>}</li>
 *   <li>{@link privacymodel.PolicyStatement#getWhose <em>Whose</em>}</li>
 *   <li>{@link privacymodel.PolicyStatement#getWhom <em>Whom</em>}</li>
 *   <li>{@link privacymodel.PolicyStatement#getCause <em>Cause</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getPolicyStatement()
 * @model
 * @generated
 */
public interface PolicyStatement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(PrivacyData)
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_EReference0()
	 * @model
	 * @generated
	 */
	PrivacyData getEReference0();

	/**
	 * Sets the value of the '{@link privacymodel.PolicyStatement#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(PrivacyData value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.PrivacyStatementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see privacymodel.PrivacyStatementType
	 * @see #setType(PrivacyStatementType)
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_Type()
	 * @model required="true"
	 * @generated
	 */
	PrivacyStatementType getType();

	/**
	 * Sets the value of the '{@link privacymodel.PolicyStatement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see privacymodel.PrivacyStatementType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrivacyStatementType value);

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
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_When()
	 * @model containment="true"
	 *        extendedMetaData="name='when'"
	 * @generated
	 */
	TimeInterval getWhen();

	/**
	 * Sets the value of the '{@link privacymodel.PolicyStatement#getWhen <em>When</em>}' containment reference.
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
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_Who()
	 * @model
	 * @generated
	 */
	Principal getWho();

	/**
	 * Sets the value of the '{@link privacymodel.PolicyStatement#getWho <em>Who</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Principal value);

	/**
	 * Returns the value of the '<em><b>Why</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Why</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Why</em>' containment reference.
	 * @see #setWhy(Purpose)
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_Why()
	 * @model containment="true"
	 * @generated
	 */
	Purpose getWhy();

	/**
	 * Sets the value of the '{@link privacymodel.PolicyStatement#getWhy <em>Why</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Why</em>' containment reference.
	 * @see #getWhy()
	 * @generated
	 */
	void setWhy(Purpose value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Location)
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_From()
	 * @model
	 * @generated
	 */
	Location getFrom();

	/**
	 * Sets the value of the '{@link privacymodel.PolicyStatement#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Location value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' reference.
	 * @see #setWhere(Location)
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_Where()
	 * @model
	 * @generated
	 */
	Location getWhere();

	/**
	 * Sets the value of the '{@link privacymodel.PolicyStatement#getWhere <em>Where</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Location value);

	/**
	 * Returns the value of the '<em><b>What</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>What</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What</em>' containment reference.
	 * @see #setWhat(What)
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_What()
	 * @model containment="true"
	 * @generated
	 */
	What getWhat();

	/**
	 * Sets the value of the '{@link privacymodel.PolicyStatement#getWhat <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What</em>' containment reference.
	 * @see #getWhat()
	 * @generated
	 */
	void setWhat(What value);

	/**
	 * Returns the value of the '<em><b>How</b></em>' reference list.
	 * The list contents are of type {@link privacymodel.How}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>How</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>How</em>' reference list.
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_How()
	 * @model type="privacymodel.How"
	 * @generated
	 */
	EList getHow();

	/**
	 * Returns the value of the '<em><b>Whose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whose</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whose</em>' reference.
	 * @see #setWhose(Principal)
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_Whose()
	 * @model
	 * @generated
	 */
	Principal getWhose();

	/**
	 * Sets the value of the '{@link privacymodel.PolicyStatement#getWhose <em>Whose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whose</em>' reference.
	 * @see #getWhose()
	 * @generated
	 */
	void setWhose(Principal value);

	/**
	 * Returns the value of the '<em><b>Whom</b></em>' reference list.
	 * The list contents are of type {@link privacymodel.Principal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whom</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whom</em>' reference list.
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_Whom()
	 * @model type="privacymodel.Principal"
	 * @generated
	 */
	EList getWhom();

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' reference.
	 * @see #setCause(PolicyStatement)
	 * @see privacymodel.PrivacymodelPackage#getPolicyStatement_Cause()
	 * @model
	 * @generated
	 */
	PolicyStatement getCause();

	/**
	 * Sets the value of the '{@link privacymodel.PolicyStatement#getCause <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' reference.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(PolicyStatement value);

} // PolicyStatement
