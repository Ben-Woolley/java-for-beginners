# Lesson 2 - Additional Java concepts

## Recap
Remember our equation from the last lesson:
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
To run this program we just right-click and run in the editor.  
Today we're going to enhance this equation using what we're learning.


# More Java Concepts
*And a few more operators. And a lot of naming conventions*

## Operators
We've talked about Arithmetic operators (`+`, `-`, `*`, `/`, `%`)  
In addition we have:
* Comparison operators (`<`, `>`, `<=`, `>=`, `==`, `!=`) return a  Boolean (true/false).
* Logical operators: AND (`&&`), OR (`||`), and NOT (`!`).
More on these next time.

And many more, but what has been shown is enough to make Pokemon Code Academy.

*Bonus homework: Have a look at the other available operators*

## Let's enhance AnExampleProgram
```java
public class AnExampleProgram {
  public static void main(String[] args) {
      Integer that = 2;
      Integer theOther = 4;
      Integer expected = 5;
      System.out.println("Is expected the sum of that and theOther? " + (expected == sum(that, theOther)));
    }

    // This is a method/function, it is a way to make code reusable.
    static Integer sum(Integer a, Integer b) {
      return a + b;
    }
}
```

# Naming Conventions and Rules
Naming conventions make programs more understandable and easier to read, partly just through consistency.

## Class Naming
You can only have one `public class` per file.  
The name of this class must match the file name (e.g. `public class Bob {...}` will only work in the file `Bob.java`).

## Variable Naming

Variables use lowerCamelCase (e.g. `runAway`). They should only start with a letter.

Constants use all uppercase characters separated by underscores (e.g. `MAX_PARTY_SIZE`).  
Constant names may also contain digits if appropriate, but not as the first character.

## Reserved Words in Java
There are some words that you cannot use as object or variable names in a Java program. These words are known as "reserved" words; they are keywords that are already used by the syntax of the Java programming language.

```java
Integer int = 1; 	//ILLEGAL
Integer integer = 1; 	//LEGAL
```

# Time to Enhance Again
## But first, Constants
When a variable can only have one value across its entire lifespan, it’s called a constant.

Constants are defined with the prefix `final` e.g. `final Integer attackPower = 6;` inside methods.

And with the prefix `static final` e.g. 'static final Integer PI = 3.14;' for variables outside methods (known as members).

## The new, new AnExampleProgram
**Exercise**
I need to know if I'm getting my recommended fruit intake:
* My recommended fruit intake is a constant of 5
* I have 2 Apples, 4 Bananas, and 2 Oranges
* I want to know if eating my apples and my bananas is exactly my recommended intake
* I want to know if eating my oranges and bananas is enough for my recommended intake

Here's how I've done it:
```
public class AnExampleProgram {
  private static final Integer MY_REQUIRED_FRUIT_INTAKE = 5;
  public static void main(String[] args) {
    Integer numberOfApples = 2;
    Integer numberOfBananas = 4;
    Integer numberOfOranges = 2;

    System.out.println(MY_REQUIRED_FRUIT_INTAKE == sum(numberOfApples, numberOfBananas));
    System.out.println(MY_REQUIRED_FRUIT_INTAKE < sum(numberOfOranges, numberOfBananas));
  }

  static Integer sum(Integer firstNumber, Integer secondNumber) {
      return firstNumber + secondNumber;
  }
}
```

# Homework
* Add complexity to your example program by using more operators.
* Come up with your own scenario you can turn into a program and implement it.
* ***Bonus***: have a look at [using the debugger](debugging.md)
* ***Bonus***: Have a look at the other operators available

---
Next Lesson: [Logic and making decisions](lesson3.md)  
[Homepage](index.md)
