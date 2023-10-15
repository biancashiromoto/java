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
                  This is a simple calculator project.""";
        System.out.println(welcomeMessage);

        String operationMessage = """
                First, let's choose an operation.
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Average (of values in an array)
                0. Exit
                """;


        System.out.println(operationMessage);

        int operation = Utils.getOperation(scanner, "Type a double value");

        switch (operation) {
            case 1:
                System.out.println("Addition: ");
                ArrayList<Double> arraySum = Utils.setArray(scanner, "Type a " +
                        "double value: ");
                Calculator.sum(arraySum);
                double sum = Calculator.sum(arraySum);
                System.out.printf("The sum of the numbers in the array is: %s",
                sum);
                break;
            case 2:
                System.out.println("Subtraction: ");
                ArrayList<Double> arraySubtraction = Utils.setArray(scanner,
                        "Type a " +
                "double value: ");
                double subtraction = Calculator.subtract(arraySubtraction);
                System.out.printf("The subtraction of the numbers in the " +
                "array is: %s", subtraction);
                break;
            case 3:
                ArrayList<Double> arrayMultiplication = Utils.setArray(scanner,
                        "Type a " +
                                "double value: ");
                double multiply = Calculator.multiply(arrayMultiplication);
                System.out.printf("The multiplication of the numbers in the " +
                "array is: %s", multiply);
                break;
            case 4:
                ArrayList<Double> arrayDivision = Utils.setArray(scanner,
                        "Type a " +
                                "double value: ");
                double division = Calculator.divide(arrayDivision);
                System.out.printf("The division of the numbers in the " +
                        "array is: %s", division);
                break;
            case 5:
                ArrayList<Double> arrayAverage = Utils.setArray(scanner,
                        "Type a " +
                                "double value: ");
                double average = Calculator.average(arrayAverage);
                System.out.printf("The average of the numbers in the " +
                        "array is: %s", average);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
