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
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < array.size(); i += 1) {
            double value = array.get(i);
            if (value != -1) {
                result += value;
                response.append(value).append(", ");
            }
        }
//        System.out.printf("The sum of %s is: %s", response.toString(), result);
        return result;
    }

    public static void averageArray(ArrayList<Double> array) {
        double sum = sumArray(array);
        double result = sum / array.size();
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < array.size(); i += 1) {
            double value = array.get(i);
            if (value != -1) {
                response.append(value).append(", ");
            }
        }
        System.out.printf("The average of %s is: %s", response.toString(), result);
    }
}
