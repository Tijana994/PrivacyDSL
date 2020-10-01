/**
 */
package privacymodel;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.TimeInterval#getIntervals <em>Intervals</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getTimeInterval()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface TimeInterval extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Intervals</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.TimeStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervals</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getTimeInterval_Intervals()
	 * @model type="privacymodel.TimeStatement" containment="true"
	 * @generated
	 */
	EList getIntervals();

} // TimeInterval
