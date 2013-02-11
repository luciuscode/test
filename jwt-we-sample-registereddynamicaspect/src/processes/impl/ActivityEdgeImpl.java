/**
 */
package processes.impl;

import core.impl.ModelElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.jwt.meta.model.processes.ActivityEdge;
import org.eclipse.jwt.meta.model.processes.ActivityNode;
import org.eclipse.jwt.meta.model.processes.Guard;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processes.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link processes.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link processes.impl.ActivityEdgeImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityEdgeImpl extends ModelElementImpl implements ActivityEdge {
   /**
    * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSource()
    * @generated
    * @ordered
    */
   protected ActivityNode source;

   /**
    * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTarget()
    * @generated
    * @ordered
    */
   protected ActivityNode target;

   /**
    * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getGuard()
    * @generated
    * @ordered
    */
   protected Guard guard;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ActivityEdgeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.ACTIVITY_EDGE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode getSource() {
      if (source != null && source.eIsProxy()) {
         InternalEObject oldSource = (InternalEObject)source;
         source = (ActivityNode)eResolveProxy(oldSource);
         if (source != oldSource) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessesPackage.ACTIVITY_EDGE__SOURCE, oldSource, source));
         }
      }
      return source;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode basicGetSource() {
      return source;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSource(ActivityNode newSource, NotificationChain msgs) {
      ActivityNode oldSource = source;
      source = newSource;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTIVITY_EDGE__SOURCE, oldSource, newSource);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSource(ActivityNode newSource) {
      if (newSource != source) {
         NotificationChain msgs = null;
         if (source != null)
            msgs = ((InternalEObject)source).eInverseRemove(this, ProcessesPackage.ACTIVITY_NODE__OUT, ActivityNode.class, msgs);
         if (newSource != null)
            msgs = ((InternalEObject)newSource).eInverseAdd(this, ProcessesPackage.ACTIVITY_NODE__OUT, ActivityNode.class, msgs);
         msgs = basicSetSource(newSource, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTIVITY_EDGE__SOURCE, newSource, newSource));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode getTarget() {
      if (target != null && target.eIsProxy()) {
         InternalEObject oldTarget = (InternalEObject)target;
         target = (ActivityNode)eResolveProxy(oldTarget);
         if (target != oldTarget) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessesPackage.ACTIVITY_EDGE__TARGET, oldTarget, target));
         }
      }
      return target;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ActivityNode basicGetTarget() {
      return target;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetTarget(ActivityNode newTarget, NotificationChain msgs) {
      ActivityNode oldTarget = target;
      target = newTarget;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTIVITY_EDGE__TARGET, oldTarget, newTarget);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTarget(ActivityNode newTarget) {
      if (newTarget != target) {
         NotificationChain msgs = null;
         if (target != null)
            msgs = ((InternalEObject)target).eInverseRemove(this, ProcessesPackage.ACTIVITY_NODE__IN, ActivityNode.class, msgs);
         if (newTarget != null)
            msgs = ((InternalEObject)newTarget).eInverseAdd(this, ProcessesPackage.ACTIVITY_NODE__IN, ActivityNode.class, msgs);
         msgs = basicSetTarget(newTarget, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTIVITY_EDGE__TARGET, newTarget, newTarget));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Guard getGuard() {
      return guard;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetGuard(Guard newGuard, NotificationChain msgs) {
      Guard oldGuard = guard;
      guard = newGuard;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTIVITY_EDGE__GUARD, oldGuard, newGuard);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setGuard(Guard newGuard) {
      if (newGuard != guard) {
         NotificationChain msgs = null;
         if (guard != null)
            msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessesPackage.ACTIVITY_EDGE__GUARD, null, msgs);
         if (newGuard != null)
            msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessesPackage.ACTIVITY_EDGE__GUARD, null, msgs);
         msgs = basicSetGuard(newGuard, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTIVITY_EDGE__GUARD, newGuard, newGuard));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case ProcessesPackage.ACTIVITY_EDGE__SOURCE:
            if (source != null)
               msgs = ((InternalEObject)source).eInverseRemove(this, ProcessesPackage.ACTIVITY_NODE__OUT, ActivityNode.class, msgs);
            return basicSetSource((ActivityNode)otherEnd, msgs);
         case ProcessesPackage.ACTIVITY_EDGE__TARGET:
            if (target != null)
               msgs = ((InternalEObject)target).eInverseRemove(this, ProcessesPackage.ACTIVITY_NODE__IN, ActivityNode.class, msgs);
            return basicSetTarget((ActivityNode)otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case ProcessesPackage.ACTIVITY_EDGE__SOURCE:
            return basicSetSource(null, msgs);
         case ProcessesPackage.ACTIVITY_EDGE__TARGET:
            return basicSetTarget(null, msgs);
         case ProcessesPackage.ACTIVITY_EDGE__GUARD:
            return basicSetGuard(null, msgs);
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
         case ProcessesPackage.ACTIVITY_EDGE__SOURCE:
            if (resolve) return getSource();
            return basicGetSource();
         case ProcessesPackage.ACTIVITY_EDGE__TARGET:
            if (resolve) return getTarget();
            return basicGetTarget();
         case ProcessesPackage.ACTIVITY_EDGE__GUARD:
            return getGuard();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case ProcessesPackage.ACTIVITY_EDGE__SOURCE:
            setSource((ActivityNode)newValue);
            return;
         case ProcessesPackage.ACTIVITY_EDGE__TARGET:
            setTarget((ActivityNode)newValue);
            return;
         case ProcessesPackage.ACTIVITY_EDGE__GUARD:
            setGuard((Guard)newValue);
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
         case ProcessesPackage.ACTIVITY_EDGE__SOURCE:
            setSource((ActivityNode)null);
            return;
         case ProcessesPackage.ACTIVITY_EDGE__TARGET:
            setTarget((ActivityNode)null);
            return;
         case ProcessesPackage.ACTIVITY_EDGE__GUARD:
            setGuard((Guard)null);
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
         case ProcessesPackage.ACTIVITY_EDGE__SOURCE:
            return source != null;
         case ProcessesPackage.ACTIVITY_EDGE__TARGET:
            return target != null;
         case ProcessesPackage.ACTIVITY_EDGE__GUARD:
            return guard != null;
      }
      return super.eIsSet(featureID);
   }

} //ActivityEdgeImpl
