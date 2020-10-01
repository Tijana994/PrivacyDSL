/**
 */
package privacymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Location Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacymodel.PrivacymodelPackage#getLocationType()
 * @model
 * @generated
 */
public final class LocationType extends AbstractEnumerator {
	/**
	 * The '<em><b>Union</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Union</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNION_LITERAL
	 * @model name="Union" literal="Member"
	 * @generated
	 * @ordered
	 */
	public static final int UNION = 0;

	/**
	 * The '<em><b>Country</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Country</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNTRY_LITERAL
	 * @model name="Country"
	 * @generated
	 * @ordered
	 */
	public static final int COUNTRY = 1;

	/**
	 * The '<em><b>Region</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Region</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGION_LITERAL
	 * @model name="Region"
	 * @generated
	 * @ordered
	 */
	public static final int REGION = 2;

	/**
	 * The '<em><b>Union</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNION
	 * @generated
	 * @ordered
	 */
	public static final LocationType UNION_LITERAL = new LocationType(UNION, "Union", "Member");

	/**
	 * The '<em><b>Country</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY
	 * @generated
	 * @ordered
	 */
	public static final LocationType COUNTRY_LITERAL = new LocationType(COUNTRY, "Country", "Country");

	/**
	 * The '<em><b>Region</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGION
	 * @generated
	 * @ordered
	 */
	public static final LocationType REGION_LITERAL = new LocationType(REGION, "Region", "Region");

	/**
	 * An array of all the '<em><b>Location Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LocationType[] VALUES_ARRAY =
		new LocationType[] {
			UNION_LITERAL,
			COUNTRY_LITERAL,
			REGION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Location Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Location Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocationType get(int value) {
		switch (value) {
			case UNION: return UNION_LITERAL;
			case COUNTRY: return COUNTRY_LITERAL;
			case REGION: return REGION_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LocationType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //LocationType
