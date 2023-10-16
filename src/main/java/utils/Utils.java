package utils;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static int getRandomNumber() {
        return new Random().nextInt(100);
    }

    public static int getInput(Scanner scanner, String message) {
        int input = -1;

        while(true) {
            System.out.printf(message);
            try {
                input = scanner.nextInt();
                break;
            } catch (InputMismatchException error) {
                System.out.println("Input must be an integer value");
                scanner.next();
            }
        }
        return input;
    }
}
