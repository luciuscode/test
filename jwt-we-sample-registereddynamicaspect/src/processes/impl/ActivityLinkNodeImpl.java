/**
 */
package processes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.data.ParameterMapping;

import org.eclipse.jwt.meta.model.processes.Activity;
import org.eclipse.jwt.meta.model.processes.ActivityLinkNode;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Link Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processes.impl.ActivityLinkNodeImpl#getLinksto <em>Linksto</em>}</li>
 *   <li>{@link processes.impl.ActivityLinkNodeImpl#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityLinkNodeImpl extends ExecutableNodeImpl implements ActivityLinkNode {
   /**
    * The cached value of the '{@link #getLinksto() <em>Linksto</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLinksto()
    * @generated
    * @ordered
    */
   protected Activity linksto;

   /**
    * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUses()
    * @generated
    * @ordered
    */
   protected EList<ParameterMapping> uses;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ActivityLinkNodeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.ACTIVITY_LINK_NODE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Activity getLinksto() {
      if (linksto != null && linksto.eIsProxy()) {
         InternalEObject oldLinksto = (InternalEObject)linksto;
         linksto = (Activity)eResolveProxy(oldLinksto);
         if (linksto != oldLinksto) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessesPackage.ACTIVITY_LINK_NODE__LINKSTO, oldLinksto, linksto));
         }
      }
      return linksto;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Activity basicGetLinksto() {
      return linksto;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLinksto(Activity newLinksto) {
      Activity oldLinksto = linksto;
      linksto = newLinksto;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTIVITY_LINK_NODE__LINKSTO, oldLinksto, linksto));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ParameterMapping> getUses() {
      if (uses == null) {
         uses = new EObjectContainmentEList<ParameterMapping>(ParameterMapping.class, this, ProcessesPackage.ACTIVITY_LINK_NODE__USES);
      }
      return uses;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case ProcessesPackage.ACTIVITY_LINK_NODE__USES:
            return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
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
         case ProcessesPackage.ACTIVITY_LINK_NODE__LINKSTO:
            if (resolve) return getLinksto();
            return basicGetLinksto();
         case ProcessesPackage.ACTIVITY_LINK_NODE__USES:
            return getUses();
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
         case ProcessesPackage.ACTIVITY_LINK_NODE__LINKSTO:
            setLinksto((Activity)newValue);
            return;
         case ProcessesPackage.ACTIVITY_LINK_NODE__USES:
            getUses().clear();
            getUses().addAll((Collection<? extends ParameterMapping>)newValue);
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
         case ProcessesPackage.ACTIVITY_LINK_NODE__LINKSTO:
            setLinksto((Activity)null);
            return;
         case ProcessesPackage.ACTIVITY_LINK_NODE__USES:
            getUses().clear();
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
         case ProcessesPackage.ACTIVITY_LINK_NODE__LINKSTO:
            return linksto != null;
         case ProcessesPackage.ACTIVITY_LINK_NODE__USES:
            return uses != null && !uses.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //ActivityLinkNodeImpl
