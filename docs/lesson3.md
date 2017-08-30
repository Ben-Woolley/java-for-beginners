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

## The new, new, new SillyEquation
```java
class SillyEquation {

  public static void main(String[] args) {
    int numberOfApples = 2;
    int numberOfBananas = 4;
    int numberOfOranges = 2;
    System.out.println((numberOfApples == numberOfBananas) &&
    (numberOfApples == numberOfOranges)); //CONDITIONS
  }
}
```

# Making Decisions
We can use conditional values to construct:
* `if` statements, deciding which block of code to run.
* loop statements (`for`, `while`), to do things repetitively.

## A simple `if` statement
```java
if (healthPoints >= combatPower) {
  healthPoints = healthPoints - combatPower;
} else {
  healthPoints = 0;
}
```
This example prevents the healthPoints variable from going below 0.

It can be used in our upcoming Pokémon game:
```java
public class Pokemon {
  String name = "Pikachu";
  int healthPoints = 20;
  int combatPower = 8;

  /* Given a certain amount of points passed in as argument, 
  if my existing health points are greater than the given points
  I want to deduct the given points away from my health points.
  If my existing health points are less than the given points,   
  I want to set my health points to 0.
  */
  public void reduceHealth(int points) {
    //TODO
  }
}
```

## Collections
Collections represent a bunch of things of the same type grouped together.  
There are many types of collections (e.g. `list`, `set`, `map`) - we will focus on lists.

A list holds objects in the order you pass them to it.

```java
List<Pokemon> starterPokemon = new ArrayList<Pokemon>();

Pokemon squirtle = new Pokemon();
squirtle.name = "Squirtle";
starterPokemon.add(squirtle);

Pokemon bulbasaur = new Pokemon();
bulbasaur.name = "Bulbasaur";
starterPokemon.add(bulbsaur);

Pokemon charmander = new Pokemon();
charmander.name = "Charmander";
starterPokemon.add(charmander);
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

### A more dangerous `for`
You don't need to use this one but it's good extra stuff to know.
A `for` loop may also use conditional statements to do things a number of times instead:
```java
for (int i = 0; i < 10; i++) {
  System.out.println("And again");
}
```
The `for` statement is made of 3 expressions:
* The first `int i = 0;` sets up a variable to change on each iteration. This variable only exists in this loop.
* The second `i < 10;` is the condition on which the loop ends. In our case it is when `i` is no longer less than 10.
* The final statement `i++` is performed after every run of the loop, it's intended to eventually make the second expression `false`.

# Homework
Experiment with IF ELSE

Declare an `int` variable called `choice`.
* If the value is 1 print “Going Left”.
* If the value is 2 print “Going straight”.
* If it’s 3 print “Going right”.

For any other values print “Invalid input!”.  
Experiment with this code in the `main` method and see how different values of choice affect the output of your program.

---
Next Lesson: [Logic and making decisions](lesson3.md)  
[Objects and Classes](lesson4.md)
