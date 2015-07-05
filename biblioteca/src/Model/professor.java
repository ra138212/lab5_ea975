/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>professor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.professor#getInstituicao <em>Instituicao</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getprofessor()
 * @model
 * @generated
 */
public interface professor extends usuario {
	/**
	 * Returns the value of the '<em><b>Instituicao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instituicao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instituicao</em>' attribute.
	 * @see #setInstituicao(String)
	 * @see Model.ModelPackage#getprofessor_Instituicao()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInstituicao();

	/**
	 * Sets the value of the '{@link Model.professor#getInstituicao <em>Instituicao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instituicao</em>' attribute.
	 * @see #getInstituicao()
	 * @generated
	 */
	void setInstituicao(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registraprofessor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void excluiprofessor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void atualizaprofessor();

} // professor
