/**
 */
package privacymodel.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import privacymodel.PrivacymodelPackage;
import privacymodel.TimePreposition;
import privacymodel.TimeStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link privacymodel.impl.TimeStatementImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link privacymodel.impl.TimeStatementImpl#getPreposition <em>Preposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeStatementImpl extends CDOObjectImpl implements TimeStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrivacymodelPackage.Literals.TIME_STATEMENT;
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
	public Date getDateTime() {
		return (Date)eGet(PrivacymodelPackage.Literals.TIME_STATEMENT__DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		eSet(PrivacymodelPackage.Literals.TIME_STATEMENT__DATE_TIME, newDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePreposition getPreposition() {
		return (TimePreposition)eGet(PrivacymodelPackage.Literals.TIME_STATEMENT__PREPOSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreposition(TimePreposition newPreposition) {
		eSet(PrivacymodelPackage.Literals.TIME_STATEMENT__PREPOSITION, newPreposition);
	}

} //TimeStatementImpl
