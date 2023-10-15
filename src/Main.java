import utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // utilizada para obter entradas de dados do usuário, como teclado/arquivo
        // System.in - input stream, rastreia entradas
        Scanner scanner = new Scanner(System.in);

//        String welcomeMessage = """
//                  Hello world!
//                  This is a simple calculator project""";
//        System.out.println(welcomeMessage);
//
//        double a = Utils.getInput(scanner, "Type a double value: ");
//        double b = Utils.getInput(scanner, "Type another double number: ");
//
//        Calculator.sum(a, b);
//        Calculator.subtract(a, b);
//        Calculator.multiply(a, b);
//        Calculator.divide(a, b);

        String welcomeMessage = """
                
                Let's calculate the average of the values in an array.
                You can type as much as many double values you want,
                then you can type -1, and the application should stop.
                """;

        System.out.println(welcomeMessage);
        ArrayList<Double> array = new ArrayList<>();
        double input;

        do {
            input = Utils.getInput(scanner, "Type a double value: ");
            if (input == -1) {
                System.out.println("Exiting input loop");
                // encerra a aplicação
                System.exit(0);
            }
            array.add(input);
        } while (input != -1);

        double result = Calculator.sumArray(array) / array.size();
        System.out.printf("The average of the numbers in the array is: %s",
                result);
    }
}
