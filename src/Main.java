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

        int a = Utils.getInput(scanner, "Type an integer number: ");
        int b = Utils.getInput(scanner, "Type another integer number: ");

        if (a != -1 && b != -1) {
            Calculator.sum(a, b);
            Calculator.subtract(a, b);
            Calculator.multiply(a, b);
        }
    }
}
