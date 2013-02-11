/**
 */
package processes.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jwt.meta.model.processes.InitialNode;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InitialNodeImpl extends ControlNodeImpl implements InitialNode {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InitialNodeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.INITIAL_NODE;
   }

} //InitialNodeImpl
