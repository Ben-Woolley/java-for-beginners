# Lesson 6 - Pokémon Code Academy part 2

## Last time we finished our:
* `PokemonTrainer`
* `PokemonType`

These classes, alongside `Pokemon` are ready to go for the game!
Before we get to the main logic, we need some helper classes to handle how we handle starter and non-starter Pokemon.

## Creating `Pokemon` from `PokemonType`
One last thing before we get to logic, we need to create a method that returns a `Pokemon` based on the passed in `PokemonType`.
**Exercise**
Implement `createPokemonFromType` method which:
* Takes an argument of type `PokemonType`
* Returns a `Pokemon` instance based off of that `PokemonType`

This can live in the `PokemonType` class so it can be shared with `StarterPokemonHelper` and `WildPokemonHelper`.

## Handling starter Pokemon
Thanks to our previous work this should be fairly straightforward.
We just need to retrieve the `n`th `PokemonType` defined as a starter Pokemon from `PokemonType.getStarterPokemonTypes`, and then use our `PokemonType.createPokemonFromType` method to get a new `Pokemon` of that type.

**Exercise**
Implement the `choosePokemon` method:
* Given an `Integer id`, get a `Pokemon` of the `PokemonType` corresponding to this index in the list of starter Pokemon.
* If an invalid `id` is selected, then warn the user an return the first starter `Pokemon`.

## How do we handle wild Pokémon?
We want to randomly encounter one of our wild Pokémon. This includes any Pokemon the trainer may have caught already.

We have provided `RandomUtil.java` to do this for you. This class uses `java.util.concurrent.ThreadLocalRandom` which was added in Java 1.7 and is now [the preferred way to get random numbers](https://stackoverflow.com/a/363692).

We have provided both `randomInteger` for equal probability of each wild Pokemon, and `randomDouble` for more interesting uses that you may want to explore later.

**Exercise**
Implement the `encounter` method in `WildPokemon`:
* Return a `Pokemon` from the list of non-starter `PokemonTypes`, chosen at random with equal probability.

---

## We can now work on the core of our Pokemon game
Today we will be working on `Main`, creating the introduction and setup for our journey to becoming a Pokemon master!.

The outline of what we're doing is outlined in the file itself:
* Greet the user and take their name as an input.
* Set up the story and let the user choose their Pokemon.
* Highlight the user's choice by printing a list of their Pokemon.

**Exercise**
Open `Main` and implement the above parts of the `main` method.
We have given you `UserInputUtil`, which lets you take user input from the command line.

---

# Homework
The trainer doesn't know how to move yet, let's sort that.

Partially implement the `move` method in the `Main` class.
**(Do not do the part detailed in the last comment in the method)**

Test your method by calling it in the `main` method using a dummy `PokemonTrainer`.
```java
PokemonTrainer testTrainer = new PokemonTrainer("Greg");
move(testTrainer);
```

---
Next Lesson: [Pokémon Code Academy part 3](lesson7.md)  
[Homepage](index.md)
