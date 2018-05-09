package lessons.lesson5;

import code.academy.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class StarterPokemonLesson5 {

    /*
    private static Pokemon BULBASAUR = new Pokemon("Bulbasaur", 20, 5);
    private static Pokemon SQUIRTLE = new Pokemon("Squirtle", 16, 6);
    private static Pokemon CHARMANDER = new Pokemon("Charmander", 22, 4);
    */

    private static List<Pokemon> STARTER_POKEMON = new ArrayList<>();

    /**
     * The static block lets us do things with static variables before an object of the type has been created.
     * The STARTER_POKEMON list will have all 3 pokemon in it whenever it is used.
     */
    static {
        /*
        STARTER_POKEMON.add(BULBASAUR);
        STARTER_POKEMON.add(CHARMANDER);
        STARTER_POKEMON.add(SQUIRTLE);
        */
    }

    static List<Pokemon> get() {
        return STARTER_POKEMON;
    }

    /**
     * Given a number x of Integer type, if x is greater or equal to 0 and smaller
     * than the size of ownedPokemon, then return the Pokemon of index x on the list of owned
     * Pokemon. Otherwise, always return the first Pokemon in the list
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