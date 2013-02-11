/**
 */
package organisations.impl;

import core.impl.ReferenceableElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.jwt.meta.model.organisations.OrganisationUnit;
import org.eclipse.jwt.meta.model.organisations.Role;

import organisations.OrganisationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link organisations.impl.RoleImpl#getPerformedBy <em>Performed By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends ReferenceableElementImpl implements Role {
   /**
    * The cached value of the '{@link #getPerformedBy() <em>Performed By</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPerformedBy()
    * @generated
    * @ordered
    */
   protected EList<OrganisationUnit> performedBy;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RoleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return OrganisationsPackage.Literals.ROLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<OrganisationUnit> getPerformedBy() {
      if (performedBy == null) {
         performedBy = new EObjectResolvingEList<OrganisationUnit>(OrganisationUnit.class, this, OrganisationsPackage.ROLE__PERFORMED_BY);
      }
      return performedBy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case OrganisationsPackage.ROLE__PERFORMED_BY:
            return getPerformedBy();
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
         case OrganisationsPackage.ROLE__PERFORMED_BY:
            getPerformedBy().clear();
            getPerformedBy().addAll((Collection<? extends OrganisationUnit>)newValue);
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
         case OrganisationsPackage.ROLE__PERFORMED_BY:
            getPerformedBy().clear();
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
         case OrganisationsPackage.ROLE__PERFORMED_BY:
            return performedBy != null && !performedBy.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //RoleImpl
