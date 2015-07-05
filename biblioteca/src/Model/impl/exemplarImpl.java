/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.exemplar;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>exemplar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.exemplarImpl#getIdexemplar <em>Idexemplar</em>}</li>
 *   <li>{@link Model.impl.exemplarImpl#getIdpublicacao <em>Idpublicacao</em>}</li>
 *   <li>{@link Model.impl.exemplarImpl#isBloqueado <em>Bloqueado</em>}</li>
 *   <li>{@link Model.impl.exemplarImpl#getIdbiblioteca <em>Idbiblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class exemplarImpl extends MinimalEObjectImpl.Container implements exemplar {
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
	 * The default value of the '{@link #getIdpublicacao() <em>Idpublicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdpublicacao()
	 * @generated
	 * @ordered
	 */
	protected static final int IDPUBLICACAO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdpublicacao() <em>Idpublicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdpublicacao()
	 * @generated
	 * @ordered
	 */
	protected int idpublicacao = IDPUBLICACAO_EDEFAULT;

	/**
	 * The default value of the '{@link #isBloqueado() <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBloqueado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOQUEADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBloqueado() <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBloqueado()
	 * @generated
	 * @ordered
	 */
	protected boolean bloqueado = BLOQUEADO_EDEFAULT;

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
	protected exemplarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXEMPLAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__IDEXEMPLAR, oldIdexemplar, idexemplar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdpublicacao() {
		return idpublicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdpublicacao(int newIdpublicacao) {
		int oldIdpublicacao = idpublicacao;
		idpublicacao = newIdpublicacao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__IDPUBLICACAO, oldIdpublicacao, idpublicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBloqueado() {
		return bloqueado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloqueado(boolean newBloqueado) {
		boolean oldBloqueado = bloqueado;
		bloqueado = newBloqueado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__BLOQUEADO, oldBloqueado, bloqueado));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__IDBIBLIOTECA, oldIdbiblioteca, idbiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registraexemplar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void excluiexemplar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bloqueiaexemplar() {
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
			case ModelPackage.EXEMPLAR__IDEXEMPLAR:
				return getIdexemplar();
			case ModelPackage.EXEMPLAR__IDPUBLICACAO:
				return getIdpublicacao();
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				return isBloqueado();
			case ModelPackage.EXEMPLAR__IDBIBLIOTECA:
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
			case ModelPackage.EXEMPLAR__IDEXEMPLAR:
				setIdexemplar((Integer)newValue);
				return;
			case ModelPackage.EXEMPLAR__IDPUBLICACAO:
				setIdpublicacao((Integer)newValue);
				return;
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				setBloqueado((Boolean)newValue);
				return;
			case ModelPackage.EXEMPLAR__IDBIBLIOTECA:
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
			case ModelPackage.EXEMPLAR__IDEXEMPLAR:
				setIdexemplar(IDEXEMPLAR_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__IDPUBLICACAO:
				setIdpublicacao(IDPUBLICACAO_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				setBloqueado(BLOQUEADO_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__IDBIBLIOTECA:
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
			case ModelPackage.EXEMPLAR__IDEXEMPLAR:
				return idexemplar != IDEXEMPLAR_EDEFAULT;
			case ModelPackage.EXEMPLAR__IDPUBLICACAO:
				return idpublicacao != IDPUBLICACAO_EDEFAULT;
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				return bloqueado != BLOQUEADO_EDEFAULT;
			case ModelPackage.EXEMPLAR__IDBIBLIOTECA:
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
			case ModelPackage.EXEMPLAR___REGISTRAEXEMPLAR:
				registraexemplar();
				return null;
			case ModelPackage.EXEMPLAR___EXCLUIEXEMPLAR:
				excluiexemplar();
				return null;
			case ModelPackage.EXEMPLAR___BLOQUEIAEXEMPLAR:
				bloqueiaexemplar();
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
		result.append(" (idexemplar: ");
		result.append(idexemplar);
		result.append(", idpublicacao: ");
		result.append(idpublicacao);
		result.append(", bloqueado: ");
		result.append(bloqueado);
		result.append(", idbiblioteca: ");
		result.append(idbiblioteca);
		result.append(')');
		return result.toString();
	}

} //exemplarImpl
