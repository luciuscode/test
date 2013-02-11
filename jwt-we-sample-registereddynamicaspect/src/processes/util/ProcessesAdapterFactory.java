/**
 */
package processes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see processes.ProcessesPackage
 * @generated
 */
public class ProcessesAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static ProcessesPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProcessesAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = ProcessesPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
    * <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object) {
      if (object == modelPackage) {
         return true;
      }
      if (object instanceof EObject) {
         return ((EObject)object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ProcessesSwitch<Adapter> modelSwitch =
      new ProcessesSwitch<Adapter>() {
         @Override
         public Adapter caseScope(Scope object) {
            return createScopeAdapter();
         }
         @Override
         public Adapter caseActivity(Activity object) {
            return createActivityAdapter();
         }
         @Override
         public Adapter caseStructuredActivityNode(StructuredActivityNode object) {
            return createStructuredActivityNodeAdapter();
         }
         @Override
         public Adapter caseActivityNode(ActivityNode object) {
            return createActivityNodeAdapter();
         }
         @Override
         public Adapter caseActivityEdge(ActivityEdge object) {
            return createActivityEdgeAdapter();
         }
         @Override
         public Adapter caseGuardSpecification(GuardSpecification object) {
            return createGuardSpecificationAdapter();
         }
         @Override
         public Adapter caseExecutableNode(ExecutableNode object) {
            return createExecutableNodeAdapter();
         }
         @Override
         public Adapter caseAction(Action object) {
            return createActionAdapter();
         }
         @Override
         public Adapter caseControlNode(ControlNode object) {
            return createControlNodeAdapter();
         }
         @Override
         public Adapter caseInitialNode(InitialNode object) {
            return createInitialNodeAdapter();
         }
         @Override
         public Adapter caseForkNode(ForkNode object) {
            return createForkNodeAdapter();
         }
         @Override
         public Adapter caseJoinNode(JoinNode object) {
            return createJoinNodeAdapter();
         }
         @Override
         public Adapter caseMergeNode(MergeNode object) {
            return createMergeNodeAdapter();
         }
         @Override
         public Adapter caseDecisionNode(DecisionNode object) {
            return createDecisionNodeAdapter();
         }
         @Override
         public Adapter caseFinalNode(FinalNode object) {
            return createFinalNodeAdapter();
         }
         @Override
         public Adapter caseGuard(Guard object) {
            return createGuardAdapter();
         }
         @Override
         public Adapter caseActivityLinkNode(ActivityLinkNode object) {
            return createActivityLinkNodeAdapter();
         }
         @Override
         public Adapter caseModelElement(ModelElement object) {
            return createModelElementAdapter();
         }
         @Override
         public Adapter caseNamedElement(NamedElement object) {
            return createNamedElementAdapter();
         }
         @Override
         public Adapter casePackageableElement(PackageableElement object) {
            return createPackageableElementAdapter();
         }
         @Override
         public Adapter caseGraphicalElement(GraphicalElement object) {
            return createGraphicalElementAdapter();
         }
         @Override
         public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
         }
      };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target) {
      return modelSwitch.doSwitch((EObject)target);
   }


   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.Scope <em>Scope</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.Scope
    * @generated
    */
   public Adapter createScopeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.Activity <em>Activity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.Activity
    * @generated
    */
   public Adapter createActivityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.StructuredActivityNode <em>Structured Activity Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.StructuredActivityNode
    * @generated
    */
   public Adapter createStructuredActivityNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.ActivityNode <em>Activity Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.ActivityNode
    * @generated
    */
   public Adapter createActivityNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.ActivityEdge <em>Activity Edge</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.ActivityEdge
    * @generated
    */
   public Adapter createActivityEdgeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification <em>Guard Specification</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.GuardSpecification
    * @generated
    */
   public Adapter createGuardSpecificationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.ExecutableNode <em>Executable Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.ExecutableNode
    * @generated
    */
   public Adapter createExecutableNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.Action <em>Action</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.Action
    * @generated
    */
   public Adapter createActionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.ControlNode <em>Control Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.ControlNode
    * @generated
    */
   public Adapter createControlNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.InitialNode <em>Initial Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.InitialNode
    * @generated
    */
   public Adapter createInitialNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.ForkNode <em>Fork Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.ForkNode
    * @generated
    */
   public Adapter createForkNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.JoinNode <em>Join Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.JoinNode
    * @generated
    */
   public Adapter createJoinNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.MergeNode <em>Merge Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.MergeNode
    * @generated
    */
   public Adapter createMergeNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.DecisionNode <em>Decision Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.DecisionNode
    * @generated
    */
   public Adapter createDecisionNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.FinalNode <em>Final Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.FinalNode
    * @generated
    */
   public Adapter createFinalNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.Guard <em>Guard</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.Guard
    * @generated
    */
   public Adapter createGuardAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.processes.ActivityLinkNode <em>Activity Link Node</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.processes.ActivityLinkNode
    * @generated
    */
   public Adapter createActivityLinkNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.core.ModelElement <em>Model Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.core.ModelElement
    * @generated
    */
   public Adapter createModelElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.core.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.core.NamedElement
    * @generated
    */
   public Adapter createNamedElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.core.PackageableElement <em>Packageable Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.core.PackageableElement
    * @generated
    */
   public Adapter createPackageableElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.core.GraphicalElement <em>Graphical Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.core.GraphicalElement
    * @generated
    */
   public Adapter createGraphicalElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter() {
      return null;
   }

} //ProcessesAdapterFactory
