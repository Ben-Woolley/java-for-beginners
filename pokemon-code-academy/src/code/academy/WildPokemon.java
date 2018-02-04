package code.academy;

class WildPokemon
{

    private static final String PIDGEY = "Pidgey";
    private static final String CATERPIE = "Caterpie";
    private static final String MAGIKARP = "Magikarp";
    private static final String DITTO = "Ditto";
    private static final String SNORLAX = "Snorlax";

    public static Pokemon PIDGEY_PKMN = new Pokemon(PIDGEY, 30, 12);
    public static Pokemon CATERPIE_PKMN = new Pokemon(CATERPIE, 50, 30);
    public static Pokemon MAGIKARP_PKMN = new Pokemon(MAGIKARP, 27, 8);
    public static Pokemon DITTO_PKMN = new Pokemon(DITTO, 25, 10);
    public static Pokemon SNORLAX_PKMN = new Pokemon(SNORLAX, 15, 5);

    /**
     * Given a random number
     *
     * @return a wild pokemon among those available (not already captured)
     */
    public static Pokemon encounter() {

        boolean foundAnAvailablePokemon = false;
        Pokemon chosenPokemon = PIDGEY_PKMN; // just a default
        while(!foundAnAvailablePokemon)
        {
            double randomNumber = RandomUtil.randomDouble();
            if (0 <= randomNumber && randomNumber < 0.1) {
                chosenPokemon = PIDGEY_PKMN;
            } else if (0.1 <= randomNumber && randomNumber < 0.25) {
                chosenPokemon = CATERPIE_PKMN;
            } else if (0.25 <= randomNumber && randomNumber < 0.45) {
                chosenPokemon = MAGIKARP_PKMN;
            } else if (0.45 <= randomNumber && randomNumber < 0.75) {
                chosenPokemon = DITTO_PKMN;
            } else {
                chosenPokemon = SNORLAX_PKMN;
            }
            if (!chosenPokemon.isCaptured()) {
                foundAnAvailablePokemon = true;
            }
        }
        return chosenPokemon;
    }
}
