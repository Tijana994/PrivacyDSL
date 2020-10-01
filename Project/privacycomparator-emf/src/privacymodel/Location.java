/**
 */
package privacymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.Location#isIsEUMember <em>Is EU Member</em>}</li>
 *   <li>{@link privacymodel.Location#getEAttribute0 <em>EAttribute0</em>}</li>
 *   <li>{@link privacymodel.Location#getSubLocations <em>Sub Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is EU Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is EU Member</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is EU Member</em>' attribute.
	 * @see #setIsEUMember(boolean)
	 * @see privacymodel.PrivacymodelPackage#getLocation_IsEUMember()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsEUMember();

	/**
	 * Sets the value of the '{@link privacymodel.Location#isIsEUMember <em>Is EU Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is EU Member</em>' attribute.
	 * @see #isIsEUMember()
	 * @generated
	 */
	void setIsEUMember(boolean value);

	/**
	 * Returns the value of the '<em><b>EAttribute0</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.LocationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute0</em>' attribute.
	 * @see privacymodel.LocationType
	 * @see #setEAttribute0(LocationType)
	 * @see privacymodel.PrivacymodelPackage#getLocation_EAttribute0()
	 * @model required="true"
	 * @generated
	 */
	LocationType getEAttribute0();

	/**
	 * Sets the value of the '{@link privacymodel.Location#getEAttribute0 <em>EAttribute0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAttribute0</em>' attribute.
	 * @see privacymodel.LocationType
	 * @see #getEAttribute0()
	 * @generated
	 */
	void setEAttribute0(LocationType value);

	/**
	 * Returns the value of the '<em><b>Sub Locations</b></em>' reference list.
	 * The list contents are of type {@link privacymodel.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Locations</em>' reference list.
	 * @see privacymodel.PrivacymodelPackage#getLocation_SubLocations()
	 * @model type="privacymodel.Location"
	 * @generated
	 */
	EList getSubLocations();

} // Location
