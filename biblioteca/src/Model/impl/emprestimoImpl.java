/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.emprestimo;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>emprestimo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.emprestimoImpl#getIdemprestimo <em>Idemprestimo</em>}</li>
 *   <li>{@link Model.impl.emprestimoImpl#getIdexemplar <em>Idexemplar</em>}</li>
 *   <li>{@link Model.impl.emprestimoImpl#getRegistrousuario <em>Registrousuario</em>}</li>
 *   <li>{@link Model.impl.emprestimoImpl#getDatadevolucao <em>Datadevolucao</em>}</li>
 *   <li>{@link Model.impl.emprestimoImpl#getIdbiblioteca <em>Idbiblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class emprestimoImpl extends MinimalEObjectImpl.Container implements emprestimo {
	/**
	 * The default value of the '{@link #getIdemprestimo() <em>Idemprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdemprestimo()
	 * @generated
	 * @ordered
	 */
	protected static final int IDEMPRESTIMO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdemprestimo() <em>Idemprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdemprestimo()
	 * @generated
	 * @ordered
	 */
	protected int idemprestimo = IDEMPRESTIMO_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdexemplar() <em>Idexemplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdexemplar()
	 * @generated
	 * @ordered
	 */
	protected static final int IDEXEMPLAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdexemplar() <em>Idexemplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdexemplar()
	 * @generated
	 * @ordered
	 */
	protected int idexemplar = IDEXEMPLAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistrousuario() <em>Registrousuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrousuario()
	 * @generated
	 * @ordered
	 */
	protected static final int REGISTROUSUARIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistrousuario() <em>Registrousuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrousuario()
	 * @generated
	 * @ordered
	 */
	protected int registrousuario = REGISTROUSUARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatadevolucao() <em>Datadevolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatadevolucao()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATADEVOLUCAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatadevolucao() <em>Datadevolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatadevolucao()
	 * @generated
	 * @ordered
	 */
	protected Date datadevolucao = DATADEVOLUCAO_EDEFAULT;

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
	protected emprestimoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EMPRESTIMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdemprestimo() {
		return idemprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdemprestimo(int newIdemprestimo) {
		int oldIdemprestimo = idemprestimo;
		idemprestimo = newIdemprestimo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__IDEMPRESTIMO, oldIdemprestimo, idemprestimo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdexemplar() {
		return idexemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdexemplar(int newIdexemplar) {
		int oldIdexemplar = idexemplar;
		idexemplar = newIdexemplar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__IDEXEMPLAR, oldIdexemplar, idexemplar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegistrousuario() {
		return registrousuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrousuario(int newRegistrousuario) {
		int oldRegistrousuario = registrousuario;
		registrousuario = newRegistrousuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__REGISTROUSUARIO, oldRegistrousuario, registrousuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatadevolucao() {
		return datadevolucao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatadevolucao(Date newDatadevolucao) {
		Date oldDatadevolucao = datadevolucao;
		datadevolucao = newDatadevolucao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__DATADEVOLUCAO, oldDatadevolucao, datadevolucao));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__IDBIBLIOTECA, oldIdbiblioteca, idbiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void realizaemprestimo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void realizadevolucao() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculamulta() {
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
			case ModelPackage.EMPRESTIMO__IDEMPRESTIMO:
				return getIdemprestimo();
			case ModelPackage.EMPRESTIMO__IDEXEMPLAR:
				return getIdexemplar();
			case ModelPackage.EMPRESTIMO__REGISTROUSUARIO:
				return getRegistrousuario();
			case ModelPackage.EMPRESTIMO__DATADEVOLUCAO:
				return getDatadevolucao();
			case ModelPackage.EMPRESTIMO__IDBIBLIOTECA:
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
			case ModelPackage.EMPRESTIMO__IDEMPRESTIMO:
				setIdemprestimo((Integer)newValue);
				return;
			case ModelPackage.EMPRESTIMO__IDEXEMPLAR:
				setIdexemplar((Integer)newValue);
				return;
			case ModelPackage.EMPRESTIMO__REGISTROUSUARIO:
				setRegistrousuario((Integer)newValue);
				return;
			case ModelPackage.EMPRESTIMO__DATADEVOLUCAO:
				setDatadevolucao((Date)newValue);
				return;
			case ModelPackage.EMPRESTIMO__IDBIBLIOTECA:
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
			case ModelPackage.EMPRESTIMO__IDEMPRESTIMO:
				setIdemprestimo(IDEMPRESTIMO_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__IDEXEMPLAR:
				setIdexemplar(IDEXEMPLAR_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__REGISTROUSUARIO:
				setRegistrousuario(REGISTROUSUARIO_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__DATADEVOLUCAO:
				setDatadevolucao(DATADEVOLUCAO_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__IDBIBLIOTECA:
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
			case ModelPackage.EMPRESTIMO__IDEMPRESTIMO:
				return idemprestimo != IDEMPRESTIMO_EDEFAULT;
			case ModelPackage.EMPRESTIMO__IDEXEMPLAR:
				return idexemplar != IDEXEMPLAR_EDEFAULT;
			case ModelPackage.EMPRESTIMO__REGISTROUSUARIO:
				return registrousuario != REGISTROUSUARIO_EDEFAULT;
			case ModelPackage.EMPRESTIMO__DATADEVOLUCAO:
				return DATADEVOLUCAO_EDEFAULT == null ? datadevolucao != null : !DATADEVOLUCAO_EDEFAULT.equals(datadevolucao);
			case ModelPackage.EMPRESTIMO__IDBIBLIOTECA:
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
			case ModelPackage.EMPRESTIMO___REALIZAEMPRESTIMO:
				realizaemprestimo();
				return null;
			case ModelPackage.EMPRESTIMO___REALIZADEVOLUCAO:
				realizadevolucao();
				return null;
			case ModelPackage.EMPRESTIMO___CALCULAMULTA:
				calculamulta();
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
		result.append(" (idemprestimo: ");
		result.append(idemprestimo);
		result.append(", idexemplar: ");
		result.append(idexemplar);
		result.append(", registrousuario: ");
		result.append(registrousuario);
		result.append(", datadevolucao: ");
		result.append(datadevolucao);
		result.append(", idbiblioteca: ");
		result.append(idbiblioteca);
		result.append(')');
		return result.toString();
	}

} //emprestimoImpl
