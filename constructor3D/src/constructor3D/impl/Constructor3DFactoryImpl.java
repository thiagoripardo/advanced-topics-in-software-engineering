/**
 */
package constructor3D.impl;

import constructor3D.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Constructor3DFactoryImpl extends EFactoryImpl implements Constructor3DFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Constructor3DFactory init() {
		try {
			Constructor3DFactory theConstructor3DFactory = (Constructor3DFactory)EPackage.Registry.INSTANCE.getEFactory(Constructor3DPackage.eNS_URI);
			if (theConstructor3DFactory != null) {
				return theConstructor3DFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Constructor3DFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor3DFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Constructor3DPackage.CANVAS: return createCanvas();
			case Constructor3DPackage.FACE: return createFace();
			case Constructor3DPackage.VERTEX: return createVertex();
			case Constructor3DPackage.CUBE: return createCube();
			case Constructor3DPackage.TREE: return createTree();
			case Constructor3DPackage.HOUSE: return createHouse();
			case Constructor3DPackage.GRID: return createGrid();
			case Constructor3DPackage.COLUMN: return createColumn();
			case Constructor3DPackage.WORLD: return createWorld();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canvas createCanvas() {
		CanvasImpl canvas = new CanvasImpl();
		return canvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Face createFace() {
		FaceImpl face = new FaceImpl();
		return face;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex createVertex() {
		VertexImpl vertex = new VertexImpl();
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cube createCube() {
		CubeImpl cube = new CubeImpl();
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid createGrid() {
		GridImpl grid = new GridImpl();
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public World createWorld() {
		WorldImpl world = new WorldImpl();
		return world;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor3DPackage getConstructor3DPackage() {
		return (Constructor3DPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Constructor3DPackage getPackage() {
		return Constructor3DPackage.eINSTANCE;
	}

} //Constructor3DFactoryImpl
