/**
 */
package privacymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacymodel.PrivacymodelPackage#getAction()
 * @model
 * @generated
 */
public final class Action extends AbstractEnumerator {
	/**
	 * The '<em><b>Store</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Store</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORE_LITERAL
	 * @model name="Store"
	 * @generated
	 * @ordered
	 */
	public static final int STORE = 0;

	/**
	 * The '<em><b>Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Access</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCESS_LITERAL
	 * @model name="Access"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS = 1;

	/**
	 * The '<em><b>Collecting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collecting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLECTING_LITERAL
	 * @model name="Collecting"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTING = 2;

	/**
	 * The '<em><b>Retrieval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Retrieval</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETRIEVAL_LITERAL
	 * @model name="Retrieval"
	 * @generated
	 * @ordered
	 */
	public static final int RETRIEVAL = 2;

	/**
	 * The '<em><b>Notify About Erasure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Notify About Erasure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTIFY_ABOUT_ERASURE_LITERAL
	 * @model name="NotifyAboutErasure"
	 * @generated
	 * @ordered
	 */
	public static final int NOTIFY_ABOUT_ERASURE = 3;

	/**
	 * The '<em><b>Notify About Rectification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Notify About Rectification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTIFY_ABOUT_RECTIFICATION_LITERAL
	 * @model name="NotifyAboutRectification"
	 * @generated
	 * @ordered
	 */
	public static final int NOTIFY_ABOUT_RECTIFICATION = 4;

	/**
	 * The '<em><b>Store</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORE
	 * @generated
	 * @ordered
	 */
	public static final Action STORE_LITERAL = new Action(STORE, "Store", "Store");

	/**
	 * The '<em><b>Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS
	 * @generated
	 * @ordered
	 */
	public static final Action ACCESS_LITERAL = new Action(ACCESS, "Access", "Access");

	/**
	 * The '<em><b>Collecting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTING
	 * @generated
	 * @ordered
	 */
	public static final Action COLLECTING_LITERAL = new Action(COLLECTING, "Collecting", "Collecting");

	/**
	 * The '<em><b>Retrieval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRIEVAL
	 * @generated
	 * @ordered
	 */
	public static final Action RETRIEVAL_LITERAL = new Action(RETRIEVAL, "Retrieval", "Retrieval");

	/**
	 * The '<em><b>Notify About Erasure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFY_ABOUT_ERASURE
	 * @generated
	 * @ordered
	 */
	public static final Action NOTIFY_ABOUT_ERASURE_LITERAL = new Action(NOTIFY_ABOUT_ERASURE, "NotifyAboutErasure", "NotifyAboutErasure");

	/**
	 * The '<em><b>Notify About Rectification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFY_ABOUT_RECTIFICATION
	 * @generated
	 * @ordered
	 */
	public static final Action NOTIFY_ABOUT_RECTIFICATION_LITERAL = new Action(NOTIFY_ABOUT_RECTIFICATION, "NotifyAboutRectification", "NotifyAboutRectification");

	/**
	 * An array of all the '<em><b>Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Action[] VALUES_ARRAY =
		new Action[] {
			STORE_LITERAL,
			ACCESS_LITERAL,
			COLLECTING_LITERAL,
			RETRIEVAL_LITERAL,
			NOTIFY_ABOUT_ERASURE_LITERAL,
			NOTIFY_ABOUT_RECTIFICATION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Action get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Action result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Action getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Action result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Action get(int value) {
		switch (value) {
			case STORE: return STORE_LITERAL;
			case ACCESS: return ACCESS_LITERAL;
			case COLLECTING: return COLLECTING_LITERAL;
			case NOTIFY_ABOUT_ERASURE: return NOTIFY_ABOUT_ERASURE_LITERAL;
			case NOTIFY_ABOUT_RECTIFICATION: return NOTIFY_ABOUT_RECTIFICATION_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Action(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Action
