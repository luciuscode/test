/**
 */
package processes;

import org.eclipse.emf.ecore.EFactory;

import org.eclipse.jwt.meta.model.processes.Action;
import org.eclipse.jwt.meta.model.processes.Activity;
import org.eclipse.jwt.meta.model.processes.ActivityEdge;
import org.eclipse.jwt.meta.model.processes.ActivityLinkNode;
import org.eclipse.jwt.meta.model.processes.ActivityNode;
import org.eclipse.jwt.meta.model.processes.ControlNode;
import org.eclipse.jwt.meta.model.processes.DecisionNode;
import org.eclipse.jwt.meta.model.processes.ExecutableNode;
import org.eclipse.jwt.meta.model.processes.FinalNode;
import org.eclipse.jwt.meta.model.processes.ForkNode;
import org.eclipse.jwt.meta.model.processes.Guard;
import org.eclipse.jwt.meta.model.processes.GuardSpecification;
import org.eclipse.jwt.meta.model.processes.InitialNode;
import org.eclipse.jwt.meta.model.processes.JoinNode;
import org.eclipse.jwt.meta.model.processes.MergeNode;
import org.eclipse.jwt.meta.model.processes.Scope;
import org.eclipse.jwt.meta.model.processes.StructuredActivityNode;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see processes.ProcessesPackage
 * @generated
 */
public interface ProcessesFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ProcessesFactory eINSTANCE = processes.impl.ProcessesFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Scope</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Scope</em>'.
    * @generated
    */
   Scope createScope();

   /**
    * Returns a new object of class '<em>Activity</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Activity</em>'.
    * @generated
    */
   Activity createActivity();

   /**
    * Returns a new object of class '<em>Structured Activity Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Structured Activity Node</em>'.
    * @generated
    */
   StructuredActivityNode createStructuredActivityNode();

   /**
    * Returns a new object of class '<em>Activity Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Activity Node</em>'.
    * @generated
    */
   ActivityNode createActivityNode();

   /**
    * Returns a new object of class '<em>Activity Edge</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Activity Edge</em>'.
    * @generated
    */
   ActivityEdge createActivityEdge();

   /**
    * Returns a new object of class '<em>Guard Specification</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Guard Specification</em>'.
    * @generated
    */
   GuardSpecification createGuardSpecification();

   /**
    * Returns a new object of class '<em>Executable Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Executable Node</em>'.
    * @generated
    */
   ExecutableNode createExecutableNode();

   /**
    * Returns a new object of class '<em>Action</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Action</em>'.
    * @generated
    */
   Action createAction();

   /**
    * Returns a new object of class '<em>Control Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Control Node</em>'.
    * @generated
    */
   ControlNode createControlNode();

   /**
    * Returns a new object of class '<em>Initial Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Initial Node</em>'.
    * @generated
    */
   InitialNode createInitialNode();

   /**
    * Returns a new object of class '<em>Fork Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Fork Node</em>'.
    * @generated
    */
   ForkNode createForkNode();

   /**
    * Returns a new object of class '<em>Join Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Join Node</em>'.
    * @generated
    */
   JoinNode createJoinNode();

   /**
    * Returns a new object of class '<em>Merge Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Merge Node</em>'.
    * @generated
    */
   MergeNode createMergeNode();

   /**
    * Returns a new object of class '<em>Decision Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Decision Node</em>'.
    * @generated
    */
   DecisionNode createDecisionNode();

   /**
    * Returns a new object of class '<em>Final Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Final Node</em>'.
    * @generated
    */
   FinalNode createFinalNode();

   /**
    * Returns a new object of class '<em>Guard</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Guard</em>'.
    * @generated
    */
   Guard createGuard();

   /**
    * Returns a new object of class '<em>Activity Link Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Activity Link Node</em>'.
    * @generated
    */
   ActivityLinkNode createActivityLinkNode();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   ProcessesPackage getProcessesPackage();

} //ProcessesFactory
