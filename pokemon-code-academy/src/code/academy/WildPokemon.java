package code.academy;

class WildPokemon
{

    static final String PIDGEY = "Pidgey";
    static final String CATERPIE = "Caterpie";
    static final String MAGICARP = "Magicarp";
    static final String DITTO = "Ditto";
    static final String SNORLAX = "Snorlax";

    static Pokemon pidgey = new Pokemon(PIDGEY, 30, 12);
    static Pokemon caterpie = new Pokemon(CATERPIE, 50, 30);
    static Pokemon magicarp = new Pokemon(MAGICARP, 27, 8);
    static Pokemon ditto = new Pokemon(DITTO, 25, 10);
    static Pokemon snorlax = new Pokemon(SNORLAX, 15, 5);

    /**
     * Given a random number
     *
     * @return a wild pokemon among those available
     */
    static Pokemon encounter() {

        boolean foundAnAvailablePokemon = false;
        Pokemon chosenPokemon = pidgey; // just a default
        while(!foundAnAvailablePokemon)
        {
            double randomNumber = Math.random();
            if (0 <= randomNumber && randomNumber < 0.1)
            {
                chosenPokemon = pidgey;
            }
            else if (0.1 <= randomNumber && randomNumber < 0.25)
            {
                chosenPokemon = caterpie;
            }
            else if (0.25 <= randomNumber && randomNumber < 0.45)
            {
                chosenPokemon = magicarp;
            }
            else if (0.45 <= randomNumber && randomNumber < 0.75)
            {
                chosenPokemon = ditto;
            }
            else
            {
                chosenPokemon = snorlax;
            }
            if (!chosenPokemon.isCaptured) {
                foundAnAvailablePokemon = true;
            }
        }
        return chosenPokemon;
    }
}
