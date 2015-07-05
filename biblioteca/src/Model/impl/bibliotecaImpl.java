/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.biblioteca;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>biblioteca</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.bibliotecaImpl#getIdbiblioteca <em>Idbiblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class bibliotecaImpl extends MinimalEObjectImpl.Container implements biblioteca {
	/**
	 * The default value of the '{@link #getIdbiblioteca() <em>Idbiblioteca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdbiblioteca()
	 * @generated
	 * @ordered
	 */
	protected static final int IDBIBLIOTECA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdbiblioteca() <em>Idbiblioteca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdbiblioteca()
	 * @generated
	 * @ordered
	 */
	protected int idbiblioteca = IDBIBLIOTECA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected bibliotecaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BIBLIOTECA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdbiblioteca() {
		return idbiblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdbiblioteca(int newIdbiblioteca) {
		int oldIdbiblioteca = idbiblioteca;
		idbiblioteca = newIdbiblioteca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIBLIOTECA__IDBIBLIOTECA, oldIdbiblioteca, idbiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrabiblioteca() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void excluibiblioteca() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BIBLIOTECA__IDBIBLIOTECA:
				return getIdbiblioteca();
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
			case ModelPackage.BIBLIOTECA__IDBIBLIOTECA:
				setIdbiblioteca((Integer)newValue);
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
			case ModelPackage.BIBLIOTECA__IDBIBLIOTECA:
				setIdbiblioteca(IDBIBLIOTECA_EDEFAULT);
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
			case ModelPackage.BIBLIOTECA__IDBIBLIOTECA:
				return idbiblioteca != IDBIBLIOTECA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.BIBLIOTECA___REGISTRABIBLIOTECA:
				registrabiblioteca();
				return null;
			case ModelPackage.BIBLIOTECA___EXCLUIBIBLIOTECA:
				excluibiblioteca();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (idbiblioteca: ");
		result.append(idbiblioteca);
		result.append(')');
		return result.toString();
	}

} //bibliotecaImpl
