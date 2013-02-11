/**
 */
package events.impl;

import core.impl.NamedElementImpl;

import events.EventsPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jwt.meta.model.events.EventHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EventHandlerImpl extends NamedElementImpl implements EventHandler {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected EventHandlerImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return EventsPackage.Literals.EVENT_HANDLER;
   }

} //EventHandlerImpl
