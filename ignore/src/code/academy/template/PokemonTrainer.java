package code.academy.template;

public class PokemonTrainer
{
    //TODO WEEK 5
    // name
    // numberOfPokeballs - start with 10
    // list of ownedPokemon

    // constructor that takes the trainer's name - trainerName

    // getters for all the attributes of the trainer

    /**
     *  Given an object of type Pokemon, reduce the number of balls by 1 and add the
     *  pokemon to the list of ownedPokemon
     */
    void capture(Pokemon pokemon) {
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
    boolean hasCaughtThemAll() {
        // TODO Week 8
        return true;
    }
}
