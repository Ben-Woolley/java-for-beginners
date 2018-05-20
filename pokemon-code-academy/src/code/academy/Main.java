package code.academy;

public class Main {

    public static void main(String[] args) {
        //TODO Week 6
        /* ------- Step 1: take name input and create a PokemonTrainer with the name ------ */

        // print introduction to the game

        // ask for and take the user's name

        // create a PokemonTrainer using the inputted name

        /* ------- Step 2: choose your starter Pokemon ------ */

        // print message asking the player to choose their Pokemon

        // print out the player's choices

        // have the user select their Pokemon, and add the selected Pokemon to the PokemonTrainer object you created

        // print a message confirming the player's choice

        //TODO Week 7+
        /* ------- Step 3: beginning the core of the game ------ */

        // now the trainer is set up, we can begin the adventure

        // Introduce the goal of the game - to catch all Pokemon

        // Start the main game loop - move()ing until you wildPokemonEncounter() a wild Pokemon
        // End the loop when you catch them all or run out of Pokeballs

        // End the game with some congratulatory or otherwise message

    }

    /**
     * The trainer explores to find pokemon.
     * They:
     *   1. choose a direction to go
     *   2. "move" there, randomly deciding if there is a
     *        wildPokemonEncounter(trainer)
     */
    static void move(PokemonTrainer trainer) {
        //TODO complete and enhance method

        //read in the user input and put it in a local variable called choice
        int choice = -1;

        // Tell user which way they are going

        //generate a random value decide if we have a wildPokemonEncounter()
    }

    /**
     * The trainer encounters a wild Pokemon randomly.
     * They must choose to run away, ending the encounter.
     *   Or fight(trainer, wildPokemon)
     */
    static void wildPokemonEncounter(PokemonTrainer trainer) {
        // TODO Week 8
    }

    /**
     * A fight between a Pokemon trainer and a wild Pokemon.
     *
     * 1. Trainer selects a pokemon
     * 2. The fight begins: while the wildPokemon cannot be caught
     *      (i.e. its health is too high):
     *   a. Ask the trainer to attack or run away
     *     i. If attack, your pokemon attacks it
     *     ii. If run away, the battle ends
     *   b. Once the wild Pokemon can be caught:
     *     i. Ask the trainer to capture or run away
     *       i. If capture, add the wild Pokemon to your owned Pokemon
     *       i. If run away, the battle ends
     */
    static void fight(PokemonTrainer trainer, Pokemon wildPokemon) {
        // TODO Week 8
    }

    /**
     * List (print out) all the owned pokemon given a PokemonTrainer
     */
    static void listOwnedPokemon(PokemonTrainer trainer) {
        // TODO Week 6
    }

}
