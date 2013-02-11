/**
 */
package conf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see conf.ConfFactory
 * @model kind="package"
 * @generated
 */
public interface ConfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.jwt.conf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfPackage eINSTANCE = conf.impl.ConfPackageImpl.init();

	/**
	 * The meta object id for the '{@link conf.impl.ConfModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conf.impl.ConfModelImpl
	 * @see conf.impl.ConfPackageImpl#getConfModel()
	 * @generated
	 */
	int CONF_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Profiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_MODEL__PROFILES = 0;

	/**
	 * The feature id for the '<em><b>Use Embedded Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_MODEL__USE_EMBEDDED_CONF = 1;

	/**
	 * The feature id for the '<em><b>Aspect Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_MODEL__ASPECT_INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Enriched Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_MODEL__ENRICHED_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Cached No Missing Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_MODEL__CACHED_NO_MISSING_PROFILE = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link conf.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conf.impl.ProfileImpl
	 * @see conf.impl.ConfPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__URL = 4;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__ASPECTS = 5;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link conf.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conf.impl.AspectImpl
	 * @see conf.impl.ConfPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Aspect Instance EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ASPECT_INSTANCE_ETYPE = 1;

	/**
	 * The feature id for the '<em><b>Target Model Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__TARGET_MODEL_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Autocreated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__AUTOCREATED = 3;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__MULTIPLE = 4;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__DEFAULT_VALUE = 5;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link conf.impl.AspectInstanceImpl <em>Aspect Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conf.impl.AspectInstanceImpl
	 * @see conf.impl.ConfPackageImpl#getAspectInstance()
	 * @generated
	 */
	int ASPECT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_INSTANCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Target Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_INSTANCE__TARGET_MODEL_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Aspect Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_INSTANCE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.jwt.we.conf.model.ConfModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.jwt.we.conf.model.ConfModel
	 * @generated
	 */
	EClass getConfModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.we.conf.model.ConfModel#getProfiles <em>Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profiles</em>'.
	 * @see org.eclipse.jwt.we.conf.model.ConfModel#getProfiles()
	 * @see #getConfModel()
	 * @generated
	 */
	EReference getConfModel_Profiles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.ConfModel#getUseEmbeddedConf <em>Use Embedded Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Embedded Conf</em>'.
	 * @see org.eclipse.jwt.we.conf.model.ConfModel#getUseEmbeddedConf()
	 * @see #getConfModel()
	 * @generated
	 */
	EAttribute getConfModel_UseEmbeddedConf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.we.conf.model.ConfModel#getAspectInstances <em>Aspect Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspect Instances</em>'.
	 * @see org.eclipse.jwt.we.conf.model.ConfModel#getAspectInstances()
	 * @see #getConfModel()
	 * @generated
	 */
	EReference getConfModel_AspectInstances();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.jwt.we.conf.model.ConfModel#getEnrichedModel <em>Enriched Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enriched Model</em>'.
	 * @see org.eclipse.jwt.we.conf.model.ConfModel#getEnrichedModel()
	 * @see #getConfModel()
	 * @generated
	 */
	EReference getConfModel_EnrichedModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.ConfModel#isCachedNoMissingProfile <em>Cached No Missing Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached No Missing Profile</em>'.
	 * @see org.eclipse.jwt.we.conf.model.ConfModel#isCachedNoMissingProfile()
	 * @see #getConfModel()
	 * @generated
	 */
	EAttribute getConfModel_CachedNoMissingProfile();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jwt.we.conf.model.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.Profile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Profile#getName()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.Profile#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Profile#getDescription()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.Profile#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Profile#getAuthor()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.Profile#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Profile#getVersion()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.Profile#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Profile#getUrl()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.we.conf.model.Profile#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Profile#getAspects()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Aspects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jwt.we.conf.model.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.Aspect#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Aspect#getId()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_Id();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.jwt.we.conf.model.Aspect#getAspectInstanceEType <em>Aspect Instance EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aspect Instance EType</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Aspect#getAspectInstanceEType()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_AspectInstanceEType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.jwt.we.conf.model.Aspect#getTargetModelElements <em>Target Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Model Elements</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Aspect#getTargetModelElements()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_TargetModelElements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.Aspect#isAutocreated <em>Autocreated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autocreated</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Aspect#isAutocreated()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_Autocreated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.Aspect#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Aspect#isMultiple()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.Aspect#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.jwt.we.conf.model.Aspect#getDefaultValue()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jwt.we.conf.model.AspectInstance <em>Aspect Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect Instance</em>'.
	 * @see org.eclipse.jwt.we.conf.model.AspectInstance
	 * @generated
	 */
	EClass getAspectInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.we.conf.model.AspectInstance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jwt.we.conf.model.AspectInstance#getId()
	 * @see #getAspectInstance()
	 * @generated
	 */
	EAttribute getAspectInstance_Id();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.jwt.we.conf.model.AspectInstance#getTargetModelElement <em>Target Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Model Element</em>'.
	 * @see org.eclipse.jwt.we.conf.model.AspectInstance#getTargetModelElement()
	 * @see #getAspectInstance()
	 * @generated
	 */
	EReference getAspectInstance_TargetModelElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfFactory getConfFactory();

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
		 * The meta object literal for the '{@link conf.impl.ConfModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conf.impl.ConfModelImpl
		 * @see conf.impl.ConfPackageImpl#getConfModel()
		 * @generated
		 */
		EClass CONF_MODEL = eINSTANCE.getConfModel();

		/**
		 * The meta object literal for the '<em><b>Profiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONF_MODEL__PROFILES = eINSTANCE.getConfModel_Profiles();

		/**
		 * The meta object literal for the '<em><b>Use Embedded Conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONF_MODEL__USE_EMBEDDED_CONF = eINSTANCE.getConfModel_UseEmbeddedConf();

		/**
		 * The meta object literal for the '<em><b>Aspect Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONF_MODEL__ASPECT_INSTANCES = eINSTANCE.getConfModel_AspectInstances();

		/**
		 * The meta object literal for the '<em><b>Enriched Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONF_MODEL__ENRICHED_MODEL = eINSTANCE.getConfModel_EnrichedModel();

		/**
		 * The meta object literal for the '<em><b>Cached No Missing Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONF_MODEL__CACHED_NO_MISSING_PROFILE = eINSTANCE.getConfModel_CachedNoMissingProfile();

		/**
		 * The meta object literal for the '{@link conf.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conf.impl.ProfileImpl
		 * @see conf.impl.ConfPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__NAME = eINSTANCE.getProfile_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__DESCRIPTION = eINSTANCE.getProfile_Description();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__AUTHOR = eINSTANCE.getProfile_Author();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__VERSION = eINSTANCE.getProfile_Version();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__URL = eINSTANCE.getProfile_Url();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__ASPECTS = eINSTANCE.getProfile_Aspects();

		/**
		 * The meta object literal for the '{@link conf.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conf.impl.AspectImpl
		 * @see conf.impl.ConfPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT__ID = eINSTANCE.getAspect_Id();

		/**
		 * The meta object literal for the '<em><b>Aspect Instance EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__ASPECT_INSTANCE_ETYPE = eINSTANCE.getAspect_AspectInstanceEType();

		/**
		 * The meta object literal for the '<em><b>Target Model Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__TARGET_MODEL_ELEMENTS = eINSTANCE.getAspect_TargetModelElements();

		/**
		 * The meta object literal for the '<em><b>Autocreated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT__AUTOCREATED = eINSTANCE.getAspect_Autocreated();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT__MULTIPLE = eINSTANCE.getAspect_Multiple();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT__DEFAULT_VALUE = eINSTANCE.getAspect_DefaultValue();

		/**
		 * The meta object literal for the '{@link conf.impl.AspectInstanceImpl <em>Aspect Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conf.impl.AspectInstanceImpl
		 * @see conf.impl.ConfPackageImpl#getAspectInstance()
		 * @generated
		 */
		EClass ASPECT_INSTANCE = eINSTANCE.getAspectInstance();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT_INSTANCE__ID = eINSTANCE.getAspectInstance_Id();

		/**
		 * The meta object literal for the '<em><b>Target Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_INSTANCE__TARGET_MODEL_ELEMENT = eINSTANCE.getAspectInstance_TargetModelElement();

	}

} //ConfPackage
