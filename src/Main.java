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

        System.out.println("Type an integer number: ");
        if(scanner.hasNextInt()) {
            // lê a linha de texto da entrada do usuário e a retorna como uma
            // string - aguarda até que o usuário pressione Enter após inserir o
            // texto
            int a = scanner.nextInt();
            System.out.println("Type another integer number: ");
            if(scanner.hasNextInt()) {
                int b = scanner.nextInt();
                scanner.nextLine();
                Calculator.sum(a, b);
                Calculator.subtract(a, b);
                Calculator.multiply(a, b);
                Calculator.divide(a, b);
            } else {
                System.out.println("Input must be an integer");
            }
        } else {
            System.out.println("Input must be an integer");
        }
    }
}
