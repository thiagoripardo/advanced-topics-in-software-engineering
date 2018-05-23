/**
 */
package constructor3D;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link constructor3D.Form#getFace <em>Face</em>}</li>
 *   <li>{@link constructor3D.Form#getCanvas <em>Canvas</em>}</li>
 *   <li>{@link constructor3D.Form#getId <em>Id</em>}</li>
 *   <li>{@link constructor3D.Form#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see constructor3D.Constructor3DPackage#getForm()
 * @model abstract="true"
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Face</b></em>' containment reference list.
	 * The list contents are of type {@link constructor3D.Face}.
	 * It is bidirectional and its opposite is '{@link constructor3D.Face#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face</em>' containment reference list.
	 * @see constructor3D.Constructor3DPackage#getForm_Face()
	 * @see constructor3D.Face#getForm
	 * @model opposite="form" containment="true"
	 * @generated
	 */
	EList<Face> getFace();

	/**
	 * Returns the value of the '<em><b>Canvas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link constructor3D.Canvas#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canvas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canvas</em>' container reference.
	 * @see #setCanvas(Canvas)
	 * @see constructor3D.Constructor3DPackage#getForm_Canvas()
	 * @see constructor3D.Canvas#getForm
	 * @model opposite="form" required="true" transient="false"
	 * @generated
	 */
	Canvas getCanvas();

	/**
	 * Sets the value of the '{@link constructor3D.Form#getCanvas <em>Canvas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canvas</em>' container reference.
	 * @see #getCanvas()
	 * @generated
	 */
	void setCanvas(Canvas value);

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
	 * @see constructor3D.Constructor3DPackage#getForm_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link constructor3D.Form#getId <em>Id</em>}' attribute.
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
	 * @see constructor3D.Constructor3DPackage#getForm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link constructor3D.Form#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Form
