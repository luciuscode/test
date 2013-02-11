/**
 */
package registereddynamicaspect.impl;

import conf.impl.AspectInstanceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.jwt.meta.model.processes.Action;

import registereddynamicaspect.RegistereddynamicaspectPackage;
import registereddynamicaspect.SampleRegisteredDynamicAspect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample Registered Dynamic Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link registereddynamicaspect.impl.SampleRegisteredDynamicAspectImpl#getSampleintprop <em>Sampleintprop</em>}</li>
 *   <li>{@link registereddynamicaspect.impl.SampleRegisteredDynamicAspectImpl#getSampleactionref <em>Sampleactionref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SampleRegisteredDynamicAspectImpl extends AspectInstanceImpl implements SampleRegisteredDynamicAspect {
   /**
    * The default value of the '{@link #getSampleintprop() <em>Sampleintprop</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSampleintprop()
    * @generated
    * @ordered
    */
   protected static final int SAMPLEINTPROP_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getSampleintprop() <em>Sampleintprop</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSampleintprop()
    * @generated
    * @ordered
    */
   protected int sampleintprop = SAMPLEINTPROP_EDEFAULT;

   /**
    * The cached value of the '{@link #getSampleactionref() <em>Sampleactionref</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSampleactionref()
    * @generated
    * @ordered
    */
   protected Action sampleactionref;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SampleRegisteredDynamicAspectImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return RegistereddynamicaspectPackage.Literals.SAMPLE_REGISTERED_DYNAMIC_ASPECT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getSampleintprop() {
      return sampleintprop;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSampleintprop(int newSampleintprop) {
      int oldSampleintprop = sampleintprop;
      sampleintprop = newSampleintprop;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEINTPROP, oldSampleintprop, sampleintprop));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action getSampleactionref() {
      if (sampleactionref != null && sampleactionref.eIsProxy()) {
         InternalEObject oldSampleactionref = (InternalEObject)sampleactionref;
         sampleactionref = (Action)eResolveProxy(oldSampleactionref);
         if (sampleactionref != oldSampleactionref) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEACTIONREF, oldSampleactionref, sampleactionref));
         }
      }
      return sampleactionref;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action basicGetSampleactionref() {
      return sampleactionref;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSampleactionref(Action newSampleactionref) {
      Action oldSampleactionref = sampleactionref;
      sampleactionref = newSampleactionref;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEACTIONREF, oldSampleactionref, sampleactionref));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEINTPROP:
            return getSampleintprop();
         case RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEACTIONREF:
            if (resolve) return getSampleactionref();
            return basicGetSampleactionref();
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
         case RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEINTPROP:
            setSampleintprop((Integer)newValue);
            return;
         case RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEACTIONREF:
            setSampleactionref((Action)newValue);
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
         case RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEINTPROP:
            setSampleintprop(SAMPLEINTPROP_EDEFAULT);
            return;
         case RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEACTIONREF:
            setSampleactionref((Action)null);
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
         case RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEINTPROP:
            return sampleintprop != SAMPLEINTPROP_EDEFAULT;
         case RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEACTIONREF:
            return sampleactionref != null;
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
      result.append(" (sampleintprop: ");
      result.append(sampleintprop);
      result.append(')');
      return result.toString();
   }

} //SampleRegisteredDynamicAspectImpl
