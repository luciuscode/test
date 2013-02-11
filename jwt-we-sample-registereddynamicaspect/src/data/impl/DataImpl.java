/**
 */
package data.impl;

import core.impl.ReferenceableElementImpl;

import data.DataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.data.Data;
import org.eclipse.jwt.meta.model.data.DataType;
import org.eclipse.jwt.meta.model.data.InformationType;
import org.eclipse.jwt.meta.model.data.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.impl.DataImpl#getValue <em>Value</em>}</li>
 *   <li>{@link data.impl.DataImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link data.impl.DataImpl#getInformationType <em>Information Type</em>}</li>
 *   <li>{@link data.impl.DataImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataImpl extends ReferenceableElementImpl implements Data {
   /**
    * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValue()
    * @generated
    * @ordered
    */
   protected static final String VALUE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValue()
    * @generated
    * @ordered
    */
   protected String value = VALUE_EDEFAULT;

   /**
    * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDataType()
    * @generated
    * @ordered
    */
   protected DataType dataType;

   /**
    * The cached value of the '{@link #getInformationType() <em>Information Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInformationType()
    * @generated
    * @ordered
    */
   protected InformationType informationType;

   /**
    * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParameters()
    * @generated
    * @ordered
    */
   protected EList<Parameter> parameters;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected DataImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return DataPackage.Literals.DATA;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getValue() {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setValue(String newValue) {
      String oldValue = value;
      value = newValue;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA__VALUE, oldValue, value));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType getDataType() {
      if (dataType != null && dataType.eIsProxy()) {
         InternalEObject oldDataType = (InternalEObject)dataType;
         dataType = (DataType)eResolveProxy(oldDataType);
         if (dataType != oldDataType) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA__DATA_TYPE, oldDataType, dataType));
         }
      }
      return dataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType basicGetDataType() {
      return dataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDataType(DataType newDataType) {
      DataType oldDataType = dataType;
      dataType = newDataType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA__DATA_TYPE, oldDataType, dataType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InformationType getInformationType() {
      if (informationType != null && informationType.eIsProxy()) {
         InternalEObject oldInformationType = (InternalEObject)informationType;
         informationType = (InformationType)eResolveProxy(oldInformationType);
         if (informationType != oldInformationType) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA__INFORMATION_TYPE, oldInformationType, informationType));
         }
      }
      return informationType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InformationType basicGetInformationType() {
      return informationType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInformationType(InformationType newInformationType) {
      InformationType oldInformationType = informationType;
      informationType = newInformationType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA__INFORMATION_TYPE, oldInformationType, informationType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Parameter> getParameters() {
      if (parameters == null) {
         parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, DataPackage.DATA__PARAMETERS);
      }
      return parameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case DataPackage.DATA__PARAMETERS:
            return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
         case DataPackage.DATA__VALUE:
            return getValue();
         case DataPackage.DATA__DATA_TYPE:
            if (resolve) return getDataType();
            return basicGetDataType();
         case DataPackage.DATA__INFORMATION_TYPE:
            if (resolve) return getInformationType();
            return basicGetInformationType();
         case DataPackage.DATA__PARAMETERS:
            return getParameters();
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
         case DataPackage.DATA__VALUE:
            setValue((String)newValue);
            return;
         case DataPackage.DATA__DATA_TYPE:
            setDataType((DataType)newValue);
            return;
         case DataPackage.DATA__INFORMATION_TYPE:
            setInformationType((InformationType)newValue);
            return;
         case DataPackage.DATA__PARAMETERS:
            getParameters().clear();
            getParameters().addAll((Collection<? extends Parameter>)newValue);
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
         case DataPackage.DATA__VALUE:
            setValue(VALUE_EDEFAULT);
            return;
         case DataPackage.DATA__DATA_TYPE:
            setDataType((DataType)null);
            return;
         case DataPackage.DATA__INFORMATION_TYPE:
            setInformationType((InformationType)null);
            return;
         case DataPackage.DATA__PARAMETERS:
            getParameters().clear();
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
         case DataPackage.DATA__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
         case DataPackage.DATA__DATA_TYPE:
            return dataType != null;
         case DataPackage.DATA__INFORMATION_TYPE:
            return informationType != null;
         case DataPackage.DATA__PARAMETERS:
            return parameters != null && !parameters.isEmpty();
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
      result.append(" (value: ");
      result.append(value);
      result.append(')');
      return result.toString();
   }

} //DataImpl
