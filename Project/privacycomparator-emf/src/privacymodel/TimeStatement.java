/**
 */
package privacymodel;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.TimeStatement#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link privacymodel.TimeStatement#getPreposition <em>Preposition</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getTimeStatement()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface TimeStatement extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see privacymodel.PrivacymodelPackage#getTimeStatement_DateTime()
	 * @model
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link privacymodel.TimeStatement#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Preposition</b></em>' attribute.
	 * The literals are from the enumeration {@link privacymodel.TimePreposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preposition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preposition</em>' attribute.
	 * @see privacymodel.TimePreposition
	 * @see #setPreposition(TimePreposition)
	 * @see privacymodel.PrivacymodelPackage#getTimeStatement_Preposition()
	 * @model required="true"
	 * @generated
	 */
	TimePreposition getPreposition();

	/**
	 * Sets the value of the '{@link privacymodel.TimeStatement#getPreposition <em>Preposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preposition</em>' attribute.
	 * @see privacymodel.TimePreposition
	 * @see #getPreposition()
	 * @generated
	 */
	void setPreposition(TimePreposition value);

} // TimeStatement
