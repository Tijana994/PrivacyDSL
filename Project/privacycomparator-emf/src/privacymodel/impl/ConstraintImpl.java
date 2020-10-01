/**
 */
package privacymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import privacymodel.Constraint;
import privacymodel.ConstraintScope;
import privacymodel.PrivacymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.ConstraintImpl#getDataOwnerScope <em>Data Owner Scope</em>}</li>
 *   <li>{@link privacymodel.impl.ConstraintImpl#getDataControllerScope <em>Data Controller Scope</em>}</li>
 *   <li>{@link privacymodel.impl.ConstraintImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link privacymodel.impl.ConstraintImpl#getDataRecipientScope <em>Data Recipient Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends CDOObjectImpl implements Constraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.CONSTRAINT;
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
	public ConstraintScope getDataOwnerScope() {
		return (ConstraintScope)eGet(PrivacymodelPackage.Literals.CONSTRAINT__DATA_OWNER_SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataOwnerScope(ConstraintScope newDataOwnerScope) {
		eSet(PrivacymodelPackage.Literals.CONSTRAINT__DATA_OWNER_SCOPE, newDataOwnerScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintScope getDataControllerScope() {
		return (ConstraintScope)eGet(PrivacymodelPackage.Literals.CONSTRAINT__DATA_CONTROLLER_SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataControllerScope(ConstraintScope newDataControllerScope) {
		eSet(PrivacymodelPackage.Literals.CONSTRAINT__DATA_CONTROLLER_SCOPE, newDataControllerScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRequired() {
		return (EList)eGet(PrivacymodelPackage.Literals.CONSTRAINT__REQUIRED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintScope getDataRecipientScope() {
		return (ConstraintScope)eGet(PrivacymodelPackage.Literals.CONSTRAINT__DATA_RECIPIENT_SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRecipientScope(ConstraintScope newDataRecipientScope) {
		eSet(PrivacymodelPackage.Literals.CONSTRAINT__DATA_RECIPIENT_SCOPE, newDataRecipientScope);
	}

} //ConstraintImpl
