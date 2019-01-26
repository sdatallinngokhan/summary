package week11.basic;

public class DataTypes_Variables_Constants_Operators_Casts {

    public final static String LAPTOP_BRAND = "ASUS"; // constants are created with final and static keywords. constant name is defined with capital letters. Constant value has to be initialized.

    public void printConstantValue() {
        System.out.println("---CONSTANTS---");
        System.out.println("Constant value for laptop brand is : " + LAPTOP_BRAND);

        System.out.println();
        System.out.println();
    }

    // Java has 2 different data type types. Primitive and Wrapper
    public void dataTypes_variables() {

        // PRIMITIVES : int, double, long, short, char, float, boolean, byte
        // WRAPPERS : Integer, Double, Long, Short, Character, Float, Boolean, Byte, String

        String s = "My name is Jack"; // String is variable type, s is variable name. Right side of equals operator is assigned to left side variable
        int i = 5; // int is primitive type. Wrapper type of int is Integer
        Boolean b = true; // Boolean is Wrapper type. primitive type of Boolean is boolean
        double d = 5.6d;

        System.out.println("---DATA TYPES---");
        System.out.println("Variable is s, String value : " + s);
        System.out.println("Variable is i, int value : " + i);
        System.out.println("Variable is b, Boolean value : " + b);
        System.out.println("Variable is d, double value : " + d);

        System.out.println();
        System.out.println();
    }

    // Java has 2 different operator types. 1-Arithmetic, 2-Logical
    public void operators() {
        // ARITHMETIC OPERATORS
        int sum = 5 + 4; // = and + are arithmetic operators
        int subtract = 5 - 4; // = and - are arithmetic operators
        int multiply = 5 * 4; // = and * are arithmetic operators
        int divide = 8 / 4; // = and / are arithmetic operators
        int modularity = 5 % 4; // = and % are arithmetic operators

        System.out.println("Sum up of values are done by + Sum up value is :" + sum);
        System.out.println("Subtract of values are done by - Subtract value is :" + subtract);
        System.out.println("Multiply of values are done by * Multiply value is :" + multiply);
        System.out.println("Dividing of values are done by / Dividend value is :" + divide);
        System.out.println("Modularity of values are done by % Modularity value is :" + modularity);

        System.out.println();

        // LOGICAL OPERATORS
        boolean a = true;
        boolean b = false;
        int num1 = 5;
        int num2 = 4;
        boolean andOperator = a && b; // && is and operator. = arithmetic operator
        boolean orOperator = a || b; // || is and operator. = arithmetic operator
        boolean lessThan = num1 < num2; // < is and operator. = arithmetic operator
        boolean greaterThan = num1 > num2; // > is and operator. = arithmetic operator
        boolean complementOperator = !b; // ! is complement operator

        System.out.println("And operations are done by && . And result is : " + andOperator);
        System.out.println("Or operations are done by || . And result is : " + orOperator);
        System.out.println("Less than operations are done by < . And result is : " + lessThan);
        System.out.println("Greater operations are done by > . And result is : " + greaterThan);
        System.out.println("Complement operations are done by ! . And result is : " + complementOperator);

        System.out.println();
        System.out.println();
    }

    public void casts() {
        String stringValue = "5";
        Integer castedStringValue = Integer.parseInt(stringValue);
        System.out.println("String is casted to integer and result is : " + castedStringValue);
        System.out.println();

        Integer integerValue = 5;
        String castedIntegerValueWithToString = integerValue.toString();
        String castedIntegerValueWithDoubleQuotes = "" + integerValue;
        System.out.println("Integer is casted to String with toString method. Result is : " + castedIntegerValueWithToString);
        System.out.println("Integer is casted to String with double quotes. Result is : " + castedIntegerValueWithDoubleQuotes);

        short shortValue1 = 5;
        short shortValue2 = 6;
        short result = (short) (shortValue1 + shortValue2); // +, -, *, / arithmetic operations results are integer. but short MAX and MIN values are more narrow than integer. That's why we have to cast integer operation to short

        int intValue1 = 2;
        int intValue2 = 2;
        double result2 = intValue1 + intValue2; // double MIN MAX range is wider than integer. So, no need to cast here
    }

    public static void main(String[] args) {
        DataTypes_Variables_Constants_Operators_Casts instanceOfMyClass = new DataTypes_Variables_Constants_Operators_Casts();
        instanceOfMyClass.dataTypes_variables();
        instanceOfMyClass.printConstantValue();
        instanceOfMyClass.operators();
        instanceOfMyClass.casts();
    }
}
