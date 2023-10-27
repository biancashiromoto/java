package utils;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Pokemon {
    public static String fetch() {
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
            return body;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
