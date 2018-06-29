/**
 */
package constructor3D;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see constructor3D.Constructor3DFactory
 * @model kind="package"
 * @generated
 */
public interface Constructor3DPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constructor3D";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/constructor3D";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "constructor3D";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Constructor3DPackage eINSTANCE = constructor3D.impl.Constructor3DPackageImpl.init();

	/**
	 * The meta object id for the '{@link constructor3D.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constructor3D.impl.CanvasImpl
	 * @see constructor3D.impl.Constructor3DPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__NAME = 1;

	/**
	 * The feature id for the '<em><b>World</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__WORLD = 2;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link constructor3D.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constructor3D.impl.FormImpl
	 * @see constructor3D.impl.Constructor3DPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VERTEX = 2;

	/**
	 * The feature id for the '<em><b>Face</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__FACE = 3;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link constructor3D.impl.FaceImpl <em>Face</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constructor3D.impl.FaceImpl
	 * @see constructor3D.impl.Constructor3DPackageImpl#getFace()
	 * @generated
	 */
	int FACE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__ID = 0;

	/**
	 * The feature id for the '<em><b>Vertex List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__VERTEX_LIST = 1;

	/**
	 * The number of structural features of the '<em>Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link constructor3D.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constructor3D.impl.VertexImpl
	 * @see constructor3D.impl.Constructor3DPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 3;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__POS_X = 0;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__POS_Y = 1;

	/**
	 * The feature id for the '<em><b>Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__POS_Z = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ID = 3;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link constructor3D.impl.CubeImpl <em>Cube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constructor3D.impl.CubeImpl
	 * @see constructor3D.impl.Constructor3DPackageImpl#getCube()
	 * @generated
	 */
	int CUBE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__ID = FORM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__NAME = FORM__NAME;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__VERTEX = FORM__VERTEX;

	/**
	 * The feature id for the '<em><b>Face</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__FACE = FORM__FACE;

	/**
	 * The number of structural features of the '<em>Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_FEATURE_COUNT = FORM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_OPERATION_COUNT = FORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link constructor3D.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constructor3D.impl.TreeImpl
	 * @see constructor3D.impl.Constructor3DPackageImpl#getTree()
	 * @generated
	 */
	int TREE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ID = FORM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__NAME = FORM__NAME;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__VERTEX = FORM__VERTEX;

	/**
	 * The feature id for the '<em><b>Face</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__FACE = FORM__FACE;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = FORM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_OPERATION_COUNT = FORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link constructor3D.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constructor3D.impl.HouseImpl
	 * @see constructor3D.impl.Constructor3DPackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ID = FORM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__NAME = FORM__NAME;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__VERTEX = FORM__VERTEX;

	/**
	 * The feature id for the '<em><b>Face</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__FACE = FORM__FACE;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = FORM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_OPERATION_COUNT = FORM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link constructor3D.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constructor3D.impl.GridImpl
	 * @see constructor3D.impl.Constructor3DPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ID = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link constructor3D.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constructor3D.impl.ColumnImpl
	 * @see constructor3D.impl.Constructor3DPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ID = 0;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FORM = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link constructor3D.impl.WorldImpl <em>World</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constructor3D.impl.WorldImpl
	 * @see constructor3D.impl.Constructor3DPackageImpl#getWorld()
	 * @generated
	 */
	int WORLD = 9;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__GRID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__ID = 1;

	/**
	 * The number of structural features of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link constructor3D.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see constructor3D.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.Canvas#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see constructor3D.Canvas#getId()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_Id();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.Canvas#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see constructor3D.Canvas#getName()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_Name();

	/**
	 * Returns the meta object for the containment reference '{@link constructor3D.Canvas#getWorld <em>World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>World</em>'.
	 * @see constructor3D.Canvas#getWorld()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_World();

	/**
	 * Returns the meta object for class '{@link constructor3D.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see constructor3D.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link constructor3D.Form#getFace <em>Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Face</em>'.
	 * @see constructor3D.Form#getFace()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Face();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.Form#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see constructor3D.Form#getId()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Id();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.Form#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see constructor3D.Form#getName()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link constructor3D.Form#getVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertex</em>'.
	 * @see constructor3D.Form#getVertex()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Vertex();

	/**
	 * Returns the meta object for class '{@link constructor3D.Face <em>Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Face</em>'.
	 * @see constructor3D.Face
	 * @generated
	 */
	EClass getFace();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.Face#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see constructor3D.Face#getId()
	 * @see #getFace()
	 * @generated
	 */
	EAttribute getFace_Id();

	/**
	 * Returns the meta object for the reference list '{@link constructor3D.Face#getVertexList <em>Vertex List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vertex List</em>'.
	 * @see constructor3D.Face#getVertexList()
	 * @see #getFace()
	 * @generated
	 */
	EReference getFace_VertexList();

	/**
	 * Returns the meta object for class '{@link constructor3D.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see constructor3D.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.Vertex#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see constructor3D.Vertex#getPosX()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_PosX();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.Vertex#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see constructor3D.Vertex#getPosY()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_PosY();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.Vertex#getPosZ <em>Pos Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Z</em>'.
	 * @see constructor3D.Vertex#getPosZ()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_PosZ();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.Vertex#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see constructor3D.Vertex#getId()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Id();

	/**
	 * Returns the meta object for class '{@link constructor3D.Cube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube</em>'.
	 * @see constructor3D.Cube
	 * @generated
	 */
	EClass getCube();

	/**
	 * Returns the meta object for class '{@link constructor3D.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see constructor3D.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for class '{@link constructor3D.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see constructor3D.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for class '{@link constructor3D.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see constructor3D.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.Grid#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see constructor3D.Grid#getId()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link constructor3D.Grid#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see constructor3D.Grid#getColumn()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Column();

	/**
	 * Returns the meta object for class '{@link constructor3D.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see constructor3D.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.Column#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see constructor3D.Column#getId()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Id();

	/**
	 * Returns the meta object for the containment reference '{@link constructor3D.Column#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form</em>'.
	 * @see constructor3D.Column#getForm()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Form();

	/**
	 * Returns the meta object for class '{@link constructor3D.World <em>World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World</em>'.
	 * @see constructor3D.World
	 * @generated
	 */
	EClass getWorld();

	/**
	 * Returns the meta object for the containment reference list '{@link constructor3D.World#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grid</em>'.
	 * @see constructor3D.World#getGrid()
	 * @see #getWorld()
	 * @generated
	 */
	EReference getWorld_Grid();

	/**
	 * Returns the meta object for the attribute '{@link constructor3D.World#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see constructor3D.World#getId()
	 * @see #getWorld()
	 * @generated
	 */
	EAttribute getWorld_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Constructor3DFactory getConstructor3DFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link constructor3D.impl.CanvasImpl <em>Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constructor3D.impl.CanvasImpl
		 * @see constructor3D.impl.Constructor3DPackageImpl#getCanvas()
		 * @generated
		 */
		EClass CANVAS = eINSTANCE.getCanvas();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS__ID = eINSTANCE.getCanvas_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS__NAME = eINSTANCE.getCanvas_Name();

		/**
		 * The meta object literal for the '<em><b>World</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS__WORLD = eINSTANCE.getCanvas_World();

		/**
		 * The meta object literal for the '{@link constructor3D.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constructor3D.impl.FormImpl
		 * @see constructor3D.impl.Constructor3DPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Face</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__FACE = eINSTANCE.getForm_Face();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__ID = eINSTANCE.getForm_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NAME = eINSTANCE.getForm_Name();

		/**
		 * The meta object literal for the '<em><b>Vertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__VERTEX = eINSTANCE.getForm_Vertex();

		/**
		 * The meta object literal for the '{@link constructor3D.impl.FaceImpl <em>Face</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constructor3D.impl.FaceImpl
		 * @see constructor3D.impl.Constructor3DPackageImpl#getFace()
		 * @generated
		 */
		EClass FACE = eINSTANCE.getFace();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACE__ID = eINSTANCE.getFace_Id();

		/**
		 * The meta object literal for the '<em><b>Vertex List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACE__VERTEX_LIST = eINSTANCE.getFace_VertexList();

		/**
		 * The meta object literal for the '{@link constructor3D.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constructor3D.impl.VertexImpl
		 * @see constructor3D.impl.Constructor3DPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__POS_X = eINSTANCE.getVertex_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__POS_Y = eINSTANCE.getVertex_PosY();

		/**
		 * The meta object literal for the '<em><b>Pos Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__POS_Z = eINSTANCE.getVertex_PosZ();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__ID = eINSTANCE.getVertex_Id();

		/**
		 * The meta object literal for the '{@link constructor3D.impl.CubeImpl <em>Cube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constructor3D.impl.CubeImpl
		 * @see constructor3D.impl.Constructor3DPackageImpl#getCube()
		 * @generated
		 */
		EClass CUBE = eINSTANCE.getCube();

		/**
		 * The meta object literal for the '{@link constructor3D.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constructor3D.impl.TreeImpl
		 * @see constructor3D.impl.Constructor3DPackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();

		/**
		 * The meta object literal for the '{@link constructor3D.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constructor3D.impl.HouseImpl
		 * @see constructor3D.impl.Constructor3DPackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '{@link constructor3D.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constructor3D.impl.GridImpl
		 * @see constructor3D.impl.Constructor3DPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__ID = eINSTANCE.getGrid_Id();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__COLUMN = eINSTANCE.getGrid_Column();

		/**
		 * The meta object literal for the '{@link constructor3D.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constructor3D.impl.ColumnImpl
		 * @see constructor3D.impl.Constructor3DPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__ID = eINSTANCE.getColumn_Id();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__FORM = eINSTANCE.getColumn_Form();

		/**
		 * The meta object literal for the '{@link constructor3D.impl.WorldImpl <em>World</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constructor3D.impl.WorldImpl
		 * @see constructor3D.impl.Constructor3DPackageImpl#getWorld()
		 * @generated
		 */
		EClass WORLD = eINSTANCE.getWorld();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD__GRID = eINSTANCE.getWorld_Grid();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD__ID = eINSTANCE.getWorld_Id();

	}

} //Constructor3DPackage
