/**
 */
package organisations.impl;

import core.impl.PackageableElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.organisations.OrganisationUnit;

import organisations.OrganisationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link organisations.impl.OrganisationUnitImpl#getSubUnit <em>Sub Unit</em>}</li>
 *   <li>{@link organisations.impl.OrganisationUnitImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganisationUnitImpl extends PackageableElementImpl implements OrganisationUnit {
   /**
    * The cached value of the '{@link #getSubUnit() <em>Sub Unit</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSubUnit()
    * @generated
    * @ordered
    */
   protected EList<OrganisationUnit> subUnit;

   /**
    * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBelongsTo()
    * @generated
    * @ordered
    */
   protected EList<OrganisationUnit> belongsTo;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected OrganisationUnitImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return OrganisationsPackage.Literals.ORGANISATION_UNIT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<OrganisationUnit> getSubUnit() {
      if (subUnit == null) {
         subUnit = new EObjectWithInverseResolvingEList.ManyInverse<OrganisationUnit>(OrganisationUnit.class, this, OrganisationsPackage.ORGANISATION_UNIT__SUB_UNIT, OrganisationsPackage.ORGANISATION_UNIT__BELONGS_TO);
      }
      return subUnit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<OrganisationUnit> getBelongsTo() {
      if (belongsTo == null) {
         belongsTo = new EObjectWithInverseResolvingEList.ManyInverse<OrganisationUnit>(OrganisationUnit.class, this, OrganisationsPackage.ORGANISATION_UNIT__BELONGS_TO, OrganisationsPackage.ORGANISATION_UNIT__SUB_UNIT);
      }
      return belongsTo;
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
         case OrganisationsPackage.ORGANISATION_UNIT__SUB_UNIT:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubUnit()).basicAdd(otherEnd, msgs);
         case OrganisationsPackage.ORGANISATION_UNIT__BELONGS_TO:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getBelongsTo()).basicAdd(otherEnd, msgs);
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
         case OrganisationsPackage.ORGANISATION_UNIT__SUB_UNIT:
            return ((InternalEList<?>)getSubUnit()).basicRemove(otherEnd, msgs);
         case OrganisationsPackage.ORGANISATION_UNIT__BELONGS_TO:
            return ((InternalEList<?>)getBelongsTo()).basicRemove(otherEnd, msgs);
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
         case OrganisationsPackage.ORGANISATION_UNIT__SUB_UNIT:
            return getSubUnit();
         case OrganisationsPackage.ORGANISATION_UNIT__BELONGS_TO:
            return getBelongsTo();
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
         case OrganisationsPackage.ORGANISATION_UNIT__SUB_UNIT:
            getSubUnit().clear();
            getSubUnit().addAll((Collection<? extends OrganisationUnit>)newValue);
            return;
         case OrganisationsPackage.ORGANISATION_UNIT__BELONGS_TO:
            getBelongsTo().clear();
            getBelongsTo().addAll((Collection<? extends OrganisationUnit>)newValue);
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
         case OrganisationsPackage.ORGANISATION_UNIT__SUB_UNIT:
            getSubUnit().clear();
            return;
         case OrganisationsPackage.ORGANISATION_UNIT__BELONGS_TO:
            getBelongsTo().clear();
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
         case OrganisationsPackage.ORGANISATION_UNIT__SUB_UNIT:
            return subUnit != null && !subUnit.isEmpty();
         case OrganisationsPackage.ORGANISATION_UNIT__BELONGS_TO:
            return belongsTo != null && !belongsTo.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //OrganisationUnitImpl
