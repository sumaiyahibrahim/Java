package day1;

public class PrintStatements {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("World");


        int age = 25;
        int weight = 85;
        System.out.println(age);
        System.out.println(weight);

        //formatted output
        System.out.printf("Age: %d, Weight: %d%n", age, weight);
        System.out.printf("Formatted Output: Age = %d, Weight = %d%n", age, weight);  
        //%d is a placeholder for integers
        //%n is a newline character
        //%s is a placeholder for strings
        //%f is a placeholder for floating-point numbers

    }
}
