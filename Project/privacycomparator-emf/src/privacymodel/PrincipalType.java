/**
 */
package privacymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Principal Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacymodel.PrivacymodelPackage#getPrincipalType()
 * @model
 * @generated
 */
public final class PrincipalType extends AbstractEnumerator {
	/**
	 * The '<em><b>Organization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Organization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_LITERAL
	 * @model name="Organization"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION = 0;

	/**
	 * The '<em><b>Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROUP_LITERAL
	 * @model name="Group"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP = 1;

	/**
	 * The '<em><b>Individual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Individual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDIVIDUAL_LITERAL
	 * @model name="Individual"
	 * @generated
	 * @ordered
	 */
	public static final int INDIVIDUAL = 2;

	/**
	 * The '<em><b>Organization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION
	 * @generated
	 * @ordered
	 */
	public static final PrincipalType ORGANIZATION_LITERAL = new PrincipalType(ORGANIZATION, "Organization", "Organization");

	/**
	 * The '<em><b>Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP
	 * @generated
	 * @ordered
	 */
	public static final PrincipalType GROUP_LITERAL = new PrincipalType(GROUP, "Group", "Group");

	/**
	 * The '<em><b>Individual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIVIDUAL
	 * @generated
	 * @ordered
	 */
	public static final PrincipalType INDIVIDUAL_LITERAL = new PrincipalType(INDIVIDUAL, "Individual", "Individual");

	/**
	 * An array of all the '<em><b>Principal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrincipalType[] VALUES_ARRAY =
		new PrincipalType[] {
			ORGANIZATION_LITERAL,
			GROUP_LITERAL,
			INDIVIDUAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Principal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Principal Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrincipalType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrincipalType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Principal Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrincipalType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrincipalType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Principal Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrincipalType get(int value) {
		switch (value) {
			case ORGANIZATION: return ORGANIZATION_LITERAL;
			case GROUP: return GROUP_LITERAL;
			case INDIVIDUAL: return INDIVIDUAL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PrincipalType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PrincipalType
