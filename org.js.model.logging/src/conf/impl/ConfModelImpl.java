/**
 */
package conf.impl;

import conf.ConfPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.we.conf.model.AspectInstance;
import org.eclipse.jwt.we.conf.model.ConfModel;
import org.eclipse.jwt.we.conf.model.Profile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link conf.impl.ConfModelImpl#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link conf.impl.ConfModelImpl#getUseEmbeddedConf <em>Use Embedded Conf</em>}</li>
 *   <li>{@link conf.impl.ConfModelImpl#getAspectInstances <em>Aspect Instances</em>}</li>
 *   <li>{@link conf.impl.ConfModelImpl#getEnrichedModel <em>Enriched Model</em>}</li>
 *   <li>{@link conf.impl.ConfModelImpl#isCachedNoMissingProfile <em>Cached No Missing Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfModelImpl extends EObjectImpl implements ConfModel {
	/**
	 * The cached value of the '{@link #getProfiles() <em>Profiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Profile> profiles;

	/**
	 * The default value of the '{@link #getUseEmbeddedConf() <em>Use Embedded Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseEmbeddedConf()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_EMBEDDED_CONF_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseEmbeddedConf() <em>Use Embedded Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseEmbeddedConf()
	 * @generated
	 * @ordered
	 */
	protected Boolean useEmbeddedConf = USE_EMBEDDED_CONF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAspectInstances() <em>Aspect Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<AspectInstance> aspectInstances;

	/**
	 * The cached value of the '{@link #getEnrichedModel() <em>Enriched Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrichedModel()
	 * @generated
	 * @ordered
	 */
	protected EObject enrichedModel;

	/**
	 * The default value of the '{@link #isCachedNoMissingProfile() <em>Cached No Missing Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCachedNoMissingProfile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHED_NO_MISSING_PROFILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCachedNoMissingProfile() <em>Cached No Missing Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCachedNoMissingProfile()
	 * @generated
	 * @ordered
	 */
	protected boolean cachedNoMissingProfile = CACHED_NO_MISSING_PROFILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfPackage.Literals.CONF_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Profile> getProfiles() {
		if (profiles == null) {
			profiles = new EObjectContainmentEList<Profile>(Profile.class, this, ConfPackage.CONF_MODEL__PROFILES);
		}
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUseEmbeddedConf() {
		return useEmbeddedConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseEmbeddedConf(Boolean newUseEmbeddedConf) {
		Boolean oldUseEmbeddedConf = useEmbeddedConf;
		useEmbeddedConf = newUseEmbeddedConf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.CONF_MODEL__USE_EMBEDDED_CONF, oldUseEmbeddedConf, useEmbeddedConf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AspectInstance> getAspectInstances() {
		if (aspectInstances == null) {
			aspectInstances = new EObjectContainmentEList<AspectInstance>(AspectInstance.class, this, ConfPackage.CONF_MODEL__ASPECT_INSTANCES);
		}
		return aspectInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getEnrichedModel() {
		if (enrichedModel != null && enrichedModel.eIsProxy()) {
			InternalEObject oldEnrichedModel = (InternalEObject)enrichedModel;
			enrichedModel = eResolveProxy(oldEnrichedModel);
			if (enrichedModel != oldEnrichedModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfPackage.CONF_MODEL__ENRICHED_MODEL, oldEnrichedModel, enrichedModel));
			}
		}
		return enrichedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetEnrichedModel() {
		return enrichedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrichedModel(EObject newEnrichedModel) {
		EObject oldEnrichedModel = enrichedModel;
		enrichedModel = newEnrichedModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.CONF_MODEL__ENRICHED_MODEL, oldEnrichedModel, enrichedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCachedNoMissingProfile() {
		return cachedNoMissingProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCachedNoMissingProfile(boolean newCachedNoMissingProfile) {
		boolean oldCachedNoMissingProfile = cachedNoMissingProfile;
		cachedNoMissingProfile = newCachedNoMissingProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.CONF_MODEL__CACHED_NO_MISSING_PROFILE, oldCachedNoMissingProfile, cachedNoMissingProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfPackage.CONF_MODEL__PROFILES:
				return ((InternalEList<?>)getProfiles()).basicRemove(otherEnd, msgs);
			case ConfPackage.CONF_MODEL__ASPECT_INSTANCES:
				return ((InternalEList<?>)getAspectInstances()).basicRemove(otherEnd, msgs);
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
			case ConfPackage.CONF_MODEL__PROFILES:
				return getProfiles();
			case ConfPackage.CONF_MODEL__USE_EMBEDDED_CONF:
				return getUseEmbeddedConf();
			case ConfPackage.CONF_MODEL__ASPECT_INSTANCES:
				return getAspectInstances();
			case ConfPackage.CONF_MODEL__ENRICHED_MODEL:
				if (resolve) return getEnrichedModel();
				return basicGetEnrichedModel();
			case ConfPackage.CONF_MODEL__CACHED_NO_MISSING_PROFILE:
				return isCachedNoMissingProfile();
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
			case ConfPackage.CONF_MODEL__PROFILES:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends Profile>)newValue);
				return;
			case ConfPackage.CONF_MODEL__USE_EMBEDDED_CONF:
				setUseEmbeddedConf((Boolean)newValue);
				return;
			case ConfPackage.CONF_MODEL__ASPECT_INSTANCES:
				getAspectInstances().clear();
				getAspectInstances().addAll((Collection<? extends AspectInstance>)newValue);
				return;
			case ConfPackage.CONF_MODEL__ENRICHED_MODEL:
				setEnrichedModel((EObject)newValue);
				return;
			case ConfPackage.CONF_MODEL__CACHED_NO_MISSING_PROFILE:
				setCachedNoMissingProfile((Boolean)newValue);
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
			case ConfPackage.CONF_MODEL__PROFILES:
				getProfiles().clear();
				return;
			case ConfPackage.CONF_MODEL__USE_EMBEDDED_CONF:
				setUseEmbeddedConf(USE_EMBEDDED_CONF_EDEFAULT);
				return;
			case ConfPackage.CONF_MODEL__ASPECT_INSTANCES:
				getAspectInstances().clear();
				return;
			case ConfPackage.CONF_MODEL__ENRICHED_MODEL:
				setEnrichedModel((EObject)null);
				return;
			case ConfPackage.CONF_MODEL__CACHED_NO_MISSING_PROFILE:
				setCachedNoMissingProfile(CACHED_NO_MISSING_PROFILE_EDEFAULT);
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
			case ConfPackage.CONF_MODEL__PROFILES:
				return profiles != null && !profiles.isEmpty();
			case ConfPackage.CONF_MODEL__USE_EMBEDDED_CONF:
				return USE_EMBEDDED_CONF_EDEFAULT == null ? useEmbeddedConf != null : !USE_EMBEDDED_CONF_EDEFAULT.equals(useEmbeddedConf);
			case ConfPackage.CONF_MODEL__ASPECT_INSTANCES:
				return aspectInstances != null && !aspectInstances.isEmpty();
			case ConfPackage.CONF_MODEL__ENRICHED_MODEL:
				return enrichedModel != null;
			case ConfPackage.CONF_MODEL__CACHED_NO_MISSING_PROFILE:
				return cachedNoMissingProfile != CACHED_NO_MISSING_PROFILE_EDEFAULT;
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
		result.append(" (useEmbeddedConf: ");
		result.append(useEmbeddedConf);
		result.append(", cachedNoMissingProfile: ");
		result.append(cachedNoMissingProfile);
		result.append(')');
		return result.toString();
	}

} //ConfModelImpl
