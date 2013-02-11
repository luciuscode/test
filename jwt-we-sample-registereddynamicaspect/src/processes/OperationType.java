/**
 */
package processes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see processes.ProcessesPackage#getOperationType()
 * @model
 * @generated
 */
public enum OperationType implements Enumerator {
   /**
    * The '<em><b>Equals</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EQUALS_VALUE
    * @generated
    * @ordered
    */
   EQUALS(0, "Equals", "=="),

   /**
    * The '<em><b>Lower</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #LOWER_VALUE
    * @generated
    * @ordered
    */
   LOWER(1, "Lower", "<"),

   /**
    * The '<em><b>Lower Equals</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #LOWER_EQUALS_VALUE
    * @generated
    * @ordered
    */
   LOWER_EQUALS(2, "LowerEquals", "<="),

   /**
    * The '<em><b>Greater</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #GREATER_VALUE
    * @generated
    * @ordered
    */
   GREATER(3, "Greater", ">"),

   /**
    * The '<em><b>Greate Equals</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #GREATE_EQUALS_VALUE
    * @generated
    * @ordered
    */
   GREATE_EQUALS(4, "GreateEquals", ">="),

   /**
    * The '<em><b>Un Equals</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #UN_EQUALS_VALUE
    * @generated
    * @ordered
    */
   UN_EQUALS(5, "UnEquals", "!=");

   /**
    * The '<em><b>Equals</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>Equals</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EQUALS
    * @model name="Equals" literal="=="
    * @generated
    * @ordered
    */
   public static final int EQUALS_VALUE = 0;

   /**
    * The '<em><b>Lower</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>Lower</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #LOWER
    * @model name="Lower" literal="<"
    * @generated
    * @ordered
    */
   public static final int LOWER_VALUE = 1;

   /**
    * The '<em><b>Lower Equals</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>Lower Equals</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #LOWER_EQUALS
    * @model name="LowerEquals" literal="<="
    * @generated
    * @ordered
    */
   public static final int LOWER_EQUALS_VALUE = 2;

   /**
    * The '<em><b>Greater</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>Greater</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #GREATER
    * @model name="Greater" literal=">"
    * @generated
    * @ordered
    */
   public static final int GREATER_VALUE = 3;

   /**
    * The '<em><b>Greate Equals</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>Greate Equals</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #GREATE_EQUALS
    * @model name="GreateEquals" literal=">="
    * @generated
    * @ordered
    */
   public static final int GREATE_EQUALS_VALUE = 4;

   /**
    * The '<em><b>Un Equals</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>Un Equals</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #UN_EQUALS
    * @model name="UnEquals" literal="!="
    * @generated
    * @ordered
    */
   public static final int UN_EQUALS_VALUE = 5;

   /**
    * An array of all the '<em><b>Operation Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final OperationType[] VALUES_ARRAY =
      new OperationType[] {
         EQUALS,
         LOWER,
         LOWER_EQUALS,
         GREATER,
         GREATE_EQUALS,
         UN_EQUALS,
      };

   /**
    * A public read-only list of all the '<em><b>Operation Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<OperationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Operation Type</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static OperationType get(String literal) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         OperationType result = VALUES_ARRAY[i];
         if (result.toString().equals(literal)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Operation Type</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static OperationType getByName(String name) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         OperationType result = VALUES_ARRAY[i];
         if (result.getName().equals(name)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Operation Type</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static OperationType get(int value) {
      switch (value) {
         case EQUALS_VALUE: return EQUALS;
         case LOWER_VALUE: return LOWER;
         case LOWER_EQUALS_VALUE: return LOWER_EQUALS;
         case GREATER_VALUE: return GREATER;
         case GREATE_EQUALS_VALUE: return GREATE_EQUALS;
         case UN_EQUALS_VALUE: return UN_EQUALS;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private OperationType(int value, String name, String literal) {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getValue() {
     return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName() {
     return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getLiteral() {
     return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      return literal;
   }
   
} //OperationType
