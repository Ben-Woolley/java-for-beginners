# Lesson 7 - Pokemon Code Academy part 3
## Last Time, we:
- Created our Pokemon
- Wrote methods to let us **choose** our starter Pokemon, and **randomly encounter** our wild ones.
- Wrote the beginning of the core of our application, the setup of the Pokemon journey

This time we will continue working on the core of our game.
This lesson is particularly meaty so **it is expected that we spill over into the next lesson**.

## Wild Pokemon Encounters
When we move around, there is a random chance that we encounter a wild Pokemon.
This logic will go at the end of our ``move(PokemonTrainer currentUser)`` method:

```java
static void move(PokemonTrainer currentUser) {
    listDirection();

    // Take user input  (done last lesson)
    // Feed back to user what they have chosen (done last lesson)

    // Randomly decide whether to do nothing or have a wildEncounter(currentUser)
}
```

**Exercise** Add the random chance to `wildEncounter` to the end of your `move` method.
You can test this by adding a `System.out.println` in the empty `wildEncounter` method to confirm you are reaching it.

## So now we need to implement wild encounters
```java
static void wildEncounter(PokemonTrainer currentUser) {
    // Get a random wild pokemon and tell the user which one
    //  they have encountered

    // Give the user the choice to fight(currentUser, wildPokemon)
    //  the pokemon or run away (do nothing)
}
```

**Exercise** Implement the `wildEncounter` method.
Test this as you did `move`, adding a test `println` to the `fight` method to check.

## And finally we need to be able to ``fight()``
A Pokemon battle in our game will be slightly different to in the games for the sake of simplicity:
1. Select a Pokemon to battle
2. The user chooses to fight or run away
   * If fight, reduce the wild Pokemon's health by the combat power of your Pokemon
   * If run away, end the battle
3. When the wild Pokemon's health is low enough (e.g. less than 5). The user chooses the capture the Pokemon or run away

## And with all this done...
You have officially created a bootleg Pokemon game as intended by this course!

**Congratulations! And we really hope you enjoyed it.**

---
Next Lesson: [Final Thoughts](lesson8.md)  
[Homepage](index.md)
