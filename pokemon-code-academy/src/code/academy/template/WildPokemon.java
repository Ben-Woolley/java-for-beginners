package code.academy.template;

import code.academy.Pokemon;

class WildPokemon
{

    static final String PIDGEY = "Brainy Pokemon";
    static final String CATERPIE = "Vanity Pokemon";
    static final String MAGICARP = "Clumsy Pokemon";
    static final String DITTO = "Grouchy Pokemon";
    static final String SNORLAX = "Hefty Pokemon";

    static Pokemon pidgey = new Pokemon(PIDGEY, 30, 12);
    static Pokemon caterpie = new Pokemon(CATERPIE, 50, 30);
    static Pokemon magicarp = new Pokemon(MAGICARP, 27, 8);
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
