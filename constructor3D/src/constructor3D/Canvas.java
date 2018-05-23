/**
 */
package constructor3D;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link constructor3D.Canvas#getForm <em>Form</em>}</li>
 *   <li>{@link constructor3D.Canvas#getId <em>Id</em>}</li>
 *   <li>{@link constructor3D.Canvas#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see constructor3D.Constructor3DPackage#getCanvas()
 * @model
 * @generated
 */
public interface Canvas extends EObject {
	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference list.
	 * The list contents are of type {@link constructor3D.Form}.
	 * It is bidirectional and its opposite is '{@link constructor3D.Form#getCanvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference list.
	 * @see constructor3D.Constructor3DPackage#getCanvas_Form()
	 * @see constructor3D.Form#getCanvas
	 * @model opposite="canvas" containment="true"
	 * @generated
	 */
	EList<Form> getForm();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see constructor3D.Constructor3DPackage#getCanvas_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link constructor3D.Canvas#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see constructor3D.Constructor3DPackage#getCanvas_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link constructor3D.Canvas#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Canvas
