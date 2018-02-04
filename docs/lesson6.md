# Lesson 6 - Pokémon Code Academy part 2

## Last time we created our:
* Trainer
* Starter Pokémon
* Wild Pokémon

These java classes are almost ready to be used in our actual Pokémon game!

## Let's choose our Pokémon!
**Exercise** Implement the `choosePokemon` method. The method takes in an `Integer id` which is the position of the Pokemon we want in the list.
```java
class StarterPokemon
{
    //Our List of Pokémon from last Lesson

    ...

    /**
     * Given a number x of Integer type, if x is greater or equal to 0 and smaller
     * than the size of ownedPokemon, then return the Pokémon of index x on the list of owned
     * Pokémon. Otherwise, always return the first Pokémon in the list
     */
    static Pokemon choosePokemon(Integer id) {
        // You do this bit
    }
}
```

## How do we handle wild Pokémon?
We want to randomly encounter one of our wild Pokémon.

We have provided `RandomUtil.java` to do this for you. This class uses `java.util.concurrent.ThreadLocalRandom` which was added in Java 1.7 and is now [the preferred way to get random numbers](https://stackoverflow.com/a/363692).

``ThreadLocalRandom`` provides convenient methods to get random numbers and booleans, including within specified ranges.
We have provided both `randomInteger` for equal probability of each wild Pokemon, and `randomDouble` for weighted probability of wild Pokemon appearing. It's up to you which you'd like to use.
(You can check if the returned value is between different boundaries to choose which to encounter)

**Exercise** Implement the `encounter` method in `WildPokemon`.

### Let's go!
```java
class WildPokemon
{
    // Your wild Pokémon

    ...

    /**
     * Given a random number
     * Return a wild Pokémon among those available
     */
    static Pokemon encounter() {
        // You do this bit too
    }
}
```

---

## We can now work on the core of our Pokemon game
Today we will be working on `Main`, creating the introduction and setup for our journey to becoming a Pokemon master!.

The outline of what we're doing is outlined in the file itself:
* Greet the user and take their name as an input.
* Set up the story and let the user choose their Pokemon.
* Highlight the user's choice by printing a list of their Pokemon.

**Exercise** Open `Main` and implement the above parts of the `main` method.
We have given you `UserInputUtil`, which lets you take user input from the command line.

---

# Homework
The trainer doesn't know how to move yet, let's sort that.
Test your method by creating a main method and interacting with it.
```java
static void move() {
    listDirection();

    /* HOMEWORK: read in the user input and choose the
    *  direction and print where the user has chosen to go
    */
}
```

---
Next Lesson: [Pokémon Code Academy part 3](lesson7.md)  
[Homepage](index.md)
