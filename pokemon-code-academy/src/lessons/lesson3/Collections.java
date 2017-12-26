package lessons.lesson3;

import java.util.Arrays;
import java.util.List;

/**
 * Collections represent a bunch of things of the same type
 *   grouped together.
 * e.g. List, Set, Map, Queue, Stack, Deck
 *
 * We will focus on List, which maintains order of elements.
 */
public class Collections {

    private static final List<String> POKEMON_NAMES =
            Arrays.asList(
                    "Charmander",
                    "Bulbasaur",
                    "Squirtle"
            );

    public static void main(String[] args) {
        /*
          List maintains order of what is passed into it
            we can prove this with a for loop.

          This is a for each loop, which executes the block
            on each element - the value of 'String pokemon'
            changing on each run.
         */
        for (String pokemon: POKEMON_NAMES) {
            System.out.println(pokemon);
        }

        /*
          This can also be done with a for loop with an index.
          This lets you play with the index i, we defined it to
            increment after each go to affect every pokemon; we
            could make it touch every other by doing i = i + 2.

          Each block explained:
            'Integer i = 0' - setting up the variable to increment.
                               This is only accessible inside the loop.
            'i < POKEMON_NAMES.size()' - the condition to be met
                                           for the loop to end
            'i++' - the incrementer, how the variable
                        changes after each run.

          As you can see there is plenty that can go wrong.
         */
        for (Integer i = 0; i < POKEMON_NAMES.size(); i++) {
            System.out.println(POKEMON_NAMES.get(i));
        }
    }
}
