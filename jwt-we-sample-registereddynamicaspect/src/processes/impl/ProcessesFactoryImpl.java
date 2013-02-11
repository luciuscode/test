/**
 */
package processes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessesFactoryImpl extends EFactoryImpl implements ProcessesFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static ProcessesFactory init() {
      try {
         ProcessesFactory theProcessesFactory = (ProcessesFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.jwt/processes"); 
         if (theProcessesFactory != null) {
            return theProcessesFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new ProcessesFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProcessesFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case ProcessesPackage.SCOPE: return createScope();
         case ProcessesPackage.ACTIVITY: return createActivity();
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE: return createStructuredActivityNode();
         case ProcessesPackage.ACTIVITY_NODE: return createActivityNode();
         case ProcessesPackage.ACTIVITY_EDGE: return createActivityEdge();
         case ProcessesPackage.GUARD_SPECIFICATION: return createGuardSpecification();
         case ProcessesPackage.EXECUTABLE_NODE: return createExecutableNode();
         case ProcessesPackage.ACTION: return createAction();
         case ProcessesPackage.CONTROL_NODE: return createControlNode();
         case ProcessesPackage.INITIAL_NODE: return createInitialNode();
         case ProcessesPackage.FORK_NODE: return createForkNode();
         case ProcessesPackage.JOIN_NODE: return createJoinNode();
         case ProcessesPackage.MERGE_NODE: return createMergeNode();
         case ProcessesPackage.DECISION_NODE: return createDecisionNode();
         case ProcessesPackage.FINAL_NODE: return createFinalNode();
         case ProcessesPackage.GUARD: return createGuard();
         case ProcessesPackage.ACTIVITY_LINK_NODE: return createActivityLinkNode();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object createFromString(EDataType eDataType, String initialValue) {
      switch (eDataType.getClassifierID()) {
         case ProcessesPackage.OPERATION_TYPE:
            return createOperationTypeFromString(eDataType, initialValue);
         case ProcessesPackage.BOOLEAN_CONNECTOR:
            return createBooleanConnectorFromString(eDataType, initialValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String convertToString(EDataType eDataType, Object instanceValue) {
      switch (eDataType.getClassifierID()) {
         case ProcessesPackage.OPERATION_TYPE:
            return convertOperationTypeToString(eDataType, instanceValue);
         case ProcessesPackage.BOOLEAN_CONNECTOR:
            return convertBooleanConnectorToString(eDataType, instanceValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Scope createScope() {
      ScopeImpl scope = new ScopeImpl();
      return scope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Activity createActivity() {
      ActivityImpl activity = new ActivityImpl();
      return activity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StructuredActivityNode createStructuredActivityNode() {
      StructuredActivityNodeImpl structuredActivityNode = new StructuredActivityNodeImpl();
      return structuredActivityNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode createActivityNode() {
      ActivityNodeImpl activityNode = new ActivityNodeImpl();
      return activityNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivityEdge createActivityEdge() {
      ActivityEdgeImpl activityEdge = new ActivityEdgeImpl();
      return activityEdge;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GuardSpecification createGuardSpecification() {
      GuardSpecificationImpl guardSpecification = new GuardSpecificationImpl();
      return guardSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExecutableNode createExecutableNode() {
      ExecutableNodeImpl executableNode = new ExecutableNodeImpl();
      return executableNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action createAction() {
      ActionImpl action = new ActionImpl();
      return action;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ControlNode createControlNode() {
      ControlNodeImpl controlNode = new ControlNodeImpl();
      return controlNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InitialNode createInitialNode() {
      InitialNodeImpl initialNode = new InitialNodeImpl();
      return initialNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ForkNode createForkNode() {
      ForkNodeImpl forkNode = new ForkNodeImpl();
      return forkNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public JoinNode createJoinNode() {
      JoinNodeImpl joinNode = new JoinNodeImpl();
      return joinNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public MergeNode createMergeNode() {
      MergeNodeImpl mergeNode = new MergeNodeImpl();
      return mergeNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DecisionNode createDecisionNode() {
      DecisionNodeImpl decisionNode = new DecisionNodeImpl();
      return decisionNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public FinalNode createFinalNode() {
      FinalNodeImpl finalNode = new FinalNodeImpl();
      return finalNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Guard createGuard() {
      GuardImpl guard = new GuardImpl();
      return guard;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivityLinkNode createActivityLinkNode() {
      ActivityLinkNodeImpl activityLinkNode = new ActivityLinkNodeImpl();
      return activityLinkNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
      OperationType result = OperationType.get(initialValue);
      if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertOperationTypeToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BooleanConnector createBooleanConnectorFromString(EDataType eDataType, String initialValue) {
      BooleanConnector result = BooleanConnector.get(initialValue);
      if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertBooleanConnectorToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProcessesPackage getProcessesPackage() {
      return (ProcessesPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static ProcessesPackage getPackage() {
      return ProcessesPackage.eINSTANCE;
   }

} //ProcessesFactoryImpl
