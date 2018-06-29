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
 *   <li>{@link constructor3D.Form#getId <em>Id</em>}</li>
 *   <li>{@link constructor3D.Form#getName <em>Name</em>}</li>
 *   <li>{@link constructor3D.Form#getVertex <em>Vertex</em>}</li>
 *   <li>{@link constructor3D.Form#getFace <em>Face</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face</em>' containment reference list.
	 * @see constructor3D.Constructor3DPackage#getForm_Face()
	 * @model containment="true"
	 * @generated
	 */
	EList<Face> getFace();

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
	 * @model
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

	/**
	 * Returns the value of the '<em><b>Vertex</b></em>' containment reference list.
	 * The list contents are of type {@link constructor3D.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex</em>' containment reference list.
	 * @see constructor3D.Constructor3DPackage#getForm_Vertex()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vertex> getVertex();

} // Form
