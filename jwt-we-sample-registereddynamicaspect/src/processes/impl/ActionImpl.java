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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.application.Application;

import org.eclipse.jwt.meta.model.data.Data;
import org.eclipse.jwt.meta.model.data.DataMapping;

import org.eclipse.jwt.meta.model.functions.Function;

import org.eclipse.jwt.meta.model.organisations.Role;

import org.eclipse.jwt.meta.model.processes.Action;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processes.impl.ActionImpl#getPerformedBy <em>Performed By</em>}</li>
 *   <li>{@link processes.impl.ActionImpl#getExecutedBy <em>Executed By</em>}</li>
 *   <li>{@link processes.impl.ActionImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link processes.impl.ActionImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link processes.impl.ActionImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link processes.impl.ActionImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link processes.impl.ActionImpl#getTargetexecutiontime <em>Targetexecutiontime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends ExecutableNodeImpl implements Action {
   /**
    * The cached value of the '{@link #getPerformedBy() <em>Performed By</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPerformedBy()
    * @generated
    * @ordered
    */
   protected Role performedBy;

   /**
    * The cached value of the '{@link #getExecutedBy() <em>Executed By</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExecutedBy()
    * @generated
    * @ordered
    */
   protected Application executedBy;

   /**
    * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRealizes()
    * @generated
    * @ordered
    */
   protected Function realizes;

   /**
    * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInputs()
    * @generated
    * @ordered
    */
   protected EList<Data> inputs;

   /**
    * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOutputs()
    * @generated
    * @ordered
    */
   protected EList<Data> outputs;

   /**
    * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getMappings()
    * @generated
    * @ordered
    */
   protected EList<DataMapping> mappings;

   /**
    * The default value of the '{@link #getTargetexecutiontime() <em>Targetexecutiontime</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTargetexecutiontime()
    * @generated
    * @ordered
    */
   protected static final int TARGETEXECUTIONTIME_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getTargetexecutiontime() <em>Targetexecutiontime</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTargetexecutiontime()
    * @generated
    * @ordered
    */
   protected int targetexecutiontime = TARGETEXECUTIONTIME_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ActionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.ACTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Role getPerformedBy() {
      if (performedBy != null && performedBy.eIsProxy()) {
         InternalEObject oldPerformedBy = (InternalEObject)performedBy;
         performedBy = (Role)eResolveProxy(oldPerformedBy);
         if (performedBy != oldPerformedBy) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessesPackage.ACTION__PERFORMED_BY, oldPerformedBy, performedBy));
         }
      }
      return performedBy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Role basicGetPerformedBy() {
      return performedBy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPerformedBy(Role newPerformedBy) {
      Role oldPerformedBy = performedBy;
      performedBy = newPerformedBy;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTION__PERFORMED_BY, oldPerformedBy, performedBy));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Application getExecutedBy() {
      if (executedBy != null && executedBy.eIsProxy()) {
         InternalEObject oldExecutedBy = (InternalEObject)executedBy;
         executedBy = (Application)eResolveProxy(oldExecutedBy);
         if (executedBy != oldExecutedBy) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessesPackage.ACTION__EXECUTED_BY, oldExecutedBy, executedBy));
         }
      }
      return executedBy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Application basicGetExecutedBy() {
      return executedBy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setExecutedBy(Application newExecutedBy) {
      Application oldExecutedBy = executedBy;
      executedBy = newExecutedBy;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTION__EXECUTED_BY, oldExecutedBy, executedBy));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Function getRealizes() {
      if (realizes != null && realizes.eIsProxy()) {
         InternalEObject oldRealizes = (InternalEObject)realizes;
         realizes = (Function)eResolveProxy(oldRealizes);
         if (realizes != oldRealizes) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessesPackage.ACTION__REALIZES, oldRealizes, realizes));
         }
      }
      return realizes;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Function basicGetRealizes() {
      return realizes;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRealizes(Function newRealizes) {
      Function oldRealizes = realizes;
      realizes = newRealizes;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTION__REALIZES, oldRealizes, realizes));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Data> getInputs() {
      if (inputs == null) {
         inputs = new EObjectResolvingEList<Data>(Data.class, this, ProcessesPackage.ACTION__INPUTS);
      }
      return inputs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Data> getOutputs() {
      if (outputs == null) {
         outputs = new EObjectResolvingEList<Data>(Data.class, this, ProcessesPackage.ACTION__OUTPUTS);
      }
      return outputs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<DataMapping> getMappings() {
      if (mappings == null) {
         mappings = new EObjectContainmentEList<DataMapping>(DataMapping.class, this, ProcessesPackage.ACTION__MAPPINGS);
      }
      return mappings;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getTargetexecutiontime() {
      return targetexecutiontime;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTargetexecutiontime(int newTargetexecutiontime) {
      int oldTargetexecutiontime = targetexecutiontime;
      targetexecutiontime = newTargetexecutiontime;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.ACTION__TARGETEXECUTIONTIME, oldTargetexecutiontime, targetexecutiontime));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case ProcessesPackage.ACTION__MAPPINGS:
            return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
         case ProcessesPackage.ACTION__PERFORMED_BY:
            if (resolve) return getPerformedBy();
            return basicGetPerformedBy();
         case ProcessesPackage.ACTION__EXECUTED_BY:
            if (resolve) return getExecutedBy();
            return basicGetExecutedBy();
         case ProcessesPackage.ACTION__REALIZES:
            if (resolve) return getRealizes();
            return basicGetRealizes();
         case ProcessesPackage.ACTION__INPUTS:
            return getInputs();
         case ProcessesPackage.ACTION__OUTPUTS:
            return getOutputs();
         case ProcessesPackage.ACTION__MAPPINGS:
            return getMappings();
         case ProcessesPackage.ACTION__TARGETEXECUTIONTIME:
            return getTargetexecutiontime();
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
         case ProcessesPackage.ACTION__PERFORMED_BY:
            setPerformedBy((Role)newValue);
            return;
         case ProcessesPackage.ACTION__EXECUTED_BY:
            setExecutedBy((Application)newValue);
            return;
         case ProcessesPackage.ACTION__REALIZES:
            setRealizes((Function)newValue);
            return;
         case ProcessesPackage.ACTION__INPUTS:
            getInputs().clear();
            getInputs().addAll((Collection<? extends Data>)newValue);
            return;
         case ProcessesPackage.ACTION__OUTPUTS:
            getOutputs().clear();
            getOutputs().addAll((Collection<? extends Data>)newValue);
            return;
         case ProcessesPackage.ACTION__MAPPINGS:
            getMappings().clear();
            getMappings().addAll((Collection<? extends DataMapping>)newValue);
            return;
         case ProcessesPackage.ACTION__TARGETEXECUTIONTIME:
            setTargetexecutiontime((Integer)newValue);
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
         case ProcessesPackage.ACTION__PERFORMED_BY:
            setPerformedBy((Role)null);
            return;
         case ProcessesPackage.ACTION__EXECUTED_BY:
            setExecutedBy((Application)null);
            return;
         case ProcessesPackage.ACTION__REALIZES:
            setRealizes((Function)null);
            return;
         case ProcessesPackage.ACTION__INPUTS:
            getInputs().clear();
            return;
         case ProcessesPackage.ACTION__OUTPUTS:
            getOutputs().clear();
            return;
         case ProcessesPackage.ACTION__MAPPINGS:
            getMappings().clear();
            return;
         case ProcessesPackage.ACTION__TARGETEXECUTIONTIME:
            setTargetexecutiontime(TARGETEXECUTIONTIME_EDEFAULT);
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
         case ProcessesPackage.ACTION__PERFORMED_BY:
            return performedBy != null;
         case ProcessesPackage.ACTION__EXECUTED_BY:
            return executedBy != null;
         case ProcessesPackage.ACTION__REALIZES:
            return realizes != null;
         case ProcessesPackage.ACTION__INPUTS:
            return inputs != null && !inputs.isEmpty();
         case ProcessesPackage.ACTION__OUTPUTS:
            return outputs != null && !outputs.isEmpty();
         case ProcessesPackage.ACTION__MAPPINGS:
            return mappings != null && !mappings.isEmpty();
         case ProcessesPackage.ACTION__TARGETEXECUTIONTIME:
            return targetexecutiontime != TARGETEXECUTIONTIME_EDEFAULT;
      }
      return super.eIsSet(featureID);
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
      result.append(" (targetexecutiontime: ");
      result.append(targetexecutiontime);
      result.append(')');
      return result.toString();
   }

} //ActionImpl
