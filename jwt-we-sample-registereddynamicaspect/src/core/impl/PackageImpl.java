/**
 */
package core.impl;

import core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.core.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.PackageImpl#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link core.impl.PackageImpl#getSuperpackage <em>Superpackage</em>}</li>
 *   <li>{@link core.impl.PackageImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements org.eclipse.jwt.meta.model.core.Package {
   /**
    * The cached value of the '{@link #getSubpackages() <em>Subpackages</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSubpackages()
    * @generated
    * @ordered
    */
   protected EList<org.eclipse.jwt.meta.model.core.Package> subpackages;

   /**
    * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getElements()
    * @generated
    * @ordered
    */
   protected EList<PackageableElement> elements;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PackageImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return CorePackage.Literals.PACKAGE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<org.eclipse.jwt.meta.model.core.Package> getSubpackages() {
      if (subpackages == null) {
         subpackages = new EObjectContainmentWithInverseEList<org.eclipse.jwt.meta.model.core.Package>(org.eclipse.jwt.meta.model.core.Package.class, this, CorePackage.PACKAGE__SUBPACKAGES, CorePackage.PACKAGE__SUPERPACKAGE);
      }
      return subpackages;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public org.eclipse.jwt.meta.model.core.Package getSuperpackage() {
      if (eContainerFeatureID() != CorePackage.PACKAGE__SUPERPACKAGE) return null;
      return (org.eclipse.jwt.meta.model.core.Package)eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSuperpackage(org.eclipse.jwt.meta.model.core.Package newSuperpackage, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newSuperpackage, CorePackage.PACKAGE__SUPERPACKAGE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSuperpackage(org.eclipse.jwt.meta.model.core.Package newSuperpackage) {
      if (newSuperpackage != eInternalContainer() || (eContainerFeatureID() != CorePackage.PACKAGE__SUPERPACKAGE && newSuperpackage != null)) {
         if (EcoreUtil.isAncestor(this, newSuperpackage))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newSuperpackage != null)
            msgs = ((InternalEObject)newSuperpackage).eInverseAdd(this, CorePackage.PACKAGE__SUBPACKAGES, org.eclipse.jwt.meta.model.core.Package.class, msgs);
         msgs = basicSetSuperpackage(newSuperpackage, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PACKAGE__SUPERPACKAGE, newSuperpackage, newSuperpackage));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<PackageableElement> getElements() {
      if (elements == null) {
         elements = new EObjectContainmentWithInverseEList<PackageableElement>(PackageableElement.class, this, CorePackage.PACKAGE__ELEMENTS, CorePackage.PACKAGEABLE_ELEMENT__PACKAGE);
      }
      return elements;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case CorePackage.PACKAGE__SUBPACKAGES:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpackages()).basicAdd(otherEnd, msgs);
         case CorePackage.PACKAGE__SUPERPACKAGE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetSuperpackage((org.eclipse.jwt.meta.model.core.Package)otherEnd, msgs);
         case CorePackage.PACKAGE__ELEMENTS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
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
         case CorePackage.PACKAGE__SUBPACKAGES:
            return ((InternalEList<?>)getSubpackages()).basicRemove(otherEnd, msgs);
         case CorePackage.PACKAGE__SUPERPACKAGE:
            return basicSetSuperpackage(null, msgs);
         case CorePackage.PACKAGE__ELEMENTS:
            return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
         case CorePackage.PACKAGE__SUPERPACKAGE:
            return eInternalContainer().eInverseRemove(this, CorePackage.PACKAGE__SUBPACKAGES, org.eclipse.jwt.meta.model.core.Package.class, msgs);
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
         case CorePackage.PACKAGE__SUBPACKAGES:
            return getSubpackages();
         case CorePackage.PACKAGE__SUPERPACKAGE:
            return getSuperpackage();
         case CorePackage.PACKAGE__ELEMENTS:
            return getElements();
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
         case CorePackage.PACKAGE__SUBPACKAGES:
            getSubpackages().clear();
            getSubpackages().addAll((Collection<? extends org.eclipse.jwt.meta.model.core.Package>)newValue);
            return;
         case CorePackage.PACKAGE__SUPERPACKAGE:
            setSuperpackage((org.eclipse.jwt.meta.model.core.Package)newValue);
            return;
         case CorePackage.PACKAGE__ELEMENTS:
            getElements().clear();
            getElements().addAll((Collection<? extends PackageableElement>)newValue);
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
         case CorePackage.PACKAGE__SUBPACKAGES:
            getSubpackages().clear();
            return;
         case CorePackage.PACKAGE__SUPERPACKAGE:
            setSuperpackage((org.eclipse.jwt.meta.model.core.Package)null);
            return;
         case CorePackage.PACKAGE__ELEMENTS:
            getElements().clear();
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
         case CorePackage.PACKAGE__SUBPACKAGES:
            return subpackages != null && !subpackages.isEmpty();
         case CorePackage.PACKAGE__SUPERPACKAGE:
            return getSuperpackage() != null;
         case CorePackage.PACKAGE__ELEMENTS:
            return elements != null && !elements.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //PackageImpl
