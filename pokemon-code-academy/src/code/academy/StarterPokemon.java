package code.academy;

import java.util.ArrayList;
import java.util.List;

class StarterPokemon
{

    static Pokemon bulbasaur = new Pokemon("Bulbasaur", 20, 8);
    static Pokemon charmander = new Pokemon("Charmander", 25, 5);
    static Pokemon squirtle = new Pokemon("Squirtle", 23, 7);

    static List<Pokemon> starterPokemonCollection;

    static List<Pokemon> get() {
        starterPokemonCollection = new ArrayList<>();
        starterPokemonCollection.add(bulbasaur);
        starterPokemonCollection.add(charmander);
        starterPokemonCollection.add(squirtle);
        return starterPokemonCollection;
    }

    /**
     * Given a number x of int type, if x is greater or equal to 0 and smaller
     * than the size of ownedPokemon, then return the Pokémon of index x on the list of owned
     * Pokémon. Otherwise, always return the first Pokémon in the list
     * @param id
     * @return
     */
    static Pokemon choosePokemon(Integer id) {
        if (id >= 0 && id < starterPokemonCollection.size()) {
            return starterPokemonCollection.get(id);
        } else {
            System.out.println("Invalid ID. The first Pokémon will be chosen!");
            return starterPokemonCollection.get(0);
        }
    }
}
