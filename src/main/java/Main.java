import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import utils.Pokemon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        try {
            String[] response = Pokemon.getPokemonName();
//            System.out.println(response[0]);

            String welcomeMessage = """
                    Hello world!
                    This is a Pokémon-based hangman game!
                    The application will sort a pokémon id from 1 to 151...
                    And your mission is to guess the pokémon's name!
                    """;

            System.out.println(welcomeMessage);
            Thread.sleep(500);
            System.out.println(response[1]);
            Scanner scanner = new Scanner(System.in);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
