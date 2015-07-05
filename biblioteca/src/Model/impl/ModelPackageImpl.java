/**
 */
package Model.impl;

import Model.ModelFactory;
import Model.ModelPackage;
import Model.aluno;
import Model.biblioteca;
import Model.emprestimo;
import Model.exemplar;
import Model.funcionario;
import Model.livro;
import Model.manual;
import Model.periodico;
import Model.professor;
import Model.publicacao;
import Model.terminal;
import Model.tese;
import Model.usuario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliotecaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exemplarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emprestimoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicacaoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfuncionario() {
		return funcionarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getfuncionario_Idfuncionario() {
		return (EAttribute)funcionarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getfuncionario_Nome() {
		return (EAttribute)funcionarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfuncionario__Registrofuncionario() {
		return funcionarioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfuncionario__Excluifuncionario() {
		return funcionarioEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfuncionario__Atualizafuncionario() {
		return funcionarioEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getterminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getterminal_Idterminal() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getterminal_Idfuncionario() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getterminal_Horalogin() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getterminal_Idbiblioteca() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getterminal__Registraacesso() {
		return terminalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbiblioteca() {
		return bibliotecaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getbiblioteca_Idbiblioteca() {
		return (EAttribute)bibliotecaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getbiblioteca__Registrabiblioteca() {
		return bibliotecaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getbiblioteca__Excluibiblioteca() {
		return bibliotecaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getexemplar() {
		return exemplarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getexemplar_Idexemplar() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getexemplar_Idpublicacao() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getexemplar_Bloqueado() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getexemplar_Idbiblioteca() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getexemplar__Registraexemplar() {
		return exemplarEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getexemplar__Excluiexemplar() {
		return exemplarEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getexemplar__Bloqueiaexemplar() {
		return exemplarEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getemprestimo() {
		return emprestimoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getemprestimo_Idemprestimo() {
		return (EAttribute)emprestimoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getemprestimo_Idexemplar() {
		return (EAttribute)emprestimoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getemprestimo_Registrousuario() {
		return (EAttribute)emprestimoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getemprestimo_Datadevolucao() {
		return (EAttribute)emprestimoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getemprestimo_Idbiblioteca() {
		return (EAttribute)emprestimoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getemprestimo__Realizaemprestimo() {
		return emprestimoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getemprestimo__Realizadevolucao() {
		return emprestimoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getemprestimo__Calculamulta() {
		return emprestimoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpublicacao() {
		return publicacaoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpublicacao_Idpublicacao() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpublicacao_Autor() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpublicacao_Assunto() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpublicacao_Idbiblioteca() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getpublicacao__Registrapublicacao() {
		return publicacaoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getpublicacao__Excluipublicacao() {
		return publicacaoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlivro() {
		return livroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getperiodico() {
		return periodicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettese() {
		return teseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmanual() {
		return manualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getusuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Registro() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Nome() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Sobrenome() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Pronome() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Datanascimento() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Email() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Cpf() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Fone() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Endereco() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Cep() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Cidade() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Estado() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getusuario_Pais() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getusuario__Registrausuario() {
		return usuarioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getusuario__Excluiusuario() {
		return usuarioEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getusuario__Atualizausuario() {
		return usuarioEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaluno() {
		return alunoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getaluno_Curso() {
		return (EAttribute)alunoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getaluno__Registraaluno() {
		return alunoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getaluno__Excluialuno() {
		return alunoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getaluno__Atualizaaluno() {
		return alunoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getprofessor() {
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprofessor_Instituicao() {
		return (EAttribute)professorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprofessor__Registraprofessor() {
		return professorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprofessor__Excluiprofessor() {
		return professorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprofessor__Atualizaprofessor() {
		return professorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		funcionarioEClass = createEClass(FUNCIONARIO);
		createEAttribute(funcionarioEClass, FUNCIONARIO__IDFUNCIONARIO);
		createEAttribute(funcionarioEClass, FUNCIONARIO__NOME);
		createEOperation(funcionarioEClass, FUNCIONARIO___REGISTROFUNCIONARIO);
		createEOperation(funcionarioEClass, FUNCIONARIO___EXCLUIFUNCIONARIO);
		createEOperation(funcionarioEClass, FUNCIONARIO___ATUALIZAFUNCIONARIO);

		terminalEClass = createEClass(TERMINAL);
		createEAttribute(terminalEClass, TERMINAL__IDTERMINAL);
		createEAttribute(terminalEClass, TERMINAL__IDFUNCIONARIO);
		createEAttribute(terminalEClass, TERMINAL__HORALOGIN);
		createEAttribute(terminalEClass, TERMINAL__IDBIBLIOTECA);
		createEOperation(terminalEClass, TERMINAL___REGISTRAACESSO);

		bibliotecaEClass = createEClass(BIBLIOTECA);
		createEAttribute(bibliotecaEClass, BIBLIOTECA__IDBIBLIOTECA);
		createEOperation(bibliotecaEClass, BIBLIOTECA___REGISTRABIBLIOTECA);
		createEOperation(bibliotecaEClass, BIBLIOTECA___EXCLUIBIBLIOTECA);

		exemplarEClass = createEClass(EXEMPLAR);
		createEAttribute(exemplarEClass, EXEMPLAR__IDEXEMPLAR);
		createEAttribute(exemplarEClass, EXEMPLAR__IDPUBLICACAO);
		createEAttribute(exemplarEClass, EXEMPLAR__BLOQUEADO);
		createEAttribute(exemplarEClass, EXEMPLAR__IDBIBLIOTECA);
		createEOperation(exemplarEClass, EXEMPLAR___REGISTRAEXEMPLAR);
		createEOperation(exemplarEClass, EXEMPLAR___EXCLUIEXEMPLAR);
		createEOperation(exemplarEClass, EXEMPLAR___BLOQUEIAEXEMPLAR);

		emprestimoEClass = createEClass(EMPRESTIMO);
		createEAttribute(emprestimoEClass, EMPRESTIMO__IDEMPRESTIMO);
		createEAttribute(emprestimoEClass, EMPRESTIMO__IDEXEMPLAR);
		createEAttribute(emprestimoEClass, EMPRESTIMO__REGISTROUSUARIO);
		createEAttribute(emprestimoEClass, EMPRESTIMO__DATADEVOLUCAO);
		createEAttribute(emprestimoEClass, EMPRESTIMO__IDBIBLIOTECA);
		createEOperation(emprestimoEClass, EMPRESTIMO___REALIZAEMPRESTIMO);
		createEOperation(emprestimoEClass, EMPRESTIMO___REALIZADEVOLUCAO);
		createEOperation(emprestimoEClass, EMPRESTIMO___CALCULAMULTA);

		publicacaoEClass = createEClass(PUBLICACAO);
		createEAttribute(publicacaoEClass, PUBLICACAO__IDPUBLICACAO);
		createEAttribute(publicacaoEClass, PUBLICACAO__AUTOR);
		createEAttribute(publicacaoEClass, PUBLICACAO__ASSUNTO);
		createEAttribute(publicacaoEClass, PUBLICACAO__IDBIBLIOTECA);
		createEOperation(publicacaoEClass, PUBLICACAO___REGISTRAPUBLICACAO);
		createEOperation(publicacaoEClass, PUBLICACAO___EXCLUIPUBLICACAO);

		livroEClass = createEClass(LIVRO);

		periodicoEClass = createEClass(PERIODICO);

		teseEClass = createEClass(TESE);

		manualEClass = createEClass(MANUAL);

		usuarioEClass = createEClass(USUARIO);
		createEAttribute(usuarioEClass, USUARIO__REGISTRO);
		createEAttribute(usuarioEClass, USUARIO__NOME);
		createEAttribute(usuarioEClass, USUARIO__SOBRENOME);
		createEAttribute(usuarioEClass, USUARIO__PRONOME);
		createEAttribute(usuarioEClass, USUARIO__DATANASCIMENTO);
		createEAttribute(usuarioEClass, USUARIO__EMAIL);
		createEAttribute(usuarioEClass, USUARIO__CPF);
		createEAttribute(usuarioEClass, USUARIO__FONE);
		createEAttribute(usuarioEClass, USUARIO__ENDERECO);
		createEAttribute(usuarioEClass, USUARIO__CEP);
		createEAttribute(usuarioEClass, USUARIO__CIDADE);
		createEAttribute(usuarioEClass, USUARIO__ESTADO);
		createEAttribute(usuarioEClass, USUARIO__PAIS);
		createEOperation(usuarioEClass, USUARIO___REGISTRAUSUARIO);
		createEOperation(usuarioEClass, USUARIO___EXCLUIUSUARIO);
		createEOperation(usuarioEClass, USUARIO___ATUALIZAUSUARIO);

		alunoEClass = createEClass(ALUNO);
		createEAttribute(alunoEClass, ALUNO__CURSO);
		createEOperation(alunoEClass, ALUNO___REGISTRAALUNO);
		createEOperation(alunoEClass, ALUNO___EXCLUIALUNO);
		createEOperation(alunoEClass, ALUNO___ATUALIZAALUNO);

		professorEClass = createEClass(PROFESSOR);
		createEAttribute(professorEClass, PROFESSOR__INSTITUICAO);
		createEOperation(professorEClass, PROFESSOR___REGISTRAPROFESSOR);
		createEOperation(professorEClass, PROFESSOR___EXCLUIPROFESSOR);
		createEOperation(professorEClass, PROFESSOR___ATUALIZAPROFESSOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		livroEClass.getESuperTypes().add(this.getpublicacao());
		periodicoEClass.getESuperTypes().add(this.getpublicacao());
		teseEClass.getESuperTypes().add(this.getpublicacao());
		manualEClass.getESuperTypes().add(this.getpublicacao());
		alunoEClass.getESuperTypes().add(this.getusuario());
		professorEClass.getESuperTypes().add(this.getusuario());

		// Initialize classes, features, and operations; add parameters
		initEClass(funcionarioEClass, funcionario.class, "funcionario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getfuncionario_Idfuncionario(), theTypesPackage.getInteger(), "idfuncionario", null, 1, 1, funcionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getfuncionario_Nome(), theTypesPackage.getString(), "nome", null, 1, 1, funcionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getfuncionario__Registrofuncionario(), null, "registrofuncionario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getfuncionario__Excluifuncionario(), null, "excluifuncionario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getfuncionario__Atualizafuncionario(), null, "atualizafuncionario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(terminalEClass, terminal.class, "terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getterminal_Idterminal(), theTypesPackage.getInteger(), "idterminal", null, 1, 1, terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getterminal_Idfuncionario(), theTypesPackage.getInteger(), "idfuncionario", null, 1, 1, terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getterminal_Horalogin(), ecorePackage.getEDate(), "horalogin", null, 1, 1, terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getterminal_Idbiblioteca(), theTypesPackage.getInteger(), "idbiblioteca", null, 1, 1, terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getterminal__Registraacesso(), null, "registraacesso", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bibliotecaEClass, biblioteca.class, "biblioteca", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getbiblioteca_Idbiblioteca(), theTypesPackage.getInteger(), "idbiblioteca", null, 1, 1, biblioteca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getbiblioteca__Registrabiblioteca(), null, "registrabiblioteca", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getbiblioteca__Excluibiblioteca(), null, "excluibiblioteca", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(exemplarEClass, exemplar.class, "exemplar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getexemplar_Idexemplar(), theTypesPackage.getInteger(), "idexemplar", null, 1, 1, exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getexemplar_Idpublicacao(), theTypesPackage.getInteger(), "idpublicacao", null, 1, 1, exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getexemplar_Bloqueado(), theTypesPackage.getBoolean(), "bloqueado", null, 1, 1, exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getexemplar_Idbiblioteca(), theTypesPackage.getInteger(), "idbiblioteca", null, 1, 1, exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getexemplar__Registraexemplar(), null, "registraexemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getexemplar__Excluiexemplar(), null, "excluiexemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getexemplar__Bloqueiaexemplar(), null, "bloqueiaexemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(emprestimoEClass, emprestimo.class, "emprestimo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getemprestimo_Idemprestimo(), theTypesPackage.getInteger(), "idemprestimo", null, 1, 1, emprestimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getemprestimo_Idexemplar(), theTypesPackage.getInteger(), "idexemplar", null, 1, 1, emprestimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getemprestimo_Registrousuario(), theTypesPackage.getInteger(), "registrousuario", null, 1, 1, emprestimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getemprestimo_Datadevolucao(), ecorePackage.getEDate(), "datadevolucao", null, 1, 1, emprestimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getemprestimo_Idbiblioteca(), theTypesPackage.getInteger(), "idbiblioteca", null, 1, 1, emprestimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getemprestimo__Realizaemprestimo(), null, "realizaemprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getemprestimo__Realizadevolucao(), null, "realizadevolucao", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getemprestimo__Calculamulta(), null, "calculamulta", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(publicacaoEClass, publicacao.class, "publicacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getpublicacao_Idpublicacao(), theTypesPackage.getInteger(), "idpublicacao", null, 1, 1, publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getpublicacao_Autor(), theTypesPackage.getString(), "autor", null, 1, 1, publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getpublicacao_Assunto(), theTypesPackage.getString(), "assunto", null, 1, 1, publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getpublicacao_Idbiblioteca(), theTypesPackage.getInteger(), "idbiblioteca", null, 1, 1, publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getpublicacao__Registrapublicacao(), null, "registrapublicacao", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getpublicacao__Excluipublicacao(), null, "excluipublicacao", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(livroEClass, livro.class, "livro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(periodicoEClass, periodico.class, "periodico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(teseEClass, tese.class, "tese", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualEClass, manual.class, "manual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usuarioEClass, usuario.class, "usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getusuario_Registro(), theTypesPackage.getInteger(), "registro", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Nome(), theTypesPackage.getString(), "nome", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Sobrenome(), theTypesPackage.getString(), "sobrenome", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Pronome(), theTypesPackage.getString(), "pronome", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Datanascimento(), ecorePackage.getEDate(), "datanascimento", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Email(), theTypesPackage.getString(), "email", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Cpf(), theTypesPackage.getString(), "cpf", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Fone(), theTypesPackage.getString(), "fone", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Endereco(), theTypesPackage.getString(), "endereco", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Cep(), theTypesPackage.getString(), "cep", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Cidade(), theTypesPackage.getString(), "cidade", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Estado(), theTypesPackage.getString(), "estado", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getusuario_Pais(), theTypesPackage.getString(), "pais", null, 1, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getusuario__Registrausuario(), null, "registrausuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getusuario__Excluiusuario(), null, "excluiusuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getusuario__Atualizausuario(), null, "atualizausuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(alunoEClass, aluno.class, "aluno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getaluno_Curso(), theTypesPackage.getString(), "curso", null, 1, 1, aluno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getaluno__Registraaluno(), null, "registraaluno", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getaluno__Excluialuno(), null, "excluialuno", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getaluno__Atualizaaluno(), null, "atualizaaluno", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(professorEClass, professor.class, "professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getprofessor_Instituicao(), theTypesPackage.getString(), "instituicao", null, 1, 1, professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getprofessor__Registraprofessor(), null, "registraprofessor", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getprofessor__Excluiprofessor(), null, "excluiprofessor", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getprofessor__Atualizaprofessor(), null, "atualizaprofessor", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
