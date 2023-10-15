import java.util.ArrayList;
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

    public static double sumArray(ArrayList<Double> array) {
        double result = 0;
        for (double value : array) {
            result += value;
        }
//        System.out.println(result);
        return result;
    }
}
