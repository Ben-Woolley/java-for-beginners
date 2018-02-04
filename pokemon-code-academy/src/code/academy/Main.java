package code.academy;

import java.util.List;

public class Main {

    private static final List<Pokemon> STARTER_POKEMON = StarterPokemon.STARTER_POKEMON;

    public static void main(String[] args) {
        System.out.println("Hello, and welcome to the world of Pokemon!");
        System.out.println("My name is Professor Oak. What was your name again?");

        PokemonTrainer trainer = new PokemonTrainer(UserInputUtil.readString());

        System.out.println("Ah yes, now I remember, " + trainer.getName() + "!");
        System.out.println("I'll give you one Pokemon to start your adventure, which do you want?\n");

        for (Pokemon pokemon : STARTER_POKEMON) {
            System.out.println(STARTER_POKEMON.indexOf(pokemon) + ". " + pokemon);
        }

        trainer.setStarterPokemon(StarterPokemon.choosePokemon(UserInputUtil.readInteger()));

        System.out.println(trainer.getOwnedPokemon().get(0).getName() + ", an excellent choice!");
        listOwnedPokemon(trainer);

        System.out.println("You are about to start your Pokemon adventure!");

        while(trainer.getNumberOfPokeballs() > 0 && !trainer.hasCaughtThemAll()) {
            move(trainer);
        }

        if (trainer.getNumberOfPokeballs() == 0) {
            System.out.println("You've run out of Pokéballs. I hope you enjoyed!");
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

        int choice = UserInputUtil.readInteger();

        if (choice == 1) {
            System.out.println("Going left...");
        } else if (choice == 2) {
            System.out.println("Going forward...");
        } else if (choice == 3) {
            System.out.println("Going right...");
        } else {
            System.out.println("Invalid input");
        }

        if (RandomUtil.randomDouble() <= 0.5) {
            System.out.println("Nothing here.");
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
        if (UserInputUtil.readInteger() == 1) {
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
        Pokemon chosenPokemon = currentUser.choosePokemon(UserInputUtil.readInteger());
        System.out.println(chosenPokemon + " vs. " + wildPokemon);

        boolean runAway = false;
        while(wildPokemon.getHealthPoints() > 10) {
            System.out.println("1. Attack 2. Run away");
            if (UserInputUtil.readInteger() == 1) {
                wildPokemon.reduceHealth(chosenPokemon.getCombatPower());
                System.out.println(chosenPokemon + " vs. " + wildPokemon);
            } else {
                runAway = true;
                break;
            }
        }
        if (!runAway) {
            System.out.println("1. Capture 2. Run away");
            if (UserInputUtil.readInteger() == 1)
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
        for (Pokemon pokemon : currentUser.getOwnedPokemon()) {
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
