package utils;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
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
}
