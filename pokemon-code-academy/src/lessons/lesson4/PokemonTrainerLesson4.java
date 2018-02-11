package lessons.lesson4;

import code.academy.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokemonTrainerLesson4 {
    private String name;
    private Integer numberOfPokeballs = 10;
    private List<Pokemon> ownedPokemon = new ArrayList<>();

    public PokemonTrainerLesson4(String name) {
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
     *  Given an object of type Pokemon, reduce the number of balls by 1 and add the
     *  pokemon to the list of ownedPokemon
     */
    void capture(Pokemon pokemon) {
    }

    /**
     * Given a number x of Integer type, if x is greater or equal to 0 and smaller
     * than the size of ownedPokemon, then return the Pokemon of index x on the list of owned
     * Pokemon. Otherwise, always return the first Pokemon in the list.
     * @param id
     * @return an instance of Pokemon
     */
    Pokemon choosePokemon(Integer id) {
        // TIP: class ArrayList provides the method size() which can be used to get the total number of items in it
        // TIP: For retrieving an Object from the List, use .get(index)
        // REMEMBER: ArrayList always starts with index 0
        return null;
    }

    /**
     * Given a starterPokemon of Pokemon type, add the starterPokemon to the list of ownedPokemon
     * @param pokemon
     */
    void setStarterPokemon(Pokemon pokemon) {
    }


    /**
     * Flag whether one WildPokemon of each kind has been captured.
     *
     * @return true or false
     */
    Boolean hasCaughtThemAll() {
        // TODO Week 8
        return true;
    }
}
