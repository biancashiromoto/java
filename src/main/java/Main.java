import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import utils.Pokemon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            JsonObject response = Pokemon.getRandomPokemon();
            String pokemonName = response.get("name").getAsString();
            String secretName = "";
            for (int i = 0; i < pokemonName.length(); i += 1) {
                secretName = secretName.concat("_ ");
            }
            System.out.println(secretName);

            Scanner scanner = new Scanner(System.in);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
