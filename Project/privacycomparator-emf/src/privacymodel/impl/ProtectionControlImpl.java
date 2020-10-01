/**
 */
package privacymodel.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import privacymodel.PrivacymodelPackage;
import privacymodel.ProtectionControl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protection Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.ProtectionControlImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtectionControlImpl extends CDOObjectImpl implements ProtectionControl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.PROTECTION_CONTROL;
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
	public String getMethod() {
		return (String)eGet(PrivacymodelPackage.Literals.PROTECTION_CONTROL__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		eSet(PrivacymodelPackage.Literals.PROTECTION_CONTROL__METHOD, newMethod);
	}

} //ProtectionControlImpl
