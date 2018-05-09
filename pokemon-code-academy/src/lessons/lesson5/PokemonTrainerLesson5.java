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
     *  Given an object of type Pokemon, reduce the number of balls by 1 and add the
     *  pokemon to the list of ownedPokemon
     */
    void capture(Pokemon pokemon) {
        numberOfPokeballs--; // the same as numberOfPokeballs = numberOfPokeballs - 1
        this.ownedPokemon.add(pokemon);

        // note there is no return because this method is void
    }

    /**
     * Given a number x of Integer type, if x is greater or equal to 0 and smaller
     * than the size of ownedPokemon, then return the Pokemon of index x on the list of owned
     * Pokemon. Otherwise, always return the first Pokemon in the list.
     */
    Pokemon choosePokemon(Integer id) {
        // if the id is greater than or equal to zero, and the id is lower than the number of owned pokemon
        if (id >= 0 && id < ownedPokemon.size()) {
            return ownedPokemon.get(id);
        } else {
            System.out.println("Invalid ID. The first Pokemon will be chosen!");
            return ownedPokemon.get(0);
        }
    }

    /**
     * Given a starterPokemon of Pokemon type, add the starterPokemon to the list of ownedPokemon
     */
    void setStarterPokemon(Pokemon pokemon) {
        ownedPokemon.add(pokemon);
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
