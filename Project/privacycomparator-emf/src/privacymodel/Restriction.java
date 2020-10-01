/**
 */
package privacymodel;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.Restriction#getRestrictionType <em>Restriction Type</em>}</li>
 *   <li>{@link privacymodel.Restriction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getRestriction()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Restriction extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Restriction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.RestrictionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Type</em>' attribute.
	 * @see privacymodel.RestrictionType
	 * @see #setRestrictionType(RestrictionType)
	 * @see privacymodel.PrivacymodelPackage#getRestriction_RestrictionType()
	 * @model
	 * @generated
	 */
	RestrictionType getRestrictionType();

	/**
	 * Sets the value of the '{@link privacymodel.Restriction#getRestrictionType <em>Restriction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction Type</em>' attribute.
	 * @see privacymodel.RestrictionType
	 * @see #getRestrictionType()
	 * @generated
	 */
	void setRestrictionType(RestrictionType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see privacymodel.PrivacymodelPackage#getRestriction_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link privacymodel.Restriction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Restriction
