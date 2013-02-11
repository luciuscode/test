/**
 */
package application.impl;

import application.ApplicationPackage;

import core.impl.ReferenceableElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.application.Application;
import org.eclipse.jwt.meta.model.application.ApplicationType;

import org.eclipse.jwt.meta.model.data.InputParameter;
import org.eclipse.jwt.meta.model.data.OutputParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.ApplicationImpl#getType <em>Type</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getJarArchive <em>Jar Archive</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends ReferenceableElementImpl implements Application {
   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected ApplicationType type;

   /**
    * The default value of the '{@link #getJarArchive() <em>Jar Archive</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getJarArchive()
    * @generated
    * @ordered
    */
   protected static final String JAR_ARCHIVE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getJarArchive() <em>Jar Archive</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getJarArchive()
    * @generated
    * @ordered
    */
   protected String jarArchive = JAR_ARCHIVE_EDEFAULT;

   /**
    * The default value of the '{@link #getJavaClass() <em>Java Class</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getJavaClass()
    * @generated
    * @ordered
    */
   protected static final String JAVA_CLASS_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getJavaClass()
    * @generated
    * @ordered
    */
   protected String javaClass = JAVA_CLASS_EDEFAULT;

   /**
    * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getMethod()
    * @generated
    * @ordered
    */
   protected static final String METHOD_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getMethod()
    * @generated
    * @ordered
    */
   protected String method = METHOD_EDEFAULT;

   /**
    * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInput()
    * @generated
    * @ordered
    */
   protected EList<InputParameter> input;

   /**
    * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOutput()
    * @generated
    * @ordered
    */
   protected EList<OutputParameter> output;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ApplicationImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ApplicationPackage.Literals.APPLICATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ApplicationType getType() {
      if (type != null && type.eIsProxy()) {
         InternalEObject oldType = (InternalEObject)type;
         type = (ApplicationType)eResolveProxy(oldType);
         if (type != oldType) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__TYPE, oldType, type));
         }
      }
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ApplicationType basicGetType() {
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setType(ApplicationType newType) {
      ApplicationType oldType = type;
      type = newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getJarArchive() {
      return jarArchive;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setJarArchive(String newJarArchive) {
      String oldJarArchive = jarArchive;
      jarArchive = newJarArchive;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__JAR_ARCHIVE, oldJarArchive, jarArchive));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getJavaClass() {
      return javaClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setJavaClass(String newJavaClass) {
      String oldJavaClass = javaClass;
      javaClass = newJavaClass;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__JAVA_CLASS, oldJavaClass, javaClass));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getMethod() {
      return method;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setMethod(String newMethod) {
      String oldMethod = method;
      method = newMethod;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__METHOD, oldMethod, method));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<InputParameter> getInput() {
      if (input == null) {
         input = new EObjectContainmentEList<InputParameter>(InputParameter.class, this, ApplicationPackage.APPLICATION__INPUT);
      }
      return input;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<OutputParameter> getOutput() {
      if (output == null) {
         output = new EObjectContainmentEList<OutputParameter>(OutputParameter.class, this, ApplicationPackage.APPLICATION__OUTPUT);
      }
      return output;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case ApplicationPackage.APPLICATION__INPUT:
            return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
         case ApplicationPackage.APPLICATION__OUTPUT:
            return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
         case ApplicationPackage.APPLICATION__TYPE:
            if (resolve) return getType();
            return basicGetType();
         case ApplicationPackage.APPLICATION__JAR_ARCHIVE:
            return getJarArchive();
         case ApplicationPackage.APPLICATION__JAVA_CLASS:
            return getJavaClass();
         case ApplicationPackage.APPLICATION__METHOD:
            return getMethod();
         case ApplicationPackage.APPLICATION__INPUT:
            return getInput();
         case ApplicationPackage.APPLICATION__OUTPUT:
            return getOutput();
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
         case ApplicationPackage.APPLICATION__TYPE:
            setType((ApplicationType)newValue);
            return;
         case ApplicationPackage.APPLICATION__JAR_ARCHIVE:
            setJarArchive((String)newValue);
            return;
         case ApplicationPackage.APPLICATION__JAVA_CLASS:
            setJavaClass((String)newValue);
            return;
         case ApplicationPackage.APPLICATION__METHOD:
            setMethod((String)newValue);
            return;
         case ApplicationPackage.APPLICATION__INPUT:
            getInput().clear();
            getInput().addAll((Collection<? extends InputParameter>)newValue);
            return;
         case ApplicationPackage.APPLICATION__OUTPUT:
            getOutput().clear();
            getOutput().addAll((Collection<? extends OutputParameter>)newValue);
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
         case ApplicationPackage.APPLICATION__TYPE:
            setType((ApplicationType)null);
            return;
         case ApplicationPackage.APPLICATION__JAR_ARCHIVE:
            setJarArchive(JAR_ARCHIVE_EDEFAULT);
            return;
         case ApplicationPackage.APPLICATION__JAVA_CLASS:
            setJavaClass(JAVA_CLASS_EDEFAULT);
            return;
         case ApplicationPackage.APPLICATION__METHOD:
            setMethod(METHOD_EDEFAULT);
            return;
         case ApplicationPackage.APPLICATION__INPUT:
            getInput().clear();
            return;
         case ApplicationPackage.APPLICATION__OUTPUT:
            getOutput().clear();
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
         case ApplicationPackage.APPLICATION__TYPE:
            return type != null;
         case ApplicationPackage.APPLICATION__JAR_ARCHIVE:
            return JAR_ARCHIVE_EDEFAULT == null ? jarArchive != null : !JAR_ARCHIVE_EDEFAULT.equals(jarArchive);
         case ApplicationPackage.APPLICATION__JAVA_CLASS:
            return JAVA_CLASS_EDEFAULT == null ? javaClass != null : !JAVA_CLASS_EDEFAULT.equals(javaClass);
         case ApplicationPackage.APPLICATION__METHOD:
            return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
         case ApplicationPackage.APPLICATION__INPUT:
            return input != null && !input.isEmpty();
         case ApplicationPackage.APPLICATION__OUTPUT:
            return output != null && !output.isEmpty();
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
      result.append(" (jarArchive: ");
      result.append(jarArchive);
      result.append(", javaClass: ");
      result.append(javaClass);
      result.append(", method: ");
      result.append(method);
      result.append(')');
      return result.toString();
   }

} //ApplicationImpl
