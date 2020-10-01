/**
 */
package privacymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import privacymodel.PrivacymodelPackage;
import privacymodel.What;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>What</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.WhatImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link privacymodel.impl.WhatImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link privacymodel.impl.WhatImpl#getDatas <em>Datas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhatImpl extends CDOObjectImpl implements What {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.WHAT;
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
	public EList getActions() {
		return (EList)eGet(PrivacymodelPackage.Literals.WHAT__ACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProviders() {
		return (EList)eGet(PrivacymodelPackage.Literals.WHAT__PROVIDERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDatas() {
		return (EList)eGet(PrivacymodelPackage.Literals.WHAT__DATAS, true);
	}

} //WhatImpl
