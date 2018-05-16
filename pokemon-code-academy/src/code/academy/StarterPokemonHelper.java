package code.academy;

import java.util.List;

public class StarterPokemonHelper {

    public static final List<PokemonType> STARTER_POKEMON = PokemonType.getStarterPokemonTypes();

    /**
     * Given a number x of Integer type, if x is greater or equal to 0 and smaller
     * than the size of ownedPokemon, then return the Pokémon of index x on the list of owned
     * Pokémon. Otherwise, always return the first Pokémon in the list
     */
    static Pokemon choosePokemon(Integer id) {
        if (id >= 0 && id < STARTER_POKEMON.size()) {
            return createPokemon(STARTER_POKEMON.get(id));
        } else {
            System.out.println("Invalid ID. The first Pokémon will be chosen!");
            return createPokemon(STARTER_POKEMON.get(0));
        }
    }

    /**
     * Given a Pokemon type, create an instance (use the Pokemon blueprint to create) of Pokemon.
     * @param pokemonType the pokemon type to create one of.
     * @return a pokemon of the pokemonType type.
     */
    private static Pokemon createPokemon(PokemonType pokemonType) {
        return new Pokemon(pokemonType.getName(), pokemonType.getHealthPoints(), pokemonType.getCombatPower());
    }
}
