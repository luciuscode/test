/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: SampleStaticAspectItemProvider.java,v 1.3 2010-05-10 08:36:46 chsaad Exp $
 */
package org.eclipse.jwt.sample.staticaspect.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.jwt.sample.staticaspect.SampleStaticAspect;
import org.eclipse.jwt.sample.staticaspect.StaticaspectPackage;

import org.eclipse.jwt.we.conf.edit.provider.AspectInstanceItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.jwt.sample.staticaspect.SampleStaticAspect} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SampleStaticAspectItemProvider
	extends AspectInstanceItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleStaticAspectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSamplestringpropPropertyDescriptor(object);
			addSampleintpropPropertyDescriptor(object);
			addSampleactionrefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Samplestringprop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplestringpropPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SampleStaticAspect_samplestringprop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SampleStaticAspect_samplestringprop_feature", "_UI_SampleStaticAspect_type"),
				 StaticaspectPackage.Literals.SAMPLE_STATIC_ASPECT__SAMPLESTRINGPROP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sampleintprop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSampleintpropPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SampleStaticAspect_sampleintprop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SampleStaticAspect_sampleintprop_feature", "_UI_SampleStaticAspect_type"),
				 StaticaspectPackage.Literals.SAMPLE_STATIC_ASPECT__SAMPLEINTPROP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sampleactionref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSampleactionrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SampleStaticAspect_sampleactionref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SampleStaticAspect_sampleactionref_feature", "_UI_SampleStaticAspect_type"),
				 StaticaspectPackage.Literals.SAMPLE_STATIC_ASPECT__SAMPLEACTIONREF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns SampleStaticAspect.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SampleStaticAspect"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((SampleStaticAspect)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_SampleStaticAspect_type") :
			getString("_UI_SampleStaticAspect_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SampleStaticAspect.class)) {
			case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLESTRINGPROP:
			case StaticaspectPackage.SAMPLE_STATIC_ASPECT__SAMPLEINTPROP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return StaticaspectEditPlugin.INSTANCE;
	}

}
