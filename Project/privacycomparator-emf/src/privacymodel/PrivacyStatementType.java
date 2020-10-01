/**
 */
package privacymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Privacy Statement Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacymodel.PrivacymodelPackage#getPrivacyStatementType()
 * @model
 * @generated
 */
public final class PrivacyStatementType extends AbstractEnumerator {
	/**
	 * The '<em><b>Permission</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Permission</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERMISSION_LITERAL
	 * @model name="Permission"
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION = 0;

	/**
	 * The '<em><b>Obligation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Obligation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBLIGATION_LITERAL
	 * @model name="Obligation"
	 * @generated
	 * @ordered
	 */
	public static final int OBLIGATION = 1;

	/**
	 * The '<em><b>Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Information</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_LITERAL
	 * @model name="Information"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION = 2;

	/**
	 * The '<em><b>Optional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Optional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_LITERAL
	 * @model name="Optional"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL = 3;

	/**
	 * The '<em><b>Prohibition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prohibition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROHIBITION_LITERAL
	 * @model name="Prohibition"
	 * @generated
	 * @ordered
	 */
	public static final int PROHIBITION = 4;

	/**
	 * The '<em><b>Permission</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMISSION
	 * @generated
	 * @ordered
	 */
	public static final PrivacyStatementType PERMISSION_LITERAL = new PrivacyStatementType(PERMISSION, "Permission", "Permission");

	/**
	 * The '<em><b>Obligation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIGATION
	 * @generated
	 * @ordered
	 */
	public static final PrivacyStatementType OBLIGATION_LITERAL = new PrivacyStatementType(OBLIGATION, "Obligation", "Obligation");

	/**
	 * The '<em><b>Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION
	 * @generated
	 * @ordered
	 */
	public static final PrivacyStatementType INFORMATION_LITERAL = new PrivacyStatementType(INFORMATION, "Information", "Information");

	/**
	 * The '<em><b>Optional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL
	 * @generated
	 * @ordered
	 */
	public static final PrivacyStatementType OPTIONAL_LITERAL = new PrivacyStatementType(OPTIONAL, "Optional", "Optional");

	/**
	 * The '<em><b>Prohibition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROHIBITION
	 * @generated
	 * @ordered
	 */
	public static final PrivacyStatementType PROHIBITION_LITERAL = new PrivacyStatementType(PROHIBITION, "Prohibition", "Prohibition");

	/**
	 * An array of all the '<em><b>Privacy Statement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrivacyStatementType[] VALUES_ARRAY =
		new PrivacyStatementType[] {
			PERMISSION_LITERAL,
			OBLIGATION_LITERAL,
			INFORMATION_LITERAL,
			OPTIONAL_LITERAL,
			PROHIBITION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Privacy Statement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Privacy Statement Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrivacyStatementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrivacyStatementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Privacy Statement Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrivacyStatementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrivacyStatementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Privacy Statement Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrivacyStatementType get(int value) {
		switch (value) {
			case PERMISSION: return PERMISSION_LITERAL;
			case OBLIGATION: return OBLIGATION_LITERAL;
			case INFORMATION: return INFORMATION_LITERAL;
			case OPTIONAL: return OPTIONAL_LITERAL;
			case PROHIBITION: return PROHIBITION_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PrivacyStatementType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PrivacyStatementType
