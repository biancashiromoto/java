import utils.Utils;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;

        // enquanto playAgain for true
        while (playAgain) {
            // chama o método playGame que contém a lógica do jogo
            playGame(scanner);

            System.out.println("""
                    ___________________________________________________
                    
                    Would you like to play again? (yes/no)""");
            // lẽ a resposta do usuário e armazena na input
            String input = scanner.next();
            // o valor de playAgain é atribuído a true caso a input seja
            // "yes" e false caso não seja
            playAgain = input.equalsIgnoreCase("yes");
        }

        if (!playAgain) {
            System.out.println("""
                    ___________________________________________________
                    Exiting.
                    """);
        }
    }

    public static void playGame(Scanner scanner) {
        try {
            int counter = 1;
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

            while (counter <= 5) {
                String message = String.format("""
                        ____________________________________________________
                        Guess #%d:\s""", counter);
                int guess = Utils.getInput(scanner, message);
                counter += 1;

                Utils.compareValues(guess, secretNumber, counter);
            }
            System.out.printf("""
                            ____________________________________________________
                            Oh no!
                            The secret number was: %d%n""", secretNumber);
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }
}
