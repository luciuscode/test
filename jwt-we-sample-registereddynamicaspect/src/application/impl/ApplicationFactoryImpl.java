/**
 */
package application.impl;

import application.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.jwt.meta.model.application.Application;
import org.eclipse.jwt.meta.model.application.ApplicationType;
import org.eclipse.jwt.meta.model.application.WebServiceApplication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationFactoryImpl extends EFactoryImpl implements ApplicationFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static ApplicationFactory init() {
      try {
         ApplicationFactory theApplicationFactory = (ApplicationFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.jwt/application"); 
         if (theApplicationFactory != null) {
            return theApplicationFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new ApplicationFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ApplicationFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case ApplicationPackage.APPLICATION: return createApplication();
         case ApplicationPackage.APPLICATION_TYPE: return createApplicationType();
         case ApplicationPackage.WEB_SERVICE_APPLICATION: return createWebServiceApplication();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Application createApplication() {
      ApplicationImpl application = new ApplicationImpl();
      return application;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ApplicationType createApplicationType() {
      ApplicationTypeImpl applicationType = new ApplicationTypeImpl();
      return applicationType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public WebServiceApplication createWebServiceApplication() {
      WebServiceApplicationImpl webServiceApplication = new WebServiceApplicationImpl();
      return webServiceApplication;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ApplicationPackage getApplicationPackage() {
      return (ApplicationPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static ApplicationPackage getPackage() {
      return ApplicationPackage.eINSTANCE;
   }

} //ApplicationFactoryImpl
