package code.academy;

import java.util.List;

public enum PokemonType {
//    CHARMANDER("Charmander", 18, 5, true),
//    SQUIRTLE("Squirtle", 22, 4, true),
//    BULBASAUR("Bulbasaur", 15, 7, true),
//    PIDGEY("Pidgey", 30, 12, false),
//    CATERPIE("Caterpie", 50, 30, false),
//    MAGIKARP("Magikarp", 27, 8, false),
//    DITTO("Ditto", 25, 10, false),
//    SNORLAX("Snorlax", 15, 5, false);
    ; // Get rid of this semi-colon when you uncomment the above

    /**
     * Prints out information about the Pokemon in a nice way
     */
    public String toString() {
        throw new IllegalStateException("Not implemented toString yet!");
    }

    /**
     * Return the list of PokemonType that only contains starter pokemon.
     */
    public static List<PokemonType> getStarterPokemonTypes() {
        throw new IllegalStateException("Not implemented getStarterPokemonTypes yet!");
    }

    /**
     * Return the list of PokemonType that only contains wild pokemon.
     */
    public static List<PokemonType> getWildPokemonTypes() {
        throw new IllegalStateException("Not implemented getWildPokemonTypes yet!");
    }

    /**
     * Given a Pokemon type, create an instance (use the Pokemon blueprint to create) of Pokemon.
     * @param pokemonType the pokemon type to create one of.
     * @return a pokemon of the pokemonType type.
     */
    public static Pokemon createPokemon(PokemonType pokemonType) {
        throw new IllegalStateException("You haven't written createPokemon yet!");
    }
}