/**
 */
package Model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = Model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Model.impl.funcionarioImpl <em>funcionario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.funcionarioImpl
	 * @see Model.impl.ModelPackageImpl#getfuncionario()
	 * @generated
	 */
	int FUNCIONARIO = 0;

	/**
	 * The feature id for the '<em><b>Idfuncionario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__IDFUNCIONARIO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__NOME = 1;

	/**
	 * The number of structural features of the '<em>funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Registrofuncionario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___REGISTROFUNCIONARIO = 0;

	/**
	 * The operation id for the '<em>Excluifuncionario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___EXCLUIFUNCIONARIO = 1;

	/**
	 * The operation id for the '<em>Atualizafuncionario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___ATUALIZAFUNCIONARIO = 2;

	/**
	 * The number of operations of the '<em>funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Model.impl.terminalImpl <em>terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.terminalImpl
	 * @see Model.impl.ModelPackageImpl#getterminal()
	 * @generated
	 */
	int TERMINAL = 1;

	/**
	 * The feature id for the '<em><b>Idterminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__IDTERMINAL = 0;

	/**
	 * The feature id for the '<em><b>Idfuncionario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__IDFUNCIONARIO = 1;

	/**
	 * The feature id for the '<em><b>Horalogin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__HORALOGIN = 2;

	/**
	 * The feature id for the '<em><b>Idbiblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__IDBIBLIOTECA = 3;

	/**
	 * The number of structural features of the '<em>terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Registraacesso</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___REGISTRAACESSO = 0;

	/**
	 * The number of operations of the '<em>terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Model.impl.bibliotecaImpl <em>biblioteca</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.bibliotecaImpl
	 * @see Model.impl.ModelPackageImpl#getbiblioteca()
	 * @generated
	 */
	int BIBLIOTECA = 2;

	/**
	 * The feature id for the '<em><b>Idbiblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__IDBIBLIOTECA = 0;

	/**
	 * The number of structural features of the '<em>biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Registrabiblioteca</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA___REGISTRABIBLIOTECA = 0;

	/**
	 * The operation id for the '<em>Excluibiblioteca</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA___EXCLUIBIBLIOTECA = 1;

	/**
	 * The number of operations of the '<em>biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model.impl.exemplarImpl <em>exemplar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.exemplarImpl
	 * @see Model.impl.ModelPackageImpl#getexemplar()
	 * @generated
	 */
	int EXEMPLAR = 3;

	/**
	 * The feature id for the '<em><b>Idexemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__IDEXEMPLAR = 0;

	/**
	 * The feature id for the '<em><b>Idpublicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__IDPUBLICACAO = 1;

	/**
	 * The feature id for the '<em><b>Bloqueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__BLOQUEADO = 2;

	/**
	 * The feature id for the '<em><b>Idbiblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__IDBIBLIOTECA = 3;

	/**
	 * The number of structural features of the '<em>exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Registraexemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___REGISTRAEXEMPLAR = 0;

	/**
	 * The operation id for the '<em>Excluiexemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___EXCLUIEXEMPLAR = 1;

	/**
	 * The operation id for the '<em>Bloqueiaexemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___BLOQUEIAEXEMPLAR = 2;

	/**
	 * The number of operations of the '<em>exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Model.impl.emprestimoImpl <em>emprestimo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.emprestimoImpl
	 * @see Model.impl.ModelPackageImpl#getemprestimo()
	 * @generated
	 */
	int EMPRESTIMO = 4;

	/**
	 * The feature id for the '<em><b>Idemprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__IDEMPRESTIMO = 0;

	/**
	 * The feature id for the '<em><b>Idexemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__IDEXEMPLAR = 1;

	/**
	 * The feature id for the '<em><b>Registrousuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__REGISTROUSUARIO = 2;

	/**
	 * The feature id for the '<em><b>Datadevolucao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__DATADEVOLUCAO = 3;

	/**
	 * The feature id for the '<em><b>Idbiblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__IDBIBLIOTECA = 4;

	/**
	 * The number of structural features of the '<em>emprestimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Realizaemprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO___REALIZAEMPRESTIMO = 0;

	/**
	 * The operation id for the '<em>Realizadevolucao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO___REALIZADEVOLUCAO = 1;

	/**
	 * The operation id for the '<em>Calculamulta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO___CALCULAMULTA = 2;

	/**
	 * The number of operations of the '<em>emprestimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Model.impl.publicacaoImpl <em>publicacao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.publicacaoImpl
	 * @see Model.impl.ModelPackageImpl#getpublicacao()
	 * @generated
	 */
	int PUBLICACAO = 5;

	/**
	 * The feature id for the '<em><b>Idpublicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__IDPUBLICACAO = 0;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__AUTOR = 1;

	/**
	 * The feature id for the '<em><b>Assunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__ASSUNTO = 2;

	/**
	 * The feature id for the '<em><b>Idbiblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__IDBIBLIOTECA = 3;

	/**
	 * The number of structural features of the '<em>publicacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Registrapublicacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO___REGISTRAPUBLICACAO = 0;

	/**
	 * The operation id for the '<em>Excluipublicacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO___EXCLUIPUBLICACAO = 1;

	/**
	 * The number of operations of the '<em>publicacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model.impl.livroImpl <em>livro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.livroImpl
	 * @see Model.impl.ModelPackageImpl#getlivro()
	 * @generated
	 */
	int LIVRO = 6;

	/**
	 * The feature id for the '<em><b>Idpublicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__IDPUBLICACAO = PUBLICACAO__IDPUBLICACAO;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Assunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__ASSUNTO = PUBLICACAO__ASSUNTO;

	/**
	 * The feature id for the '<em><b>Idbiblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__IDBIBLIOTECA = PUBLICACAO__IDBIBLIOTECA;

	/**
	 * The number of structural features of the '<em>livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Registrapublicacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO___REGISTRAPUBLICACAO = PUBLICACAO___REGISTRAPUBLICACAO;

	/**
	 * The operation id for the '<em>Excluipublicacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO___EXCLUIPUBLICACAO = PUBLICACAO___EXCLUIPUBLICACAO;

	/**
	 * The number of operations of the '<em>livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.periodicoImpl <em>periodico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.periodicoImpl
	 * @see Model.impl.ModelPackageImpl#getperiodico()
	 * @generated
	 */
	int PERIODICO = 7;

	/**
	 * The feature id for the '<em><b>Idpublicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__IDPUBLICACAO = PUBLICACAO__IDPUBLICACAO;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Assunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__ASSUNTO = PUBLICACAO__ASSUNTO;

	/**
	 * The feature id for the '<em><b>Idbiblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__IDBIBLIOTECA = PUBLICACAO__IDBIBLIOTECA;

	/**
	 * The number of structural features of the '<em>periodico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Registrapublicacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO___REGISTRAPUBLICACAO = PUBLICACAO___REGISTRAPUBLICACAO;

	/**
	 * The operation id for the '<em>Excluipublicacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO___EXCLUIPUBLICACAO = PUBLICACAO___EXCLUIPUBLICACAO;

	/**
	 * The number of operations of the '<em>periodico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.teseImpl <em>tese</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.teseImpl
	 * @see Model.impl.ModelPackageImpl#gettese()
	 * @generated
	 */
	int TESE = 8;

	/**
	 * The feature id for the '<em><b>Idpublicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__IDPUBLICACAO = PUBLICACAO__IDPUBLICACAO;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Assunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__ASSUNTO = PUBLICACAO__ASSUNTO;

	/**
	 * The feature id for the '<em><b>Idbiblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__IDBIBLIOTECA = PUBLICACAO__IDBIBLIOTECA;

	/**
	 * The number of structural features of the '<em>tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Registrapublicacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE___REGISTRAPUBLICACAO = PUBLICACAO___REGISTRAPUBLICACAO;

	/**
	 * The operation id for the '<em>Excluipublicacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE___EXCLUIPUBLICACAO = PUBLICACAO___EXCLUIPUBLICACAO;

	/**
	 * The number of operations of the '<em>tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.manualImpl <em>manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.manualImpl
	 * @see Model.impl.ModelPackageImpl#getmanual()
	 * @generated
	 */
	int MANUAL = 9;

	/**
	 * The feature id for the '<em><b>Idpublicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__IDPUBLICACAO = PUBLICACAO__IDPUBLICACAO;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Assunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ASSUNTO = PUBLICACAO__ASSUNTO;

	/**
	 * The feature id for the '<em><b>Idbiblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__IDBIBLIOTECA = PUBLICACAO__IDBIBLIOTECA;

	/**
	 * The number of structural features of the '<em>manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Registrapublicacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___REGISTRAPUBLICACAO = PUBLICACAO___REGISTRAPUBLICACAO;

	/**
	 * The operation id for the '<em>Excluipublicacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___EXCLUIPUBLICACAO = PUBLICACAO___EXCLUIPUBLICACAO;

	/**
	 * The number of operations of the '<em>manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.usuarioImpl <em>usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.usuarioImpl
	 * @see Model.impl.ModelPackageImpl#getusuario()
	 * @generated
	 */
	int USUARIO = 10;

	/**
	 * The feature id for the '<em><b>Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__REGISTRO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOME = 1;

	/**
	 * The feature id for the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__SOBRENOME = 2;

	/**
	 * The feature id for the '<em><b>Pronome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PRONOME = 3;

	/**
	 * The feature id for the '<em><b>Datanascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__DATANASCIMENTO = 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMAIL = 5;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CPF = 6;

	/**
	 * The feature id for the '<em><b>Fone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__FONE = 7;

	/**
	 * The feature id for the '<em><b>Endereco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ENDERECO = 8;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CEP = 9;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CIDADE = 10;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ESTADO = 11;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PAIS = 12;

	/**
	 * The number of structural features of the '<em>usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Registrausuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___REGISTRAUSUARIO = 0;

	/**
	 * The operation id for the '<em>Excluiusuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___EXCLUIUSUARIO = 1;

	/**
	 * The operation id for the '<em>Atualizausuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___ATUALIZAUSUARIO = 2;

	/**
	 * The number of operations of the '<em>usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Model.impl.alunoImpl <em>aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.alunoImpl
	 * @see Model.impl.ModelPackageImpl#getaluno()
	 * @generated
	 */
	int ALUNO = 11;

	/**
	 * The feature id for the '<em><b>Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__REGISTRO = USUARIO__REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__SOBRENOME = USUARIO__SOBRENOME;

	/**
	 * The feature id for the '<em><b>Pronome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__PRONOME = USUARIO__PRONOME;

	/**
	 * The feature id for the '<em><b>Datanascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__DATANASCIMENTO = USUARIO__DATANASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Fone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__FONE = USUARIO__FONE;

	/**
	 * The feature id for the '<em><b>Endereco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ENDERECO = USUARIO__ENDERECO;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CIDADE = USUARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ESTADO = USUARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__PAIS = USUARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Curso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CURSO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Registrausuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___REGISTRAUSUARIO = USUARIO___REGISTRAUSUARIO;

	/**
	 * The operation id for the '<em>Excluiusuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___EXCLUIUSUARIO = USUARIO___EXCLUIUSUARIO;

	/**
	 * The operation id for the '<em>Atualizausuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___ATUALIZAUSUARIO = USUARIO___ATUALIZAUSUARIO;

	/**
	 * The operation id for the '<em>Registraaluno</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___REGISTRAALUNO = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Excluialuno</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___EXCLUIALUNO = USUARIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Atualizaaluno</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___ATUALIZAALUNO = USUARIO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link Model.impl.professorImpl <em>professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.professorImpl
	 * @see Model.impl.ModelPackageImpl#getprofessor()
	 * @generated
	 */
	int PROFESSOR = 12;

	/**
	 * The feature id for the '<em><b>Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__REGISTRO = USUARIO__REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__SOBRENOME = USUARIO__SOBRENOME;

	/**
	 * The feature id for the '<em><b>Pronome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__PRONOME = USUARIO__PRONOME;

	/**
	 * The feature id for the '<em><b>Datanascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__DATANASCIMENTO = USUARIO__DATANASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Fone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__FONE = USUARIO__FONE;

	/**
	 * The feature id for the '<em><b>Endereco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ENDERECO = USUARIO__ENDERECO;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CIDADE = USUARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ESTADO = USUARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__PAIS = USUARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Instituicao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__INSTITUICAO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Registrausuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___REGISTRAUSUARIO = USUARIO___REGISTRAUSUARIO;

	/**
	 * The operation id for the '<em>Excluiusuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___EXCLUIUSUARIO = USUARIO___EXCLUIUSUARIO;

	/**
	 * The operation id for the '<em>Atualizausuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___ATUALIZAUSUARIO = USUARIO___ATUALIZAUSUARIO;

	/**
	 * The operation id for the '<em>Registraprofessor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___REGISTRAPROFESSOR = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Excluiprofessor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___EXCLUIPROFESSOR = USUARIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Atualizaprofessor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___ATUALIZAPROFESSOR = USUARIO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link Model.funcionario <em>funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>funcionario</em>'.
	 * @see Model.funcionario
	 * @generated
	 */
	EClass getfuncionario();

	/**
	 * Returns the meta object for the attribute '{@link Model.funcionario#getIdfuncionario <em>Idfuncionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idfuncionario</em>'.
	 * @see Model.funcionario#getIdfuncionario()
	 * @see #getfuncionario()
	 * @generated
	 */
	EAttribute getfuncionario_Idfuncionario();

	/**
	 * Returns the meta object for the attribute '{@link Model.funcionario#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Model.funcionario#getNome()
	 * @see #getfuncionario()
	 * @generated
	 */
	EAttribute getfuncionario_Nome();

	/**
	 * Returns the meta object for the '{@link Model.funcionario#registrofuncionario() <em>Registrofuncionario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registrofuncionario</em>' operation.
	 * @see Model.funcionario#registrofuncionario()
	 * @generated
	 */
	EOperation getfuncionario__Registrofuncionario();

	/**
	 * Returns the meta object for the '{@link Model.funcionario#excluifuncionario() <em>Excluifuncionario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluifuncionario</em>' operation.
	 * @see Model.funcionario#excluifuncionario()
	 * @generated
	 */
	EOperation getfuncionario__Excluifuncionario();

	/**
	 * Returns the meta object for the '{@link Model.funcionario#atualizafuncionario() <em>Atualizafuncionario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualizafuncionario</em>' operation.
	 * @see Model.funcionario#atualizafuncionario()
	 * @generated
	 */
	EOperation getfuncionario__Atualizafuncionario();

	/**
	 * Returns the meta object for class '{@link Model.terminal <em>terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>terminal</em>'.
	 * @see Model.terminal
	 * @generated
	 */
	EClass getterminal();

	/**
	 * Returns the meta object for the attribute '{@link Model.terminal#getIdterminal <em>Idterminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idterminal</em>'.
	 * @see Model.terminal#getIdterminal()
	 * @see #getterminal()
	 * @generated
	 */
	EAttribute getterminal_Idterminal();

	/**
	 * Returns the meta object for the attribute '{@link Model.terminal#getIdfuncionario <em>Idfuncionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idfuncionario</em>'.
	 * @see Model.terminal#getIdfuncionario()
	 * @see #getterminal()
	 * @generated
	 */
	EAttribute getterminal_Idfuncionario();

	/**
	 * Returns the meta object for the attribute '{@link Model.terminal#getHoralogin <em>Horalogin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horalogin</em>'.
	 * @see Model.terminal#getHoralogin()
	 * @see #getterminal()
	 * @generated
	 */
	EAttribute getterminal_Horalogin();

	/**
	 * Returns the meta object for the attribute '{@link Model.terminal#getIdbiblioteca <em>Idbiblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idbiblioteca</em>'.
	 * @see Model.terminal#getIdbiblioteca()
	 * @see #getterminal()
	 * @generated
	 */
	EAttribute getterminal_Idbiblioteca();

	/**
	 * Returns the meta object for the '{@link Model.terminal#registraacesso() <em>Registraacesso</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registraacesso</em>' operation.
	 * @see Model.terminal#registraacesso()
	 * @generated
	 */
	EOperation getterminal__Registraacesso();

	/**
	 * Returns the meta object for class '{@link Model.biblioteca <em>biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>biblioteca</em>'.
	 * @see Model.biblioteca
	 * @generated
	 */
	EClass getbiblioteca();

	/**
	 * Returns the meta object for the attribute '{@link Model.biblioteca#getIdbiblioteca <em>Idbiblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idbiblioteca</em>'.
	 * @see Model.biblioteca#getIdbiblioteca()
	 * @see #getbiblioteca()
	 * @generated
	 */
	EAttribute getbiblioteca_Idbiblioteca();

	/**
	 * Returns the meta object for the '{@link Model.biblioteca#registrabiblioteca() <em>Registrabiblioteca</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registrabiblioteca</em>' operation.
	 * @see Model.biblioteca#registrabiblioteca()
	 * @generated
	 */
	EOperation getbiblioteca__Registrabiblioteca();

	/**
	 * Returns the meta object for the '{@link Model.biblioteca#excluibiblioteca() <em>Excluibiblioteca</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluibiblioteca</em>' operation.
	 * @see Model.biblioteca#excluibiblioteca()
	 * @generated
	 */
	EOperation getbiblioteca__Excluibiblioteca();

	/**
	 * Returns the meta object for class '{@link Model.exemplar <em>exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>exemplar</em>'.
	 * @see Model.exemplar
	 * @generated
	 */
	EClass getexemplar();

	/**
	 * Returns the meta object for the attribute '{@link Model.exemplar#getIdexemplar <em>Idexemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idexemplar</em>'.
	 * @see Model.exemplar#getIdexemplar()
	 * @see #getexemplar()
	 * @generated
	 */
	EAttribute getexemplar_Idexemplar();

	/**
	 * Returns the meta object for the attribute '{@link Model.exemplar#getIdpublicacao <em>Idpublicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idpublicacao</em>'.
	 * @see Model.exemplar#getIdpublicacao()
	 * @see #getexemplar()
	 * @generated
	 */
	EAttribute getexemplar_Idpublicacao();

	/**
	 * Returns the meta object for the attribute '{@link Model.exemplar#isBloqueado <em>Bloqueado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bloqueado</em>'.
	 * @see Model.exemplar#isBloqueado()
	 * @see #getexemplar()
	 * @generated
	 */
	EAttribute getexemplar_Bloqueado();

	/**
	 * Returns the meta object for the attribute '{@link Model.exemplar#getIdbiblioteca <em>Idbiblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idbiblioteca</em>'.
	 * @see Model.exemplar#getIdbiblioteca()
	 * @see #getexemplar()
	 * @generated
	 */
	EAttribute getexemplar_Idbiblioteca();

	/**
	 * Returns the meta object for the '{@link Model.exemplar#registraexemplar() <em>Registraexemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registraexemplar</em>' operation.
	 * @see Model.exemplar#registraexemplar()
	 * @generated
	 */
	EOperation getexemplar__Registraexemplar();

	/**
	 * Returns the meta object for the '{@link Model.exemplar#excluiexemplar() <em>Excluiexemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluiexemplar</em>' operation.
	 * @see Model.exemplar#excluiexemplar()
	 * @generated
	 */
	EOperation getexemplar__Excluiexemplar();

	/**
	 * Returns the meta object for the '{@link Model.exemplar#bloqueiaexemplar() <em>Bloqueiaexemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloqueiaexemplar</em>' operation.
	 * @see Model.exemplar#bloqueiaexemplar()
	 * @generated
	 */
	EOperation getexemplar__Bloqueiaexemplar();

	/**
	 * Returns the meta object for class '{@link Model.emprestimo <em>emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>emprestimo</em>'.
	 * @see Model.emprestimo
	 * @generated
	 */
	EClass getemprestimo();

	/**
	 * Returns the meta object for the attribute '{@link Model.emprestimo#getIdemprestimo <em>Idemprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idemprestimo</em>'.
	 * @see Model.emprestimo#getIdemprestimo()
	 * @see #getemprestimo()
	 * @generated
	 */
	EAttribute getemprestimo_Idemprestimo();

	/**
	 * Returns the meta object for the attribute '{@link Model.emprestimo#getIdexemplar <em>Idexemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idexemplar</em>'.
	 * @see Model.emprestimo#getIdexemplar()
	 * @see #getemprestimo()
	 * @generated
	 */
	EAttribute getemprestimo_Idexemplar();

	/**
	 * Returns the meta object for the attribute '{@link Model.emprestimo#getRegistrousuario <em>Registrousuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registrousuario</em>'.
	 * @see Model.emprestimo#getRegistrousuario()
	 * @see #getemprestimo()
	 * @generated
	 */
	EAttribute getemprestimo_Registrousuario();

	/**
	 * Returns the meta object for the attribute '{@link Model.emprestimo#getDatadevolucao <em>Datadevolucao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datadevolucao</em>'.
	 * @see Model.emprestimo#getDatadevolucao()
	 * @see #getemprestimo()
	 * @generated
	 */
	EAttribute getemprestimo_Datadevolucao();

	/**
	 * Returns the meta object for the attribute '{@link Model.emprestimo#getIdbiblioteca <em>Idbiblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idbiblioteca</em>'.
	 * @see Model.emprestimo#getIdbiblioteca()
	 * @see #getemprestimo()
	 * @generated
	 */
	EAttribute getemprestimo_Idbiblioteca();

	/**
	 * Returns the meta object for the '{@link Model.emprestimo#realizaemprestimo() <em>Realizaemprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizaemprestimo</em>' operation.
	 * @see Model.emprestimo#realizaemprestimo()
	 * @generated
	 */
	EOperation getemprestimo__Realizaemprestimo();

	/**
	 * Returns the meta object for the '{@link Model.emprestimo#realizadevolucao() <em>Realizadevolucao</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizadevolucao</em>' operation.
	 * @see Model.emprestimo#realizadevolucao()
	 * @generated
	 */
	EOperation getemprestimo__Realizadevolucao();

	/**
	 * Returns the meta object for the '{@link Model.emprestimo#calculamulta() <em>Calculamulta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculamulta</em>' operation.
	 * @see Model.emprestimo#calculamulta()
	 * @generated
	 */
	EOperation getemprestimo__Calculamulta();

	/**
	 * Returns the meta object for class '{@link Model.publicacao <em>publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>publicacao</em>'.
	 * @see Model.publicacao
	 * @generated
	 */
	EClass getpublicacao();

	/**
	 * Returns the meta object for the attribute '{@link Model.publicacao#getIdpublicacao <em>Idpublicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idpublicacao</em>'.
	 * @see Model.publicacao#getIdpublicacao()
	 * @see #getpublicacao()
	 * @generated
	 */
	EAttribute getpublicacao_Idpublicacao();

	/**
	 * Returns the meta object for the attribute '{@link Model.publicacao#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autor</em>'.
	 * @see Model.publicacao#getAutor()
	 * @see #getpublicacao()
	 * @generated
	 */
	EAttribute getpublicacao_Autor();

	/**
	 * Returns the meta object for the attribute '{@link Model.publicacao#getAssunto <em>Assunto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assunto</em>'.
	 * @see Model.publicacao#getAssunto()
	 * @see #getpublicacao()
	 * @generated
	 */
	EAttribute getpublicacao_Assunto();

	/**
	 * Returns the meta object for the attribute '{@link Model.publicacao#getIdbiblioteca <em>Idbiblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idbiblioteca</em>'.
	 * @see Model.publicacao#getIdbiblioteca()
	 * @see #getpublicacao()
	 * @generated
	 */
	EAttribute getpublicacao_Idbiblioteca();

	/**
	 * Returns the meta object for the '{@link Model.publicacao#registrapublicacao() <em>Registrapublicacao</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registrapublicacao</em>' operation.
	 * @see Model.publicacao#registrapublicacao()
	 * @generated
	 */
	EOperation getpublicacao__Registrapublicacao();

	/**
	 * Returns the meta object for the '{@link Model.publicacao#excluipublicacao() <em>Excluipublicacao</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluipublicacao</em>' operation.
	 * @see Model.publicacao#excluipublicacao()
	 * @generated
	 */
	EOperation getpublicacao__Excluipublicacao();

	/**
	 * Returns the meta object for class '{@link Model.livro <em>livro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>livro</em>'.
	 * @see Model.livro
	 * @generated
	 */
	EClass getlivro();

	/**
	 * Returns the meta object for class '{@link Model.periodico <em>periodico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>periodico</em>'.
	 * @see Model.periodico
	 * @generated
	 */
	EClass getperiodico();

	/**
	 * Returns the meta object for class '{@link Model.tese <em>tese</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tese</em>'.
	 * @see Model.tese
	 * @generated
	 */
	EClass gettese();

	/**
	 * Returns the meta object for class '{@link Model.manual <em>manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>manual</em>'.
	 * @see Model.manual
	 * @generated
	 */
	EClass getmanual();

	/**
	 * Returns the meta object for class '{@link Model.usuario <em>usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>usuario</em>'.
	 * @see Model.usuario
	 * @generated
	 */
	EClass getusuario();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getRegistro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registro</em>'.
	 * @see Model.usuario#getRegistro()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Registro();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Model.usuario#getNome()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getSobrenome <em>Sobrenome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sobrenome</em>'.
	 * @see Model.usuario#getSobrenome()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Sobrenome();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getPronome <em>Pronome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pronome</em>'.
	 * @see Model.usuario#getPronome()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Pronome();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getDatanascimento <em>Datanascimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datanascimento</em>'.
	 * @see Model.usuario#getDatanascimento()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Datanascimento();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Model.usuario#getEmail()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Email();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getCpf <em>Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpf</em>'.
	 * @see Model.usuario#getCpf()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Cpf();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getFone <em>Fone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fone</em>'.
	 * @see Model.usuario#getFone()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Fone();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getEndereco <em>Endereco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endereco</em>'.
	 * @see Model.usuario#getEndereco()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Endereco();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getCep <em>Cep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cep</em>'.
	 * @see Model.usuario#getCep()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Cep();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getCidade <em>Cidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidade</em>'.
	 * @see Model.usuario#getCidade()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Cidade();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see Model.usuario#getEstado()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Estado();

	/**
	 * Returns the meta object for the attribute '{@link Model.usuario#getPais <em>Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pais</em>'.
	 * @see Model.usuario#getPais()
	 * @see #getusuario()
	 * @generated
	 */
	EAttribute getusuario_Pais();

	/**
	 * Returns the meta object for the '{@link Model.usuario#registrausuario() <em>Registrausuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registrausuario</em>' operation.
	 * @see Model.usuario#registrausuario()
	 * @generated
	 */
	EOperation getusuario__Registrausuario();

	/**
	 * Returns the meta object for the '{@link Model.usuario#excluiusuario() <em>Excluiusuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluiusuario</em>' operation.
	 * @see Model.usuario#excluiusuario()
	 * @generated
	 */
	EOperation getusuario__Excluiusuario();

	/**
	 * Returns the meta object for the '{@link Model.usuario#atualizausuario() <em>Atualizausuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualizausuario</em>' operation.
	 * @see Model.usuario#atualizausuario()
	 * @generated
	 */
	EOperation getusuario__Atualizausuario();

	/**
	 * Returns the meta object for class '{@link Model.aluno <em>aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aluno</em>'.
	 * @see Model.aluno
	 * @generated
	 */
	EClass getaluno();

	/**
	 * Returns the meta object for the attribute '{@link Model.aluno#getCurso <em>Curso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curso</em>'.
	 * @see Model.aluno#getCurso()
	 * @see #getaluno()
	 * @generated
	 */
	EAttribute getaluno_Curso();

	/**
	 * Returns the meta object for the '{@link Model.aluno#registraaluno() <em>Registraaluno</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registraaluno</em>' operation.
	 * @see Model.aluno#registraaluno()
	 * @generated
	 */
	EOperation getaluno__Registraaluno();

	/**
	 * Returns the meta object for the '{@link Model.aluno#excluialuno() <em>Excluialuno</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluialuno</em>' operation.
	 * @see Model.aluno#excluialuno()
	 * @generated
	 */
	EOperation getaluno__Excluialuno();

	/**
	 * Returns the meta object for the '{@link Model.aluno#atualizaaluno() <em>Atualizaaluno</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualizaaluno</em>' operation.
	 * @see Model.aluno#atualizaaluno()
	 * @generated
	 */
	EOperation getaluno__Atualizaaluno();

	/**
	 * Returns the meta object for class '{@link Model.professor <em>professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>professor</em>'.
	 * @see Model.professor
	 * @generated
	 */
	EClass getprofessor();

	/**
	 * Returns the meta object for the attribute '{@link Model.professor#getInstituicao <em>Instituicao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instituicao</em>'.
	 * @see Model.professor#getInstituicao()
	 * @see #getprofessor()
	 * @generated
	 */
	EAttribute getprofessor_Instituicao();

	/**
	 * Returns the meta object for the '{@link Model.professor#registraprofessor() <em>Registraprofessor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registraprofessor</em>' operation.
	 * @see Model.professor#registraprofessor()
	 * @generated
	 */
	EOperation getprofessor__Registraprofessor();

	/**
	 * Returns the meta object for the '{@link Model.professor#excluiprofessor() <em>Excluiprofessor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluiprofessor</em>' operation.
	 * @see Model.professor#excluiprofessor()
	 * @generated
	 */
	EOperation getprofessor__Excluiprofessor();

	/**
	 * Returns the meta object for the '{@link Model.professor#atualizaprofessor() <em>Atualizaprofessor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualizaprofessor</em>' operation.
	 * @see Model.professor#atualizaprofessor()
	 * @generated
	 */
	EOperation getprofessor__Atualizaprofessor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Model.impl.funcionarioImpl <em>funcionario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.funcionarioImpl
		 * @see Model.impl.ModelPackageImpl#getfuncionario()
		 * @generated
		 */
		EClass FUNCIONARIO = eINSTANCE.getfuncionario();

		/**
		 * The meta object literal for the '<em><b>Idfuncionario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCIONARIO__IDFUNCIONARIO = eINSTANCE.getfuncionario_Idfuncionario();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCIONARIO__NOME = eINSTANCE.getfuncionario_Nome();

		/**
		 * The meta object literal for the '<em><b>Registrofuncionario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCIONARIO___REGISTROFUNCIONARIO = eINSTANCE.getfuncionario__Registrofuncionario();

		/**
		 * The meta object literal for the '<em><b>Excluifuncionario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCIONARIO___EXCLUIFUNCIONARIO = eINSTANCE.getfuncionario__Excluifuncionario();

		/**
		 * The meta object literal for the '<em><b>Atualizafuncionario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCIONARIO___ATUALIZAFUNCIONARIO = eINSTANCE.getfuncionario__Atualizafuncionario();

		/**
		 * The meta object literal for the '{@link Model.impl.terminalImpl <em>terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.terminalImpl
		 * @see Model.impl.ModelPackageImpl#getterminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getterminal();

		/**
		 * The meta object literal for the '<em><b>Idterminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__IDTERMINAL = eINSTANCE.getterminal_Idterminal();

		/**
		 * The meta object literal for the '<em><b>Idfuncionario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__IDFUNCIONARIO = eINSTANCE.getterminal_Idfuncionario();

		/**
		 * The meta object literal for the '<em><b>Horalogin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__HORALOGIN = eINSTANCE.getterminal_Horalogin();

		/**
		 * The meta object literal for the '<em><b>Idbiblioteca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__IDBIBLIOTECA = eINSTANCE.getterminal_Idbiblioteca();

		/**
		 * The meta object literal for the '<em><b>Registraacesso</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___REGISTRAACESSO = eINSTANCE.getterminal__Registraacesso();

		/**
		 * The meta object literal for the '{@link Model.impl.bibliotecaImpl <em>biblioteca</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.bibliotecaImpl
		 * @see Model.impl.ModelPackageImpl#getbiblioteca()
		 * @generated
		 */
		EClass BIBLIOTECA = eINSTANCE.getbiblioteca();

		/**
		 * The meta object literal for the '<em><b>Idbiblioteca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOTECA__IDBIBLIOTECA = eINSTANCE.getbiblioteca_Idbiblioteca();

		/**
		 * The meta object literal for the '<em><b>Registrabiblioteca</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECA___REGISTRABIBLIOTECA = eINSTANCE.getbiblioteca__Registrabiblioteca();

		/**
		 * The meta object literal for the '<em><b>Excluibiblioteca</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECA___EXCLUIBIBLIOTECA = eINSTANCE.getbiblioteca__Excluibiblioteca();

		/**
		 * The meta object literal for the '{@link Model.impl.exemplarImpl <em>exemplar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.exemplarImpl
		 * @see Model.impl.ModelPackageImpl#getexemplar()
		 * @generated
		 */
		EClass EXEMPLAR = eINSTANCE.getexemplar();

		/**
		 * The meta object literal for the '<em><b>Idexemplar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__IDEXEMPLAR = eINSTANCE.getexemplar_Idexemplar();

		/**
		 * The meta object literal for the '<em><b>Idpublicacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__IDPUBLICACAO = eINSTANCE.getexemplar_Idpublicacao();

		/**
		 * The meta object literal for the '<em><b>Bloqueado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__BLOQUEADO = eINSTANCE.getexemplar_Bloqueado();

		/**
		 * The meta object literal for the '<em><b>Idbiblioteca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__IDBIBLIOTECA = eINSTANCE.getexemplar_Idbiblioteca();

		/**
		 * The meta object literal for the '<em><b>Registraexemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXEMPLAR___REGISTRAEXEMPLAR = eINSTANCE.getexemplar__Registraexemplar();

		/**
		 * The meta object literal for the '<em><b>Excluiexemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXEMPLAR___EXCLUIEXEMPLAR = eINSTANCE.getexemplar__Excluiexemplar();

		/**
		 * The meta object literal for the '<em><b>Bloqueiaexemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXEMPLAR___BLOQUEIAEXEMPLAR = eINSTANCE.getexemplar__Bloqueiaexemplar();

		/**
		 * The meta object literal for the '{@link Model.impl.emprestimoImpl <em>emprestimo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.emprestimoImpl
		 * @see Model.impl.ModelPackageImpl#getemprestimo()
		 * @generated
		 */
		EClass EMPRESTIMO = eINSTANCE.getemprestimo();

		/**
		 * The meta object literal for the '<em><b>Idemprestimo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__IDEMPRESTIMO = eINSTANCE.getemprestimo_Idemprestimo();

		/**
		 * The meta object literal for the '<em><b>Idexemplar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__IDEXEMPLAR = eINSTANCE.getemprestimo_Idexemplar();

		/**
		 * The meta object literal for the '<em><b>Registrousuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__REGISTROUSUARIO = eINSTANCE.getemprestimo_Registrousuario();

		/**
		 * The meta object literal for the '<em><b>Datadevolucao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__DATADEVOLUCAO = eINSTANCE.getemprestimo_Datadevolucao();

		/**
		 * The meta object literal for the '<em><b>Idbiblioteca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__IDBIBLIOTECA = eINSTANCE.getemprestimo_Idbiblioteca();

		/**
		 * The meta object literal for the '<em><b>Realizaemprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPRESTIMO___REALIZAEMPRESTIMO = eINSTANCE.getemprestimo__Realizaemprestimo();

		/**
		 * The meta object literal for the '<em><b>Realizadevolucao</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPRESTIMO___REALIZADEVOLUCAO = eINSTANCE.getemprestimo__Realizadevolucao();

		/**
		 * The meta object literal for the '<em><b>Calculamulta</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPRESTIMO___CALCULAMULTA = eINSTANCE.getemprestimo__Calculamulta();

		/**
		 * The meta object literal for the '{@link Model.impl.publicacaoImpl <em>publicacao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.publicacaoImpl
		 * @see Model.impl.ModelPackageImpl#getpublicacao()
		 * @generated
		 */
		EClass PUBLICACAO = eINSTANCE.getpublicacao();

		/**
		 * The meta object literal for the '<em><b>Idpublicacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__IDPUBLICACAO = eINSTANCE.getpublicacao_Idpublicacao();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__AUTOR = eINSTANCE.getpublicacao_Autor();

		/**
		 * The meta object literal for the '<em><b>Assunto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__ASSUNTO = eINSTANCE.getpublicacao_Assunto();

		/**
		 * The meta object literal for the '<em><b>Idbiblioteca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__IDBIBLIOTECA = eINSTANCE.getpublicacao_Idbiblioteca();

		/**
		 * The meta object literal for the '<em><b>Registrapublicacao</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLICACAO___REGISTRAPUBLICACAO = eINSTANCE.getpublicacao__Registrapublicacao();

		/**
		 * The meta object literal for the '<em><b>Excluipublicacao</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLICACAO___EXCLUIPUBLICACAO = eINSTANCE.getpublicacao__Excluipublicacao();

		/**
		 * The meta object literal for the '{@link Model.impl.livroImpl <em>livro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.livroImpl
		 * @see Model.impl.ModelPackageImpl#getlivro()
		 * @generated
		 */
		EClass LIVRO = eINSTANCE.getlivro();

		/**
		 * The meta object literal for the '{@link Model.impl.periodicoImpl <em>periodico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.periodicoImpl
		 * @see Model.impl.ModelPackageImpl#getperiodico()
		 * @generated
		 */
		EClass PERIODICO = eINSTANCE.getperiodico();

		/**
		 * The meta object literal for the '{@link Model.impl.teseImpl <em>tese</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.teseImpl
		 * @see Model.impl.ModelPackageImpl#gettese()
		 * @generated
		 */
		EClass TESE = eINSTANCE.gettese();

		/**
		 * The meta object literal for the '{@link Model.impl.manualImpl <em>manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.manualImpl
		 * @see Model.impl.ModelPackageImpl#getmanual()
		 * @generated
		 */
		EClass MANUAL = eINSTANCE.getmanual();

		/**
		 * The meta object literal for the '{@link Model.impl.usuarioImpl <em>usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.usuarioImpl
		 * @see Model.impl.ModelPackageImpl#getusuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getusuario();

		/**
		 * The meta object literal for the '<em><b>Registro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__REGISTRO = eINSTANCE.getusuario_Registro();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NOME = eINSTANCE.getusuario_Nome();

		/**
		 * The meta object literal for the '<em><b>Sobrenome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__SOBRENOME = eINSTANCE.getusuario_Sobrenome();

		/**
		 * The meta object literal for the '<em><b>Pronome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PRONOME = eINSTANCE.getusuario_Pronome();

		/**
		 * The meta object literal for the '<em><b>Datanascimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__DATANASCIMENTO = eINSTANCE.getusuario_Datanascimento();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EMAIL = eINSTANCE.getusuario_Email();

		/**
		 * The meta object literal for the '<em><b>Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CPF = eINSTANCE.getusuario_Cpf();

		/**
		 * The meta object literal for the '<em><b>Fone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__FONE = eINSTANCE.getusuario_Fone();

		/**
		 * The meta object literal for the '<em><b>Endereco</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ENDERECO = eINSTANCE.getusuario_Endereco();

		/**
		 * The meta object literal for the '<em><b>Cep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CEP = eINSTANCE.getusuario_Cep();

		/**
		 * The meta object literal for the '<em><b>Cidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CIDADE = eINSTANCE.getusuario_Cidade();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ESTADO = eINSTANCE.getusuario_Estado();

		/**
		 * The meta object literal for the '<em><b>Pais</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PAIS = eINSTANCE.getusuario_Pais();

		/**
		 * The meta object literal for the '<em><b>Registrausuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___REGISTRAUSUARIO = eINSTANCE.getusuario__Registrausuario();

		/**
		 * The meta object literal for the '<em><b>Excluiusuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___EXCLUIUSUARIO = eINSTANCE.getusuario__Excluiusuario();

		/**
		 * The meta object literal for the '<em><b>Atualizausuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___ATUALIZAUSUARIO = eINSTANCE.getusuario__Atualizausuario();

		/**
		 * The meta object literal for the '{@link Model.impl.alunoImpl <em>aluno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.alunoImpl
		 * @see Model.impl.ModelPackageImpl#getaluno()
		 * @generated
		 */
		EClass ALUNO = eINSTANCE.getaluno();

		/**
		 * The meta object literal for the '<em><b>Curso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__CURSO = eINSTANCE.getaluno_Curso();

		/**
		 * The meta object literal for the '<em><b>Registraaluno</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALUNO___REGISTRAALUNO = eINSTANCE.getaluno__Registraaluno();

		/**
		 * The meta object literal for the '<em><b>Excluialuno</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALUNO___EXCLUIALUNO = eINSTANCE.getaluno__Excluialuno();

		/**
		 * The meta object literal for the '<em><b>Atualizaaluno</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALUNO___ATUALIZAALUNO = eINSTANCE.getaluno__Atualizaaluno();

		/**
		 * The meta object literal for the '{@link Model.impl.professorImpl <em>professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.professorImpl
		 * @see Model.impl.ModelPackageImpl#getprofessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getprofessor();

		/**
		 * The meta object literal for the '<em><b>Instituicao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__INSTITUICAO = eINSTANCE.getprofessor_Instituicao();

		/**
		 * The meta object literal for the '<em><b>Registraprofessor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___REGISTRAPROFESSOR = eINSTANCE.getprofessor__Registraprofessor();

		/**
		 * The meta object literal for the '<em><b>Excluiprofessor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___EXCLUIPROFESSOR = eINSTANCE.getprofessor__Excluiprofessor();

		/**
		 * The meta object literal for the '<em><b>Atualizaprofessor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___ATUALIZAPROFESSOR = eINSTANCE.getprofessor__Atualizaprofessor();

	}

} //ModelPackage
