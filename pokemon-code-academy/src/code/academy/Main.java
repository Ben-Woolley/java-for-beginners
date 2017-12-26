package code.academy;

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

        // print pokemons from the starter pokemon collection

        // choose a pokemon as your starter pokemon

        // print out all your owned pokemons

        //TODO
        /* ------- Step 3: going on adventures ------ */

        // print message

        // Introduce goal here

    }

    static void move(Integer choice) {
        //TODO complete and enhance method

        //read in the user input and put it in a local variable called choice

        if (choice == 1) {
            System.out.println("Going left...");
        } else if (choice == 2) {
            System.out.println("Going straight...");
        } else if (choice == 3) {
            System.out.println("Going right...");
        } else {
            System.out.println("Invalid input");
        }

        //generate a random value decide to repeat this step (no Pokemon met)
        //or call a method that makes the pokemonTrainer to meet a pokemon
    }

    static void wildPokemonEncounter(PokemonTrainer currentUser) {
        // TODO Week 8
    }

    static void fight(PokemonTrainer currentUser, Pokemon wildPokemon) {
        // TODO Week 8
    }

    /**
     * List (print out) all the owned pokemon given a pokemon trainer
     */
    static void listOwnedPokemon(PokemonTrainer currentUser) {
        // TODO Week 6
    }

    // list(print) the direction: 1. Left, 2. Straight, 3. Right
    static void listDirection() {
        //TODO WEEK 7
    }
}
