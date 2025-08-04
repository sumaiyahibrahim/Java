package day1;
public class VariableDemo {
    public static void main(String[] args) {

        // 📌 Data Types
        // String - text in double quotes (e.g., "Hello")
        // int - whole numbers (e.g., 10)
        // double - decimal numbers (e.g., 10.5)
        // boolean - true/false values
        // char - single characters (e.g., 'A')
        // float - single-precision decimal numbers
        // long - larger whole numbers
        // short - smaller whole numbers
        // byte - smallest whole numbers

        // Java printf placeholders:
        // %d → int (e.g., 42)
        // %.2f → double with 2 decimal places (e.g., 12.99)
        // %b → boolean (e.g., true or false)
        // %c → char (e.g., 'A')
        // %s → String (e.g., "Alice")

        // 🔒 Final Variables (Constants)
        final double PI = 3.14;
        final String COUNTRY = "USA";
        final int rollNo = 101;
        // rollNo = 102; // Error: cannot change final value

        // Declaring and Initializing Multiple Variables
        int x = 1, y = 2, z = 3;
        // OR
        int a1, b1, c1;
        a1 = b1 = c1 = 50;

        // Problem 1: Swap Two Numbers Without Temp Variable
        int a = 5, b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b; // b becomes 5
        a = a - b; // a becomes 10
        System.out.println("After Swap: a = " + a + ", b = " + b);

        // Problem 2: Declare and Print All Types of Variables
        int i = 5;
        float f = 3.14f;
        double d = 3.14159;
        char c = 'S';
        boolean bool = true;
        String s = "Java";

        System.out.println("int: " + i);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + s);
    }
}