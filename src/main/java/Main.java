import utils.Utils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        try {
            int counter = 1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    ___________________________________________________
                    Hello world!
                    This is a guessing game!""");
            Thread.sleep(500);

            System.out.println("""
                    ____________________________________________________
                    The application will sort a random number from 1 to 100,
                    and you have to guess what that number is.""");
            Thread.sleep(500);

            System.out.println("""
                    ____________________________________________________
                    You have five chances.
                    Good luck!""");
            Thread.sleep(500);

            int secretNumber = Utils.getRandomNumber();

            // enquanto counter for menor ou igual a 5
            while(counter <= 5) {
                // solicita um guess
                String message = String.format("""
                        ____________________________________________________
                        Guess #%d:\s""", counter);
                int guess = Utils.getInput(scanner, message);
                // adiciona uma unidade ao counter
                counter += 1;

                Utils.compareValues(guess, secretNumber, counter);
            }
            System.out.printf("""
                            ____________________________________________________
                            The secret number was: %d%n""", secretNumber);
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }
}
