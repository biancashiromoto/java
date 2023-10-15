import utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // utilizada para obter entradas de dados do usuário, como teclado/arquivo
        // System.in - input stream, rastreia entradas
        Scanner scanner = new Scanner(System.in);

        String welcomeMessage = """
                  Hello world!
                  This is a simple calculator project""";
//        System.out.println(welcomeMessage);
//
//        double a = Utils.getInput(scanner, "Type a double value: ");
//        double b = Utils.getInput(scanner, "Type another double number: ");
//
//        Calculator.sum(a, b);
//        Calculator.subtract(a, b);
//        Calculator.multiply(a, b);
//        Calculator.divide(a, b);

        ArrayList<Double> array = new ArrayList<>();
        double input;

        // aqui ele executa primeiro a ordem (do) - recupera uma input e a
        // adiciona ao array enquanto o valor passado como input for
        // diferente de -1. Se for diferente de -1, ele realiza o código que
        // estiver abaixo.
        do {
            input = Utils.getInput(scanner, "Type a double value: ");
            array.add(input);
        } while (input != -1);

//        Calculator.sumArray(array);
//        Calculator.averageArray(array);

//        double result = Calculator.averageArray(array);
//        System.out.printf("The average of the numbers in the array is: %s",
//                result);
    }
}
