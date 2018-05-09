package lessons.lesson6;

import code.academy.Pokemon;
import code.academy.RandomUtil;

class WildPokemonLesson6
{

    static final String PIDGEY = "Pidgey";
    static final String CATERPIE = "Caterpie";
    static final String MAGIKARP = "Magikarp";
    static final String DITTO = "Ditto";
    static final String SNORLAX = "Snorlax";

    /*
    public static Pokemon PIDGEY_PKMN = new Pokemon(PIDGEY, 30, 12);
    public static Pokemon CATERPIE_PKMN = new Pokemon(CATERPIE, 50, 30);
    public static Pokemon MAGIKARP_PKMN = new Pokemon(MAGIKARP, 27, 8);
    public static Pokemon DITTO_PKMN = new Pokemon(DITTO, 25, 10);
    public static Pokemon SNORLAX_PKMN = new Pokemon(SNORLAX, 15, 5);
    */

    /**
     * Given a random number
     *
     * @return a wild Pokémon among those available
     */
    static Pokemon encounter() {
        Double randomNum = RandomUtil.randomDouble();
        Pokemon chosenPokemon = null;
        /*
        if (0 <= randomNum && randomNum < 0.1) {
            chosenPokemon = PIDGEY_PKMN;
        } else if (0.1 <= randomNum && randomNum < 0.25) {
            chosenPokemon = CATERPIE_PKMN;
        } else if (0.25 <= randomNum && randomNum < 0.45) {
            chosenPokemon = MAGIKARP_PKMN;
        } else if (0.45 <= randomNum && randomNum < 0.75) {
            chosenPokemon = DITTO_PKMN;
        } else {
            chosenPokemon = SNORLAX_PKMN;
        }
        */
        return chosenPokemon;
    }
}
