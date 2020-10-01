/**
 */
package privacymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import privacymodel.Location;
import privacymodel.PrivacymodelPackage;
import privacymodel.Provider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.ProviderImpl#getProvide <em>Provide</em>}</li>
 *   <li>{@link privacymodel.impl.ProviderImpl#getLocated <em>Located</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderImpl extends NamedElementImpl implements Provider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProvide() {
		return (EList)eGet(PrivacymodelPackage.Literals.PROVIDER__PROVIDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocated() {
		return (Location)eGet(PrivacymodelPackage.Literals.PROVIDER__LOCATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocated(Location newLocated) {
		eSet(PrivacymodelPackage.Literals.PROVIDER__LOCATED, newLocated);
	}

} //ProviderImpl
