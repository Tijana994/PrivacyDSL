/**
 */
package privacymodel;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link privacymodel.ConfigurationManager#getProtectionControlsMethods <em>Protection Controls Methods</em>}</li>
 *   <li>{@link privacymodel.ConfigurationManager#getDefinedDataSources <em>Defined Data Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see privacymodel.PrivacymodelPackage#getConfigurationManager()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ConfigurationManager extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Protection Controls Methods</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.ProtectionControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Controls Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Controls Methods</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getConfigurationManager_ProtectionControlsMethods()
	 * @model type="privacymodel.ProtectionControl" containment="true"
	 * @generated
	 */
	EList getProtectionControlsMethods();

	/**
	 * Returns the value of the '<em><b>Defined Data Sources</b></em>' containment reference list.
	 * The list contents are of type {@link privacymodel.DataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Data Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Data Sources</em>' containment reference list.
	 * @see privacymodel.PrivacymodelPackage#getConfigurationManager_DefinedDataSources()
	 * @model type="privacymodel.DataSource" containment="true"
	 * @generated
	 */
	EList getDefinedDataSources();

} // ConfigurationManager
