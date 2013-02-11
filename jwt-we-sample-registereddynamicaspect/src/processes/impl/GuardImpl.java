/**
 */
package processes.impl;

import core.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.jwt.meta.model.processes.Guard;
import org.eclipse.jwt.meta.model.processes.GuardSpecification;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processes.impl.GuardImpl#getTextualdescription <em>Textualdescription</em>}</li>
 *   <li>{@link processes.impl.GuardImpl#getShortdescription <em>Shortdescription</em>}</li>
 *   <li>{@link processes.impl.GuardImpl#getDetailedSpecification <em>Detailed Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardImpl extends NamedElementImpl implements Guard {
   /**
    * The default value of the '{@link #getTextualdescription() <em>Textualdescription</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTextualdescription()
    * @generated
    * @ordered
    */
   protected static final String TEXTUALDESCRIPTION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getTextualdescription() <em>Textualdescription</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTextualdescription()
    * @generated
    * @ordered
    */
   protected String textualdescription = TEXTUALDESCRIPTION_EDEFAULT;

   /**
    * The default value of the '{@link #getShortdescription() <em>Shortdescription</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getShortdescription()
    * @generated
    * @ordered
    */
   protected static final String SHORTDESCRIPTION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getShortdescription() <em>Shortdescription</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getShortdescription()
    * @generated
    * @ordered
    */
   protected String shortdescription = SHORTDESCRIPTION_EDEFAULT;

   /**
    * The cached value of the '{@link #getDetailedSpecification() <em>Detailed Specification</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDetailedSpecification()
    * @generated
    * @ordered
    */
   protected GuardSpecification detailedSpecification;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected GuardImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.GUARD;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getTextualdescription() {
      return textualdescription;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTextualdescription(String newTextualdescription) {
      String oldTextualdescription = textualdescription;
      textualdescription = newTextualdescription;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.GUARD__TEXTUALDESCRIPTION, oldTextualdescription, textualdescription));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getShortdescription() {
      return shortdescription;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setShortdescription(String newShortdescription) {
      String oldShortdescription = shortdescription;
      shortdescription = newShortdescription;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.GUARD__SHORTDESCRIPTION, oldShortdescription, shortdescription));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GuardSpecification getDetailedSpecification() {
      return detailedSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetDetailedSpecification(GuardSpecification newDetailedSpecification, NotificationChain msgs) {
      GuardSpecification oldDetailedSpecification = detailedSpecification;
      detailedSpecification = newDetailedSpecification;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessesPackage.GUARD__DETAILED_SPECIFICATION, oldDetailedSpecification, newDetailedSpecification);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDetailedSpecification(GuardSpecification newDetailedSpecification) {
      if (newDetailedSpecification != detailedSpecification) {
         NotificationChain msgs = null;
         if (detailedSpecification != null)
            msgs = ((InternalEObject)detailedSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessesPackage.GUARD__DETAILED_SPECIFICATION, null, msgs);
         if (newDetailedSpecification != null)
            msgs = ((InternalEObject)newDetailedSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessesPackage.GUARD__DETAILED_SPECIFICATION, null, msgs);
         msgs = basicSetDetailedSpecification(newDetailedSpecification, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.GUARD__DETAILED_SPECIFICATION, newDetailedSpecification, newDetailedSpecification));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case ProcessesPackage.GUARD__DETAILED_SPECIFICATION:
            return basicSetDetailedSpecification(null, msgs);
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
         case ProcessesPackage.GUARD__TEXTUALDESCRIPTION:
            return getTextualdescription();
         case ProcessesPackage.GUARD__SHORTDESCRIPTION:
            return getShortdescription();
         case ProcessesPackage.GUARD__DETAILED_SPECIFICATION:
            return getDetailedSpecification();
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
         case ProcessesPackage.GUARD__TEXTUALDESCRIPTION:
            setTextualdescription((String)newValue);
            return;
         case ProcessesPackage.GUARD__SHORTDESCRIPTION:
            setShortdescription((String)newValue);
            return;
         case ProcessesPackage.GUARD__DETAILED_SPECIFICATION:
            setDetailedSpecification((GuardSpecification)newValue);
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
         case ProcessesPackage.GUARD__TEXTUALDESCRIPTION:
            setTextualdescription(TEXTUALDESCRIPTION_EDEFAULT);
            return;
         case ProcessesPackage.GUARD__SHORTDESCRIPTION:
            setShortdescription(SHORTDESCRIPTION_EDEFAULT);
            return;
         case ProcessesPackage.GUARD__DETAILED_SPECIFICATION:
            setDetailedSpecification((GuardSpecification)null);
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
         case ProcessesPackage.GUARD__TEXTUALDESCRIPTION:
            return TEXTUALDESCRIPTION_EDEFAULT == null ? textualdescription != null : !TEXTUALDESCRIPTION_EDEFAULT.equals(textualdescription);
         case ProcessesPackage.GUARD__SHORTDESCRIPTION:
            return SHORTDESCRIPTION_EDEFAULT == null ? shortdescription != null : !SHORTDESCRIPTION_EDEFAULT.equals(shortdescription);
         case ProcessesPackage.GUARD__DETAILED_SPECIFICATION:
            return detailedSpecification != null;
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
      result.append(" (textualdescription: ");
      result.append(textualdescription);
      result.append(", shortdescription: ");
      result.append(shortdescription);
      result.append(')');
      return result.toString();
   }

} //GuardImpl
