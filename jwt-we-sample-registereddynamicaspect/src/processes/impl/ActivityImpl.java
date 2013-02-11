/**
 */
package processes.impl;

import core.impl.PackageableElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.events.EventHandler;

import org.eclipse.jwt.meta.model.processes.Activity;
import org.eclipse.jwt.meta.model.processes.ActivityEdge;
import org.eclipse.jwt.meta.model.processes.ActivityNode;
import org.eclipse.jwt.meta.model.processes.Scope;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processes.impl.ActivityImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link processes.impl.ActivityImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link processes.impl.ActivityImpl#getEventHandler <em>Event Handler</em>}</li>
 *   <li>{@link processes.impl.ActivityImpl#getTotalexecutiontime <em>Totalexecutiontime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends PackageableElementImpl implements Activity {
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
    * The cached value of the '{@link #getEventHandler() <em>Event Handler</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEventHandler()
    * @generated
    * @ordered
    */
   protected EventHandler eventHandler;

   /**
    * The default value of the '{@link #getTotalexecutiontime() <em>Totalexecutiontime</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTotalexecutiontime()
    * @generated
    * @ordered
    */
   protected static final int TOTALEXECUTIONTIME_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getTotalexecutiontime() <em>Totalexecutiontime</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTotalexecutiontime()
    * @generated
    * @ordered
    */
   protected int totalexecutiontime = TOTALEXECUTIONTIME_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ActivityImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.ACTIVITY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ActivityNode> getNodes() {
      if (nodes == null) {
         nodes = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this, ProcessesPackage.ACTIVITY__NODES);
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
         edges = new EObjectContainmentEList<ActivityEdge>(ActivityEdge.class, this, ProcessesPackage.ACTIVITY__EDGES);
      }
      return edges;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EventHandler getEventHandler() {
      return eventHandler;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetEventHandler(EventHandler newEventHandler, NotificationChain msgs) {
      EventHandler oldEventHandler = eventHandler;
      eventHandler = newEventHandler;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTIVITY__EVENT_HANDLER, oldEventHandler, newEventHandler);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEventHandler(EventHandler newEventHandler) {
      if (newEventHandler != eventHandler) {
         NotificationChain msgs = null;
         if (eventHandler != null)
            msgs = ((InternalEObject)eventHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessesPackage.ACTIVITY__EVENT_HANDLER, null, msgs);
         if (newEventHandler != null)
            msgs = ((InternalEObject)newEventHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessesPackage.ACTIVITY__EVENT_HANDLER, null, msgs);
         msgs = basicSetEventHandler(newEventHandler, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTIVITY__EVENT_HANDLER, newEventHandler, newEventHandler));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getTotalexecutiontime() {
      return totalexecutiontime;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTotalexecutiontime(int newTotalexecutiontime) {
      int oldTotalexecutiontime = totalexecutiontime;
      totalexecutiontime = newTotalexecutiontime;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTIVITY__TOTALEXECUTIONTIME, oldTotalexecutiontime, totalexecutiontime));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case ProcessesPackage.ACTIVITY__NODES:
            return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
         case ProcessesPackage.ACTIVITY__EDGES:
            return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
         case ProcessesPackage.ACTIVITY__EVENT_HANDLER:
            return basicSetEventHandler(null, msgs);
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
         case ProcessesPackage.ACTIVITY__NODES:
            return getNodes();
         case ProcessesPackage.ACTIVITY__EDGES:
            return getEdges();
         case ProcessesPackage.ACTIVITY__EVENT_HANDLER:
            return getEventHandler();
         case ProcessesPackage.ACTIVITY__TOTALEXECUTIONTIME:
            return getTotalexecutiontime();
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
         case ProcessesPackage.ACTIVITY__NODES:
            getNodes().clear();
            getNodes().addAll((Collection<? extends ActivityNode>)newValue);
            return;
         case ProcessesPackage.ACTIVITY__EDGES:
            getEdges().clear();
            getEdges().addAll((Collection<? extends ActivityEdge>)newValue);
            return;
         case ProcessesPackage.ACTIVITY__EVENT_HANDLER:
            setEventHandler((EventHandler)newValue);
            return;
         case ProcessesPackage.ACTIVITY__TOTALEXECUTIONTIME:
            setTotalexecutiontime((Integer)newValue);
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
         case ProcessesPackage.ACTIVITY__NODES:
            getNodes().clear();
            return;
         case ProcessesPackage.ACTIVITY__EDGES:
            getEdges().clear();
            return;
         case ProcessesPackage.ACTIVITY__EVENT_HANDLER:
            setEventHandler((EventHandler)null);
            return;
         case ProcessesPackage.ACTIVITY__TOTALEXECUTIONTIME:
            setTotalexecutiontime(TOTALEXECUTIONTIME_EDEFAULT);
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
         case ProcessesPackage.ACTIVITY__NODES:
            return nodes != null && !nodes.isEmpty();
         case ProcessesPackage.ACTIVITY__EDGES:
            return edges != null && !edges.isEmpty();
         case ProcessesPackage.ACTIVITY__EVENT_HANDLER:
            return eventHandler != null;
         case ProcessesPackage.ACTIVITY__TOTALEXECUTIONTIME:
            return totalexecutiontime != TOTALEXECUTIONTIME_EDEFAULT;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
      if (baseClass == Scope.class) {
         switch (derivedFeatureID) {
            case ProcessesPackage.ACTIVITY__NODES: return ProcessesPackage.SCOPE__NODES;
            case ProcessesPackage.ACTIVITY__EDGES: return ProcessesPackage.SCOPE__EDGES;
            default: return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
      if (baseClass == Scope.class) {
         switch (baseFeatureID) {
            case ProcessesPackage.SCOPE__NODES: return ProcessesPackage.ACTIVITY__NODES;
            case ProcessesPackage.SCOPE__EDGES: return ProcessesPackage.ACTIVITY__EDGES;
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (totalexecutiontime: ");
      result.append(totalexecutiontime);
      result.append(')');
      return result.toString();
   }

} //ActivityImpl
