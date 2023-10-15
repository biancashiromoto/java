import utils.Utils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // utilizada para obter entradas de dados do usuário, como teclado/arquivo
        // System.in - input stream, rastreia entradas
        Scanner scanner = new Scanner(System.in);

        String welcomeMessage = """
        Hello world!
        This is a simple calculator project""";
        System.out.println(welcomeMessage);

        double a = Utils.getInput(scanner, "Type a double value: ");
        double b = Utils.getInput(scanner, "Type another double number: ");

        Calculator.sum(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }
}
