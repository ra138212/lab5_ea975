/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exemplar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.exemplar#getIdexemplar <em>Idexemplar</em>}</li>
 *   <li>{@link Model.exemplar#getIdpublicacao <em>Idpublicacao</em>}</li>
 *   <li>{@link Model.exemplar#isBloqueado <em>Bloqueado</em>}</li>
 *   <li>{@link Model.exemplar#getIdbiblioteca <em>Idbiblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getexemplar()
 * @model
 * @generated
 */
public interface exemplar extends EObject {
	/**
	 * Returns the value of the '<em><b>Idexemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idexemplar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idexemplar</em>' attribute.
	 * @see #setIdexemplar(int)
	 * @see Model.ModelPackage#getexemplar_Idexemplar()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdexemplar();

	/**
	 * Sets the value of the '{@link Model.exemplar#getIdexemplar <em>Idexemplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idexemplar</em>' attribute.
	 * @see #getIdexemplar()
	 * @generated
	 */
	void setIdexemplar(int value);

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
	 * @see Model.ModelPackage#getexemplar_Idpublicacao()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdpublicacao();

	/**
	 * Sets the value of the '{@link Model.exemplar#getIdpublicacao <em>Idpublicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idpublicacao</em>' attribute.
	 * @see #getIdpublicacao()
	 * @generated
	 */
	void setIdpublicacao(int value);

	/**
	 * Returns the value of the '<em><b>Bloqueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloqueado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloqueado</em>' attribute.
	 * @see #setBloqueado(boolean)
	 * @see Model.ModelPackage#getexemplar_Bloqueado()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBloqueado();

	/**
	 * Sets the value of the '{@link Model.exemplar#isBloqueado <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloqueado</em>' attribute.
	 * @see #isBloqueado()
	 * @generated
	 */
	void setBloqueado(boolean value);

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
	 * @see Model.ModelPackage#getexemplar_Idbiblioteca()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdbiblioteca();

	/**
	 * Sets the value of the '{@link Model.exemplar#getIdbiblioteca <em>Idbiblioteca</em>}' attribute.
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
	void registraexemplar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void excluiexemplar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bloqueiaexemplar();

} // exemplar
