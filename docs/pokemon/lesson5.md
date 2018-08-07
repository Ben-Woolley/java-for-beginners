# Lesson 5 - Pokemon Code Academy part 1

## Recap
Last lesson we covered quite a lot. We created out first class for our game, including:
* Properties
* Accessors
* Methods

And in the homework I asked you to do the first two on your own.


## Now let's add some functionality
First to our Pokemon trainer. We want them to be able to capture and choose between their Pokemon.

**Exercise**
Implement `capture` and `choosePokemon`

```java
public class PokemonTrainer {
    // attributes, constructor and get methods here
    /**
    * Given an object of type Pokemon, reduce the number of balls by 1 and add the
    *  Pokemon to the list of ownedPokemon
    */
    void capture(Pokemon pokemon) {}

    /**
    * Given a number id of Integer type, if id is greater or equal to 0 and smaller
    * than the size of ownedPokemon, then return the Pokemon of index id on the list of owned
    * Pokemon. Otherwise, always return the first Pokemon in the list.
    * @param id
    * @return an instance of Pokemon
    */
    void choosePokemon(Integer id) {}
    // TIP: the method size() can be used for ArrayList to get the total number of items in it
    // TIP: For retrieving an Object from the List, use .get(index)
    // TIP: ArrayList always starts with index 0

    /**
    * Given a starterPokemon of Pokemon type, add the starterPokemon to the list of ownedPokemon
    * @param pokemon
    */
    void setStarterPokemon(Pokemon pokemon) {}
}
```

We can test these with a `main` such as:
```java
public static void main(String[] args) {
  Pokemon pikachu = new Pokemon("Pikachu", 20, 10);
  Pokemon psyduck = new Pokemon("Psyduck", 15, 12);

  PokemonTrainer gary = new PokemonTrainer("Gary");
  gary.setStarterPokemon(pikachu);
  gary.capture(psyduck);
  System.out.println(gary.choosePokemon(0));
  System.out.println(gary.choosePokemon(1));
}
```

---

## How do we define our game's set of Pokemon?
### The problem
A Pokemon game has a pool of different Pokemon, which can either be:
* Given to you as a **Starter Pokemon**
* Encountered in the wild as a **Wild Pokemon**

We need a solution that can fulfil these points:
* I need to be able to give multiple Pokemon of the same type
* I need to create new Pokemon each time
  * **Otherwise if you give the same Pokemon twice, it will refer to the same Pokemon**
* I need a mechanism to tell which Pokemon are reserved as starter Pokemon

### A solution
Instead of creating Pokemon statically in our game (i.e. manually creating a bunch of `new Pokemon(...)` and handing them out), we can define the **types** of Pokemon that can exist.
We can then refer to these **types** to create new `Pokemon`.

To do this we can define an `enum` - which represents *a set of named values* which can include additional properties.
So we can define a bunch of `PokemonType` with their names, starting health and combat power and then use this type to *create instances* following this enum.

**Exercise**
Complete the `PokemonType` enum in your project. A `PokemonType` has the following properties:
* The `name` as a `String`
* The `healthPoints` as an `Integer`
* The `combatPower` as an `Integer`
* Whether the Pokemon is a `starterPokemon` as a `Boolean`

You then need to create a **constructor** so we can define each `PokemonType`, taking an argument for each field.

Then, we need **accessors/getters** for each of the fields.

And finally, we can implement `getStarterPokemonTypes()` and `getWildPokemonTypes()`
You can use `PokemonType.values()` to get an `array` of all defined `PokemonType`.

**Remember to test your work along the way!**

With all this done, you can uncomment the example Pokemon I've provided and add your own!

## And that's it for this lesson
With that, you've built your third Java class that will be integral in your Pokemon game!

# Homework
No specific homework this time!
Finish up your `class` and `enum` files if you need to and polish them if you can think of any way to improve the logic.

---
Next Lesson: [Pokémon Code Academy part 2](lesson6.md)  
[Homepage](../index.md)
