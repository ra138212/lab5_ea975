/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.terminal#getIdterminal <em>Idterminal</em>}</li>
 *   <li>{@link Model.terminal#getIdfuncionario <em>Idfuncionario</em>}</li>
 *   <li>{@link Model.terminal#getHoralogin <em>Horalogin</em>}</li>
 *   <li>{@link Model.terminal#getIdbiblioteca <em>Idbiblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getterminal()
 * @model
 * @generated
 */
public interface terminal extends EObject {
	/**
	 * Returns the value of the '<em><b>Idterminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idterminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idterminal</em>' attribute.
	 * @see #setIdterminal(int)
	 * @see Model.ModelPackage#getterminal_Idterminal()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdterminal();

	/**
	 * Sets the value of the '{@link Model.terminal#getIdterminal <em>Idterminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idterminal</em>' attribute.
	 * @see #getIdterminal()
	 * @generated
	 */
	void setIdterminal(int value);

	/**
	 * Returns the value of the '<em><b>Idfuncionario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idfuncionario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idfuncionario</em>' attribute.
	 * @see #setIdfuncionario(int)
	 * @see Model.ModelPackage#getterminal_Idfuncionario()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdfuncionario();

	/**
	 * Sets the value of the '{@link Model.terminal#getIdfuncionario <em>Idfuncionario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idfuncionario</em>' attribute.
	 * @see #getIdfuncionario()
	 * @generated
	 */
	void setIdfuncionario(int value);

	/**
	 * Returns the value of the '<em><b>Horalogin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horalogin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horalogin</em>' attribute.
	 * @see #setHoralogin(Date)
	 * @see Model.ModelPackage#getterminal_Horalogin()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getHoralogin();

	/**
	 * Sets the value of the '{@link Model.terminal#getHoralogin <em>Horalogin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horalogin</em>' attribute.
	 * @see #getHoralogin()
	 * @generated
	 */
	void setHoralogin(Date value);

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
	 * @see Model.ModelPackage#getterminal_Idbiblioteca()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdbiblioteca();

	/**
	 * Sets the value of the '{@link Model.terminal#getIdbiblioteca <em>Idbiblioteca</em>}' attribute.
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
	void registraacesso();

} // terminal
