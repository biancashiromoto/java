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

    public static double sum(ArrayList<Double> array, int index) {
//        caso base: index == array.size() - 1
        if (index == array.size() - 1) {
            return array.get(index);
        }
//        chamada recursiva: sum(array, index + 1)
//        progresso para o caso base: progride no array
//        combinação dos resultados:
        return array.get(index) + sum(array, index + 1);
    }

    public static double average(ArrayList<Double> array) {
        double sum = sum(array, 0);
        return sum / array.size();
    }
}
