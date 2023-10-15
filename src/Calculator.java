import java.util.Scanner;
public class Calculator {
    public static void sum(double a, double b) {
        double result = a + b;
        System.out.printf("%s + %s = %s %n", a, b, result);
    }

    public static void subtract(double a, double b) {
        double result = a - b;
        System.out.printf("%s - %s = %s %n", a, b, result);
    }

    public static void multiply(double a, double b) {
        double result = a * b;
        System.out.printf("%s * %s = %s %n", a, b, result);
    }

    public static void divide(double a, double b) {
        double result = a / b;
        System.out.printf("%s / %s = %s %n", a, b, result);
    }
}
