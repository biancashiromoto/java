package utils;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static int getInput(Scanner scanner, String message) {
        boolean isValidInput = false;
        int input = -1;

        while(!isValidInput) {
            System.out.println(message);
            try {
                input = scanner.nextInt();
                isValidInput = true;
            } catch (InputMismatchException error) {
                System.out.println("Input must be an integer");
                scanner.next();
            }
        }
        return input;
    }
}
