package code.academy;

import java.util.Arrays;
import java.util.List;

class StarterPokemon
{

    private static Pokemon BULBASAUR = new Pokemon("Bulbasaur", 20, 8);
    private static Pokemon CHARMANDER = new Pokemon("Charmander", 25, 5);
    private static Pokemon SQUIRTLE = new Pokemon("Squirtle", 23, 7);

    public static final List<Pokemon> STARTER_POKEMON = Arrays.asList(
            BULBASAUR,
            CHARMANDER,
            SQUIRTLE
    );

    /**
     * Given a number x of int type, if x is greater or equal to 0 and smaller
     * than the size of ownedPokemon, then return the Pokémon of index x on the list of owned
     * Pokémon. Otherwise, always return the first Pokémon in the list
     */
    static Pokemon choosePokemon(Integer id) {
        if (id >= 0 && id < STARTER_POKEMON.size()) {
            return STARTER_POKEMON.get(id);
        } else {
            System.out.println("Invalid ID. The first Pokémon will be chosen!");
            return STARTER_POKEMON.get(0);
        }
    }
}
