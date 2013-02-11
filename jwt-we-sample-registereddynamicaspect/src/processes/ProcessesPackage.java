/**
 */
package processes;

import core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see processes.ProcessesFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessesPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "processes";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "org.eclipse.jwt/processes";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "processes";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ProcessesPackage eINSTANCE = processes.impl.ProcessesPackageImpl.init();

   /**
    * The meta object id for the '{@link processes.impl.ScopeImpl <em>Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.ScopeImpl
    * @see processes.impl.ProcessesPackageImpl#getScope()
    * @generated
    */
   int SCOPE = 0;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE__OWNED_COMMENT = CorePackage.MODEL_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE__NODES = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Edges</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE__EDGES = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Scope</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link processes.impl.ActivityImpl <em>Activity</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.ActivityImpl
    * @see processes.impl.ProcessesPackageImpl#getActivity()
    * @generated
    */
   int ACTIVITY = 1;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__OWNED_COMMENT = CorePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__NAME = CorePackage.PACKAGEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__ICON = CorePackage.PACKAGEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__PACKAGE = CorePackage.PACKAGEABLE_ELEMENT__PACKAGE;

   /**
    * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__NODES = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Edges</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__EDGES = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Event Handler</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__EVENT_HANDLER = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Totalexecutiontime</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__TOTALEXECUTIONTIME = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Activity</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_FEATURE_COUNT = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link processes.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.StructuredActivityNodeImpl
    * @see processes.impl.ProcessesPackageImpl#getStructuredActivityNode()
    * @generated
    */
   int STRUCTURED_ACTIVITY_NODE = 2;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT = SCOPE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_ACTIVITY_NODE__NODES = SCOPE__NODES;

   /**
    * The feature id for the '<em><b>Edges</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_ACTIVITY_NODE__EDGES = SCOPE__EDGES;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_ACTIVITY_NODE__NAME = SCOPE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_ACTIVITY_NODE__ICON = SCOPE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_ACTIVITY_NODE__IN = SCOPE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_ACTIVITY_NODE__OUT = SCOPE_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Structured Activity Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link processes.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.ActivityNodeImpl
    * @see processes.impl.ProcessesPackageImpl#getActivityNode()
    * @generated
    */
   int ACTIVITY_NODE = 3;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__OWNED_COMMENT = CorePackage.NAMED_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__NAME = CorePackage.NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__ICON = CorePackage.NAMED_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__IN = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__OUT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Activity Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link processes.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.ActivityEdgeImpl
    * @see processes.impl.ProcessesPackageImpl#getActivityEdge()
    * @generated
    */
   int ACTIVITY_EDGE = 4;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__OWNED_COMMENT = CorePackage.MODEL_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__SOURCE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__TARGET = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Guard</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__GUARD = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Activity Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link processes.impl.GuardSpecificationImpl <em>Guard Specification</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.GuardSpecificationImpl
    * @see processes.impl.ProcessesPackageImpl#getGuardSpecification()
    * @generated
    */
   int GUARD_SPECIFICATION = 5;

   /**
    * The feature id for the '<em><b>Data</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD_SPECIFICATION__DATA = 0;

   /**
    * The feature id for the '<em><b>Attribute</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD_SPECIFICATION__ATTRIBUTE = 1;

   /**
    * The feature id for the '<em><b>Operation</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD_SPECIFICATION__OPERATION = 2;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD_SPECIFICATION__VALUE = 3;

   /**
    * The feature id for the '<em><b>Description</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD_SPECIFICATION__DESCRIPTION = 4;

   /**
    * The feature id for the '<em><b>Sub Specification</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD_SPECIFICATION__SUB_SPECIFICATION = 5;

   /**
    * The feature id for the '<em><b>Sub Specification Connector</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD_SPECIFICATION__SUB_SPECIFICATION_CONNECTOR = 6;

   /**
    * The number of structural features of the '<em>Guard Specification</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD_SPECIFICATION_FEATURE_COUNT = 7;

   /**
    * The meta object id for the '{@link processes.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.ExecutableNodeImpl
    * @see processes.impl.ProcessesPackageImpl#getExecutableNode()
    * @generated
    */
   int EXECUTABLE_NODE = 6;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXECUTABLE_NODE__OWNED_COMMENT = ACTIVITY_NODE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXECUTABLE_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXECUTABLE_NODE__ICON = ACTIVITY_NODE__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXECUTABLE_NODE__IN = ACTIVITY_NODE__IN;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXECUTABLE_NODE__OUT = ACTIVITY_NODE__OUT;

   /**
    * The number of structural features of the '<em>Executable Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXECUTABLE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link processes.impl.ActionImpl <em>Action</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.ActionImpl
    * @see processes.impl.ProcessesPackageImpl#getAction()
    * @generated
    */
   int ACTION = 7;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__OWNED_COMMENT = EXECUTABLE_NODE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__NAME = EXECUTABLE_NODE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__ICON = EXECUTABLE_NODE__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__IN = EXECUTABLE_NODE__IN;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__OUT = EXECUTABLE_NODE__OUT;

   /**
    * The feature id for the '<em><b>Performed By</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__PERFORMED_BY = EXECUTABLE_NODE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Executed By</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__EXECUTED_BY = EXECUTABLE_NODE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Realizes</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__REALIZES = EXECUTABLE_NODE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Inputs</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__INPUTS = EXECUTABLE_NODE_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Outputs</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__OUTPUTS = EXECUTABLE_NODE_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__MAPPINGS = EXECUTABLE_NODE_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Targetexecutiontime</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__TARGETEXECUTIONTIME = EXECUTABLE_NODE_FEATURE_COUNT + 6;

   /**
    * The number of structural features of the '<em>Action</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 7;

   /**
    * The meta object id for the '{@link processes.impl.ControlNodeImpl <em>Control Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.ControlNodeImpl
    * @see processes.impl.ProcessesPackageImpl#getControlNode()
    * @generated
    */
   int CONTROL_NODE = 8;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_NODE__OWNED_COMMENT = ACTIVITY_NODE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_NODE__ICON = ACTIVITY_NODE__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_NODE__IN = ACTIVITY_NODE__IN;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_NODE__OUT = ACTIVITY_NODE__OUT;

   /**
    * The number of structural features of the '<em>Control Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link processes.impl.InitialNodeImpl <em>Initial Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.InitialNodeImpl
    * @see processes.impl.ProcessesPackageImpl#getInitialNode()
    * @generated
    */
   int INITIAL_NODE = 9;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INITIAL_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INITIAL_NODE__NAME = CONTROL_NODE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INITIAL_NODE__ICON = CONTROL_NODE__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INITIAL_NODE__IN = CONTROL_NODE__IN;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INITIAL_NODE__OUT = CONTROL_NODE__OUT;

   /**
    * The number of structural features of the '<em>Initial Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INITIAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link processes.impl.ForkNodeImpl <em>Fork Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.ForkNodeImpl
    * @see processes.impl.ProcessesPackageImpl#getForkNode()
    * @generated
    */
   int FORK_NODE = 10;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FORK_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FORK_NODE__NAME = CONTROL_NODE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FORK_NODE__ICON = CONTROL_NODE__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FORK_NODE__IN = CONTROL_NODE__IN;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FORK_NODE__OUT = CONTROL_NODE__OUT;

   /**
    * The number of structural features of the '<em>Fork Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FORK_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link processes.impl.JoinNodeImpl <em>Join Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.JoinNodeImpl
    * @see processes.impl.ProcessesPackageImpl#getJoinNode()
    * @generated
    */
   int JOIN_NODE = 11;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE__NAME = CONTROL_NODE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE__ICON = CONTROL_NODE__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE__IN = CONTROL_NODE__IN;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE__OUT = CONTROL_NODE__OUT;

   /**
    * The number of structural features of the '<em>Join Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link processes.impl.MergeNodeImpl <em>Merge Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.MergeNodeImpl
    * @see processes.impl.ProcessesPackageImpl#getMergeNode()
    * @generated
    */
   int MERGE_NODE = 12;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MERGE_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MERGE_NODE__NAME = CONTROL_NODE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MERGE_NODE__ICON = CONTROL_NODE__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MERGE_NODE__IN = CONTROL_NODE__IN;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MERGE_NODE__OUT = CONTROL_NODE__OUT;

   /**
    * The number of structural features of the '<em>Merge Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MERGE_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link processes.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.DecisionNodeImpl
    * @see processes.impl.ProcessesPackageImpl#getDecisionNode()
    * @generated
    */
   int DECISION_NODE = 13;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__NAME = CONTROL_NODE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__ICON = CONTROL_NODE__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__IN = CONTROL_NODE__IN;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE__OUT = CONTROL_NODE__OUT;

   /**
    * The number of structural features of the '<em>Decision Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link processes.impl.FinalNodeImpl <em>Final Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.FinalNodeImpl
    * @see processes.impl.ProcessesPackageImpl#getFinalNode()
    * @generated
    */
   int FINAL_NODE = 14;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FINAL_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FINAL_NODE__NAME = CONTROL_NODE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FINAL_NODE__ICON = CONTROL_NODE__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FINAL_NODE__IN = CONTROL_NODE__IN;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FINAL_NODE__OUT = CONTROL_NODE__OUT;

   /**
    * The number of structural features of the '<em>Final Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FINAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link processes.impl.GuardImpl <em>Guard</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.GuardImpl
    * @see processes.impl.ProcessesPackageImpl#getGuard()
    * @generated
    */
   int GUARD = 15;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD__OWNED_COMMENT = CorePackage.NAMED_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD__NAME = CorePackage.NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD__ICON = CorePackage.NAMED_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Textualdescription</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD__TEXTUALDESCRIPTION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Shortdescription</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD__SHORTDESCRIPTION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Detailed Specification</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD__DETAILED_SPECIFICATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Guard</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GUARD_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link processes.impl.ActivityLinkNodeImpl <em>Activity Link Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.impl.ActivityLinkNodeImpl
    * @see processes.impl.ProcessesPackageImpl#getActivityLinkNode()
    * @generated
    */
   int ACTIVITY_LINK_NODE = 16;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_LINK_NODE__OWNED_COMMENT = EXECUTABLE_NODE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_LINK_NODE__NAME = EXECUTABLE_NODE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_LINK_NODE__ICON = EXECUTABLE_NODE__ICON;

   /**
    * The feature id for the '<em><b>In</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_LINK_NODE__IN = EXECUTABLE_NODE__IN;

   /**
    * The feature id for the '<em><b>Out</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_LINK_NODE__OUT = EXECUTABLE_NODE__OUT;

   /**
    * The feature id for the '<em><b>Linksto</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_LINK_NODE__LINKSTO = EXECUTABLE_NODE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Uses</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_LINK_NODE__USES = EXECUTABLE_NODE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Activity Link Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_LINK_NODE_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link processes.OperationType <em>Operation Type</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.OperationType
    * @see processes.impl.ProcessesPackageImpl#getOperationType()
    * @generated
    */
   int OPERATION_TYPE = 17;

   /**
    * The meta object id for the '{@link processes.BooleanConnector <em>Boolean Connector</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see processes.BooleanConnector
    * @see processes.impl.ProcessesPackageImpl#getBooleanConnector()
    * @generated
    */
   int BOOLEAN_CONNECTOR = 18;


   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.Scope <em>Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Scope</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Scope
    * @generated
    */
   EClass getScope();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.processes.Scope#getNodes <em>Nodes</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Nodes</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Scope#getNodes()
    * @see #getScope()
    * @generated
    */
   EReference getScope_Nodes();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.processes.Scope#getEdges <em>Edges</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Edges</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Scope#getEdges()
    * @see #getScope()
    * @generated
    */
   EReference getScope_Edges();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.Activity <em>Activity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Activity</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Activity
    * @generated
    */
   EClass getActivity();

   /**
    * Returns the meta object for the containment reference '{@link org.eclipse.jwt.meta.model.processes.Activity#getEventHandler <em>Event Handler</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Event Handler</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Activity#getEventHandler()
    * @see #getActivity()
    * @generated
    */
   EReference getActivity_EventHandler();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.processes.Activity#getTotalexecutiontime <em>Totalexecutiontime</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Totalexecutiontime</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Activity#getTotalexecutiontime()
    * @see #getActivity()
    * @generated
    */
   EAttribute getActivity_Totalexecutiontime();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.StructuredActivityNode <em>Structured Activity Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Structured Activity Node</em>'.
    * @see org.eclipse.jwt.meta.model.processes.StructuredActivityNode
    * @generated
    */
   EClass getStructuredActivityNode();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.ActivityNode <em>Activity Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Activity Node</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ActivityNode
    * @generated
    */
   EClass getActivityNode();

   /**
    * Returns the meta object for the reference list '{@link org.eclipse.jwt.meta.model.processes.ActivityNode#getIn <em>In</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>In</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ActivityNode#getIn()
    * @see #getActivityNode()
    * @generated
    */
   EReference getActivityNode_In();

   /**
    * Returns the meta object for the reference list '{@link org.eclipse.jwt.meta.model.processes.ActivityNode#getOut <em>Out</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Out</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ActivityNode#getOut()
    * @see #getActivityNode()
    * @generated
    */
   EReference getActivityNode_Out();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.ActivityEdge <em>Activity Edge</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Activity Edge</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ActivityEdge
    * @generated
    */
   EClass getActivityEdge();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.processes.ActivityEdge#getSource <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Source</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ActivityEdge#getSource()
    * @see #getActivityEdge()
    * @generated
    */
   EReference getActivityEdge_Source();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.processes.ActivityEdge#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Target</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ActivityEdge#getTarget()
    * @see #getActivityEdge()
    * @generated
    */
   EReference getActivityEdge_Target();

   /**
    * Returns the meta object for the containment reference '{@link org.eclipse.jwt.meta.model.processes.ActivityEdge#getGuard <em>Guard</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Guard</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ActivityEdge#getGuard()
    * @see #getActivityEdge()
    * @generated
    */
   EReference getActivityEdge_Guard();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification <em>Guard Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Guard Specification</em>'.
    * @see org.eclipse.jwt.meta.model.processes.GuardSpecification
    * @generated
    */
   EClass getGuardSpecification();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getData <em>Data</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Data</em>'.
    * @see org.eclipse.jwt.meta.model.processes.GuardSpecification#getData()
    * @see #getGuardSpecification()
    * @generated
    */
   EReference getGuardSpecification_Data();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getAttribute <em>Attribute</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Attribute</em>'.
    * @see org.eclipse.jwt.meta.model.processes.GuardSpecification#getAttribute()
    * @see #getGuardSpecification()
    * @generated
    */
   EAttribute getGuardSpecification_Attribute();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getOperation <em>Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Operation</em>'.
    * @see org.eclipse.jwt.meta.model.processes.GuardSpecification#getOperation()
    * @see #getGuardSpecification()
    * @generated
    */
   EAttribute getGuardSpecification_Operation();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see org.eclipse.jwt.meta.model.processes.GuardSpecification#getValue()
    * @see #getGuardSpecification()
    * @generated
    */
   EAttribute getGuardSpecification_Value();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getDescription <em>Description</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Description</em>'.
    * @see org.eclipse.jwt.meta.model.processes.GuardSpecification#getDescription()
    * @see #getGuardSpecification()
    * @generated
    */
   EAttribute getGuardSpecification_Description();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getSubSpecification <em>Sub Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Sub Specification</em>'.
    * @see org.eclipse.jwt.meta.model.processes.GuardSpecification#getSubSpecification()
    * @see #getGuardSpecification()
    * @generated
    */
   EReference getGuardSpecification_SubSpecification();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getSubSpecificationConnector <em>Sub Specification Connector</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Sub Specification Connector</em>'.
    * @see org.eclipse.jwt.meta.model.processes.GuardSpecification#getSubSpecificationConnector()
    * @see #getGuardSpecification()
    * @generated
    */
   EAttribute getGuardSpecification_SubSpecificationConnector();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.ExecutableNode <em>Executable Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Executable Node</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ExecutableNode
    * @generated
    */
   EClass getExecutableNode();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.Action <em>Action</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Action</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Action
    * @generated
    */
   EClass getAction();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.processes.Action#getPerformedBy <em>Performed By</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Performed By</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Action#getPerformedBy()
    * @see #getAction()
    * @generated
    */
   EReference getAction_PerformedBy();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.processes.Action#getExecutedBy <em>Executed By</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Executed By</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Action#getExecutedBy()
    * @see #getAction()
    * @generated
    */
   EReference getAction_ExecutedBy();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.processes.Action#getRealizes <em>Realizes</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Realizes</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Action#getRealizes()
    * @see #getAction()
    * @generated
    */
   EReference getAction_Realizes();

   /**
    * Returns the meta object for the reference list '{@link org.eclipse.jwt.meta.model.processes.Action#getInputs <em>Inputs</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Inputs</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Action#getInputs()
    * @see #getAction()
    * @generated
    */
   EReference getAction_Inputs();

   /**
    * Returns the meta object for the reference list '{@link org.eclipse.jwt.meta.model.processes.Action#getOutputs <em>Outputs</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Outputs</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Action#getOutputs()
    * @see #getAction()
    * @generated
    */
   EReference getAction_Outputs();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.processes.Action#getMappings <em>Mappings</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Mappings</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Action#getMappings()
    * @see #getAction()
    * @generated
    */
   EReference getAction_Mappings();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.processes.Action#getTargetexecutiontime <em>Targetexecutiontime</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Targetexecutiontime</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Action#getTargetexecutiontime()
    * @see #getAction()
    * @generated
    */
   EAttribute getAction_Targetexecutiontime();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.ControlNode <em>Control Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Control Node</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ControlNode
    * @generated
    */
   EClass getControlNode();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.InitialNode <em>Initial Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Initial Node</em>'.
    * @see org.eclipse.jwt.meta.model.processes.InitialNode
    * @generated
    */
   EClass getInitialNode();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.ForkNode <em>Fork Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Fork Node</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ForkNode
    * @generated
    */
   EClass getForkNode();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.JoinNode <em>Join Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Join Node</em>'.
    * @see org.eclipse.jwt.meta.model.processes.JoinNode
    * @generated
    */
   EClass getJoinNode();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.MergeNode <em>Merge Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Merge Node</em>'.
    * @see org.eclipse.jwt.meta.model.processes.MergeNode
    * @generated
    */
   EClass getMergeNode();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.DecisionNode <em>Decision Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Decision Node</em>'.
    * @see org.eclipse.jwt.meta.model.processes.DecisionNode
    * @generated
    */
   EClass getDecisionNode();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.FinalNode <em>Final Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Final Node</em>'.
    * @see org.eclipse.jwt.meta.model.processes.FinalNode
    * @generated
    */
   EClass getFinalNode();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.Guard <em>Guard</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Guard</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Guard
    * @generated
    */
   EClass getGuard();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.processes.Guard#getTextualdescription <em>Textualdescription</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Textualdescription</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Guard#getTextualdescription()
    * @see #getGuard()
    * @generated
    */
   EAttribute getGuard_Textualdescription();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.processes.Guard#getShortdescription <em>Shortdescription</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Shortdescription</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Guard#getShortdescription()
    * @see #getGuard()
    * @generated
    */
   EAttribute getGuard_Shortdescription();

   /**
    * Returns the meta object for the containment reference '{@link org.eclipse.jwt.meta.model.processes.Guard#getDetailedSpecification <em>Detailed Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Detailed Specification</em>'.
    * @see org.eclipse.jwt.meta.model.processes.Guard#getDetailedSpecification()
    * @see #getGuard()
    * @generated
    */
   EReference getGuard_DetailedSpecification();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.processes.ActivityLinkNode <em>Activity Link Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Activity Link Node</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ActivityLinkNode
    * @generated
    */
   EClass getActivityLinkNode();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.processes.ActivityLinkNode#getLinksto <em>Linksto</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Linksto</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ActivityLinkNode#getLinksto()
    * @see #getActivityLinkNode()
    * @generated
    */
   EReference getActivityLinkNode_Linksto();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.processes.ActivityLinkNode#getUses <em>Uses</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Uses</em>'.
    * @see org.eclipse.jwt.meta.model.processes.ActivityLinkNode#getUses()
    * @see #getActivityLinkNode()
    * @generated
    */
   EReference getActivityLinkNode_Uses();

   /**
    * Returns the meta object for enum '{@link processes.OperationType <em>Operation Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Operation Type</em>'.
    * @see processes.OperationType
    * @generated
    */
   EEnum getOperationType();

   /**
    * Returns the meta object for enum '{@link processes.BooleanConnector <em>Boolean Connector</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Boolean Connector</em>'.
    * @see processes.BooleanConnector
    * @generated
    */
   EEnum getBooleanConnector();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ProcessesFactory getProcessesFactory();

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
       * The meta object literal for the '{@link processes.impl.ScopeImpl <em>Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.ScopeImpl
       * @see processes.impl.ProcessesPackageImpl#getScope()
       * @generated
       */
      EClass SCOPE = eINSTANCE.getScope();

      /**
       * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SCOPE__NODES = eINSTANCE.getScope_Nodes();

      /**
       * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SCOPE__EDGES = eINSTANCE.getScope_Edges();

      /**
       * The meta object literal for the '{@link processes.impl.ActivityImpl <em>Activity</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.ActivityImpl
       * @see processes.impl.ProcessesPackageImpl#getActivity()
       * @generated
       */
      EClass ACTIVITY = eINSTANCE.getActivity();

      /**
       * The meta object literal for the '<em><b>Event Handler</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY__EVENT_HANDLER = eINSTANCE.getActivity_EventHandler();

      /**
       * The meta object literal for the '<em><b>Totalexecutiontime</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ACTIVITY__TOTALEXECUTIONTIME = eINSTANCE.getActivity_Totalexecutiontime();

      /**
       * The meta object literal for the '{@link processes.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.StructuredActivityNodeImpl
       * @see processes.impl.ProcessesPackageImpl#getStructuredActivityNode()
       * @generated
       */
      EClass STRUCTURED_ACTIVITY_NODE = eINSTANCE.getStructuredActivityNode();

      /**
       * The meta object literal for the '{@link processes.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.ActivityNodeImpl
       * @see processes.impl.ProcessesPackageImpl#getActivityNode()
       * @generated
       */
      EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

      /**
       * The meta object literal for the '<em><b>In</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_NODE__IN = eINSTANCE.getActivityNode_In();

      /**
       * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_NODE__OUT = eINSTANCE.getActivityNode_Out();

      /**
       * The meta object literal for the '{@link processes.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.ActivityEdgeImpl
       * @see processes.impl.ProcessesPackageImpl#getActivityEdge()
       * @generated
       */
      EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

      /**
       * The meta object literal for the '<em><b>Source</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

      /**
       * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_EDGE__GUARD = eINSTANCE.getActivityEdge_Guard();

      /**
       * The meta object literal for the '{@link processes.impl.GuardSpecificationImpl <em>Guard Specification</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.GuardSpecificationImpl
       * @see processes.impl.ProcessesPackageImpl#getGuardSpecification()
       * @generated
       */
      EClass GUARD_SPECIFICATION = eINSTANCE.getGuardSpecification();

      /**
       * The meta object literal for the '<em><b>Data</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference GUARD_SPECIFICATION__DATA = eINSTANCE.getGuardSpecification_Data();

      /**
       * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute GUARD_SPECIFICATION__ATTRIBUTE = eINSTANCE.getGuardSpecification_Attribute();

      /**
       * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute GUARD_SPECIFICATION__OPERATION = eINSTANCE.getGuardSpecification_Operation();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute GUARD_SPECIFICATION__VALUE = eINSTANCE.getGuardSpecification_Value();

      /**
       * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute GUARD_SPECIFICATION__DESCRIPTION = eINSTANCE.getGuardSpecification_Description();

      /**
       * The meta object literal for the '<em><b>Sub Specification</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference GUARD_SPECIFICATION__SUB_SPECIFICATION = eINSTANCE.getGuardSpecification_SubSpecification();

      /**
       * The meta object literal for the '<em><b>Sub Specification Connector</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute GUARD_SPECIFICATION__SUB_SPECIFICATION_CONNECTOR = eINSTANCE.getGuardSpecification_SubSpecificationConnector();

      /**
       * The meta object literal for the '{@link processes.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.ExecutableNodeImpl
       * @see processes.impl.ProcessesPackageImpl#getExecutableNode()
       * @generated
       */
      EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

      /**
       * The meta object literal for the '{@link processes.impl.ActionImpl <em>Action</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.ActionImpl
       * @see processes.impl.ProcessesPackageImpl#getAction()
       * @generated
       */
      EClass ACTION = eINSTANCE.getAction();

      /**
       * The meta object literal for the '<em><b>Performed By</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION__PERFORMED_BY = eINSTANCE.getAction_PerformedBy();

      /**
       * The meta object literal for the '<em><b>Executed By</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION__EXECUTED_BY = eINSTANCE.getAction_ExecutedBy();

      /**
       * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION__REALIZES = eINSTANCE.getAction_Realizes();

      /**
       * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION__INPUTS = eINSTANCE.getAction_Inputs();

      /**
       * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION__OUTPUTS = eINSTANCE.getAction_Outputs();

      /**
       * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION__MAPPINGS = eINSTANCE.getAction_Mappings();

      /**
       * The meta object literal for the '<em><b>Targetexecutiontime</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ACTION__TARGETEXECUTIONTIME = eINSTANCE.getAction_Targetexecutiontime();

      /**
       * The meta object literal for the '{@link processes.impl.ControlNodeImpl <em>Control Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.ControlNodeImpl
       * @see processes.impl.ProcessesPackageImpl#getControlNode()
       * @generated
       */
      EClass CONTROL_NODE = eINSTANCE.getControlNode();

      /**
       * The meta object literal for the '{@link processes.impl.InitialNodeImpl <em>Initial Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.InitialNodeImpl
       * @see processes.impl.ProcessesPackageImpl#getInitialNode()
       * @generated
       */
      EClass INITIAL_NODE = eINSTANCE.getInitialNode();

      /**
       * The meta object literal for the '{@link processes.impl.ForkNodeImpl <em>Fork Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.ForkNodeImpl
       * @see processes.impl.ProcessesPackageImpl#getForkNode()
       * @generated
       */
      EClass FORK_NODE = eINSTANCE.getForkNode();

      /**
       * The meta object literal for the '{@link processes.impl.JoinNodeImpl <em>Join Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.JoinNodeImpl
       * @see processes.impl.ProcessesPackageImpl#getJoinNode()
       * @generated
       */
      EClass JOIN_NODE = eINSTANCE.getJoinNode();

      /**
       * The meta object literal for the '{@link processes.impl.MergeNodeImpl <em>Merge Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.MergeNodeImpl
       * @see processes.impl.ProcessesPackageImpl#getMergeNode()
       * @generated
       */
      EClass MERGE_NODE = eINSTANCE.getMergeNode();

      /**
       * The meta object literal for the '{@link processes.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.DecisionNodeImpl
       * @see processes.impl.ProcessesPackageImpl#getDecisionNode()
       * @generated
       */
      EClass DECISION_NODE = eINSTANCE.getDecisionNode();

      /**
       * The meta object literal for the '{@link processes.impl.FinalNodeImpl <em>Final Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.FinalNodeImpl
       * @see processes.impl.ProcessesPackageImpl#getFinalNode()
       * @generated
       */
      EClass FINAL_NODE = eINSTANCE.getFinalNode();

      /**
       * The meta object literal for the '{@link processes.impl.GuardImpl <em>Guard</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.GuardImpl
       * @see processes.impl.ProcessesPackageImpl#getGuard()
       * @generated
       */
      EClass GUARD = eINSTANCE.getGuard();

      /**
       * The meta object literal for the '<em><b>Textualdescription</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute GUARD__TEXTUALDESCRIPTION = eINSTANCE.getGuard_Textualdescription();

      /**
       * The meta object literal for the '<em><b>Shortdescription</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute GUARD__SHORTDESCRIPTION = eINSTANCE.getGuard_Shortdescription();

      /**
       * The meta object literal for the '<em><b>Detailed Specification</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference GUARD__DETAILED_SPECIFICATION = eINSTANCE.getGuard_DetailedSpecification();

      /**
       * The meta object literal for the '{@link processes.impl.ActivityLinkNodeImpl <em>Activity Link Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.impl.ActivityLinkNodeImpl
       * @see processes.impl.ProcessesPackageImpl#getActivityLinkNode()
       * @generated
       */
      EClass ACTIVITY_LINK_NODE = eINSTANCE.getActivityLinkNode();

      /**
       * The meta object literal for the '<em><b>Linksto</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_LINK_NODE__LINKSTO = eINSTANCE.getActivityLinkNode_Linksto();

      /**
       * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_LINK_NODE__USES = eINSTANCE.getActivityLinkNode_Uses();

      /**
       * The meta object literal for the '{@link processes.OperationType <em>Operation Type</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.OperationType
       * @see processes.impl.ProcessesPackageImpl#getOperationType()
       * @generated
       */
      EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

      /**
       * The meta object literal for the '{@link processes.BooleanConnector <em>Boolean Connector</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see processes.BooleanConnector
       * @see processes.impl.ProcessesPackageImpl#getBooleanConnector()
       * @generated
       */
      EEnum BOOLEAN_CONNECTOR = eINSTANCE.getBooleanConnector();

   }

} //ProcessesPackage
