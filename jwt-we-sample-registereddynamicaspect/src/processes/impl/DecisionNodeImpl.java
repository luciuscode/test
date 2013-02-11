/**
 */
package processes.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jwt.meta.model.processes.DecisionNode;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DecisionNodeImpl extends ControlNodeImpl implements DecisionNode {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected DecisionNodeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.DECISION_NODE;
   }

} //DecisionNodeImpl
