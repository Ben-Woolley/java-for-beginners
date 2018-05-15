package code.academy;

import static code.academy.PokemonType.*;

public class WildPokemon {

    /**
     * Given a random number
     *
     * @return a wild pokemon among those available
     */
    public static Pokemon encounter() {

        PokemonType chosenPokemon; // just a default

        Double randomNumber = RandomUtil.randomDouble();
        if (0 <= randomNumber && randomNumber < 0.1) {
            chosenPokemon = PIDGEY;
        } else if (0.1 <= randomNumber && randomNumber < 0.25) {
            chosenPokemon = CATERPIE;
        } else if (0.25 <= randomNumber && randomNumber < 0.45) {
            chosenPokemon = MAGIKARP;
        } else if (0.45 <= randomNumber && randomNumber < 0.75) {
            chosenPokemon = DITTO;
        } else {
            chosenPokemon = SNORLAX;
        }

        return createPokemon(chosenPokemon);
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
