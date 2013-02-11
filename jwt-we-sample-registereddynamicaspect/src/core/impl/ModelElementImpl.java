/**
 */
package core.impl;

import core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.core.Comment;
import org.eclipse.jwt.meta.model.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.ModelElementImpl#getOwnedComment <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelElementImpl extends EObjectImpl implements ModelElement {
   /**
    * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOwnedComment()
    * @generated
    * @ordered
    */
   protected EList<Comment> ownedComment;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ModelElementImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return CorePackage.Literals.MODEL_ELEMENT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Comment> getOwnedComment() {
      if (ownedComment == null) {
         ownedComment = new EObjectContainmentEList<Comment>(Comment.class, this, CorePackage.MODEL_ELEMENT__OWNED_COMMENT);
      }
      return ownedComment;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case CorePackage.MODEL_ELEMENT__OWNED_COMMENT:
            return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
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
         case CorePackage.MODEL_ELEMENT__OWNED_COMMENT:
            return getOwnedComment();
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
         case CorePackage.MODEL_ELEMENT__OWNED_COMMENT:
            getOwnedComment().clear();
            getOwnedComment().addAll((Collection<? extends Comment>)newValue);
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
         case CorePackage.MODEL_ELEMENT__OWNED_COMMENT:
            getOwnedComment().clear();
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
         case CorePackage.MODEL_ELEMENT__OWNED_COMMENT:
            return ownedComment != null && !ownedComment.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //ModelElementImpl
