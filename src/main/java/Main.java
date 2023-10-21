import utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        try {
            // utilizada para obter entradas de dados do usuário, como teclado/arquivo
            // System.in - input stream, rastreia entradas
            Scanner scanner = new Scanner(System.in);
            String welcomeMessage = """
                    ___________________________________________________
                    Hello world!
                    This is a simple calculator project.""";
            System.out.println(welcomeMessage);
            Thread.sleep(500);

            String operationMessage = """
                    ____________________________________________________
                    First, let's choose an operation.
                    1. Addition
                    2. Subtraction
                    3. Multiplication
                    4. Division
                    5. Average
                    0. Exit
                    ____________________________________________________
                    """;

            System.out.println(operationMessage);
            Thread.sleep(500);

            int operation = Utils.getOperation(scanner, "Operation: ");

            switch (operation) {
                case 1:
                    System.out.println("Addition: ");
                    ArrayList<Double> arraySum = Utils.setArray(scanner);
                    Calculator.sum(arraySum, 0);
                    double sum = Calculator.sum(arraySum, 0);
                    Utils.printResult(sum);
                    break;
                case 2:
                    System.out.println("Subtraction: ");
                    ArrayList<Double> arraySubtraction = Utils.setArray(scanner);
                    double subtraction = Calculator.subtract(arraySubtraction);
                    Utils.printResult(subtraction);
                    break;
                case 3:
                    System.out.println("Multiplication: ");
                    ArrayList<Double> arrayMultiplication = Utils.setArray(scanner);
                    double multiplication =
                            Calculator.multiply(arrayMultiplication);
                    Utils.printResult(multiplication);
                    break;
                case 4:
                    System.out.println("Division: ");
                    ArrayList<Double> arrayDivision = Utils.setArray(scanner);
                    double division = Calculator.divide(arrayDivision);
                    Utils.printResult(division);
                    break;
                case 5:
                    System.out.println("Average: ");
                    ArrayList<Double> arrayAverage = Utils.setArray(scanner);
                    double average = Calculator.average(arrayAverage);
                    Utils.printResult(average);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }
}
