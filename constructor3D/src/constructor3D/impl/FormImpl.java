/**
 */
package constructor3D.impl;

import constructor3D.Canvas;
import constructor3D.Constructor3DPackage;
import constructor3D.Face;
import constructor3D.Form;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link constructor3D.impl.FormImpl#getFace <em>Face</em>}</li>
 *   <li>{@link constructor3D.impl.FormImpl#getCanvas <em>Canvas</em>}</li>
 *   <li>{@link constructor3D.impl.FormImpl#getId <em>Id</em>}</li>
 *   <li>{@link constructor3D.impl.FormImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FormImpl extends MinimalEObjectImpl.Container implements Form {
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
			face = new EObjectContainmentWithInverseEList<Face>(Face.class, this, Constructor3DPackage.FORM__FACE, Constructor3DPackage.FACE__FORM);
		}
		return face;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canvas getCanvas() {
		if (eContainerFeatureID() != Constructor3DPackage.FORM__CANVAS) return null;
		return (Canvas)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanvas(Canvas newCanvas, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCanvas, Constructor3DPackage.FORM__CANVAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanvas(Canvas newCanvas) {
		if (newCanvas != eInternalContainer() || (eContainerFeatureID() != Constructor3DPackage.FORM__CANVAS && newCanvas != null)) {
			if (EcoreUtil.isAncestor(this, newCanvas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCanvas != null)
				msgs = ((InternalEObject)newCanvas).eInverseAdd(this, Constructor3DPackage.CANVAS__FORM, Canvas.class, msgs);
			msgs = basicSetCanvas(newCanvas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Constructor3DPackage.FORM__CANVAS, newCanvas, newCanvas));
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Constructor3DPackage.FORM__FACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFace()).basicAdd(otherEnd, msgs);
			case Constructor3DPackage.FORM__CANVAS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCanvas((Canvas)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Constructor3DPackage.FORM__FACE:
				return ((InternalEList<?>)getFace()).basicRemove(otherEnd, msgs);
			case Constructor3DPackage.FORM__CANVAS:
				return basicSetCanvas(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Constructor3DPackage.FORM__CANVAS:
				return eInternalContainer().eInverseRemove(this, Constructor3DPackage.CANVAS__FORM, Canvas.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Constructor3DPackage.FORM__FACE:
				return getFace();
			case Constructor3DPackage.FORM__CANVAS:
				return getCanvas();
			case Constructor3DPackage.FORM__ID:
				return getId();
			case Constructor3DPackage.FORM__NAME:
				return getName();
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
			case Constructor3DPackage.FORM__FACE:
				getFace().clear();
				getFace().addAll((Collection<? extends Face>)newValue);
				return;
			case Constructor3DPackage.FORM__CANVAS:
				setCanvas((Canvas)newValue);
				return;
			case Constructor3DPackage.FORM__ID:
				setId((Integer)newValue);
				return;
			case Constructor3DPackage.FORM__NAME:
				setName((String)newValue);
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
			case Constructor3DPackage.FORM__FACE:
				getFace().clear();
				return;
			case Constructor3DPackage.FORM__CANVAS:
				setCanvas((Canvas)null);
				return;
			case Constructor3DPackage.FORM__ID:
				setId(ID_EDEFAULT);
				return;
			case Constructor3DPackage.FORM__NAME:
				setName(NAME_EDEFAULT);
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
			case Constructor3DPackage.FORM__FACE:
				return face != null && !face.isEmpty();
			case Constructor3DPackage.FORM__CANVAS:
				return getCanvas() != null;
			case Constructor3DPackage.FORM__ID:
				return id != ID_EDEFAULT;
			case Constructor3DPackage.FORM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
