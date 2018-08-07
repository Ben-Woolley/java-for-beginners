# Lesson 4 - More Loops, Objects and classes

## The `while` Loop
A while loop keeps going as long as the provided conditional statement is still true.

```java
Integer healthPoints = 20;
while (healthPoints > 10) {
  System.out.println("1. Attack 2. Run away");
  healthPoints = healthPoints - 1;
}
```

They are however prone to causing infinite loops, as there is nothing stopping you from forgetting to reduce or increment a value to make the condition true.
e.g.
```java
while (true) {
    System.out.println("Help me I'm stuck!");
}
```
Is completely valid.

*Exercise*
Make use of each loop type to do something with:
```java
List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
```
You will need to `import` 2 things for this line of code:
```java
import java.util.Arrays;
import java.util.List;
```

## Classes
A class is a representation of a type of an object in your program.

It is a blueprint you can use to create objects of that type with unique values.
They have:
* Properties/Fields that are unique to each one you create
* Methods to interact with the unique properties of the object

### Properties/Fields
**Exercise**
Our `Pokemon.class` is pretty empty. Lets add some properties to our `Pokemon.class`.
We'll need a `name` (which is a `String`), an amount of `healthPoints` (which is an `Integer`),
and `combatPower` (which is an `Integer` for how much damage a Pokemon can do).

We'll make these properties private so we can control how other parts of the program access them.
Here's a `main` to test your solution with:

```java
public static void main(String[] args) {
  Pokemon pikachu = new Pokemon();
  pikachu.name = "Pikachu";
  pikachu.healthPoints = 20;
  pikachu.combatPower = 10;

  System.out.println(pikachu.name);
  System.out.println(pikachu.healthPoints);
  System.out.println(pikachu.combatPower);
}
```

### Constructors
Constructors are used to create a new object of the specified type.

To create an object you must use the `new` keyword, e.g.
`Pokemon pikachu = new Pokemon();`
This results in a new instance of `Pokemon` stored in the variable `pikachu`.

**Exercise**
Add a constructor to your `Pokemon.class`, taking the arguments:
* A `String` for the `pokemonName`
* An `Integer` for the `pokemonHealthPoints`
* An `Integer` for the `pokemonCombatPower`

Then you can use these arguments to set values for your new `name`, `healthPoints`, and `combatPower`.
Your test `main` can then become:

```java
public static void main(String[] args) {
  Pokemon pikachu = new Pokemon("Pikachu", 20, 10);

  System.out.println(pikachu.name);
  System.out.println(pikachu.healthPoints);
  System.out.println(pikachu.combatPower);
}
```
It's now much lower effort to make a `Pokemon` and less prone to errors.

## Methods
A Method is a code block you can use repeatedly without duplication. It also gives you control in how properties are used.
For example the following gives you the name but won't let you set it:
```java
public String getName() {
  return name;
}
```
A method has a return type, the type of object that the method will generate and give to the caller (in this case `String`).  
Methods are given a name used to call them (in this case `getName`).

*If you don't want to return anything from a method, use the `void` return type.*

Preferably you should use meaningful names for your methods so that you can understand the method will do from its name.

### Getters - Retrieving properties
**Exercise**
Create methods that let people using a `Pokemon` *access* its properties.
These are known as *accessors* or *getters* and by convention are written:
```java
public *ReturnType* get*ThingToReturn*() {
  return *thingToReturn*;
}
```

You can test these by updating your `main` to:
```java
public static void main(String[] args) {
  Pokemon pikachu = new Pokemon("Pikachu", 20, 10);

  System.out.println(pikachu.getName());
  System.out.println(pikachu.getHealthPoints());
  System.out.println(pikachu.getCombatPower());
}
```

### The `toString()` method
`toString()` is a method every `class` in Java supports.
This is because every `class` extends the `Object` type which has a default (and ugly) version.
We can **override** this default with our own, better `toString()`.
```java
public String toString() {
  //Print detailed information about your object
}
```

**Exercise**
Make your own `toString()` for your `Pokemon.class` - this should return all the properties of a `Pokemon` is a useful way.
(e.g. you might shorten `healthPoints` to "HP" when labelling in your `toString()`)

This can be tested by changing your `main` to this:
```java
public static void main(String[] args) {
  Pokemon pikachu = new Pokemon("Pikachu", 20, 10);
  System.out.println(pikachu.toString());
}
```

As an example, it can be implemented like this:
```java
public String toString() {
  return name + " (HP: " + healthPoints + ")"
              + " (CP: " + combatPower + ")";
}
```

### Using our properties
We need only one special method for our game: `reduceHealth`. It's behavior is:
* It takes an `Integer` of `damage` the Pokemon is going to take
* Reduce the Pokemon's `healthPoints` by the amount of `damage`
  * If the `damage` is greater than the `healthPoints`, reduce `healthPoints` to zero instead

**Exercise**
Implement the `reduceHealth` method in the `Pokemon` class.

You can test this by adding to the `main`:
```java
public static void main(String[] args) {
  Pokemon pikachu = new Pokemon("Pikachu", 20, 10);

  System.out.println(pikachu.toString());
  pikachu.reduceHealth(10);
  System.out.println(pikachu.toString());
}
```

# Homework
Implement the `PokemonTrainer` Class, the class should already exist in your project to add to.
**You do not need to implement any of the other methods, these are for next time**
```java
public class PokemonTrainer {
  // name
  // numberOfPokeBalls - start with 10
  // list of ownedPokemon

  // constructor that takes the trainer’s name - trainerName

  // getters for all attributes of the trainer
}
```
---
Next Lesson: [Pokémon Code Academy part 1](lesson5.md)  
[Homepage](../index.md)
