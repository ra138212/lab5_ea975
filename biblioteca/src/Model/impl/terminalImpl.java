/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.terminal;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.terminalImpl#getIdterminal <em>Idterminal</em>}</li>
 *   <li>{@link Model.impl.terminalImpl#getIdfuncionario <em>Idfuncionario</em>}</li>
 *   <li>{@link Model.impl.terminalImpl#getHoralogin <em>Horalogin</em>}</li>
 *   <li>{@link Model.impl.terminalImpl#getIdbiblioteca <em>Idbiblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class terminalImpl extends MinimalEObjectImpl.Container implements terminal {
	/**
	 * The default value of the '{@link #getIdterminal() <em>Idterminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdterminal()
	 * @generated
	 * @ordered
	 */
	protected static final int IDTERMINAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdterminal() <em>Idterminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdterminal()
	 * @generated
	 * @ordered
	 */
	protected int idterminal = IDTERMINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdfuncionario() <em>Idfuncionario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdfuncionario()
	 * @generated
	 * @ordered
	 */
	protected static final int IDFUNCIONARIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdfuncionario() <em>Idfuncionario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdfuncionario()
	 * @generated
	 * @ordered
	 */
	protected int idfuncionario = IDFUNCIONARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoralogin() <em>Horalogin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoralogin()
	 * @generated
	 * @ordered
	 */
	protected static final Date HORALOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoralogin() <em>Horalogin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoralogin()
	 * @generated
	 * @ordered
	 */
	protected Date horalogin = HORALOGIN_EDEFAULT;

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
	protected terminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdterminal() {
		return idterminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdterminal(int newIdterminal) {
		int oldIdterminal = idterminal;
		idterminal = newIdterminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TERMINAL__IDTERMINAL, oldIdterminal, idterminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdfuncionario() {
		return idfuncionario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdfuncionario(int newIdfuncionario) {
		int oldIdfuncionario = idfuncionario;
		idfuncionario = newIdfuncionario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TERMINAL__IDFUNCIONARIO, oldIdfuncionario, idfuncionario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHoralogin() {
		return horalogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoralogin(Date newHoralogin) {
		Date oldHoralogin = horalogin;
		horalogin = newHoralogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TERMINAL__HORALOGIN, oldHoralogin, horalogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TERMINAL__IDBIBLIOTECA, oldIdbiblioteca, idbiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registraacesso() {
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
			case ModelPackage.TERMINAL__IDTERMINAL:
				return getIdterminal();
			case ModelPackage.TERMINAL__IDFUNCIONARIO:
				return getIdfuncionario();
			case ModelPackage.TERMINAL__HORALOGIN:
				return getHoralogin();
			case ModelPackage.TERMINAL__IDBIBLIOTECA:
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
			case ModelPackage.TERMINAL__IDTERMINAL:
				setIdterminal((Integer)newValue);
				return;
			case ModelPackage.TERMINAL__IDFUNCIONARIO:
				setIdfuncionario((Integer)newValue);
				return;
			case ModelPackage.TERMINAL__HORALOGIN:
				setHoralogin((Date)newValue);
				return;
			case ModelPackage.TERMINAL__IDBIBLIOTECA:
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
			case ModelPackage.TERMINAL__IDTERMINAL:
				setIdterminal(IDTERMINAL_EDEFAULT);
				return;
			case ModelPackage.TERMINAL__IDFUNCIONARIO:
				setIdfuncionario(IDFUNCIONARIO_EDEFAULT);
				return;
			case ModelPackage.TERMINAL__HORALOGIN:
				setHoralogin(HORALOGIN_EDEFAULT);
				return;
			case ModelPackage.TERMINAL__IDBIBLIOTECA:
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
			case ModelPackage.TERMINAL__IDTERMINAL:
				return idterminal != IDTERMINAL_EDEFAULT;
			case ModelPackage.TERMINAL__IDFUNCIONARIO:
				return idfuncionario != IDFUNCIONARIO_EDEFAULT;
			case ModelPackage.TERMINAL__HORALOGIN:
				return HORALOGIN_EDEFAULT == null ? horalogin != null : !HORALOGIN_EDEFAULT.equals(horalogin);
			case ModelPackage.TERMINAL__IDBIBLIOTECA:
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
			case ModelPackage.TERMINAL___REGISTRAACESSO:
				registraacesso();
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
		result.append(" (idterminal: ");
		result.append(idterminal);
		result.append(", idfuncionario: ");
		result.append(idfuncionario);
		result.append(", horalogin: ");
		result.append(horalogin);
		result.append(", idbiblioteca: ");
		result.append(idbiblioteca);
		result.append(')');
		return result.toString();
	}

} //terminalImpl
