/**
 */
package application.impl;

import application.ApplicationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.jwt.meta.model.application.WebServiceApplication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Service Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.WebServiceApplicationImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link application.impl.WebServiceApplicationImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebServiceApplicationImpl extends ApplicationImpl implements WebServiceApplication {
   /**
    * The default value of the '{@link #getInterface() <em>Interface</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInterface()
    * @generated
    * @ordered
    */
   protected static final String INTERFACE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getInterface() <em>Interface</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInterface()
    * @generated
    * @ordered
    */
   protected String interface_ = INTERFACE_EDEFAULT;

   /**
    * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOperation()
    * @generated
    * @ordered
    */
   protected static final String OPERATION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOperation()
    * @generated
    * @ordered
    */
   protected String operation = OPERATION_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected WebServiceApplicationImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ApplicationPackage.Literals.WEB_SERVICE_APPLICATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getInterface() {
      return interface_;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInterface(String newInterface) {
      String oldInterface = interface_;
      interface_ = newInterface;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.WEB_SERVICE_APPLICATION__INTERFACE, oldInterface, interface_));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getOperation() {
      return operation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOperation(String newOperation) {
      String oldOperation = operation;
      operation = newOperation;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.WEB_SERVICE_APPLICATION__OPERATION, oldOperation, operation));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case ApplicationPackage.WEB_SERVICE_APPLICATION__INTERFACE:
            return getInterface();
         case ApplicationPackage.WEB_SERVICE_APPLICATION__OPERATION:
            return getOperation();
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
         case ApplicationPackage.WEB_SERVICE_APPLICATION__INTERFACE:
            setInterface((String)newValue);
            return;
         case ApplicationPackage.WEB_SERVICE_APPLICATION__OPERATION:
            setOperation((String)newValue);
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
         case ApplicationPackage.WEB_SERVICE_APPLICATION__INTERFACE:
            setInterface(INTERFACE_EDEFAULT);
            return;
         case ApplicationPackage.WEB_SERVICE_APPLICATION__OPERATION:
            setOperation(OPERATION_EDEFAULT);
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
         case ApplicationPackage.WEB_SERVICE_APPLICATION__INTERFACE:
            return INTERFACE_EDEFAULT == null ? interface_ != null : !INTERFACE_EDEFAULT.equals(interface_);
         case ApplicationPackage.WEB_SERVICE_APPLICATION__OPERATION:
            return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
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
      result.append(" (Interface: ");
      result.append(interface_);
      result.append(", Operation: ");
      result.append(operation);
      result.append(')');
      return result.toString();
   }

} //WebServiceApplicationImpl
