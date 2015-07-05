/**
 */
package Model.util;

import Model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.FUNCIONARIO: {
				funcionario funcionario = (funcionario)theEObject;
				T result = casefuncionario(funcionario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TERMINAL: {
				terminal terminal = (terminal)theEObject;
				T result = caseterminal(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BIBLIOTECA: {
				biblioteca biblioteca = (biblioteca)theEObject;
				T result = casebiblioteca(biblioteca);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXEMPLAR: {
				exemplar exemplar = (exemplar)theEObject;
				T result = caseexemplar(exemplar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EMPRESTIMO: {
				emprestimo emprestimo = (emprestimo)theEObject;
				T result = caseemprestimo(emprestimo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PUBLICACAO: {
				publicacao publicacao = (publicacao)theEObject;
				T result = casepublicacao(publicacao);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LIVRO: {
				livro livro = (livro)theEObject;
				T result = caselivro(livro);
				if (result == null) result = casepublicacao(livro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PERIODICO: {
				periodico periodico = (periodico)theEObject;
				T result = caseperiodico(periodico);
				if (result == null) result = casepublicacao(periodico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TESE: {
				tese tese = (tese)theEObject;
				T result = casetese(tese);
				if (result == null) result = casepublicacao(tese);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MANUAL: {
				manual manual = (manual)theEObject;
				T result = casemanual(manual);
				if (result == null) result = casepublicacao(manual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.USUARIO: {
				usuario usuario = (usuario)theEObject;
				T result = caseusuario(usuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALUNO: {
				aluno aluno = (aluno)theEObject;
				T result = casealuno(aluno);
				if (result == null) result = caseusuario(aluno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROFESSOR: {
				professor professor = (professor)theEObject;
				T result = caseprofessor(professor);
				if (result == null) result = caseusuario(professor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>funcionario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>funcionario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefuncionario(funcionario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseterminal(terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>biblioteca</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>biblioteca</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebiblioteca(biblioteca object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>exemplar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>exemplar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseexemplar(exemplar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>emprestimo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>emprestimo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseemprestimo(emprestimo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>publicacao</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>publicacao</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepublicacao(publicacao object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>livro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>livro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselivro(livro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>periodico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>periodico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseperiodico(periodico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tese</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tese</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetese(tese object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>manual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>manual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemanual(manual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>usuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>usuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseusuario(usuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>aluno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>aluno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casealuno(aluno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>professor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>professor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseprofessor(professor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
