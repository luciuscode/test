/**
 */
package events;

import core.CorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import processes.ProcessesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see events.EventsFactory
 * @model kind="package"
 * @generated
 */
public interface EventsPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "events";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "org.eclipse.jwt/events";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "events";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   EventsPackage eINSTANCE = events.impl.EventsPackageImpl.init();

   /**
    * The meta object id for the '{@link events.impl.EventImpl <em>Event</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see events.impl.EventImpl
    * @see events.impl.EventsPackageImpl#getEvent()
    * @generated
    */
   int EVENT = 0;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT__OWNED_COMMENT = ProcessesPackage.EXECUTABLE_NODE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT__NAME = ProcessesPackage.EXECUTABLE_NODE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT__ICON = ProcessesPackage.EXECUTABLE_NODE__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT__IN = ProcessesPackage.EXECUTABLE_NODE__IN;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT__OUT = ProcessesPackage.EXECUTABLE_NODE__OUT;

   /**
    * The number of structural features of the '<em>Event</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_FEATURE_COUNT = ProcessesPackage.EXECUTABLE_NODE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link events.impl.EventHandlerImpl <em>Event Handler</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see events.impl.EventHandlerImpl
    * @see events.impl.EventsPackageImpl#getEventHandler()
    * @generated
    */
   int EVENT_HANDLER = 1;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_HANDLER__OWNED_COMMENT = CorePackage.NAMED_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_HANDLER__NAME = CorePackage.NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_HANDLER__ICON = CorePackage.NAMED_ELEMENT__ICON;

   /**
    * The number of structural features of the '<em>Event Handler</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_HANDLER_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;


   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.events.Event <em>Event</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Event</em>'.
    * @see org.eclipse.jwt.meta.model.events.Event
    * @generated
    */
   EClass getEvent();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.events.EventHandler <em>Event Handler</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Event Handler</em>'.
    * @see org.eclipse.jwt.meta.model.events.EventHandler
    * @generated
    */
   EClass getEventHandler();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   EventsFactory getEventsFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link events.impl.EventImpl <em>Event</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see events.impl.EventImpl
       * @see events.impl.EventsPackageImpl#getEvent()
       * @generated
       */
      EClass EVENT = eINSTANCE.getEvent();

      /**
       * The meta object literal for the '{@link events.impl.EventHandlerImpl <em>Event Handler</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see events.impl.EventHandlerImpl
       * @see events.impl.EventsPackageImpl#getEventHandler()
       * @generated
       */
      EClass EVENT_HANDLER = eINSTANCE.getEventHandler();

   }

} //EventsPackage
