/**
 */
package privacymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import privacymodel.PrivacymodelPackage;
import privacymodel.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.TimeIntervalImpl#getIntervals <em>Intervals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeIntervalImpl extends CDOObjectImpl implements TimeInterval {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.TIME_INTERVAL;
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
	public EList getIntervals() {
		return (EList)eGet(PrivacymodelPackage.Literals.TIME_INTERVAL__INTERVALS, true);
	}

} //TimeIntervalImpl
