package utils;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static int getOperation(Scanner scanner, String message) {
        int input = -1;
        while(true) {
            try {
                System.out.println(message);
                input = scanner.nextInt();
                break;
            } catch (InputMismatchException error) {
                System.out.println("Input must be an integer number");
                scanner.next();
            }
        }
        return input;
    }
    public static double getInput(Scanner scanner, String message) {
        // define o valor inicial de input, para poder retorná-lo depois
        double input = -1;

        // criação de um loop infinito, que só para quando usamos break
        while(true) {
            // imprime a mensagem no console
            System.out.println(message);
            try {
                // caso o valor seja um double, atribui à input e dá um break
                // no while loop
                input = scanner.nextDouble();
                break;
            } catch (InputMismatchException error) {
                // caso contrário, imprime a mensagem de erro
                System.out.println("Input must be a double value");
                // a mensagem de erro é exibida e a entrada é limpa
                scanner.next();
            }
        }
        return input;
    }

    public static ArrayList<Double> setArray(Scanner scanner) {
        String message = """
                Type a double value to be added to the array
                or type -1 to see the result""";
        ArrayList<Double> array = new ArrayList<>();
        double input;
        // aqui ele executa primeiro a ordem (do) - recupera uma input e a
        // adiciona ao array enquanto o valor passado como input for
        // diferente de -1. Se for diferente de -1, ele realiza o código que
        // estiver abaixo.
        do {
            input = Utils.getInput(scanner, message);
            array.add(input);
        } while (input != -1);
        return array;
    }
}
