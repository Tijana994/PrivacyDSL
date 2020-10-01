/**
 */
package privacymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import privacymodel.Location;
import privacymodel.LocationType;
import privacymodel.PrivacymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.LocationImpl#isIsEUMember <em>Is EU Member</em>}</li>
 *   <li>{@link privacymodel.impl.LocationImpl#getEAttribute0 <em>EAttribute0</em>}</li>
 *   <li>{@link privacymodel.impl.LocationImpl#getSubLocations <em>Sub Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationImpl extends NamedElementImpl implements Location {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEUMember() {
		return ((Boolean)eGet(PrivacymodelPackage.Literals.LOCATION__IS_EU_MEMBER, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEUMember(boolean newIsEUMember) {
		eSet(PrivacymodelPackage.Literals.LOCATION__IS_EU_MEMBER, new Boolean(newIsEUMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType getEAttribute0() {
		return (LocationType)eGet(PrivacymodelPackage.Literals.LOCATION__EATTRIBUTE0, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute0(LocationType newEAttribute0) {
		eSet(PrivacymodelPackage.Literals.LOCATION__EATTRIBUTE0, newEAttribute0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubLocations() {
		return (EList)eGet(PrivacymodelPackage.Literals.LOCATION__SUB_LOCATIONS, true);
	}

} //LocationImpl
