/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>publicacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.publicacao#getIdpublicacao <em>Idpublicacao</em>}</li>
 *   <li>{@link Model.publicacao#getAutor <em>Autor</em>}</li>
 *   <li>{@link Model.publicacao#getAssunto <em>Assunto</em>}</li>
 *   <li>{@link Model.publicacao#getIdbiblioteca <em>Idbiblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getpublicacao()
 * @model
 * @generated
 */
public interface publicacao extends EObject {
	/**
	 * Returns the value of the '<em><b>Idpublicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idpublicacao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idpublicacao</em>' attribute.
	 * @see #setIdpublicacao(int)
	 * @see Model.ModelPackage#getpublicacao_Idpublicacao()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdpublicacao();

	/**
	 * Sets the value of the '{@link Model.publicacao#getIdpublicacao <em>Idpublicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idpublicacao</em>' attribute.
	 * @see #getIdpublicacao()
	 * @generated
	 */
	void setIdpublicacao(int value);

	/**
	 * Returns the value of the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autor</em>' attribute.
	 * @see #setAutor(String)
	 * @see Model.ModelPackage#getpublicacao_Autor()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAutor();

	/**
	 * Sets the value of the '{@link Model.publicacao#getAutor <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' attribute.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(String value);

	/**
	 * Returns the value of the '<em><b>Assunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assunto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assunto</em>' attribute.
	 * @see #setAssunto(String)
	 * @see Model.ModelPackage#getpublicacao_Assunto()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAssunto();

	/**
	 * Sets the value of the '{@link Model.publicacao#getAssunto <em>Assunto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assunto</em>' attribute.
	 * @see #getAssunto()
	 * @generated
	 */
	void setAssunto(String value);

	/**
	 * Returns the value of the '<em><b>Idbiblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idbiblioteca</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idbiblioteca</em>' attribute.
	 * @see #setIdbiblioteca(int)
	 * @see Model.ModelPackage#getpublicacao_Idbiblioteca()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdbiblioteca();

	/**
	 * Sets the value of the '{@link Model.publicacao#getIdbiblioteca <em>Idbiblioteca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idbiblioteca</em>' attribute.
	 * @see #getIdbiblioteca()
	 * @generated
	 */
	void setIdbiblioteca(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registrapublicacao();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void excluipublicacao();

} // publicacao
