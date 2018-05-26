package lessons.lesson5;

import code.academy.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokemonTrainerLesson5 {
    private String name;
    private Integer numberOfPokeballs = 10;
    private List<Pokemon> ownedPokemon = new ArrayList<>();

    public PokemonTrainerLesson5(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfPokeballs() {
        return numberOfPokeballs;
    }

    public List<Pokemon> getOwnedPokemon() {
        return ownedPokemon;
    }

    /**
     *  Given an object of type Pokemon, reduce the numberOfPokeballs by 1 and add the
     *  pokemon to the list of ownedPokemon
     */
    void capture(Pokemon pokemon) {
        numberOfPokeballs = numberOfPokeballs - 1;
        ownedPokemon.add(pokemon);
    }

    /**
     * Given a number x of Integer type, if x is greater or equal to 0 and smaller
     * than the size of ownedPokemon, then return the Pokemon of index x on the list of owned
     * Pokemon. Otherwise, always return the first Pokemon in the list.
     */
    Pokemon choosePokemon(Integer id) {
        // TIP: List provides the method size() which can be used to get the number of items in a list.
        // TIP: For retrieving an Object from a List, use .get(index)
        // REMEMBER: Lists always start with index 0
        if (id < 0 && id > ownedPokemon.size() - 1) {
            return ownedPokemon.get(id);
        } else {
            System.out.println("Invalid choice! The first Pokemon in your party was chosen!");
            return ownedPokemon.get(0);
        }
    }

    /**
     * Given a starterPokemon of Pokemon type, add the starterPokemon to the list of ownedPokemon
     */
    void setStarterPokemon(Pokemon pokemon) {
        this.ownedPokemon.add(pokemon);
    }
}
