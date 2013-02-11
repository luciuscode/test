/**
 */
package core.impl;

import core.CorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.jwt.meta.model.core.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.PackageableElementImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageableElementImpl extends NamedElementImpl implements PackageableElement {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PackageableElementImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return CorePackage.Literals.PACKAGEABLE_ELEMENT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public org.eclipse.jwt.meta.model.core.Package getPackage() {
      if (eContainerFeatureID() != CorePackage.PACKAGEABLE_ELEMENT__PACKAGE) return null;
      return (org.eclipse.jwt.meta.model.core.Package)eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPackage(org.eclipse.jwt.meta.model.core.Package newPackage, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newPackage, CorePackage.PACKAGEABLE_ELEMENT__PACKAGE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPackage(org.eclipse.jwt.meta.model.core.Package newPackage) {
      if (newPackage != eInternalContainer() || (eContainerFeatureID() != CorePackage.PACKAGEABLE_ELEMENT__PACKAGE && newPackage != null)) {
         if (EcoreUtil.isAncestor(this, newPackage))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newPackage != null)
            msgs = ((InternalEObject)newPackage).eInverseAdd(this, CorePackage.PACKAGE__ELEMENTS, org.eclipse.jwt.meta.model.core.Package.class, msgs);
         msgs = basicSetPackage(newPackage, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PACKAGEABLE_ELEMENT__PACKAGE, newPackage, newPackage));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case CorePackage.PACKAGEABLE_ELEMENT__PACKAGE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetPackage((org.eclipse.jwt.meta.model.core.Package)otherEnd, msgs);
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
         case CorePackage.PACKAGEABLE_ELEMENT__PACKAGE:
            return basicSetPackage(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
      switch (eContainerFeatureID()) {
         case CorePackage.PACKAGEABLE_ELEMENT__PACKAGE:
            return eInternalContainer().eInverseRemove(this, CorePackage.PACKAGE__ELEMENTS, org.eclipse.jwt.meta.model.core.Package.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case CorePackage.PACKAGEABLE_ELEMENT__PACKAGE:
            return getPackage();
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
         case CorePackage.PACKAGEABLE_ELEMENT__PACKAGE:
            setPackage((org.eclipse.jwt.meta.model.core.Package)newValue);
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
         case CorePackage.PACKAGEABLE_ELEMENT__PACKAGE:
            setPackage((org.eclipse.jwt.meta.model.core.Package)null);
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
         case CorePackage.PACKAGEABLE_ELEMENT__PACKAGE:
            return getPackage() != null;
      }
      return super.eIsSet(featureID);
   }

} //PackageableElementImpl
