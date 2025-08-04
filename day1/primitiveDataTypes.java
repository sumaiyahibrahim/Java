package day1;
public class primitiveDataTypes {
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
        

        // Integer types
        byte byteVal = 127;           // 1 byte, range: -128 to 127
        short shortVal = 32000;       // 2 bytes, range: -32,768 to 32,767
        int intVal = 100000;          // 4 bytes, commonly used
        long longVal = 10000000000L;  // 8 bytes, add 'L' at the end

        // Floating-point types
        float floatVal = 3.14f;       // 4 bytes, add 'f' at the end
        double doubleVal = 3.1415926535; // 8 bytes, more precise
        System.out.printf("Double value: %.2f%n", doubleVal); // To print a floating-point number with two decimal places

        // Character type
        char charVal = 'A';           // 2 bytes, stores a single character

        // Boolean type
        boolean boolTrue = true;      // 1 bit, true or false
        boolean boolFalse = false;

        // Output all values with explanation
        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean (true): " + boolTrue);
        System.out.println("boolean (false): " + boolFalse);

        // Arithmetic example using int
        int a = 10, b = 5;
        int sum = a + b;
        int product = a * b;
        System.out.println("\nArithmetic with int:");
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Character operations
        char letter = 'B';
        int ascii = letter; // Implicit conversion to int
        System.out.println("\nCharacter to ASCII:");
        System.out.println("Character: " + letter);
        System.out.println("ASCII value: " + ascii);

        // Boolean logic
        boolean isAdult = true;
        boolean hasTicket = false;
        boolean canEnter = isAdult && hasTicket;
        System.out.println("\nBoolean Logic:");
        System.out.println("Can enter? " + canEnter);
    }
}
    