/**
 */
package constructor3D;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Face</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link constructor3D.Face#getId <em>Id</em>}</li>
 *   <li>{@link constructor3D.Face#getVertexList <em>Vertex List</em>}</li>
 * </ul>
 *
 * @see constructor3D.Constructor3DPackage#getFace()
 * @model
 * @generated
 */
public interface Face extends EObject {
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
	 * @see constructor3D.Constructor3DPackage#getFace_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link constructor3D.Face#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Vertex List</b></em>' reference list.
	 * The list contents are of type {@link constructor3D.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex List</em>' reference list.
	 * @see constructor3D.Constructor3DPackage#getFace_VertexList()
	 * @model upper="3"
	 * @generated
	 */
	EList<Vertex> getVertexList();

} // Face
