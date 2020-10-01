/**
 */
package privacymodel;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.DataConstraint#getKey <em>Key</em>}</li>
 *   <li>{@link privacymodel.DataConstraint#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getDataConstraint()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DataConstraint extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see privacymodel.Action
	 * @see #setKey(Action)
	 * @see privacymodel.PrivacymodelPackage#getDataConstraint_Key()
	 * @model
	 * @generated
	 */
	Action getKey();

	/**
	 * Sets the value of the '{@link privacymodel.DataConstraint#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see privacymodel.Action
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Action value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link privacymodel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see privacymodel.PrivacymodelPackage#getDataConstraint_Value()
	 * @model type="privacymodel.Constraint"
	 * @generated
	 */
	EList getValue();

} // DataConstraint
