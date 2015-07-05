/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.usuario;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.usuarioImpl#getRegistro <em>Registro</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getSobrenome <em>Sobrenome</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getPronome <em>Pronome</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getDatanascimento <em>Datanascimento</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getCpf <em>Cpf</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getFone <em>Fone</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getEndereco <em>Endereco</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getCep <em>Cep</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getCidade <em>Cidade</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link Model.impl.usuarioImpl#getPais <em>Pais</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class usuarioImpl extends MinimalEObjectImpl.Container implements usuario {
	/**
	 * The default value of the '{@link #getRegistro() <em>Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistro()
	 * @generated
	 * @ordered
	 */
	protected static final int REGISTRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistro() <em>Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistro()
	 * @generated
	 * @ordered
	 */
	protected int registro = REGISTRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSobrenome() <em>Sobrenome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSobrenome()
	 * @generated
	 * @ordered
	 */
	protected static final String SOBRENOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSobrenome() <em>Sobrenome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSobrenome()
	 * @generated
	 * @ordered
	 */
	protected String sobrenome = SOBRENOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPronome() <em>Pronome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPronome()
	 * @generated
	 * @ordered
	 */
	protected static final String PRONOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPronome() <em>Pronome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPronome()
	 * @generated
	 * @ordered
	 */
	protected String pronome = PRONOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatanascimento() <em>Datanascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatanascimento()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATANASCIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatanascimento() <em>Datanascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatanascimento()
	 * @generated
	 * @ordered
	 */
	protected Date datanascimento = DATANASCIMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected static final String CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected String cpf = CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getFone() <em>Fone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFone()
	 * @generated
	 * @ordered
	 */
	protected static final String FONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFone() <em>Fone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFone()
	 * @generated
	 * @ordered
	 */
	protected String fone = FONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndereco() <em>Endereco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDERECO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndereco() <em>Endereco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco()
	 * @generated
	 * @ordered
	 */
	protected String endereco = ENDERECO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected static final String CEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected String cep = CEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected String cidade = CIDADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected static final String PAIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected String pais = PAIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected usuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegistro() {
		return registro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistro(int newRegistro) {
		int oldRegistro = registro;
		registro = newRegistro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__REGISTRO, oldRegistro, registro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSobrenome(String newSobrenome) {
		String oldSobrenome = sobrenome;
		sobrenome = newSobrenome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__SOBRENOME, oldSobrenome, sobrenome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPronome() {
		return pronome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPronome(String newPronome) {
		String oldPronome = pronome;
		pronome = newPronome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__PRONOME, oldPronome, pronome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatanascimento() {
		return datanascimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatanascimento(Date newDatanascimento) {
		Date oldDatanascimento = datanascimento;
		datanascimento = newDatanascimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__DATANASCIMENTO, oldDatanascimento, datanascimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpf(String newCpf) {
		String oldCpf = cpf;
		cpf = newCpf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CPF, oldCpf, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFone() {
		return fone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFone(String newFone) {
		String oldFone = fone;
		fone = newFone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__FONE, oldFone, fone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndereco(String newEndereco) {
		String oldEndereco = endereco;
		endereco = newEndereco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ENDERECO, oldEndereco, endereco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCep(String newCep) {
		String oldCep = cep;
		cep = newCep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CEP, oldCep, cep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidade(String newCidade) {
		String oldCidade = cidade;
		cidade = newCidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CIDADE, oldCidade, cidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPais(String newPais) {
		String oldPais = pais;
		pais = newPais;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__PAIS, oldPais, pais));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrausuario() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void excluiusuario() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void atualizausuario() {
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
			case ModelPackage.USUARIO__REGISTRO:
				return getRegistro();
			case ModelPackage.USUARIO__NOME:
				return getNome();
			case ModelPackage.USUARIO__SOBRENOME:
				return getSobrenome();
			case ModelPackage.USUARIO__PRONOME:
				return getPronome();
			case ModelPackage.USUARIO__DATANASCIMENTO:
				return getDatanascimento();
			case ModelPackage.USUARIO__EMAIL:
				return getEmail();
			case ModelPackage.USUARIO__CPF:
				return getCpf();
			case ModelPackage.USUARIO__FONE:
				return getFone();
			case ModelPackage.USUARIO__ENDERECO:
				return getEndereco();
			case ModelPackage.USUARIO__CEP:
				return getCep();
			case ModelPackage.USUARIO__CIDADE:
				return getCidade();
			case ModelPackage.USUARIO__ESTADO:
				return getEstado();
			case ModelPackage.USUARIO__PAIS:
				return getPais();
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
			case ModelPackage.USUARIO__REGISTRO:
				setRegistro((Integer)newValue);
				return;
			case ModelPackage.USUARIO__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.USUARIO__SOBRENOME:
				setSobrenome((String)newValue);
				return;
			case ModelPackage.USUARIO__PRONOME:
				setPronome((String)newValue);
				return;
			case ModelPackage.USUARIO__DATANASCIMENTO:
				setDatanascimento((Date)newValue);
				return;
			case ModelPackage.USUARIO__EMAIL:
				setEmail((String)newValue);
				return;
			case ModelPackage.USUARIO__CPF:
				setCpf((String)newValue);
				return;
			case ModelPackage.USUARIO__FONE:
				setFone((String)newValue);
				return;
			case ModelPackage.USUARIO__ENDERECO:
				setEndereco((String)newValue);
				return;
			case ModelPackage.USUARIO__CEP:
				setCep((String)newValue);
				return;
			case ModelPackage.USUARIO__CIDADE:
				setCidade((String)newValue);
				return;
			case ModelPackage.USUARIO__ESTADO:
				setEstado((String)newValue);
				return;
			case ModelPackage.USUARIO__PAIS:
				setPais((String)newValue);
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
			case ModelPackage.USUARIO__REGISTRO:
				setRegistro(REGISTRO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__SOBRENOME:
				setSobrenome(SOBRENOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__PRONOME:
				setPronome(PRONOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__DATANASCIMENTO:
				setDatanascimento(DATANASCIMENTO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CPF:
				setCpf(CPF_EDEFAULT);
				return;
			case ModelPackage.USUARIO__FONE:
				setFone(FONE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ENDERECO:
				setEndereco(ENDERECO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CEP:
				setCep(CEP_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CIDADE:
				setCidade(CIDADE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__PAIS:
				setPais(PAIS_EDEFAULT);
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
			case ModelPackage.USUARIO__REGISTRO:
				return registro != REGISTRO_EDEFAULT;
			case ModelPackage.USUARIO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.USUARIO__SOBRENOME:
				return SOBRENOME_EDEFAULT == null ? sobrenome != null : !SOBRENOME_EDEFAULT.equals(sobrenome);
			case ModelPackage.USUARIO__PRONOME:
				return PRONOME_EDEFAULT == null ? pronome != null : !PRONOME_EDEFAULT.equals(pronome);
			case ModelPackage.USUARIO__DATANASCIMENTO:
				return DATANASCIMENTO_EDEFAULT == null ? datanascimento != null : !DATANASCIMENTO_EDEFAULT.equals(datanascimento);
			case ModelPackage.USUARIO__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ModelPackage.USUARIO__CPF:
				return CPF_EDEFAULT == null ? cpf != null : !CPF_EDEFAULT.equals(cpf);
			case ModelPackage.USUARIO__FONE:
				return FONE_EDEFAULT == null ? fone != null : !FONE_EDEFAULT.equals(fone);
			case ModelPackage.USUARIO__ENDERECO:
				return ENDERECO_EDEFAULT == null ? endereco != null : !ENDERECO_EDEFAULT.equals(endereco);
			case ModelPackage.USUARIO__CEP:
				return CEP_EDEFAULT == null ? cep != null : !CEP_EDEFAULT.equals(cep);
			case ModelPackage.USUARIO__CIDADE:
				return CIDADE_EDEFAULT == null ? cidade != null : !CIDADE_EDEFAULT.equals(cidade);
			case ModelPackage.USUARIO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case ModelPackage.USUARIO__PAIS:
				return PAIS_EDEFAULT == null ? pais != null : !PAIS_EDEFAULT.equals(pais);
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
			case ModelPackage.USUARIO___REGISTRAUSUARIO:
				registrausuario();
				return null;
			case ModelPackage.USUARIO___EXCLUIUSUARIO:
				excluiusuario();
				return null;
			case ModelPackage.USUARIO___ATUALIZAUSUARIO:
				atualizausuario();
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
		result.append(" (registro: ");
		result.append(registro);
		result.append(", nome: ");
		result.append(nome);
		result.append(", sobrenome: ");
		result.append(sobrenome);
		result.append(", pronome: ");
		result.append(pronome);
		result.append(", datanascimento: ");
		result.append(datanascimento);
		result.append(", email: ");
		result.append(email);
		result.append(", cpf: ");
		result.append(cpf);
		result.append(", fone: ");
		result.append(fone);
		result.append(", endereco: ");
		result.append(endereco);
		result.append(", cep: ");
		result.append(cep);
		result.append(", cidade: ");
		result.append(cidade);
		result.append(", estado: ");
		result.append(estado);
		result.append(", pais: ");
		result.append(pais);
		result.append(')');
		return result.toString();
	}

} //usuarioImpl
