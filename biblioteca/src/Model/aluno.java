/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>aluno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.aluno#getCurso <em>Curso</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getaluno()
 * @model
 * @generated
 */
public interface aluno extends usuario {
	/**
	 * Returns the value of the '<em><b>Curso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curso</em>' attribute.
	 * @see #setCurso(String)
	 * @see Model.ModelPackage#getaluno_Curso()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCurso();

	/**
	 * Sets the value of the '{@link Model.aluno#getCurso <em>Curso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curso</em>' attribute.
	 * @see #getCurso()
	 * @generated
	 */
	void setCurso(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registraaluno();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void excluialuno();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void atualizaaluno();

} // aluno
