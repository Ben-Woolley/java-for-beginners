package code.academy;

import java.util.ArrayList;

public class PokemonTrainer
{
    String name;
    int numberOfPokeballs = 1;
    ArrayList<Pokemon> ownedPokemon = new ArrayList<>();

    public PokemonTrainer(String trainerName) {
        name = trainerName;
    }

    public String getName()
    {
        return name;
    }

    public int getNumberOfPokeballs()
    {
        return numberOfPokeballs;
    }

    public ArrayList<Pokemon> getOwnedPokemon()
    {
        return ownedPokemon;
    }

    /**
     *  Given an object of type Pokemon, reduce the number of balls by 1 and add the
     *  pokemon to the list of ownedPokemon
     */
    void capture(Pokemon pokemon) {
        numberOfPokeballs = numberOfPokeballs - 1;
        ownedPokemon.add(pokemon);
        pokemon.setCaptured(true);
    }

    /**
     * Given a number x of int type, if x is greater or equal to 0 and smaller
     * than the size of ownedPokemon, then return the Pokemon of index x on the list of owned
     * Pokemon. Otherwise, always return the first Pokemon in the list.
     * @param id
     * @return an instance of Pokemon
     */
    Pokemon choosePokemon(int id) {
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
     * @param pokemon
     */
    void setStarterPokemon(Pokemon pokemon) {
        ownedPokemon.add(pokemon);
    }


    /**
     * Flag whether one WildPokemon of each kind has been captured.
     *
     * @return true or false
     */
    boolean hasCaughtThemAll() {

        boolean result = ownedPokemon.contains(WildPokemon.pidgey) &&
                ownedPokemon.contains(WildPokemon.caterpie) &&
                ownedPokemon.contains(WildPokemon.magicarp) &&
                ownedPokemon.contains(WildPokemon.ditto) &&
                ownedPokemon.contains(WildPokemon.snorlax);
        if (result)
        {
            System.out.println("Congratulations, you've caught 'em all!");
        }

        return result;
    }

}
