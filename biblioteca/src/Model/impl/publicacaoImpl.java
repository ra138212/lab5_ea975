/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.publicacao;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>publicacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.publicacaoImpl#getIdpublicacao <em>Idpublicacao</em>}</li>
 *   <li>{@link Model.impl.publicacaoImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link Model.impl.publicacaoImpl#getAssunto <em>Assunto</em>}</li>
 *   <li>{@link Model.impl.publicacaoImpl#getIdbiblioteca <em>Idbiblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class publicacaoImpl extends MinimalEObjectImpl.Container implements publicacao {
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
	 * The default value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected String autor = AUTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssunto() <em>Assunto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssunto()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSUNTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssunto() <em>Assunto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssunto()
	 * @generated
	 * @ordered
	 */
	protected String assunto = ASSUNTO_EDEFAULT;

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
	protected publicacaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PUBLICACAO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__IDPUBLICACAO, oldIdpublicacao, idpublicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutor(String newAutor) {
		String oldAutor = autor;
		autor = newAutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__AUTOR, oldAutor, autor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssunto() {
		return assunto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssunto(String newAssunto) {
		String oldAssunto = assunto;
		assunto = newAssunto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__ASSUNTO, oldAssunto, assunto));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__IDBIBLIOTECA, oldIdbiblioteca, idbiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrapublicacao() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void excluipublicacao() {
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
			case ModelPackage.PUBLICACAO__IDPUBLICACAO:
				return getIdpublicacao();
			case ModelPackage.PUBLICACAO__AUTOR:
				return getAutor();
			case ModelPackage.PUBLICACAO__ASSUNTO:
				return getAssunto();
			case ModelPackage.PUBLICACAO__IDBIBLIOTECA:
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
			case ModelPackage.PUBLICACAO__IDPUBLICACAO:
				setIdpublicacao((Integer)newValue);
				return;
			case ModelPackage.PUBLICACAO__AUTOR:
				setAutor((String)newValue);
				return;
			case ModelPackage.PUBLICACAO__ASSUNTO:
				setAssunto((String)newValue);
				return;
			case ModelPackage.PUBLICACAO__IDBIBLIOTECA:
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
			case ModelPackage.PUBLICACAO__IDPUBLICACAO:
				setIdpublicacao(IDPUBLICACAO_EDEFAULT);
				return;
			case ModelPackage.PUBLICACAO__AUTOR:
				setAutor(AUTOR_EDEFAULT);
				return;
			case ModelPackage.PUBLICACAO__ASSUNTO:
				setAssunto(ASSUNTO_EDEFAULT);
				return;
			case ModelPackage.PUBLICACAO__IDBIBLIOTECA:
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
			case ModelPackage.PUBLICACAO__IDPUBLICACAO:
				return idpublicacao != IDPUBLICACAO_EDEFAULT;
			case ModelPackage.PUBLICACAO__AUTOR:
				return AUTOR_EDEFAULT == null ? autor != null : !AUTOR_EDEFAULT.equals(autor);
			case ModelPackage.PUBLICACAO__ASSUNTO:
				return ASSUNTO_EDEFAULT == null ? assunto != null : !ASSUNTO_EDEFAULT.equals(assunto);
			case ModelPackage.PUBLICACAO__IDBIBLIOTECA:
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
			case ModelPackage.PUBLICACAO___REGISTRAPUBLICACAO:
				registrapublicacao();
				return null;
			case ModelPackage.PUBLICACAO___EXCLUIPUBLICACAO:
				excluipublicacao();
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
		result.append(" (idpublicacao: ");
		result.append(idpublicacao);
		result.append(", autor: ");
		result.append(autor);
		result.append(", assunto: ");
		result.append(assunto);
		result.append(", idbiblioteca: ");
		result.append(idbiblioteca);
		result.append(')');
		return result.toString();
	}

} //publicacaoImpl
