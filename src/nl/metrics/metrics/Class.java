/**
 */
package nl.metrics.metrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.metrics.metrics.Class#getName <em>Name</em>}</li>
 *   <li>{@link nl.metrics.metrics.Class#getMethod <em>Method</em>}</li>
 *   <li>{@link nl.metrics.metrics.Class#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link nl.metrics.metrics.Class#getOperand <em>Operand</em>}</li>
 *   <li>{@link nl.metrics.metrics.Class#getLOC <em>LOC</em>}</li>
 * </ul>
 *
 * @see nl.metrics.metrics.MetricsPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nl.metrics.metrics.MetricsPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nl.metrics.metrics.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link nl.metrics.metrics.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see nl.metrics.metrics.MetricsPackage#getClass_Method()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethod();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link nl.metrics.metrics.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see nl.metrics.metrics.MetricsPackage#getClass_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link nl.metrics.metrics.Operand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see nl.metrics.metrics.MetricsPackage#getClass_Operand()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operand> getOperand();

	/**
	 * Returns the value of the '<em><b>LOC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOC</em>' attribute.
	 * @see #setLOC(int)
	 * @see nl.metrics.metrics.MetricsPackage#getClass_LOC()
	 * @model
	 * @generated
	 */
	int getLOC();

	/**
	 * Sets the value of the '{@link nl.metrics.metrics.Class#getLOC <em>LOC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LOC</em>' attribute.
	 * @see #getLOC()
	 * @generated
	 */
	void setLOC(int value);

} // Class
