# Lesson 7 - Pokemon Code Academy part 3
## Last Time, we:
- Created our Pokemon
- Wrote methods to let us **choose** our starter Pokemon, and **randomly encounter** our wild ones
- Wrote the beginning of the core of our application, the setup of the Pokemon journey

This time we will continue working on the core of our game.
This lesson is particularly meaty so **it is expected that we spill over into the next lesson**.

## Finishing `move` to trigger wild Pokemon encounters
When we move around, there is a random chance that we encounter a wild Pokemon.
This logic will go at the end of our ``move(PokemonTrainer currentUser)`` method:

```java
static void move(PokemonTrainer currentUser) {
    // Ask the user which way they want to go   (done last lesson)
    // Take user input                          (done last lesson)
    // Feed back to user what they have chosen  (done last lesson)

    // Randomly decide whether to do nothing or have a wildEncounter(currentUser)
}
```

**Exercise**
Add the random chance to `wildEncounter` to the end of your `move` method.
You can test this by adding a `System.out.println` in the empty `wildEncounter` method to confirm you are reaching it.
e.g. `System.out.println("You saw a wild Pokemon and ran away");`

## So now we need to implement wild encounters
```java
static void wildEncounter(PokemonTrainer currentUser) {
    // Get a random wild pokemon and tell the user which one
    //  they have encountered

    // Give the user the choice to fight(currentUser, wildPokemon)
    //  the pokemon or run away (do nothing)
}
```

## Implementing `wildEncounter`
**Exercise**
Implement the `wildEncounter` method.
* Given a `PokemonTrainer` `trainer` as the argument.
* The `trainer` will be told they have encountered a random wild `Pokemon`
* The player must choose to `fight` or run away (do nothing)

Test this as you did `move`, adding a test `println` to the `fight` method to check.
e.g. `System.out.println("You fight the wild Pokemon and it fled");`

## Implementing `fight`
A Pokemon battle in our game will be slightly different to in the games for the sake of simplicity:
1. Select a Pokemon to battle
2. The user chooses to fight or run away
   * If fight, reduce the wild Pokemon's health by the combat power of your Pokemon
   * If run away, end the battle
3. When the wild Pokemon's health is low enough (e.g. less than 5). The user chooses the capture the Pokemon or run away

**Exercise**
Implement `fight` to the above specification, follow the comments in the source for guidance.

## And with all this done...
You have officially created a bootleg Pokemon game as intended by this course!

**Congratulations! And we really hope you enjoyed it.**

---
Next Lesson: [Final Thoughts](lesson8.md)  
[Homepage](index.md)
