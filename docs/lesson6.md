# Lesson 6 - Pokémon Code Academy part 2

## Last time we created our:
* Trainer
* Starter Pokémon
* Wild Pokémon

These java classes are almost ready to be used in our actual Pokémon game!

## Let's choose our Pokémon!
```java
class StarterPokemon
{
    //Our List of Pokémon from last Lesson

    ...

    /**
     * Given a number x of int type, if x is greater or equal to 0 and smaller
     * than the size of ownedPokemon, then return the Pokémon of index x on the list of owned
     * Pokémon. Otherwise, always return the first Pokémon in the list
     */
    static Pokemon choosePokemon(int id) {
        // You do this bit
    }
}
```

## How do we handle wild Pokémon?
We want to randomly encounter one of our wild Pokémon.

We can make use of the ``Math`` library to do this.

``Math.random()`` returns a ``double`` (a floating point number that can go twice as large as a ``float``, which is already pretty [big](http://cs.fit.edu/~ryan/java/language/java-data.html)) between 0 and 1.

We can check if the returned value is between different boundaries to choose the wild Pokémon to encounter. (You can even make some Pokémon rarer than others)

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

# Homework
The trainer doesn't know how to move yet, let's sort that.
```java
static void move() {
  listDirection();

  /* HOMEWORK: read in the user input and choose the
  * direction and print where the user has chosen to go
  */
}
```

<!-- TODO Main class portion -->

---
Next Lesson: [Pokémon Code Academy part 3](lesson7.md)  
[Homepage](index.md)
