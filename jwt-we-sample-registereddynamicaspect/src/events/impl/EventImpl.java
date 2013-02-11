/**
 */
package events.impl;

import events.EventsPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jwt.meta.model.events.Event;

import processes.impl.ExecutableNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EventImpl extends ExecutableNodeImpl implements Event {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected EventImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return EventsPackage.Literals.EVENT;
   }

} //EventImpl
