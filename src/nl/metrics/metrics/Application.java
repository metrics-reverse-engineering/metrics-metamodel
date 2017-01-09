/**
 */
package nl.metrics.metrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.metrics.metrics.Application#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see nl.metrics.metrics.MetricsPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link nl.metrics.metrics.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see nl.metrics.metrics.MetricsPackage#getApplication_Class()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<nl.metrics.metrics.Class> getClass_();

} // Application
