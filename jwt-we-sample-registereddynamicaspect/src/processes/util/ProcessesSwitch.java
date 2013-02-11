/**
 */
package processes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.jwt.meta.model.core.GraphicalElement;
import org.eclipse.jwt.meta.model.core.ModelElement;
import org.eclipse.jwt.meta.model.core.NamedElement;
import org.eclipse.jwt.meta.model.core.PackageableElement;

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

import processes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see processes.ProcessesPackage
 * @generated
 */
public class ProcessesSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static ProcessesPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProcessesSwitch() {
      if (modelPackage == null) {
         modelPackage = ProcessesPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case ProcessesPackage.SCOPE: {
            Scope scope = (Scope)theEObject;
            T result = caseScope(scope);
            if (result == null) result = caseModelElement(scope);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.ACTIVITY: {
            Activity activity = (Activity)theEObject;
            T result = caseActivity(activity);
            if (result == null) result = casePackageableElement(activity);
            if (result == null) result = caseScope(activity);
            if (result == null) result = caseNamedElement(activity);
            if (result == null) result = caseModelElement(activity);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE: {
            StructuredActivityNode structuredActivityNode = (StructuredActivityNode)theEObject;
            T result = caseStructuredActivityNode(structuredActivityNode);
            if (result == null) result = caseScope(structuredActivityNode);
            if (result == null) result = caseExecutableNode(structuredActivityNode);
            if (result == null) result = caseActivityNode(structuredActivityNode);
            if (result == null) result = caseNamedElement(structuredActivityNode);
            if (result == null) result = caseGraphicalElement(structuredActivityNode);
            if (result == null) result = caseModelElement(structuredActivityNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.ACTIVITY_NODE: {
            ActivityNode activityNode = (ActivityNode)theEObject;
            T result = caseActivityNode(activityNode);
            if (result == null) result = caseNamedElement(activityNode);
            if (result == null) result = caseGraphicalElement(activityNode);
            if (result == null) result = caseModelElement(activityNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.ACTIVITY_EDGE: {
            ActivityEdge activityEdge = (ActivityEdge)theEObject;
            T result = caseActivityEdge(activityEdge);
            if (result == null) result = caseModelElement(activityEdge);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.GUARD_SPECIFICATION: {
            GuardSpecification guardSpecification = (GuardSpecification)theEObject;
            T result = caseGuardSpecification(guardSpecification);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.EXECUTABLE_NODE: {
            ExecutableNode executableNode = (ExecutableNode)theEObject;
            T result = caseExecutableNode(executableNode);
            if (result == null) result = caseActivityNode(executableNode);
            if (result == null) result = caseNamedElement(executableNode);
            if (result == null) result = caseGraphicalElement(executableNode);
            if (result == null) result = caseModelElement(executableNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.ACTION: {
            Action action = (Action)theEObject;
            T result = caseAction(action);
            if (result == null) result = caseExecutableNode(action);
            if (result == null) result = caseActivityNode(action);
            if (result == null) result = caseNamedElement(action);
            if (result == null) result = caseGraphicalElement(action);
            if (result == null) result = caseModelElement(action);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.CONTROL_NODE: {
            ControlNode controlNode = (ControlNode)theEObject;
            T result = caseControlNode(controlNode);
            if (result == null) result = caseActivityNode(controlNode);
            if (result == null) result = caseNamedElement(controlNode);
            if (result == null) result = caseGraphicalElement(controlNode);
            if (result == null) result = caseModelElement(controlNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.INITIAL_NODE: {
            InitialNode initialNode = (InitialNode)theEObject;
            T result = caseInitialNode(initialNode);
            if (result == null) result = caseControlNode(initialNode);
            if (result == null) result = caseActivityNode(initialNode);
            if (result == null) result = caseNamedElement(initialNode);
            if (result == null) result = caseGraphicalElement(initialNode);
            if (result == null) result = caseModelElement(initialNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.FORK_NODE: {
            ForkNode forkNode = (ForkNode)theEObject;
            T result = caseForkNode(forkNode);
            if (result == null) result = caseControlNode(forkNode);
            if (result == null) result = caseActivityNode(forkNode);
            if (result == null) result = caseNamedElement(forkNode);
            if (result == null) result = caseGraphicalElement(forkNode);
            if (result == null) result = caseModelElement(forkNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.JOIN_NODE: {
            JoinNode joinNode = (JoinNode)theEObject;
            T result = caseJoinNode(joinNode);
            if (result == null) result = caseControlNode(joinNode);
            if (result == null) result = caseActivityNode(joinNode);
            if (result == null) result = caseNamedElement(joinNode);
            if (result == null) result = caseGraphicalElement(joinNode);
            if (result == null) result = caseModelElement(joinNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.MERGE_NODE: {
            MergeNode mergeNode = (MergeNode)theEObject;
            T result = caseMergeNode(mergeNode);
            if (result == null) result = caseControlNode(mergeNode);
            if (result == null) result = caseActivityNode(mergeNode);
            if (result == null) result = caseNamedElement(mergeNode);
            if (result == null) result = caseGraphicalElement(mergeNode);
            if (result == null) result = caseModelElement(mergeNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.DECISION_NODE: {
            DecisionNode decisionNode = (DecisionNode)theEObject;
            T result = caseDecisionNode(decisionNode);
            if (result == null) result = caseControlNode(decisionNode);
            if (result == null) result = caseActivityNode(decisionNode);
            if (result == null) result = caseNamedElement(decisionNode);
            if (result == null) result = caseGraphicalElement(decisionNode);
            if (result == null) result = caseModelElement(decisionNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.FINAL_NODE: {
            FinalNode finalNode = (FinalNode)theEObject;
            T result = caseFinalNode(finalNode);
            if (result == null) result = caseControlNode(finalNode);
            if (result == null) result = caseActivityNode(finalNode);
            if (result == null) result = caseNamedElement(finalNode);
            if (result == null) result = caseGraphicalElement(finalNode);
            if (result == null) result = caseModelElement(finalNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.GUARD: {
            Guard guard = (Guard)theEObject;
            T result = caseGuard(guard);
            if (result == null) result = caseNamedElement(guard);
            if (result == null) result = caseModelElement(guard);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case ProcessesPackage.ACTIVITY_LINK_NODE: {
            ActivityLinkNode activityLinkNode = (ActivityLinkNode)theEObject;
            T result = caseActivityLinkNode(activityLinkNode);
            if (result == null) result = caseExecutableNode(activityLinkNode);
            if (result == null) result = caseActivityNode(activityLinkNode);
            if (result == null) result = caseNamedElement(activityLinkNode);
            if (result == null) result = caseGraphicalElement(activityLinkNode);
            if (result == null) result = caseModelElement(activityLinkNode);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseScope(Scope object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActivity(Activity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStructuredActivityNode(StructuredActivityNode object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActivityNode(ActivityNode object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActivityEdge(ActivityEdge object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Guard Specification</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Guard Specification</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGuardSpecification(GuardSpecification object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExecutableNode(ExecutableNode object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Action</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAction(Action object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseControlNode(ControlNode object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInitialNode(InitialNode object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseForkNode(ForkNode object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJoinNode(JoinNode object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Merge Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Merge Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMergeNode(MergeNode object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDecisionNode(DecisionNode object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Final Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Final Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseFinalNode(FinalNode object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGuard(Guard object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Activity Link Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Activity Link Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActivityLinkNode(ActivityLinkNode object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseModelElement(ModelElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNamedElement(NamedElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePackageableElement(PackageableElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGraphicalElement(GraphicalElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object) {
      return null;
   }

} //ProcessesSwitch
