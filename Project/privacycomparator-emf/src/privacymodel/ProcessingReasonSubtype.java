/**
 */
package privacymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Processing Reason Subtype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacymodel.PrivacymodelPackage#getProcessingReasonSubtype()
 * @model
 * @generated
 */
public final class ProcessingReasonSubtype extends AbstractEnumerator {
	/**
	 * The '<em><b>Prevention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prevention</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREVENTION_LITERAL
	 * @model name="Prevention"
	 * @generated
	 * @ordered
	 */
	public static final int PREVENTION = 0;

	/**
	 * The '<em><b>Investigation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Investigation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVESTIGATION_LITERAL
	 * @model name="Investigation"
	 * @generated
	 * @ordered
	 */
	public static final int INVESTIGATION = 1;

	/**
	 * The '<em><b>Detection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Detection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETECTION_LITERAL
	 * @model name="Detection"
	 * @generated
	 * @ordered
	 */
	public static final int DETECTION = 2;

	/**
	 * The '<em><b>Prosecution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prosecution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROSECUTION_LITERAL
	 * @model name="Prosecution"
	 * @generated
	 * @ordered
	 */
	public static final int PROSECUTION = 3;

	/**
	 * The '<em><b>Prevention Of Threats</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prevention Of Threats</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREVENTION_OF_THREATS_LITERAL
	 * @model name="PreventionOfThreats"
	 * @generated
	 * @ordered
	 */
	public static final int PREVENTION_OF_THREATS = 4;

	/**
	 * The '<em><b>Out Of EU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Out Of EU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUT_OF_EU_LITERAL
	 * @model name="OutOfEU"
	 * @generated
	 * @ordered
	 */
	public static final int OUT_OF_EU = 5;

	/**
	 * The '<em><b>Personal Activity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Personal Activity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_ACTIVITY_LITERAL
	 * @model name="PersonalActivity"
	 * @generated
	 * @ordered
	 */
	public static final int PERSONAL_ACTIVITY = 6;

	/**
	 * The '<em><b>Special Scope Of Activity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Special Scope Of Activity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_SCOPE_OF_ACTIVITY_LITERAL
	 * @model name="SpecialScopeOfActivity"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_SCOPE_OF_ACTIVITY = 7;

	/**
	 * The '<em><b>Employment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Employment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPLOYMENT_LITERAL
	 * @model name="Employment"
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYMENT = 8;

	/**
	 * The '<em><b>Social Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Social Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_SECURITY_LITERAL
	 * @model name="SocialSecurity"
	 * @generated
	 * @ordered
	 */
	public static final int SOCIAL_SECURITY = 9;

	/**
	 * The '<em><b>Social Protection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Social Protection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_PROTECTION_LITERAL
	 * @model name="SocialProtection"
	 * @generated
	 * @ordered
	 */
	public static final int SOCIAL_PROTECTION = 10;

	/**
	 * The '<em><b>Prevention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVENTION
	 * @generated
	 * @ordered
	 */
	public static final ProcessingReasonSubtype PREVENTION_LITERAL = new ProcessingReasonSubtype(PREVENTION, "Prevention", "Prevention");

	/**
	 * The '<em><b>Investigation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVESTIGATION
	 * @generated
	 * @ordered
	 */
	public static final ProcessingReasonSubtype INVESTIGATION_LITERAL = new ProcessingReasonSubtype(INVESTIGATION, "Investigation", "Investigation");

	/**
	 * The '<em><b>Detection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECTION
	 * @generated
	 * @ordered
	 */
	public static final ProcessingReasonSubtype DETECTION_LITERAL = new ProcessingReasonSubtype(DETECTION, "Detection", "Detection");

	/**
	 * The '<em><b>Prosecution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROSECUTION
	 * @generated
	 * @ordered
	 */
	public static final ProcessingReasonSubtype PROSECUTION_LITERAL = new ProcessingReasonSubtype(PROSECUTION, "Prosecution", "Prosecution");

