# Lesson 2 - Debugging and additional concepts

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

---
## Debugging your Code
Right-click and debug ![debug](assets/intellij/debug.png), this is a feature of the editor!

Debugging lets us see what happens when we run our code.  
We can see everything step-by-step by using several features:
* ![breakpoint](assets/intellij/db_set_breakpoint.png) **Breakpoints** are what let you stop and see what's happening at a particular line in code.  
These are set by clicking next to the line number in the editor that you want to stop at.
* ![step over](assets/intellij/frames_step_over.png) **Step over** - run the highlighted line and wait at the next.
* ![step in](assets/intellij/frames_step_into.png) **Step in** - Run the highlighted line of code, and if it calls a function go to it's first line.
* ![step out](assets/intellij/frames_step_out.png) **Step out** - Finish running the current "block" of code (between two `{braces}`) and go to the line after the line that called it originally.

While at a breakpoint you can see what all the variables available look like in the debug pane.

![debugging example](assets/intellij/debugging.png)


### Exercise
Try out debugging and using each of the features.
To try step in and step out, create your own method that you call from the `main` method. This can be as simple as `sum(Integer a, Integer b)` that adds `a` and `b` together.

---
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
class AnExampleProgram {
  public static void main(String[] args) {
      Integer a = 2;
      Integer b = 4;
      Integer x = 5;
      System.out.println("Is x the sum of a and b? " + (x == sum(a, b)));
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
```
class AnExampleProgram {
  static final Integer MY_REQUIRED_FRUIT_INTAKE = 5;
  public static void main(String[] args) {
    Integer numberOfApples = 2;
    Integer numberOfBananas = 4;
    String numberOfOranges = ”2”;
    System.out.println(MY_REQUIRED_FRUIT_INTAKE == sum(numberOfApples, numberOfBananas));
    System.out.println(MY_REQUIRED_FRUIT_INTAKE < sum(numberOfOranges, numberOfBananas));
  }

  static Integer sum(Integer firstNumber, Integer secondNumber) {
      return firstNumber + secondNumber;
  }
}
```
**Question**: What is wrong with this program?  
I turned off the syntax highlighting so you couldn't cheat.

# Homework
* Play with the debugger and your AnExampleProgram.
* Step through your program and see what is going on in your variables.

You can add complexity to your equation by playing around with all the operators introduced so far.
* And debug that too, why not?

*Bonus: Have a look at the other operators available*

---
Next Lesson: [Logic and making decisions](lesson3.md)  
[Homepage](index.md)
