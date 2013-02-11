/**
 */
package processes.impl;

import core.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.processes.ActivityEdge;
import org.eclipse.jwt.meta.model.processes.ActivityNode;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processes.impl.ActivityNodeImpl#getIn <em>In</em>}</li>
 *   <li>{@link processes.impl.ActivityNodeImpl#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityNodeImpl extends NamedElementImpl implements ActivityNode {
   /**
    * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIn()
    * @generated
    * @ordered
    */
   protected EList<ActivityEdge> in;

   /**
    * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOut()
    * @generated
    * @ordered
    */
   protected EList<ActivityEdge> out;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ActivityNodeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.ACTIVITY_NODE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ActivityEdge> getIn() {
      if (in == null) {
         in = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, ProcessesPackage.ACTIVITY_NODE__IN, ProcessesPackage.ACTIVITY_EDGE__TARGET);
      }
      return in;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ActivityEdge> getOut() {
      if (out == null) {
         out = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, ProcessesPackage.ACTIVITY_NODE__OUT, ProcessesPackage.ACTIVITY_EDGE__SOURCE);
      }
      return out;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case ProcessesPackage.ACTIVITY_NODE__IN:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getIn()).basicAdd(otherEnd, msgs);
         case ProcessesPackage.ACTIVITY_NODE__OUT:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getOut()).basicAdd(otherEnd, msgs);
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
         case ProcessesPackage.ACTIVITY_NODE__IN:
            return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
         case ProcessesPackage.ACTIVITY_NODE__OUT:
            return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
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
         case ProcessesPackage.ACTIVITY_NODE__IN:
            return getIn();
         case ProcessesPackage.ACTIVITY_NODE__OUT:
            return getOut();
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
         case ProcessesPackage.ACTIVITY_NODE__IN:
            getIn().clear();
            getIn().addAll((Collection<? extends ActivityEdge>)newValue);
            return;
         case ProcessesPackage.ACTIVITY_NODE__OUT:
            getOut().clear();
            getOut().addAll((Collection<? extends ActivityEdge>)newValue);
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
         case ProcessesPackage.ACTIVITY_NODE__IN:
            getIn().clear();
            return;
         case ProcessesPackage.ACTIVITY_NODE__OUT:
            getOut().clear();
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
         case ProcessesPackage.ACTIVITY_NODE__IN:
            return in != null && !in.isEmpty();
         case ProcessesPackage.ACTIVITY_NODE__OUT:
            return out != null && !out.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //ActivityNodeImpl
