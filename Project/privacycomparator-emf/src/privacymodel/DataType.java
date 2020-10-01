/**
 */
package privacymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacymodel.PrivacymodelPackage#getDataType()
 * @model
 * @generated
 */
public final class DataType extends AbstractEnumerator {
	/**
	 * The '<em><b>Biometric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Biometric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIOMETRIC_LITERAL
	 * @model name="Biometric"
	 * @generated
	 * @ordered
	 */
	public static final int BIOMETRIC = 0;

	/**
	 * The '<em><b>General</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>General</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL_LITERAL
	 * @model name="General"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL = 1;

	/**
	 * The '<em><b>Genetic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Genetic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENETIC_LITERAL
	 * @model name="Genetic"
	 * @generated
	 * @ordered
	 */
	public static final int GENETIC = 2;

	/**
	 * The '<em><b>Political Opinion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Political Opinion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLITICAL_OPINION_LITERAL
	 * @model name="PoliticalOpinion"
	 * @generated
	 * @ordered
	 */
	public static final int POLITICAL_OPINION = 3;

	/**
	 * The '<em><b>Racial Ethnic Origin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Racial Ethnic Origin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RACIAL_ETHNIC_ORIGIN_LITERAL
	 * @model name="RacialEthnicOrigin"
	 * @generated
	 * @ordered
	 */
	public static final int RACIAL_ETHNIC_ORIGIN = 4;

	/**
	 * The '<em><b>Beliefs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Beliefs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BELIEFS_LITERAL
	 * @model name="Beliefs"
	 * @generated
	 * @ordered
	 */
	public static final int BELIEFS = 5;

	/**
	 * The '<em><b>Sex Life</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sex Life</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEX_LIFE_LITERAL
	 * @model name="SexLife"
	 * @generated
	 * @ordered
	 */
	public static final int SEX_LIFE = 6;

	/**
	 * The '<em><b>Biometric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOMETRIC
	 * @generated
	 * @ordered
	 */
	public static final DataType BIOMETRIC_LITERAL = new DataType(BIOMETRIC, "Biometric", "Biometric");

	/**
	 * The '<em><b>General</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL
	 * @generated
	 * @ordered
	 */
	public static final DataType GENERAL_LITERAL = new DataType(GENERAL, "General", "General");

	/**
	 * The '<em><b>Genetic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENETIC
	 * @generated
	 * @ordered
	 */
	public static final DataType GENETIC_LITERAL = new DataType(GENETIC, "Genetic", "Genetic");

	/**
	 * The '<em><b>Political Opinion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLITICAL_OPINION
	 * @generated
	 * @ordered
	 */
	public static final DataType POLITICAL_OPINION_LITERAL = new DataType(POLITICAL_OPINION, "PoliticalOpinion", "PoliticalOpinion");

	/**
	 * The '<em><b>Racial Ethnic Origin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RACIAL_ETHNIC_ORIGIN
	 * @generated
	 * @ordered
	 */
	public static final DataType RACIAL_ETHNIC_ORIGIN_LITERAL = new DataType(RACIAL_ETHNIC_ORIGIN, "RacialEthnicOrigin", "RacialEthnicOrigin");

	/**
	 * The '<em><b>Beliefs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELIEFS
	 * @generated
	 * @ordered
	 */
	public static final DataType BELIEFS_LITERAL = new DataType(BELIEFS, "Beliefs", "Beliefs");

	/**
	 * The '<em><b>Sex Life</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEX_LIFE
	 * @generated
	 * @ordered
	 */
	public static final DataType SEX_LIFE_LITERAL = new DataType(SEX_LIFE, "SexLife", "SexLife");

	/**
	 * An array of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataType[] VALUES_ARRAY =
		new DataType[] {
			BIOMETRIC_LITERAL,
			GENERAL_LITERAL,
			GENETIC_LITERAL,
			POLITICAL_OPINION_LITERAL,
			RACIAL_ETHNIC_ORIGIN_LITERAL,
			BELIEFS_LITERAL,
			SEX_LIFE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataType get(int value) {
		switch (value) {
			case BIOMETRIC: return BIOMETRIC_LITERAL;
			case GENERAL: return GENERAL_LITERAL;
			case GENETIC: return GENETIC_LITERAL;
			case POLITICAL_OPINION: return POLITICAL_OPINION_LITERAL;
			case RACIAL_ETHNIC_ORIGIN: return RACIAL_ETHNIC_ORIGIN_LITERAL;
			case BELIEFS: return BELIEFS_LITERAL;
			case SEX_LIFE: return SEX_LIFE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //DataType
