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

            int number = Utils.getRandomNumber();

            while(counter <= 5) {
                String message = String.format("""
                        ____________________________________________________
                        Guess #%d: """, counter);
                int guess = Utils.getInput(scanner, message);
                counter += 1;

                if (guess > number) {
                    Thread.sleep(250);
                    System.out.println("""
                            ____________________________________________________
                            Your guess is bigger than the secret number.""");
                } else if (guess < number) {
                    Thread.sleep(250);
                    System.out.println("""
                            ____________________________________________________
                            Your guess is smaller than the secret number.""");
                } else {
                    Thread.sleep(250);
                    System.out.printf("""
                            ____________________________________________________
                            CONGRATULATIONS!!!
                            The secret number is %d!%n""", number);
                    if (counter > 0) {
                        System.out.printf("""
                            You took %d chances to guess.%n""", counter - 1);
                    }
                    System.exit(0);
                    break;
                }
            }
            System.out.printf("""
                            ____________________________________________________
                            The secret number was: %d""", number);
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }
}
