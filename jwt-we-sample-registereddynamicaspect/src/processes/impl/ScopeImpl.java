/**
 */
package processes.impl;

import core.impl.ModelElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.processes.ActivityEdge;
import org.eclipse.jwt.meta.model.processes.ActivityNode;
import org.eclipse.jwt.meta.model.processes.Scope;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processes.impl.ScopeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link processes.impl.ScopeImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends ModelElementImpl implements Scope {
   /**
    * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNodes()
    * @generated
    * @ordered
    */
   protected EList<ActivityNode> nodes;

   /**
    * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEdges()
    * @generated
    * @ordered
    */
   protected EList<ActivityEdge> edges;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ScopeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.SCOPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ActivityNode> getNodes() {
      if (nodes == null) {
         nodes = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this, ProcessesPackage.SCOPE__NODES);
      }
      return nodes;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ActivityEdge> getEdges() {
      if (edges == null) {
         edges = new EObjectContainmentEList<ActivityEdge>(ActivityEdge.class, this, ProcessesPackage.SCOPE__EDGES);
      }
      return edges;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case ProcessesPackage.SCOPE__NODES:
            return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
         case ProcessesPackage.SCOPE__EDGES:
            return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case ProcessesPackage.SCOPE__NODES:
            return getNodes();
         case ProcessesPackage.SCOPE__EDGES:
            return getEdges();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case ProcessesPackage.SCOPE__NODES:
            getNodes().clear();
            getNodes().addAll((Collection<? extends ActivityNode>)newValue);
            return;
         case ProcessesPackage.SCOPE__EDGES:
            getEdges().clear();
            getEdges().addAll((Collection<? extends ActivityEdge>)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case ProcessesPackage.SCOPE__NODES:
            getNodes().clear();
            return;
         case ProcessesPackage.SCOPE__EDGES:
            getEdges().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case ProcessesPackage.SCOPE__NODES:
            return nodes != null && !nodes.isEmpty();
         case ProcessesPackage.SCOPE__EDGES:
            return edges != null && !edges.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //ScopeImpl
