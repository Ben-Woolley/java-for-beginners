# Lesson 4 - More Loops, Objects and classes

## The `while` Loop
A while loop keeps going as long as the provided conditional statement is still true.

```java
while (pokemon.healthPoints > 10) {
  System.out.println("1. Attack 2. Run away");

  /* TODO Reduce healthPoints to get to an exit point
  or the loop will continue infinitely! */
  pokemon.healthPoints = pokemon.healthPoints - 1;
}
```

## Classes
A class is a representation of a type of an object in your program.

It is a blueprint you can use to create objects of that type with unique values.

For example, a Pokémon could be represented as:
```java
class Pokemon {

  String name;
  int healthPoints;
  int combatPower;

  Pokemon(String pokemonName, int pokemonHealthPoints, int pokemonCombatPower) {
    name = pokemonName;
    healthPoints = pokemonHealthPoints;
    combatPower = pokemonCombatPower;
  }
}
```

The method `Pokemon(...){...}` is called the **constructor** of the `Pokemon` class. It allows you to create new objects of the type `Pokemon`.

### Using Constructors
To create an object you must use the `new` keyword, e.g.
`Pokemon pikachu = new Pokemon("Pikachu", 20, 8);`  
This results in a new instance of `Pokemon` stored in the variable `pikachu`.

## Methods
A Method is a code block you can use elsewhere in your code without duplication. For example:
```java
String getName() {
  return name;
}
```
A method has a return type, the type of object that the method will generate and give to the caller (in this case `String`).  
Methods are given a name used to call them (in this case `getName`).

*If you don't want to return anything from a method, use the `void` return type.*

Preferably you should use meaningful names for your methods so that you can understand the method will do from its name.

## Time for an Exercise
Let’s add methods to the `Pokemon` class, to be able to get and set `healthPoints` and `combatPower`.

Use the constructor to create new `Pokemon` objects in the `main` method.

### Let's Create `toString()` Too
```java
public String toString() {
  //Print detailed information about your object
}
```
As an example, it can be implemented like this:
```java
public String toString() {
  return name + " (HP: " + healthPoints + ")"
              + " (CP: " + combatPower + ")";
}
```

# Homework
Implement the `PokemonTrainer` Class
```java
class PokemonTrainer
{
  // name
  // numberOfPokeBalls - start with 10
  // list of ownedPokemon

  // constructor that takes the trainer’s name - trainerName

  // getters for all attributes of the trainer
}
```
---
Next Lesson: [Pokémon Code Academy part 1](lesson5.md)  
[Homepage](index.md)
