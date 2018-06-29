/**
 */
package constructor3D.impl;

import constructor3D.Constructor3DPackage;
import constructor3D.Face;
import constructor3D.Form;

import constructor3D.Vertex;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link constructor3D.impl.FormImpl#getId <em>Id</em>}</li>
 *   <li>{@link constructor3D.impl.FormImpl#getName <em>Name</em>}</li>
 *   <li>{@link constructor3D.impl.FormImpl#getVertex <em>Vertex</em>}</li>
 *   <li>{@link constructor3D.impl.FormImpl#getFace <em>Face</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FormImpl extends MinimalEObjectImpl.Container implements Form {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVertex() <em>Vertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertex()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> vertex;

	/**
	 * The cached value of the '{@link #getFace() <em>Face</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFace()
	 * @generated
	 * @ordered
	 */
	protected EList<Face> face;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Constructor3DPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Face> getFace() {
		if (face == null) {
			face = new EObjectContainmentEList<Face>(Face.class, this, Constructor3DPackage.FORM__FACE);
		}
		return face;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Constructor3DPackage.FORM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Constructor3DPackage.FORM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getVertex() {
		if (vertex == null) {
			vertex = new EObjectContainmentEList<Vertex>(Vertex.class, this, Constructor3DPackage.FORM__VERTEX);
		}
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Constructor3DPackage.FORM__VERTEX:
				return ((InternalEList<?>)getVertex()).basicRemove(otherEnd, msgs);
			case Constructor3DPackage.FORM__FACE:
				return ((InternalEList<?>)getFace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Constructor3DPackage.FORM__ID:
				return getId();
			case Constructor3DPackage.FORM__NAME:
				return getName();
			case Constructor3DPackage.FORM__VERTEX:
				return getVertex();
			case Constructor3DPackage.FORM__FACE:
				return getFace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Constructor3DPackage.FORM__ID:
				setId((Integer)newValue);
				return;
			case Constructor3DPackage.FORM__NAME:
				setName((String)newValue);
				return;
			case Constructor3DPackage.FORM__VERTEX:
				getVertex().clear();
				getVertex().addAll((Collection<? extends Vertex>)newValue);
				return;
			case Constructor3DPackage.FORM__FACE:
				getFace().clear();
				getFace().addAll((Collection<? extends Face>)newValue);
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
			case Constructor3DPackage.FORM__ID:
				setId(ID_EDEFAULT);
				return;
			case Constructor3DPackage.FORM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Constructor3DPackage.FORM__VERTEX:
				getVertex().clear();
				return;
			case Constructor3DPackage.FORM__FACE:
				getFace().clear();
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
			case Constructor3DPackage.FORM__ID:
				return id != ID_EDEFAULT;
			case Constructor3DPackage.FORM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Constructor3DPackage.FORM__VERTEX:
				return vertex != null && !vertex.isEmpty();
			case Constructor3DPackage.FORM__FACE:
				return face != null && !face.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FormImpl
