/**
 */
package privacymodel.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import privacymodel.PrivacymodelPackage;
import privacymodel.Restriction;
import privacymodel.RestrictionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.RestrictionImpl#getRestrictionType <em>Restriction Type</em>}</li>
 *   <li>{@link privacymodel.impl.RestrictionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionImpl extends CDOObjectImpl implements Restriction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionType getRestrictionType() {
		return (RestrictionType)eGet(PrivacymodelPackage.Literals.RESTRICTION__RESTRICTION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictionType(RestrictionType newRestrictionType) {
		eSet(PrivacymodelPackage.Literals.RESTRICTION__RESTRICTION_TYPE, newRestrictionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(PrivacymodelPackage.Literals.RESTRICTION__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(PrivacymodelPackage.Literals.RESTRICTION__VALUE, newValue);
	}

} //RestrictionImpl
