import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {
    public static Scanner scanner = new Scanner(System.in);

    public static double subtract(ArrayList<Double> array) {
        // inicia result como o primeiro item do array
        double result = array.get(0);
        // inicia i em 1 porque já usamos o primeiro elemento no result
        for (int i = 1; i < array.size(); i++) {
            double value = array.get(i);
            if (value != -1) {
                result = result - value;
            }
        }
        return result;
    }

    public static double multiply(ArrayList<Double> array) {
        double result = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            double value = array.get(i);
            if (value != -1) {
                result = result * value;
            }
        }
        return result;
    }

    public static double divide(ArrayList<Double> array) {
        double result = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            double value = array.get(i);
            if (value != -1) {
                result = result / value;
            }
        }
        return result;
    }

    public static double sum(ArrayList<Double> array) {
        double result = 0;
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < array.size(); i += 1) {
            double value = array.get(i);
            if (value != -1) {
                result += value;
                response.append(value).append(", ");
            }
        }
        return result;
    }

    public static double average(ArrayList<Double> array) {
        double sum = sum(array);
        return sum / array.size();
    }
}
