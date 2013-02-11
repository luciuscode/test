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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.data.Data;

import org.eclipse.jwt.meta.model.processes.GuardSpecification;

import processes.BooleanConnector;
import processes.OperationType;
import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processes.impl.GuardSpecificationImpl#getData <em>Data</em>}</li>
 *   <li>{@link processes.impl.GuardSpecificationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link processes.impl.GuardSpecificationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link processes.impl.GuardSpecificationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link processes.impl.GuardSpecificationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link processes.impl.GuardSpecificationImpl#getSubSpecification <em>Sub Specification</em>}</li>
 *   <li>{@link processes.impl.GuardSpecificationImpl#getSubSpecificationConnector <em>Sub Specification Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardSpecificationImpl extends EObjectImpl implements GuardSpecification {
   /**
    * The cached value of the '{@link #getData() <em>Data</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getData()
    * @generated
    * @ordered
    */
   protected Data data;

   /**
    * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAttribute()
    * @generated
    * @ordered
    */
   protected static final String ATTRIBUTE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAttribute()
    * @generated
    * @ordered
    */
   protected String attribute = ATTRIBUTE_EDEFAULT;

   /**
    * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOperation()
    * @generated
    * @ordered
    */
   protected static final OperationType OPERATION_EDEFAULT = OperationType.EQUALS;

   /**
    * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOperation()
    * @generated
    * @ordered
    */
   protected OperationType operation = OPERATION_EDEFAULT;

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
    * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDescription()
    * @generated
    * @ordered
    */
   protected static final String DESCRIPTION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDescription()
    * @generated
    * @ordered
    */
   protected String description = DESCRIPTION_EDEFAULT;

   /**
    * The cached value of the '{@link #getSubSpecification() <em>Sub Specification</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSubSpecification()
    * @generated
    * @ordered
    */
   protected EList<GuardSpecification> subSpecification;

   /**
    * The default value of the '{@link #getSubSpecificationConnector() <em>Sub Specification Connector</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSubSpecificationConnector()
    * @generated
    * @ordered
    */
   protected static final BooleanConnector SUB_SPECIFICATION_CONNECTOR_EDEFAULT = BooleanConnector.AND;

   /**
    * The cached value of the '{@link #getSubSpecificationConnector() <em>Sub Specification Connector</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSubSpecificationConnector()
    * @generated
    * @ordered
    */
   protected BooleanConnector subSpecificationConnector = SUB_SPECIFICATION_CONNECTOR_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected GuardSpecificationImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.GUARD_SPECIFICATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Data getData() {
      if (data != null && data.eIsProxy()) {
         InternalEObject oldData = (InternalEObject)data;
         data = (Data)eResolveProxy(oldData);
         if (data != oldData) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessesPackage.GUARD_SPECIFICATION__DATA, oldData, data));
         }
      }
      return data;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Data basicGetData() {
      return data;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setData(Data newData) {
      Data oldData = data;
      data = newData;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.GUARD_SPECIFICATION__DATA, oldData, data));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getAttribute() {
      return attribute;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAttribute(String newAttribute) {
      String oldAttribute = attribute;
      attribute = newAttribute;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.GUARD_SPECIFICATION__ATTRIBUTE, oldAttribute, attribute));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationType getOperation() {
      return operation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOperation(OperationType newOperation) {
      OperationType oldOperation = operation;
      operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.GUARD_SPECIFICATION__OPERATION, oldOperation, operation));
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
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.GUARD_SPECIFICATION__VALUE, oldValue, value));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getDescription() {
      return description;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDescription(String newDescription) {
      String oldDescription = description;
      description = newDescription;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.GUARD_SPECIFICATION__DESCRIPTION, oldDescription, description));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<GuardSpecification> getSubSpecification() {
      if (subSpecification == null) {
         subSpecification = new EObjectContainmentEList<GuardSpecification>(GuardSpecification.class, this, ProcessesPackage.GUARD_SPECIFICATION__SUB_SPECIFICATION);
      }
      return subSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BooleanConnector getSubSpecificationConnector() {
      return subSpecificationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSubSpecificationConnector(BooleanConnector newSubSpecificationConnector) {
      BooleanConnector oldSubSpecificationConnector = subSpecificationConnector;
      subSpecificationConnector = newSubSpecificationConnector == null ? SUB_SPECIFICATION_CONNECTOR_EDEFAULT : newSubSpecificationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.GUARD_SPECIFICATION__SUB_SPECIFICATION_CONNECTOR, oldSubSpecificationConnector, subSpecificationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case ProcessesPackage.GUARD_SPECIFICATION__SUB_SPECIFICATION:
            return ((InternalEList<?>)getSubSpecification()).basicRemove(otherEnd, msgs);
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
         case ProcessesPackage.GUARD_SPECIFICATION__DATA:
            if (resolve) return getData();
            return basicGetData();
         case ProcessesPackage.GUARD_SPECIFICATION__ATTRIBUTE:
            return getAttribute();
         case ProcessesPackage.GUARD_SPECIFICATION__OPERATION:
            return getOperation();
         case ProcessesPackage.GUARD_SPECIFICATION__VALUE:
            return getValue();
         case ProcessesPackage.GUARD_SPECIFICATION__DESCRIPTION:
            return getDescription();
         case ProcessesPackage.GUARD_SPECIFICATION__SUB_SPECIFICATION:
            return getSubSpecification();
         case ProcessesPackage.GUARD_SPECIFICATION__SUB_SPECIFICATION_CONNECTOR:
            return getSubSpecificationConnector();
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
         case ProcessesPackage.GUARD_SPECIFICATION__DATA:
            setData((Data)newValue);
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__ATTRIBUTE:
            setAttribute((String)newValue);
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__OPERATION:
            setOperation((OperationType)newValue);
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__VALUE:
            setValue((String)newValue);
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__DESCRIPTION:
            setDescription((String)newValue);
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__SUB_SPECIFICATION:
            getSubSpecification().clear();
            getSubSpecification().addAll((Collection<? extends GuardSpecification>)newValue);
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__SUB_SPECIFICATION_CONNECTOR:
            setSubSpecificationConnector((BooleanConnector)newValue);
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
         case ProcessesPackage.GUARD_SPECIFICATION__DATA:
            setData((Data)null);
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__ATTRIBUTE:
            setAttribute(ATTRIBUTE_EDEFAULT);
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__OPERATION:
            setOperation(OPERATION_EDEFAULT);
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__VALUE:
            setValue(VALUE_EDEFAULT);
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__DESCRIPTION:
            setDescription(DESCRIPTION_EDEFAULT);
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__SUB_SPECIFICATION:
            getSubSpecification().clear();
            return;
         case ProcessesPackage.GUARD_SPECIFICATION__SUB_SPECIFICATION_CONNECTOR:
            setSubSpecificationConnector(SUB_SPECIFICATION_CONNECTOR_EDEFAULT);
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
         case ProcessesPackage.GUARD_SPECIFICATION__DATA:
            return data != null;
         case ProcessesPackage.GUARD_SPECIFICATION__ATTRIBUTE:
            return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
         case ProcessesPackage.GUARD_SPECIFICATION__OPERATION:
            return operation != OPERATION_EDEFAULT;
         case ProcessesPackage.GUARD_SPECIFICATION__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
         case ProcessesPackage.GUARD_SPECIFICATION__DESCRIPTION:
            return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
         case ProcessesPackage.GUARD_SPECIFICATION__SUB_SPECIFICATION:
            return subSpecification != null && !subSpecification.isEmpty();
         case ProcessesPackage.GUARD_SPECIFICATION__SUB_SPECIFICATION_CONNECTOR:
            return subSpecificationConnector != SUB_SPECIFICATION_CONNECTOR_EDEFAULT;
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
      result.append(" (attribute: ");
      result.append(attribute);
      result.append(", operation: ");
      result.append(operation);
      result.append(", value: ");
      result.append(value);
      result.append(", Description: ");
      result.append(description);
      result.append(", subSpecificationConnector: ");
      result.append(subSpecificationConnector);
      result.append(')');
      return result.toString();
   }

} //GuardSpecificationImpl
