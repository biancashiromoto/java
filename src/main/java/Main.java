import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import utils.Pokemon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            JsonObject response = Pokemon.getRandomPokemon();
            JsonElement pokemonName = response.get("name");


            Scanner scanner = new Scanner(System.in);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
