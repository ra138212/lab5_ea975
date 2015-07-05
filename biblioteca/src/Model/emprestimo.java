/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>emprestimo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.emprestimo#getIdemprestimo <em>Idemprestimo</em>}</li>
 *   <li>{@link Model.emprestimo#getIdexemplar <em>Idexemplar</em>}</li>
 *   <li>{@link Model.emprestimo#getRegistrousuario <em>Registrousuario</em>}</li>
 *   <li>{@link Model.emprestimo#getDatadevolucao <em>Datadevolucao</em>}</li>
 *   <li>{@link Model.emprestimo#getIdbiblioteca <em>Idbiblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getemprestimo()
 * @model
 * @generated
 */
public interface emprestimo extends EObject {
	/**
	 * Returns the value of the '<em><b>Idemprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idemprestimo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idemprestimo</em>' attribute.
	 * @see #setIdemprestimo(int)
	 * @see Model.ModelPackage#getemprestimo_Idemprestimo()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdemprestimo();

	/**
	 * Sets the value of the '{@link Model.emprestimo#getIdemprestimo <em>Idemprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idemprestimo</em>' attribute.
	 * @see #getIdemprestimo()
	 * @generated
	 */
	void setIdemprestimo(int value);

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
	 * @see Model.ModelPackage#getemprestimo_Idexemplar()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdexemplar();

	/**
	 * Sets the value of the '{@link Model.emprestimo#getIdexemplar <em>Idexemplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idexemplar</em>' attribute.
	 * @see #getIdexemplar()
	 * @generated
	 */
	void setIdexemplar(int value);

	/**
	 * Returns the value of the '<em><b>Registrousuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registrousuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registrousuario</em>' attribute.
	 * @see #setRegistrousuario(int)
	 * @see Model.ModelPackage#getemprestimo_Registrousuario()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRegistrousuario();

	/**
	 * Sets the value of the '{@link Model.emprestimo#getRegistrousuario <em>Registrousuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registrousuario</em>' attribute.
	 * @see #getRegistrousuario()
	 * @generated
	 */
	void setRegistrousuario(int value);

	/**
	 * Returns the value of the '<em><b>Datadevolucao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datadevolucao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datadevolucao</em>' attribute.
	 * @see #setDatadevolucao(Date)
	 * @see Model.ModelPackage#getemprestimo_Datadevolucao()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getDatadevolucao();

	/**
	 * Sets the value of the '{@link Model.emprestimo#getDatadevolucao <em>Datadevolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadevolucao</em>' attribute.
	 * @see #getDatadevolucao()
	 * @generated
	 */
	void setDatadevolucao(Date value);

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
	 * @see Model.ModelPackage#getemprestimo_Idbiblioteca()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdbiblioteca();

	/**
	 * Sets the value of the '{@link Model.emprestimo#getIdbiblioteca <em>Idbiblioteca</em>}' attribute.
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
	void realizaemprestimo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void realizadevolucao();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculamulta();

} // emprestimo
