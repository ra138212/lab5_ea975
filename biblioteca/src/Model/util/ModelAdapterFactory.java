/**
 */
package Model.util;

import Model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter casefuncionario(funcionario object) {
				return createfuncionarioAdapter();
			}
			@Override
			public Adapter caseterminal(terminal object) {
				return createterminalAdapter();
			}
			@Override
			public Adapter casebiblioteca(biblioteca object) {
				return createbibliotecaAdapter();
			}
			@Override
			public Adapter caseexemplar(exemplar object) {
				return createexemplarAdapter();
			}
			@Override
			public Adapter caseemprestimo(emprestimo object) {
				return createemprestimoAdapter();
			}
			@Override
			public Adapter casepublicacao(publicacao object) {
				return createpublicacaoAdapter();
			}
			@Override
			public Adapter caselivro(livro object) {
				return createlivroAdapter();
			}
			@Override
			public Adapter caseperiodico(periodico object) {
				return createperiodicoAdapter();
			}
			@Override
			public Adapter casetese(tese object) {
				return createteseAdapter();
			}
			@Override
			public Adapter casemanual(manual object) {
				return createmanualAdapter();
			}
			@Override
			public Adapter caseusuario(usuario object) {
				return createusuarioAdapter();
			}
			@Override
			public Adapter casealuno(aluno object) {
				return createalunoAdapter();
			}
			@Override
			public Adapter caseprofessor(professor object) {
				return createprofessorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Model.funcionario <em>funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.funcionario
	 * @generated
	 */
	public Adapter createfuncionarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.terminal <em>terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.terminal
	 * @generated
	 */
	public Adapter createterminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.biblioteca <em>biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.biblioteca
	 * @generated
	 */
	public Adapter createbibliotecaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.exemplar <em>exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.exemplar
	 * @generated
	 */
	public Adapter createexemplarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.emprestimo <em>emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.emprestimo
	 * @generated
	 */
	public Adapter createemprestimoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.publicacao <em>publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.publicacao
	 * @generated
	 */
	public Adapter createpublicacaoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.livro <em>livro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.livro
	 * @generated
	 */
	public Adapter createlivroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.periodico <em>periodico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.periodico
	 * @generated
	 */
	public Adapter createperiodicoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.tese <em>tese</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.tese
	 * @generated
	 */
	public Adapter createteseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.manual <em>manual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.manual
	 * @generated
	 */
	public Adapter createmanualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.usuario <em>usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.usuario
	 * @generated
	 */
	public Adapter createusuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.aluno <em>aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.aluno
	 * @generated
	 */
	public Adapter createalunoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.professor <em>professor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.professor
	 * @generated
	 */
	public Adapter createprofessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
