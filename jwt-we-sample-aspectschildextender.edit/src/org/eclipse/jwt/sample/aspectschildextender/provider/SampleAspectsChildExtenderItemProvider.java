/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: SampleAspectsChildExtenderItemProvider.java,v 1.2 2010-05-10 08:36:53 chsaad Exp $
 */
package org.eclipse.jwt.sample.aspectschildextender.provider;


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

import org.eclipse.jwt.sample.aspectschildextender.AspectsChildExtenderPackage;
import org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender;

import org.eclipse.jwt.we.conf.edit.provider.AspectInstanceItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SampleAspectsChildExtenderItemProvider
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
	public SampleAspectsChildExtenderItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_SampleAspectsChildExtender_samplestringprop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SampleAspectsChildExtender_samplestringprop_feature", "_UI_SampleAspectsChildExtender_type"),
				 AspectsChildExtenderPackage.Literals.SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLESTRINGPROP,
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
				 getString("_UI_SampleAspectsChildExtender_sampleintprop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SampleAspectsChildExtender_sampleintprop_feature", "_UI_SampleAspectsChildExtender_type"),
				 AspectsChildExtenderPackage.Literals.SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLEINTPROP,
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
				 getString("_UI_SampleAspectsChildExtender_sampleactionref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SampleAspectsChildExtender_sampleactionref_feature", "_UI_SampleAspectsChildExtender_type"),
				 AspectsChildExtenderPackage.Literals.SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLEACTIONREF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns SampleAspectsChildExtender.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SampleAspectsChildExtender"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((SampleAspectsChildExtender)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_SampleAspectsChildExtender_type") :
			getString("_UI_SampleAspectsChildExtender_type") + " " + label;
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

		switch (notification.getFeatureID(SampleAspectsChildExtender.class)) {
			case AspectsChildExtenderPackage.SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLESTRINGPROP:
			case AspectsChildExtenderPackage.SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLEINTPROP:
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
		return AspectschildextenderEditPlugin.INSTANCE;
	}

}
