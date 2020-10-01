/**
 */
package privacymodel.impl;

import org.eclipse.emf.ecore.EClass;

import privacymodel.DataConstraint;
import privacymodel.DataType;
import privacymodel.PrivacyData;
import privacymodel.PrivacymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.PrivacyDataImpl#getAccessConstraints <em>Access Constraints</em>}</li>
 *   <li>{@link privacymodel.impl.PrivacyDataImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivacyDataImpl extends NamedElementImpl implements PrivacyData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.PRIVACY_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstraint getAccessConstraints() {
		return (DataConstraint)eGet(PrivacymodelPackage.Literals.PRIVACY_DATA__ACCESS_CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessConstraints(DataConstraint newAccessConstraints) {
		eSet(PrivacymodelPackage.Literals.PRIVACY_DATA__ACCESS_CONSTRAINTS, newAccessConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		return (DataType)eGet(PrivacymodelPackage.Literals.PRIVACY_DATA__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		eSet(PrivacymodelPackage.Literals.PRIVACY_DATA__TYPE, newType);
	}

} //PrivacyDataImpl
