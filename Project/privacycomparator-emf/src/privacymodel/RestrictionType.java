/**
 */
package privacymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Restriction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacymodel.PrivacymodelPackage#getRestrictionType()
 * @model
 * @generated
 */
public final class RestrictionType extends AbstractEnumerator {
	/**
	 * The '<em><b>Juvenile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Juvenile</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JUVENILE_LITERAL
	 * @model name="Juvenile"
	 * @generated
	 * @ordered
	 */
	public static final int JUVENILE = 0;

	/**
	 * The '<em><b>Explicit Consent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Explicit Consent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_CONSENT_LITERAL
	 * @model name="ExplicitConsent"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLICIT_CONSENT = 1;

	/**
	 * The '<em><b>Juvenile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUVENILE
	 * @generated
	 * @ordered
	 */
	public static final RestrictionType JUVENILE_LITERAL = new RestrictionType(JUVENILE, "Juvenile", "Juvenile");

	/**
	 * The '<em><b>Explicit Consent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_CONSENT
	 * @generated
	 * @ordered
	 */
	public static final RestrictionType EXPLICIT_CONSENT_LITERAL = new RestrictionType(EXPLICIT_CONSENT, "ExplicitConsent", "ExplicitConsent");

	/**
	 * An array of all the '<em><b>Restriction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RestrictionType[] VALUES_ARRAY =
		new RestrictionType[] {
			JUVENILE_LITERAL,
			EXPLICIT_CONSENT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Restriction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Restriction Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestrictionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RestrictionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Restriction Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestrictionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RestrictionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Restriction Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestrictionType get(int value) {
		switch (value) {
			case JUVENILE: return JUVENILE_LITERAL;
			case EXPLICIT_CONSENT: return EXPLICIT_CONSENT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RestrictionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //RestrictionType
