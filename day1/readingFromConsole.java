package day1;
import java.util.Scanner;
public class readingFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading a string input
        System.out.println("Enter your Name:");
        String name = input.nextLine();
        System.out.println("Hello "+name);

        // Reading an integer input
        System.out.println("Enter your Age:");
        int age = input.nextInt();
        System.out.println("Your Age is: " + age);

        // Reading a float input
        System.out.println("Enter your Weight in kg:");
        float weight = input.nextFloat();
        System.out.println("Your Weight is: " + weight + " kg");

        // Reading a double input
        System.out.println("Enter your Height in meters:");
        double height= input.nextDouble();
        System.out.println("Your Height is: " + height + " meters");

        // Reading a boolean input
        System.out.println("Are you a student? (true/false):");
        boolean isStudent = input.nextBoolean();
        System.out.println("Is Student: " + isStudent);     

        // Close the scanner
        input.close();
}
}