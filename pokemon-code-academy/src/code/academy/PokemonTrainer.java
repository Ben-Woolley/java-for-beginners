package code.academy;

import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {
    private String name;
    private Integer numberOfPokeballs = 1;
    private List<Pokemon> ownedPokemon = new ArrayList<>();

    public PokemonTrainer(String trainerName) {
        name = trainerName;
    }

    public String getName()
    {
        return name;
    }

    public Integer getNumberOfPokeballs() {
        return numberOfPokeballs;
    }

    public List<Pokemon> getOwnedPokemon()
    {
        return ownedPokemon;
    }

    /**
     *  Given an object of type Pokemon, reduce the number of balls by 1 and add the
     *  pokemon to the list of ownedPokemon
     */
    public void capture(Pokemon pokemon) {
        numberOfPokeballs = numberOfPokeballs - 1;
        ownedPokemon.add(pokemon);
        pokemon.setCaptured(true);
    }

    /**
     * Given a number x of Integer type, if x is greater or equal to 0 and smaller
     * than the size of ownedPokemon, then return the Pokemon of index x on the list of owned
     * Pokemon. Otherwise, always return the first Pokemon in the list.
     */
     public Pokemon choosePokemon(Integer id) {
        // TIP: class ArrayList provides the method size() which can be used to get the total number of items in it
        // TIP: For retrieving an Object from the List, use .get(index)
        // REMEMBER: ArrayList always starts with index 0
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
    public void setStarterPokemon(Pokemon pokemon) {
        ownedPokemon.add(pokemon);
    }

}
