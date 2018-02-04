# Lesson 3 - Logic and making decisions
# Operators
Perform operations on variables and/or values.

We talked about basic Arithmetic Operators (`+`, `-`).  
We also saw Comparison Operators (`<`, `>`, `<=`, `>=`, `==`, `!=`) that return a Boolean (true/false).

Now introducing logical operators:
*  (inclusive) OR (`||`)  
If any are true the answer is true.
If all are false, then the answer is false.

|           | true  | false |
| ---       | ---   | ---   |
| **true**  | true  | true  |
| **false** | true  | false |

* AND (`&&`)  
If any are false the answer is false.
If all are true, then the answer is true.

|           | true  | false |
| ---       | ---   | ---   |
| **true**  | true  | false  |
| **false** | false  | false |

* NOT (`!`)  
if true then answer is false.
if false then the answer is true

| true   | false |
| ---    | ---   |
| false  | true  |

## The new, new, new AnExampleProgram
```java
class AnExampleProgram {

  public static void main(String[] args) {
    Integer numberOfApples = 2;
    Integer numberOfBananas = 4;
    Integer numberOfOranges = 2;

    System.out.println("Do I have a balanced fruit diet? "
        + ((numberOfApples == numberOfBananas) && (numberOfApples == numberOfOranges)));
  }
}
```

# Making Decisions
We can use conditional values to construct:
* `if` statements, deciding which block of code to run.
* loop statements (`for`, `while`), to do things repetitively.

## A simple `if` statement
```java
public static Integer reduceHealth(Integer healthPoints, Integer combatPower) {
    if (healthPoints >= combatPower) {
      healthPoints = healthPoints - combatPower;
    } else {
      healthPoints = 0;
    }
    return healthPoints;
}
```
This example prevents the `healthPoints` returned from going below 0.

It can be used in our upcoming Pokémon game:
```java
public class Pokemon {
  String name = "Pikachu";
  Integer healthPoints = 20;
  Integer combatPower = 8;

  /* Given a certain amount of points passed in as argument, 
  if my existing health points are greater than the given points
  I want to deduct the given points away from my health points.
  If my existing health points are less than the given points,   
  I want to set my health points to 0.
  */
  public void reduceHealth(Integer points) {

    // TODO your implementation here

  }
}
```

## Collections
Collections represent a bunch of things of the same type grouped together.  
There are many types of collections (e.g. `list`, `set`, `map`) - we will focus on lists.

A list holds objects in the order you pass them to it.

```java
Pokemon squirtle = new Pokemon("Squirtle");
Pokemon bulbasaur = new Pokemon("Bulbasaur");
Pokemon charmander = new Pokemon("Charmander");

List<Pokemon> starterPokemon = new ArrayList<Pokemon>();
starterPokemon.add(squirtle);
starterPokemon.add(charmander);
starterPokemon.add(bulbsaur);
```
The example `starterPokemon` list would contain `squirtle`, `bulbasaur`, and `charmander` in that order.

## The `for` Loop
Lets us do the same code block for every item in a collection, without duplicating code.
This in particular is known as a for-each loop.
```java
for (Pokemon pokemon: starterPokemon) {
  System.out.println(pokemon.name);
}
```

In the context of the `for` loop, the variable `pokemon` will be the current `Pokemon` for the loop. This effectively states "For each `Pokemon` in the `starterPokemon` list, do the contents of the loop using them".

### A more dangerous `for`
You don't need to use this one but it's good extra stuff to know.
A `for` loop may also use conditional statements to do things a number of times instead:
```java
for (Integer i = 0; i < 10; i++) {
  System.out.println("And again");
}
```
The `for` statement is made of 3 expressions:
* The first `Integer i = 0;` sets up a variable to change on each iteration. This variable only exists in this loop.
* The second `i < 10;` is the condition on which the loop ends. In our case it is when `i` is no longer less than 10.
* The final statement `i++` (`i = i + 1`) is performed after every run of the loop, it's intended to eventually make the second expression `false`.

# Homework
Experiment with `if`/`else`

Create a `void` method `printMoveDirection` that takes an `Integer choice`
* If the value is 1 print “Going Left”.
* If the value is 2 print “Going straight”.
* If it’s 3 print “Going right”.
* For any other values print “Invalid input!”.

Test your code by calling the method in a `main` method and see how different values of choice affect the output of your program.

---
Next Lesson: [Objects and Classes](lesson4.md)  
[Homepage](index.md)
