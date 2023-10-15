import java.util.Scanner;
public class Calculator {
    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum: " + result);
    }

    public static void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    public static void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Division: " + result);
        } catch (ArithmeticException error) {
            System.out.println("Can't divide by zero");
        }
    }
}
