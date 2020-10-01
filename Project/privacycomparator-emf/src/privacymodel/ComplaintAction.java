/**
 */
package privacymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Complaint Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacymodel.PrivacymodelPackage#getComplaintAction()
 * @model
 * @generated
 */
public final class ComplaintAction extends AbstractEnumerator {
	/**
	 * The '<em><b>Erasure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Erasure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERASURE_LITERAL
	 * @model name="Erasure"
	 * @generated
	 * @ordered
	 */
	public static final int ERASURE = 0;

	/**
	 * The '<em><b>Rectification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rectification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECTIFICATION_LITERAL
	 * @model name="Rectification"
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFICATION = 1;

	/**
	 * The '<em><b>Erasure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERASURE
	 * @generated
	 * @ordered
	 */
	public static final ComplaintAction ERASURE_LITERAL = new ComplaintAction(ERASURE, "Erasure", "Erasure");

	/**
	 * The '<em><b>Rectification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTIFICATION
	 * @generated
	 * @ordered
	 */
	public static final ComplaintAction RECTIFICATION_LITERAL = new ComplaintAction(RECTIFICATION, "Rectification", "Rectification");

	/**
	 * An array of all the '<em><b>Complaint Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComplaintAction[] VALUES_ARRAY =
		new ComplaintAction[] {
			ERASURE_LITERAL,
			RECTIFICATION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Complaint Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Complaint Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComplaintAction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComplaintAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Complaint Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComplaintAction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComplaintAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Complaint Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComplaintAction get(int value) {
		switch (value) {
			case ERASURE: return ERASURE_LITERAL;
			case RECTIFICATION: return RECTIFICATION_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ComplaintAction(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ComplaintAction
