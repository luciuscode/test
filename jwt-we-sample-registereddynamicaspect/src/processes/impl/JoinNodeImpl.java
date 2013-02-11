/**
 */
package processes.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jwt.meta.model.processes.JoinNode;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class JoinNodeImpl extends ControlNodeImpl implements JoinNode {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected JoinNodeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.JOIN_NODE;
   }

} //JoinNodeImpl
