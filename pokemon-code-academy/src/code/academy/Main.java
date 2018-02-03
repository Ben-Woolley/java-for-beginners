package code.academy;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //TODO WEEK 6
        /* ------- Step 1: take name input and create a PokemonTrainer with the name ------ */

        // print greeting message

        // create PokemonTrainer object

        //TODO WEEK 6
        /* ------- Step 2: choose a pokemon as your starter pokemon ------ */

        // print message

        // provide starter pokemon collection

        // print pokemon from the starter pokemon collection

        // choose a pokemon as your starter pokemon

        // print out all your owned pokemon
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        //TODO
        /* ------- Step 3: going on adventures ------ */

        // print message

        // Introduce goal here

        // Continue exploring while the trainer has not caught
        //   them all, or can still catch pokemon

        // Congratulate / console player if they win or lose

    }

    /**
     * The trainer explores to find pokemon.
     * They:
     *   1. choose a direction to go
     *   2. "move" there, randomly deciding if there is a
     *        wildPokemonEncounter(trainer)
     * @param trainer
     */
    static void move(PokemonTrainer trainer) {
        //TODO complete and enhance method

        //read in the user input and put it in a local variable called choice
        int choice = -1;

        // Tell user which way they are going

        //generate a random value decide to repeat this step (no Pokemon met)
        //or call a method that makes the pokemonTrainer to meet a pokemon
    }

    /**
     * The trainer encounters a wild Pokemon randomly.
     * They must choose to run away, ending the encounter.
     *   Or fight(trainer, wildPokemon)
     * @param trainer
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

    /**
     * Guidance for choosing the direction to do into from Integer
     * e.g. "Choose where to go!"
     *      "1. Left 2. Straight 3. Right"
     */
    // list(print) the direction: 1. Left, 2. Straight, 3. Right
    static void listDirection() {
        //TODO WEEK 7
    }
}
