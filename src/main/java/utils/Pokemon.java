package utils;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Pokemon {
    public static JsonArray fetch() {
        try {
            // cria um cliente HTTP
            HttpClient client = HttpClient.newHttpClient();
            // cria a requisição do tipo GET
            // newBuilder é um método usado para criar uma instância de
            // HttpRequest.Builder
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://pokeapi.co/api/v2/pokemon?limit=151%27"))
                    .build();
            // executa a requisição
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            return JsonParser.parseString((body)).getAsJsonObject().getAsJsonArray("results");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JsonObject getRandomPokemon() {
        try {
            JsonArray pokemons = fetch();
            int randomNumber = (int) (Math.random() * pokemons.size());
            return pokemons.get(randomNumber).getAsJsonObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String[] getPokemonName() {
        try {
            JsonObject response = Pokemon.getRandomPokemon();
            String pokemonName = response.get("name").getAsString();
            String secretName = "";
            for (int i = 0; i < pokemonName.length(); i += 1) {
                secretName = secretName.concat("_ ");
            }
            return new String[]{pokemonName, secretName};
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
