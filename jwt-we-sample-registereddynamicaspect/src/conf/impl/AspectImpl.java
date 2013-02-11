/**
 */
package conf.impl;

import conf.ConfPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.jwt.we.conf.model.Aspect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link conf.impl.AspectImpl#getId <em>Id</em>}</li>
 *   <li>{@link conf.impl.AspectImpl#getAspectInstanceEType <em>Aspect Instance EType</em>}</li>
 *   <li>{@link conf.impl.AspectImpl#getTargetModelElements <em>Target Model Elements</em>}</li>
 *   <li>{@link conf.impl.AspectImpl#isAutocreated <em>Autocreated</em>}</li>
 *   <li>{@link conf.impl.AspectImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link conf.impl.AspectImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectImpl extends EObjectImpl implements Aspect {
   /**
    * The default value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected static final String ID_EDEFAULT = "com.yourcompany.yourprofile.youraspect";

   /**
    * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected String id = ID_EDEFAULT;

   /**
    * The cached value of the '{@link #getAspectInstanceEType() <em>Aspect Instance EType</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAspectInstanceEType()
    * @generated
    * @ordered
    */
   protected EClassifier aspectInstanceEType;

   /**
    * The cached value of the '{@link #getTargetModelElements() <em>Target Model Elements</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTargetModelElements()
    * @generated
    * @ordered
    */
   protected EList<EClass> targetModelElements;

   /**
    * The default value of the '{@link #isAutocreated() <em>Autocreated</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isAutocreated()
    * @generated
    * @ordered
    */
   protected static final boolean AUTOCREATED_EDEFAULT = true;

   /**
    * The cached value of the '{@link #isAutocreated() <em>Autocreated</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isAutocreated()
    * @generated
    * @ordered
    */
   protected boolean autocreated = AUTOCREATED_EDEFAULT;

   /**
    * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isMultiple()
    * @generated
    * @ordered
    */
   protected static final boolean MULTIPLE_EDEFAULT = true;

   /**
    * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isMultiple()
    * @generated
    * @ordered
    */
   protected boolean multiple = MULTIPLE_EDEFAULT;

   /**
    * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDefaultValue()
    * @generated
    * @ordered
    */
   protected static final String DEFAULT_VALUE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDefaultValue()
    * @generated
    * @ordered
    */
   protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AspectImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ConfPackage.Literals.ASPECT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getId() {
      return id;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setId(String newId) {
      String oldId = id;
      id = newId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.ASPECT__ID, oldId, id));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClassifier getAspectInstanceEType() {
      if (aspectInstanceEType != null && aspectInstanceEType.eIsProxy()) {
         InternalEObject oldAspectInstanceEType = (InternalEObject)aspectInstanceEType;
         aspectInstanceEType = (EClassifier)eResolveProxy(oldAspectInstanceEType);
         if (aspectInstanceEType != oldAspectInstanceEType) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfPackage.ASPECT__ASPECT_INSTANCE_ETYPE, oldAspectInstanceEType, aspectInstanceEType));
         }
      }
      return aspectInstanceEType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClassifier basicGetAspectInstanceEType() {
      return aspectInstanceEType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAspectInstanceEType(EClassifier newAspectInstanceEType) {
      EClassifier oldAspectInstanceEType = aspectInstanceEType;
      aspectInstanceEType = newAspectInstanceEType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.ASPECT__ASPECT_INSTANCE_ETYPE, oldAspectInstanceEType, aspectInstanceEType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<EClass> getTargetModelElements() {
      if (targetModelElements == null) {
         targetModelElements = new EObjectResolvingEList<EClass>(EClass.class, this, ConfPackage.ASPECT__TARGET_MODEL_ELEMENTS);
      }
      return targetModelElements;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isAutocreated() {
      return autocreated;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAutocreated(boolean newAutocreated) {
      boolean oldAutocreated = autocreated;
      autocreated = newAutocreated;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.ASPECT__AUTOCREATED, oldAutocreated, autocreated));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isMultiple() {
      return multiple;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setMultiple(boolean newMultiple) {
      boolean oldMultiple = multiple;
      multiple = newMultiple;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.ASPECT__MULTIPLE, oldMultiple, multiple));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getDefaultValue() {
      return defaultValue;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDefaultValue(String newDefaultValue) {
      String oldDefaultValue = defaultValue;
      defaultValue = newDefaultValue;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.ASPECT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case ConfPackage.ASPECT__ID:
            return getId();
         case ConfPackage.ASPECT__ASPECT_INSTANCE_ETYPE:
            if (resolve) return getAspectInstanceEType();
            return basicGetAspectInstanceEType();
         case ConfPackage.ASPECT__TARGET_MODEL_ELEMENTS:
            return getTargetModelElements();
         case ConfPackage.ASPECT__AUTOCREATED:
            return isAutocreated();
         case ConfPackage.ASPECT__MULTIPLE:
            return isMultiple();
         case ConfPackage.ASPECT__DEFAULT_VALUE:
            return getDefaultValue();
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
         case ConfPackage.ASPECT__ID:
            setId((String)newValue);
            return;
         case ConfPackage.ASPECT__ASPECT_INSTANCE_ETYPE:
            setAspectInstanceEType((EClassifier)newValue);
            return;
         case ConfPackage.ASPECT__TARGET_MODEL_ELEMENTS:
            getTargetModelElements().clear();
            getTargetModelElements().addAll((Collection<? extends EClass>)newValue);
            return;
         case ConfPackage.ASPECT__AUTOCREATED:
            setAutocreated((Boolean)newValue);
            return;
         case ConfPackage.ASPECT__MULTIPLE:
            setMultiple((Boolean)newValue);
            return;
         case ConfPackage.ASPECT__DEFAULT_VALUE:
            setDefaultValue((String)newValue);
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
         case ConfPackage.ASPECT__ID:
            setId(ID_EDEFAULT);
            return;
         case ConfPackage.ASPECT__ASPECT_INSTANCE_ETYPE:
            setAspectInstanceEType((EClassifier)null);
            return;
         case ConfPackage.ASPECT__TARGET_MODEL_ELEMENTS:
            getTargetModelElements().clear();
            return;
         case ConfPackage.ASPECT__AUTOCREATED:
            setAutocreated(AUTOCREATED_EDEFAULT);
            return;
         case ConfPackage.ASPECT__MULTIPLE:
            setMultiple(MULTIPLE_EDEFAULT);
            return;
         case ConfPackage.ASPECT__DEFAULT_VALUE:
            setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
         case ConfPackage.ASPECT__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
         case ConfPackage.ASPECT__ASPECT_INSTANCE_ETYPE:
            return aspectInstanceEType != null;
         case ConfPackage.ASPECT__TARGET_MODEL_ELEMENTS:
            return targetModelElements != null && !targetModelElements.isEmpty();
         case ConfPackage.ASPECT__AUTOCREATED:
            return autocreated != AUTOCREATED_EDEFAULT;
         case ConfPackage.ASPECT__MULTIPLE:
            return multiple != MULTIPLE_EDEFAULT;
         case ConfPackage.ASPECT__DEFAULT_VALUE:
            return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
      result.append(" (id: ");
      result.append(id);
      result.append(", autocreated: ");
      result.append(autocreated);
      result.append(", multiple: ");
      result.append(multiple);
      result.append(", defaultValue: ");
      result.append(defaultValue);
      result.append(')');
      return result.toString();
   }

} //AspectImpl
