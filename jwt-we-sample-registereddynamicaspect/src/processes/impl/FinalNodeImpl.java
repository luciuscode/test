/**
 */
package processes.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jwt.meta.model.processes.FinalNode;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FinalNodeImpl extends ControlNodeImpl implements FinalNode {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected FinalNodeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.FINAL_NODE;
   }

} //FinalNodeImpl
