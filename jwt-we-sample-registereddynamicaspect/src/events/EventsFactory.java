/**
 */
package events;

import org.eclipse.emf.ecore.EFactory;

import org.eclipse.jwt.meta.model.events.Event;
import org.eclipse.jwt.meta.model.events.EventHandler;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see events.EventsPackage
 * @generated
 */
public interface EventsFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   EventsFactory eINSTANCE = events.impl.EventsFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Event</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Event</em>'.
    * @generated
    */
   Event createEvent();

   /**
    * Returns a new object of class '<em>Event Handler</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Event Handler</em>'.
    * @generated
    */
   EventHandler createEventHandler();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   EventsPackage getEventsPackage();

} //EventsFactory
