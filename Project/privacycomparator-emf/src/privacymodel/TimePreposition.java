/**
 */
package privacymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Preposition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacymodel.PrivacymodelPackage#getTimePreposition()
 * @model
 * @generated
 */
public final class TimePreposition extends AbstractEnumerator {
	/**
	 * The '<em><b>From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>From</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROM_LITERAL
	 * @model name="from"
	 * @generated
	 * @ordered
	 */
	public static final int FROM = 0;

	/**
	 * The '<em><b>To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_LITERAL
	 * @model name="to"
	 * @generated
	 * @ordered
	 */
	public static final int TO = 1;

	/**
	 * The '<em><b>At</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>At</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AT_LITERAL
	 * @model name="at"
	 * @generated
	 * @ordered
	 */
	public static final int AT = 2;

	/**
	 * The '<em><b>Until</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Until</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNTIL_LITERAL
	 * @model name="until"
	 * @generated
	 * @ordered
	 */
	public static final int UNTIL = 3;

	/**
	 * The '<em><b>Before</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_LITERAL
	 * @model name="before"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE = 4;

	/**
	 * The '<em><b>After</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_LITERAL
	 * @model name="after"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER = 5;

	/**
	 * The '<em><b>From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM
	 * @generated
	 * @ordered
	 */
	public static final TimePreposition FROM_LITERAL = new TimePreposition(FROM, "from", "from");

	/**
	 * The '<em><b>To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO
	 * @generated
	 * @ordered
	 */
	public static final TimePreposition TO_LITERAL = new TimePreposition(TO, "to", "to");

	/**
	 * The '<em><b>At</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT
	 * @generated
	 * @ordered
	 */
	public static final TimePreposition AT_LITERAL = new TimePreposition(AT, "at", "at");

	/**
	 * The '<em><b>Until</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNTIL
	 * @generated
	 * @ordered
	 */
	public static final TimePreposition UNTIL_LITERAL = new TimePreposition(UNTIL, "until", "until");

	/**
	 * The '<em><b>Before</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE
	 * @generated
	 * @ordered
	 */
	public static final TimePreposition BEFORE_LITERAL = new TimePreposition(BEFORE, "before", "before");

	/**
	 * The '<em><b>After</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER
	 * @generated
	 * @ordered
	 */
	public static final TimePreposition AFTER_LITERAL = new TimePreposition(AFTER, "after", "after");

	/**
	 * An array of all the '<em><b>Time Preposition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimePreposition[] VALUES_ARRAY =
		new TimePreposition[] {
			FROM_LITERAL,
			TO_LITERAL,
			AT_LITERAL,
			UNTIL_LITERAL,
			BEFORE_LITERAL,
			AFTER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Preposition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Preposition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimePreposition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimePreposition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Preposition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimePreposition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimePreposition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Preposition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimePreposition get(int value) {
		switch (value) {
			case FROM: return FROM_LITERAL;
			case TO: return TO_LITERAL;
			case AT: return AT_LITERAL;
			case UNTIL: return UNTIL_LITERAL;
			case BEFORE: return BEFORE_LITERAL;
			case AFTER: return AFTER_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimePreposition(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TimePreposition
