/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: StaticaspectFactoryImpl.java,v 1.3 2009-11-04 16:19:56 chsaad Exp $
 */
package org.eclipse.jwt.sample.staticaspect.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.jwt.sample.staticaspect.*;
import org.eclipse.jwt.sample.staticaspect.SampleStaticAspect;
import org.eclipse.jwt.sample.staticaspect.StaticaspectFactory;
import org.eclipse.jwt.sample.staticaspect.StaticaspectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticaspectFactoryImpl extends EFactoryImpl implements StaticaspectFactory {
	/**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public static StaticaspectFactory init() {
      try {
         StaticaspectFactory theStaticaspectFactory = (StaticaspectFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.jwt.sample.staticaspect"); 
         if (theStaticaspectFactory != null) {
            return theStaticaspectFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new StaticaspectFactoryImpl();
   }

	/**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public StaticaspectFactoryImpl() {
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
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT: return createSampleStaticAspect();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public SampleStaticAspect createSampleStaticAspect() {
      SampleStaticAspectImpl sampleStaticAspect = new SampleStaticAspectImpl();
      return sampleStaticAspect;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public StaticaspectPackage getStaticaspectPackage() {
      return (StaticaspectPackage)getEPackage();
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
	@Deprecated
   public static StaticaspectPackage getPackage() {
      return StaticaspectPackage.eINSTANCE;
   }

} //StaticaspectFactoryImpl
