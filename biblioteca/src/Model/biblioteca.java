/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>biblioteca</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.biblioteca#getIdbiblioteca <em>Idbiblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getbiblioteca()
 * @model
 * @generated
 */
public interface biblioteca extends EObject {
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
	 * @see Model.ModelPackage#getbiblioteca_Idbiblioteca()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdbiblioteca();

	/**
	 * Sets the value of the '{@link Model.biblioteca#getIdbiblioteca <em>Idbiblioteca</em>}' attribute.
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
	void registrabiblioteca();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void excluibiblioteca();

} // biblioteca
