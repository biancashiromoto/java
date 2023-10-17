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

    public static void compareValues(int guessedNumber, int secretNumber,
     int counter) throws InterruptedException {
        try {
            if (guessedNumber > secretNumber) {
                Thread.sleep(250);
                System.out.println("""
                            ____________________________________________________
                            
                            Your guess is bigger than the secret number.""");
            } else if (guessedNumber < secretNumber) {
                Thread.sleep(250);
                System.out.println("""
                            ____________________________________________________
                            
                            Your guess is smaller than the secret number.""");
            } else {
                Thread.sleep(250);
                System.out.printf("""
                            ____________________________________________________
                            
                            CONGRATULATIONS!!!
                            The secret number is %d!%n""", secretNumber);
                if (guessedNumber > 0) {
                    System.out.printf("""
                            You took %d chances to guess.%n""", counter - 1);
                }
                System.exit(0);
            }
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }
}
