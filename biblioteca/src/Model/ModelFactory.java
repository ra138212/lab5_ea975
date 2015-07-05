/**
 */
package Model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = Model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>funcionario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>funcionario</em>'.
	 * @generated
	 */
	funcionario createfuncionario();

	/**
	 * Returns a new object of class '<em>terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>terminal</em>'.
	 * @generated
	 */
	terminal createterminal();

	/**
	 * Returns a new object of class '<em>biblioteca</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>biblioteca</em>'.
	 * @generated
	 */
	biblioteca createbiblioteca();

	/**
	 * Returns a new object of class '<em>exemplar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>exemplar</em>'.
	 * @generated
	 */
	exemplar createexemplar();

	/**
	 * Returns a new object of class '<em>emprestimo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>emprestimo</em>'.
	 * @generated
	 */
	emprestimo createemprestimo();

	/**
	 * Returns a new object of class '<em>publicacao</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>publicacao</em>'.
	 * @generated
	 */
	publicacao createpublicacao();

	/**
	 * Returns a new object of class '<em>livro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>livro</em>'.
	 * @generated
	 */
	livro createlivro();

	/**
	 * Returns a new object of class '<em>periodico</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>periodico</em>'.
	 * @generated
	 */
	periodico createperiodico();

	/**
	 * Returns a new object of class '<em>tese</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tese</em>'.
	 * @generated
	 */
	tese createtese();

	/**
	 * Returns a new object of class '<em>manual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>manual</em>'.
	 * @generated
	 */
	manual createmanual();

	/**
	 * Returns a new object of class '<em>usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>usuario</em>'.
	 * @generated
	 */
	usuario createusuario();

	/**
	 * Returns a new object of class '<em>aluno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>aluno</em>'.
	 * @generated
	 */
	aluno createaluno();

	/**
	 * Returns a new object of class '<em>professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>professor</em>'.
	 * @generated
	 */
	professor createprofessor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
