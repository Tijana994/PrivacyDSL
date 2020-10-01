/**
 */
package privacymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import privacymodel.Principal;
import privacymodel.PrincipalScope;
import privacymodel.PrincipalType;
import privacymodel.PrivacymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Principal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.PrincipalImpl#getSubPrincipals <em>Sub Principals</em>}</li>
 *   <li>{@link privacymodel.impl.PrincipalImpl#getType <em>Type</em>}</li>
 *   <li>{@link privacymodel.impl.PrincipalImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrincipalImpl extends NamedElementImpl implements Principal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrincipalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.PRINCIPAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubPrincipals() {
		return (EList)eGet(PrivacymodelPackage.Literals.PRINCIPAL__SUB_PRINCIPALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrincipalType getType() {
		return (PrincipalType)eGet(PrivacymodelPackage.Literals.PRINCIPAL__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrincipalType newType) {
		eSet(PrivacymodelPackage.Literals.PRINCIPAL__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrincipalScope getScope() {
		return (PrincipalScope)eGet(PrivacymodelPackage.Literals.PRINCIPAL__SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(PrincipalScope newScope) {
		eSet(PrivacymodelPackage.Literals.PRINCIPAL__SCOPE, newScope);
	}

} //PrincipalImpl
