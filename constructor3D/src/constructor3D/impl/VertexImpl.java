/**
 */
package constructor3D.impl;

import constructor3D.Constructor3DPackage;
import constructor3D.Vertex;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link constructor3D.impl.VertexImpl#getPosX <em>Pos X</em>}</li>
 *   <li>{@link constructor3D.impl.VertexImpl#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link constructor3D.impl.VertexImpl#getPosZ <em>Pos Z</em>}</li>
 *   <li>{@link constructor3D.impl.VertexImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VertexImpl extends MinimalEObjectImpl.Container implements Vertex {
	/**
	 * The default value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected static final float POS_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected float posX = POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected static final float POS_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected float posY = POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosZ() <em>Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosZ()
	 * @generated
	 * @ordered
	 */
	protected static final float POS_Z_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPosZ() <em>Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosZ()
	 * @generated
	 * @ordered
	 */
	protected float posZ = POS_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Constructor3DPackage.Literals.VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPosX() {
		return posX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosX(float newPosX) {
		float oldPosX = posX;
		posX = newPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Constructor3DPackage.VERTEX__POS_X, oldPosX, posX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPosY() {
		return posY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosY(float newPosY) {
		float oldPosY = posY;
		posY = newPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Constructor3DPackage.VERTEX__POS_Y, oldPosY, posY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPosZ() {
		return posZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosZ(float newPosZ) {
		float oldPosZ = posZ;
		posZ = newPosZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Constructor3DPackage.VERTEX__POS_Z, oldPosZ, posZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Constructor3DPackage.VERTEX__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Constructor3DPackage.VERTEX__POS_X:
				return getPosX();
			case Constructor3DPackage.VERTEX__POS_Y:
				return getPosY();
			case Constructor3DPackage.VERTEX__POS_Z:
				return getPosZ();
			case Constructor3DPackage.VERTEX__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Constructor3DPackage.VERTEX__POS_X:
				setPosX((Float)newValue);
				return;
			case Constructor3DPackage.VERTEX__POS_Y:
				setPosY((Float)newValue);
				return;
			case Constructor3DPackage.VERTEX__POS_Z:
				setPosZ((Float)newValue);
				return;
			case Constructor3DPackage.VERTEX__ID:
				setId((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Constructor3DPackage.VERTEX__POS_X:
				setPosX(POS_X_EDEFAULT);
				return;
			case Constructor3DPackage.VERTEX__POS_Y:
				setPosY(POS_Y_EDEFAULT);
				return;
			case Constructor3DPackage.VERTEX__POS_Z:
				setPosZ(POS_Z_EDEFAULT);
				return;
			case Constructor3DPackage.VERTEX__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Constructor3DPackage.VERTEX__POS_X:
				return posX != POS_X_EDEFAULT;
			case Constructor3DPackage.VERTEX__POS_Y:
				return posY != POS_Y_EDEFAULT;
			case Constructor3DPackage.VERTEX__POS_Z:
				return posZ != POS_Z_EDEFAULT;
			case Constructor3DPackage.VERTEX__ID:
				return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (posX: ");
		result.append(posX);
		result.append(", posY: ");
		result.append(posY);
		result.append(", posZ: ");
		result.append(posZ);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //VertexImpl
