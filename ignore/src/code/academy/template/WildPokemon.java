package code.academy.template;

import code.academy.Pokemon;

class WildPokemon
{

    static final String PIDGEY = "Pidgey";
    static final String CATERPIE = "Caterpie";
    static final String MAGIKARP = "Magikarp";
    static final String DITTO = "Ditto";
    static final String SNORLAX = "Snorlax";

    static Pokemon pidgey = new Pokemon(PIDGEY, 30, 12);
    static Pokemon caterpie = new Pokemon(CATERPIE, 50, 30);
    static Pokemon magikarp = new Pokemon(MAGIKARP, 27, 8);
    static Pokemon ditto = new Pokemon(DITTO, 25, 10);
    static Pokemon snorlax = new Pokemon(SNORLAX, 15, 5);

    /**
     * Given a random number
     *
     * @return a wild Pokémon among those available
     */
    static Pokemon encounter() {
        //TODO WEEK 6
        return null;
    }
}
