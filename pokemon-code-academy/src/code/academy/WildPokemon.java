package code.academy;

import java.util.List;

public class WildPokemon {

    public static final List<PokemonType> WILD_POKEMON = PokemonType.getWildPokemonTypes();

    /**
     * Given a random number
     *
     * @return a wild pokemon among those available
     */
    public static Pokemon encounter() {
        Integer randomNumber = RandomUtil.randomInteger(0, WILD_POKEMON.size() - 1);

        return createPokemon(WILD_POKEMON.get(randomNumber));
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
