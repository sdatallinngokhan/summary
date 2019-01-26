package week11.basic;

public class Conditionals_Scopes { // Conditionals_Scopes class scope starts here

    public void conditions() { // conditions method scope starts here
        System.out.println("---CONDITIONS---");

        int number1 = 5;
        int number2 = 10;

        if (number1 < number2) {
            System.out.println("number1 is less than number2");
        }

        if (number1 > number2) {
            System.out.println("number1 is greater than number2");
        }

        System.out.println();
        System.out.println();

        String hello = "helloo";
        if (hello.startsWith("he")) {
            System.out.println("hello starts with he");
        }

        if (hello.endsWith("lo")) {
            System.out.println("hello ends with lo");
        } else {
            System.out.println("hello does not end with lo");
        }

        System.out.println();
        System.out.println();

        boolean b = true;
        if (b) {
            System.out.println("b is " + b);
        }
        if (b == true) { // this if condition works as above
            System.out.println("b is " + b);
        }

        System.out.println();
        System.out.println();

        String value1 = "phone";
        String value2 = "phone";

        if (value1 == value2) {
            System.out.println("value1 is equals to value2");
        }

        if (value1.equals(value2)) {
            System.out.println("value1 is equals to value2");
        }

        System.out.println();
        System.out.println();

        String value3 = new String("phone");
        String value4 = "phone".substring(0, 5);

        if (value3.equals(value4)) {
            System.out.println("This block will work");
        }

        if (value3 == value4) {
            System.out.println("This block will not work"); // because value3 and value4 hashcodes are different
        }

    } // conditions method scope starts here

    public static void main(String[] args) { // main method scope starts here
        Conditionals_Scopes conditionals_scopes = new Conditionals_Scopes();
        conditionals_scopes.conditions();
    } // main method scope ends here

} // Conditionals_Scopes class scope end here
