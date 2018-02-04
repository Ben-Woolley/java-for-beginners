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

For example, a Pokémon could be represented as:
```java

public class Pokemon {

  String name;
  Integer healthPoints;
  Integer combatPower;

  Pokemon(String pokemonName, Integer pokemonHealthPoints, Integer pokemonCombatPower) {
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
Let’s add methods to the `Pokemon` class, to be able to get `healthPoints`, `combatPower` and `name`. We can also add our `reduceHealthPoints` method now.

Use the constructor to create new `Pokemon` objects in the `main` method and test your methods.

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
Implement the `PokemonTrainer` Class, the class should already exist in your project to add to.
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
