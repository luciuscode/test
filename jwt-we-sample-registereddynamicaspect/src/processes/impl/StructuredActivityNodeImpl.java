/**
 */
package processes.impl;

import core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.meta.model.core.GraphicalElement;
import org.eclipse.jwt.meta.model.core.NamedElement;

import org.eclipse.jwt.meta.model.processes.ActivityEdge;
import org.eclipse.jwt.meta.model.processes.ActivityNode;
import org.eclipse.jwt.meta.model.processes.ExecutableNode;
import org.eclipse.jwt.meta.model.processes.StructuredActivityNode;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link processes.impl.StructuredActivityNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link processes.impl.StructuredActivityNodeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link processes.impl.StructuredActivityNodeImpl#getIn <em>In</em>}</li>
 *   <li>{@link processes.impl.StructuredActivityNodeImpl#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends ScopeImpl implements StructuredActivityNode {
   /**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;

   /**
    * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIcon()
    * @generated
    * @ordered
    */
   protected static final String ICON_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIcon()
    * @generated
    * @ordered
    */
   protected String icon = ICON_EDEFAULT;

   /**
    * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIn()
    * @generated
    * @ordered
    */
   protected EList<ActivityEdge> in;

   /**
    * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOut()
    * @generated
    * @ordered
    */
   protected EList<ActivityEdge> out;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected StructuredActivityNodeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ProcessesPackage.Literals.STRUCTURED_ACTIVITY_NODE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName() {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setName(String newName) {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.STRUCTURED_ACTIVITY_NODE__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getIcon() {
      return icon;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setIcon(String newIcon) {
      String oldIcon = icon;
      icon = newIcon;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.STRUCTURED_ACTIVITY_NODE__ICON, oldIcon, icon));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ActivityEdge> getIn() {
      if (in == null) {
         in = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, ProcessesPackage.STRUCTURED_ACTIVITY_NODE__IN, ProcessesPackage.ACTIVITY_EDGE__TARGET);
      }
      return in;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ActivityEdge> getOut() {
      if (out == null) {
         out = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, ProcessesPackage.STRUCTURED_ACTIVITY_NODE__OUT, ProcessesPackage.ACTIVITY_EDGE__SOURCE);
      }
      return out;
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
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__IN:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getIn()).basicAdd(otherEnd, msgs);
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__OUT:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getOut()).basicAdd(otherEnd, msgs);
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
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__IN:
            return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__OUT:
            return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
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
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__NAME:
            return getName();
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__ICON:
            return getIcon();
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__IN:
            return getIn();
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__OUT:
            return getOut();
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
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__NAME:
            setName((String)newValue);
            return;
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__ICON:
            setIcon((String)newValue);
            return;
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__IN:
            getIn().clear();
            getIn().addAll((Collection<? extends ActivityEdge>)newValue);
            return;
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__OUT:
            getOut().clear();
            getOut().addAll((Collection<? extends ActivityEdge>)newValue);
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
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__NAME:
            setName(NAME_EDEFAULT);
            return;
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__ICON:
            setIcon(ICON_EDEFAULT);
            return;
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__IN:
            getIn().clear();
            return;
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__OUT:
            getOut().clear();
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
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__ICON:
            return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__IN:
            return in != null && !in.isEmpty();
         case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__OUT:
            return out != null && !out.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
      if (baseClass == NamedElement.class) {
         switch (derivedFeatureID) {
            case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__NAME: return CorePackage.NAMED_ELEMENT__NAME;
            case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__ICON: return CorePackage.NAMED_ELEMENT__ICON;
            default: return -1;
         }
      }
      if (baseClass == GraphicalElement.class) {
         switch (derivedFeatureID) {
            default: return -1;
         }
      }
      if (baseClass == ActivityNode.class) {
         switch (derivedFeatureID) {
            case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__IN: return ProcessesPackage.ACTIVITY_NODE__IN;
            case ProcessesPackage.STRUCTURED_ACTIVITY_NODE__OUT: return ProcessesPackage.ACTIVITY_NODE__OUT;
            default: return -1;
         }
      }
      if (baseClass == ExecutableNode.class) {
         switch (derivedFeatureID) {
            default: return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
      if (baseClass == NamedElement.class) {
         switch (baseFeatureID) {
            case CorePackage.NAMED_ELEMENT__NAME: return ProcessesPackage.STRUCTURED_ACTIVITY_NODE__NAME;
            case CorePackage.NAMED_ELEMENT__ICON: return ProcessesPackage.STRUCTURED_ACTIVITY_NODE__ICON;
            default: return -1;
         }
      }
      if (baseClass == GraphicalElement.class) {
         switch (baseFeatureID) {
            default: return -1;
         }
      }
      if (baseClass == ActivityNode.class) {
         switch (baseFeatureID) {
            case ProcessesPackage.ACTIVITY_NODE__IN: return ProcessesPackage.STRUCTURED_ACTIVITY_NODE__IN;
            case ProcessesPackage.ACTIVITY_NODE__OUT: return ProcessesPackage.STRUCTURED_ACTIVITY_NODE__OUT;
            default: return -1;
         }
      }
      if (baseClass == ExecutableNode.class) {
         switch (baseFeatureID) {
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
      result.append(" (name: ");
      result.append(name);
      result.append(", icon: ");
      result.append(icon);
      result.append(')');
      return result.toString();
   }

} //StructuredActivityNodeImpl