	/**
	 * The '<em><b>Prevention Of Threats</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVENTION_OF_THREATS
	 * @generated
	 * @ordered
	 */
	public static final ProcessingReasonSubtype PREVENTION_OF_THREATS_LITERAL = new ProcessingReasonSubtype(PREVENTION_OF_THREATS, "PreventionOfThreats", "PreventionOfThreats");

	/**
	 * The '<em><b>Out Of EU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_OF_EU
	 * @generated
	 * @ordered
	 */
	public static final ProcessingReasonSubtype OUT_OF_EU_LITERAL = new ProcessingReasonSubtype(OUT_OF_EU, "OutOfEU", "OutOfEU");

	/**
	 * The '<em><b>Personal Activity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_ACTIVITY
	 * @generated
	 * @ordered
	 */
	public static final ProcessingReasonSubtype PERSONAL_ACTIVITY_LITERAL = new ProcessingReasonSubtype(PERSONAL_ACTIVITY, "PersonalActivity", "PersonalActivity");

	/**
	 * The '<em><b>Special Scope Of Activity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_SCOPE_OF_ACTIVITY
	 * @generated
	 * @ordered
	 */
	public static final ProcessingReasonSubtype SPECIAL_SCOPE_OF_ACTIVITY_LITERAL = new ProcessingReasonSubtype(SPECIAL_SCOPE_OF_ACTIVITY, "SpecialScopeOfActivity", "SpecialScopeOfActivity");

	/**
	 * The '<em><b>Employment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYMENT
	 * @generated
	 * @ordered
	 */
	public static final ProcessingReasonSubtype EMPLOYMENT_LITERAL = new ProcessingReasonSubtype(EMPLOYMENT, "Employment", "Employment");

	/**
	 * The '<em><b>Social Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_SECURITY
	 * @generated
	 * @ordered
	 */
	public static final ProcessingReasonSubtype SOCIAL_SECURITY_LITERAL = new ProcessingReasonSubtype(SOCIAL_SECURITY, "SocialSecurity", "SocialSecurity");

	/**
	 * The '<em><b>Social Protection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_PROTECTION
	 * @generated
	 * @ordered
	 */
	public static final ProcessingReasonSubtype SOCIAL_PROTECTION_LITERAL = new ProcessingReasonSubtype(SOCIAL_PROTECTION, "SocialProtection", "SocialProtection");

	/**
	 * An array of all the '<em><b>Processing Reason Subtype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessingReasonSubtype[] VALUES_ARRAY =
		new ProcessingReasonSubtype[] {
			PREVENTION_LITERAL,
			INVESTIGATION_LITERAL,
			DETECTION_LITERAL,
			PROSECUTION_LITERAL,
			PREVENTION_OF_THREATS_LITERAL,
			OUT_OF_EU_LITERAL,
			PERSONAL_ACTIVITY_LITERAL,
			SPECIAL_SCOPE_OF_ACTIVITY_LITERAL,
			EMPLOYMENT_LITERAL,
			SOCIAL_SECURITY_LITERAL,
			SOCIAL_PROTECTION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Processing Reason Subtype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Processing Reason Subtype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessingReasonSubtype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingReasonSubtype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Reason Subtype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessingReasonSubtype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingReasonSubtype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Reason Subtype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessingReasonSubtype get(int value) {
		switch (value) {
			case PREVENTION: return PREVENTION_LITERAL;
			case INVESTIGATION: return INVESTIGATION_LITERAL;
			case DETECTION: return DETECTION_LITERAL;
			case PROSECUTION: return PROSECUTION_LITERAL;
			case PREVENTION_OF_THREATS: return PREVENTION_OF_THREATS_LITERAL;
			case OUT_OF_EU: return OUT_OF_EU_LITERAL;
			case PERSONAL_ACTIVITY: return PERSONAL_ACTIVITY_LITERAL;
			case SPECIAL_SCOPE_OF_ACTIVITY: return SPECIAL_SCOPE_OF_ACTIVITY_LITERAL;
			case EMPLOYMENT: return EMPLOYMENT_LITERAL;
			case SOCIAL_SECURITY: return SOCIAL_SECURITY_LITERAL;
			case SOCIAL_PROTECTION: return SOCIAL_PROTECTION_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProcessingReasonSubtype(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ProcessingReasonSubtype
