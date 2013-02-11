/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: SampleStaticAspectImpl.java,v 1.4 2010-05-10 08:36:48 chsaad Exp $
 */
package org.eclipse.jwt.sample.staticaspect.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jwt.meta.model.processes.Action;
import org.eclipse.jwt.sample.staticaspect.SampleStaticAspect;
import org.eclipse.jwt.sample.staticaspect.StaticaspectPackage;
import org.eclipse.jwt.we.conf.model.impl.AspectInstanceImpl;
import org.eclipse.jwt.we.conf.model.impl.AspectInstanceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample Static Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jwt.sample.staticaspect.impl.SampleStaticAspectImpl#getSamplestringprop <em>Samplestringprop</em>}</li>
 *   <li>{@link org.eclipse.jwt.sample.staticaspect.impl.SampleStaticAspectImpl#getSampleintprop <em>Sampleintprop</em>}</li>
 *   <li>{@link org.eclipse.jwt.sample.staticaspect.impl.SampleStaticAspectImpl#getSampleactionref <em>Sampleactionref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SampleStaticAspectImpl extends AspectInstanceImpl implements SampleStaticAspect {
	/**
    * The default value of the '{@link #getSamplestringprop() <em>Samplestringprop</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getSamplestringprop()
    * @generated
    * @ordered
    */
	protected static final String SAMPLESTRINGPROP_EDEFAULT = null;

	/**
    * The cached value of the '{@link #getSamplestringprop() <em>Samplestringprop</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getSamplestringprop()
    * @generated
    * @ordered
    */
	protected String samplestringprop = SAMPLESTRINGPROP_EDEFAULT;

	/**
    * The default value of the '{@link #getSampleintprop() <em>Sampleintprop</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getSampleintprop()
    * @generated
    * @ordered
    */
	protected static final int SAMPLEINTPROP_EDEFAULT = 0;

	/**
    * The cached value of the '{@link #getSampleintprop() <em>Sampleintprop</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getSampleintprop()
    * @generated
    * @ordered
    */
	protected int sampleintprop = SAMPLEINTPROP_EDEFAULT;

	/**
    * The cached value of the '{@link #getSampleactionref() <em>Sampleactionref</em>}' reference.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getSampleactionref()
    * @generated
    * @ordered
    */
	protected Action sampleactionref;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected SampleStaticAspectImpl() {
      super();
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
   protected EClass eStaticClass() {
      return StaticaspectPackage.Literals.SAMPLE_STATIC_ASPECT;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public String getSamplestringprop() {
      return samplestringprop;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setSamplestringprop(String newSamplestringprop) {
      String oldSamplestringprop = samplestringprop;
      samplestringprop = newSamplestringprop;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLESTRINGPROP, oldSamplestringprop, samplestringprop));
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public int getSampleintprop() {
      return sampleintprop;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setSampleintprop(int newSampleintprop) {
      int oldSampleintprop = sampleintprop;
      sampleintprop = newSampleintprop;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEINTPROP, oldSampleintprop, sampleintprop));
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public Action getSampleactionref() {
      if (sampleactionref != null && sampleactionref.eIsProxy()) {
         InternalEObject oldSampleactionref = (InternalEObject)sampleactionref;
         sampleactionref = (Action)eResolveProxy(oldSampleactionref);
         if (sampleactionref != oldSampleactionref) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEACTIONREF, oldSampleactionref, sampleactionref));
         }
      }
      return sampleactionref;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public Action basicGetSampleactionref() {
      return sampleactionref;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setSampleactionref(Action newSampleactionref) {
      Action oldSampleactionref = sampleactionref;
      sampleactionref = newSampleactionref;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEACTIONREF, oldSampleactionref, sampleactionref));
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLESTRINGPROP:
            return getSamplestringprop();
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEINTPROP:
            return getSampleintprop();
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEACTIONREF:
            if (resolve) return getSampleactionref();
            return basicGetSampleactionref();
      }
      return super.eGet(featureID, resolve, coreType);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLESTRINGPROP:
            setSamplestringprop((String)newValue);
            return;
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEINTPROP:
            setSampleintprop((Integer)newValue);
            return;
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEACTIONREF:
            setSampleactionref((Action)newValue);
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
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLESTRINGPROP:
            setSamplestringprop(SAMPLESTRINGPROP_EDEFAULT);
            return;
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEINTPROP:
            setSampleintprop(SAMPLEINTPROP_EDEFAULT);
            return;
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEACTIONREF:
            setSampleactionref((Action)null);
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
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLESTRINGPROP:
            return SAMPLESTRINGPROP_EDEFAULT == null ? samplestringprop != null : !SAMPLESTRINGPROP_EDEFAULT.equals(samplestringprop);
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEINTPROP:
            return sampleintprop != SAMPLEINTPROP_EDEFAULT;
         case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEACTIONREF:
            return sampleactionref != null;
      }
      return super.eIsSet(featureID);
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
      result.append(" (samplestringprop: ");
      result.append(samplestringprop);
      result.append(", sampleintprop: ");
      result.append(sampleintprop);
      result.append(')');
      return result.toString();
   }

} //SampleStaticAspectImpl
