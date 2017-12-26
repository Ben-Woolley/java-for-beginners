package code.academy;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("What is your name, Pokémon trainer?");

        PokemonTrainer currentUser = new PokemonTrainer(UserInputUtil.readString());

        System.out.println("Hello, " + currentUser.getName() +
                ". Please select a Pokémon from the list below as your starter Pokemon:");

        final List<Pokemon> startPokemons = StarterPokemon.get();

        for (Pokemon pokemon : startPokemons) {
            System.out.println(startPokemons.indexOf(pokemon) + ". " + pokemon);
        }

        Pokemon starterPokemon = StarterPokemon.choosePokemon(UserInputUtil.readInt());

        currentUser.setStarterPokemon(starterPokemon);

        listOwnedPokemon(currentUser);

        System.out.println("You are about to go on the Pokémon hunting trip.");

        while(currentUser.getNumberOfPokeballs() > 0 && !currentUser.hasCaughtThemAll()) {
            move(currentUser);
        }

        if (currentUser.getNumberOfPokeballs() == 0) {
            System.out.println("You've run out of Pokéballs. Exiting the game... See ya!");
        }
    }

    /**
     * The trainer explores to find pokemon.
     * They:
     *   1. choose a direction to go
     *   2. "move" there, randomly deciding if there is a
     *        wildPokemonEncounter(trainer)
     */
    static void move(PokemonTrainer currentUser) {

        listDirection();

        int choice = UserInputUtil.readInt();

        if (choice == 1) {
            System.out.println("Going left...");
        } else if (choice == 2) {
            System.out.println("Going forward...");
        } else if (choice == 3) {
            System.out.println("Going right...");
        } else {
            System.out.println("Invalid input");
        }

        if (Math.random() <= 0.5) {
            System.out.println("Nothing here.");
            move(currentUser);
        } else {
            wildEncounter(currentUser);
        }

    }

    /**
     * The trainer encounters a wild Pokemon randomly.
     * They must choose to run away, ending the encounter.
     *   Or fight(trainer, wildPokemon)
     */
    static void wildEncounter(PokemonTrainer currentUser) {
        Pokemon wildPokemon = WildPokemon.encounter();
        System.out.println("A wild " + wildPokemon + " has appeared:");
        System.out.println("1. Fight 2. Run away");
        if (UserInputUtil.readInt() == 1) {
            fight(currentUser, wildPokemon);
        }
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
    static void fight(PokemonTrainer currentUser, Pokemon wildPokemon) {
        System.out.println("You have chosen to fight.");
        System.out.println("Choose a Pokémon to fight:");
        final List<Pokemon> ownedPokemon = currentUser.getOwnedPokemon();
        for (Pokemon pokemon : ownedPokemon) {
            System.out.println(ownedPokemon.indexOf(pokemon) +".  " + pokemon);
        }
        Pokemon chosenPokemon = currentUser.choosePokemon(UserInputUtil.readInt());
        System.out.println(chosenPokemon + " vs. " + wildPokemon);

        boolean runAway = false;
        while(wildPokemon.getHealthPoints() > 10) {
            System.out.println("1. Attack 2. Run away");
            if (UserInputUtil.readInt() == 1) {
                wildPokemon.reduceHealth(chosenPokemon.getCombatPower());
                System.out.println(chosenPokemon + " vs. " + wildPokemon);
            } else {
                runAway = true;
                break;
            }
        }
        if (!runAway) {
            System.out.println("1. Capture 2. Run away");
            if (UserInputUtil.readInt() == 1)
            {
                currentUser.capture(wildPokemon);
                System.out.println("You threw a ball at it, the " + wildPokemon + " is captured!");
                listOwnedPokemon(currentUser);
                System.out.println("You have " + currentUser.getNumberOfPokeballs() + " Pokéballs left.");
            }
        }

    }

    /**
     * List (print out) all the owned pokemon given a PokemonTrainer
     */
    static void listOwnedPokemon(PokemonTrainer currentUser) {
        System.out.println("Congratulations, now you have:");
        for (Pokemon pokemon : currentUser.ownedPokemon) {
            System.out.println(pokemon);
        }
    }

    /**
     * Guidance for choosing the direction to do into from Integer
     * e.g. "Choose where to go!"
     *      "1. Left 2. Straight 3. Right"
     */
    // list(print) the direction: 1. Left, 2. Straight, 3. Right
    static void listDirection() {
        System.out.println("Choose your direction:");
        System.out.println("1. Left 2. Straight 3. Right");
    }
}
