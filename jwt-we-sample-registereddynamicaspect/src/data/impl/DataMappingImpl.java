/**
 */
package data.impl;

import core.impl.PackageableElementImpl;

import data.DataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.jwt.meta.model.data.DataMapping;
import org.eclipse.jwt.meta.model.data.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.impl.DataMappingImpl#getBoundParameter <em>Bound Parameter</em>}</li>
 *   <li>{@link data.impl.DataMappingImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataMappingImpl extends PackageableElementImpl implements DataMapping {
   /**
    * The cached value of the '{@link #getBoundParameter() <em>Bound Parameter</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBoundParameter()
    * @generated
    * @ordered
    */
   protected Parameter boundParameter;

   /**
    * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParameter()
    * @generated
    * @ordered
    */
   protected Parameter parameter;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected DataMappingImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return DataPackage.Literals.DATA_MAPPING;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter getBoundParameter() {
      if (boundParameter != null && boundParameter.eIsProxy()) {
         InternalEObject oldBoundParameter = (InternalEObject)boundParameter;
         boundParameter = (Parameter)eResolveProxy(oldBoundParameter);
         if (boundParameter != oldBoundParameter) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_MAPPING__BOUND_PARAMETER, oldBoundParameter, boundParameter));
         }
      }
      return boundParameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter basicGetBoundParameter() {
      return boundParameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBoundParameter(Parameter newBoundParameter) {
      Parameter oldBoundParameter = boundParameter;
      boundParameter = newBoundParameter;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_MAPPING__BOUND_PARAMETER, oldBoundParameter, boundParameter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter getParameter() {
      if (parameter != null && parameter.eIsProxy()) {
         InternalEObject oldParameter = (InternalEObject)parameter;
         parameter = (Parameter)eResolveProxy(oldParameter);
         if (parameter != oldParameter) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_MAPPING__PARAMETER, oldParameter, parameter));
         }
      }
      return parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter basicGetParameter() {
      return parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParameter(Parameter newParameter) {
      Parameter oldParameter = parameter;
      parameter = newParameter;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_MAPPING__PARAMETER, oldParameter, parameter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case DataPackage.DATA_MAPPING__BOUND_PARAMETER:
            if (resolve) return getBoundParameter();
            return basicGetBoundParameter();
         case DataPackage.DATA_MAPPING__PARAMETER:
            if (resolve) return getParameter();
            return basicGetParameter();
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
         case DataPackage.DATA_MAPPING__BOUND_PARAMETER:
            setBoundParameter((Parameter)newValue);
            return;
         case DataPackage.DATA_MAPPING__PARAMETER:
            setParameter((Parameter)newValue);
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
         case DataPackage.DATA_MAPPING__BOUND_PARAMETER:
            setBoundParameter((Parameter)null);
            return;
         case DataPackage.DATA_MAPPING__PARAMETER:
            setParameter((Parameter)null);
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
         case DataPackage.DATA_MAPPING__BOUND_PARAMETER:
            return boundParameter != null;
         case DataPackage.DATA_MAPPING__PARAMETER:
            return parameter != null;
      }
      return super.eIsSet(featureID);
   }

} //DataMappingImpl
