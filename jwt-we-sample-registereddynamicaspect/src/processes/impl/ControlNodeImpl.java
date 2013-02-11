/**
 */
package processes.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jwt.meta.model.processes.ControlNode;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ControlNodeImpl extends ActivityNodeImpl implements ControlNode {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ControlNodeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.CONTROL_NODE;
   }

} //ControlNodeImpl
