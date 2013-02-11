/**
 */
package functions.impl;

import core.impl.PackageableElementImpl;

import functions.FunctionsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.functions.Function;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link functions.impl.FunctionImpl#getSubfunctions <em>Subfunctions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends PackageableElementImpl implements Function {
   /**
    * The cached value of the '{@link #getSubfunctions() <em>Subfunctions</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSubfunctions()
    * @generated
    * @ordered
    */
   protected EList<Function> subfunctions;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected FunctionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return FunctionsPackage.Literals.FUNCTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Function> getSubfunctions() {
      if (subfunctions == null) {
         subfunctions = new EObjectContainmentEList<Function>(Function.class, this, FunctionsPackage.FUNCTION__SUBFUNCTIONS);
      }
      return subfunctions;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case FunctionsPackage.FUNCTION__SUBFUNCTIONS:
            return ((InternalEList<?>)getSubfunctions()).basicRemove(otherEnd, msgs);
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
         case FunctionsPackage.FUNCTION__SUBFUNCTIONS:
            return getSubfunctions();
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
         case FunctionsPackage.FUNCTION__SUBFUNCTIONS:
            getSubfunctions().clear();
            getSubfunctions().addAll((Collection<? extends Function>)newValue);
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
         case FunctionsPackage.FUNCTION__SUBFUNCTIONS:
            getSubfunctions().clear();
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
         case FunctionsPackage.FUNCTION__SUBFUNCTIONS:
            return subfunctions != null && !subfunctions.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //FunctionImpl
