# Lesson 1 - Introduction and basic java concepts

## Outcome - Pokémon Code Academy
The goal of the course is to create an interactive text based game, in which:
* The player starts their journey by picking their starter Pokémon
* They then explore and find wild Pokémon
* Which they can choose to fight, capture, or flee from

The objective is to **catch ‘em all!**  
The game ends when you have either:
* Caught them all
* Ran out of Pokéballs
* Whited out: All your Pokémon have fainted

## Before we Begin
Let's:
* Make sure everyone is set up
* Get familiar with the programming tool (IntelliJ IDEA)

---
# Basic Java Concepts

## Console Output
Display text from the program in the console. This is usually done by using:

```java
System.out.print("Tell me off ");
System.out.println("if I’m going too fast");
```

The difference between `print` and `println` is that println adds an "enter" AKA newline to the end of the input.

## Variables
Variables act as labeled boxes to store things.  
The value of the variables can be changed later in the program.

They follow the format of `ObjectType nameOfObject = *some value*;`.

Each variable can store a particular type of data, chosen by you.
 There are many different types. Today we will cover:
* Numbers (e.g. `Integer`, `Long`, `Float`,`Double``)
* Strings (`String`)
* Booleans (`Boolean` - `true/false` values)

### Numbers
Come in many flavours, based on how large or small you need them to go, and if you need decimal points.

We are going to use `Integer` – whole numbers

```java
Integer pokemonSeen = 18;
Integer pokemonCaught = -65;
```

### Strings
A String is a sequence of (0 or more) characters.  
e.g. ``['H', 'e', 'l', 'l', 'o', ' ', 't', 'h', 'e', 'r', 'e', '.']``

```java
String pokemonName = "Pikachu";
System.out.println("A wild Pokemon appeared!");
System.out.println("1. Attack 2. Run away");
```

*(These are also known as String literals, where literal means it is a fixed value in the program)*

#### Concatenating Strings
Strings can be concatenated/glued together using the `+` operator e.g.

```java
String pokemonName = "Pikachu";
System.out.println("A wild " + pokemonName + " appeared!");
System.out.println("You threw a ball at it, the " + wildPokemon + " is captured!");
```

You can also use different data types in concatenation, Java automatically converts non-Strings.
(This is done by calling their `toString()` method, that all Java Types implement by default)
e.g.:

```java
Integer pokeBallsLeft = 2;
String message = "You have " + pokeBallsLeft + " Pokeballs left.";
```

### Booleans
A Boolean can be either `true` or `false`, use this for simple flags such as:

```java
Boolean havePokeballs = true;
Boolean canCatchWildPokemon = false;
```

## Arithmetic Operators
We can perform basic arithmetic operations on variables:
* `+` add
* `-` subtract
* `*` multiply
* `/` divide
* and other less commonly used, including modulus `%` - the remainder of whole number division.

e.g.
```java
Integer aNumber = 1 + (2 – 3) * 4 / 5;
````

## Code Formatting
* `{Braces}` group statements e.g. if, for and declarations e.g. class and methods

* `[Brackets]` let you get an item from a list

* `(Parentheses)` control the order of operation as in maths, and are used to give things as parameters to methods/functions

*I will likely use the wrong words for these e.g. `(bracket)`, `[square bracket]`, `{moustache bracket}`*

## Some code to start
```java
public class AnExampleProgram {
  public static void main(String[] args) {
  	Integer that = 2;
  	Integer theOther = 4;
  	Integer result = that + theOther;
  	System.out.println("The result is " + result);
  }
}
```

## Running your Code
Right-click and run, the editor makes this really easy!

## Homework - Experiment with Operators
* Switch, change, or use new operators in AnExampleProgram and see what happens.
* Have a look at what operators are available in Java (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html).
(Don’t worry too much about the terrifying sound ones, we barely use them ourselves.)
* *Bonus: Discover how division works with integers by writing your own program*

---
Next Lesson: [Debugging and additional concepts](lesson2.md)  
[Homepage](index.md)
