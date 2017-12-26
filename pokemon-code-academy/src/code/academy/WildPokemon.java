package code.academy;

class WildPokemon
{

    static final String PIDGEY = "Pidgey";
    static final String CATERPIE = "Caterpie";
    static final String MAGIKARP = "Magikarp";
    static final String DITTO = "Ditto";
    static final String SNORLAX = "Snorlax";

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
                chosenPokemon = magikarp;
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
