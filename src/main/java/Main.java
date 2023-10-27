import utils.Pokemon;

public class Main {

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        String response = pokemon.fetch();
        System.out.println(response);
    }
}
