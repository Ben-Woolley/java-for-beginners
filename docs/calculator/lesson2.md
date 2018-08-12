# Lesson 2 - The basic building blocks of programming

## Lesson Outcomes
This lesson we're going to cover the basic essentials that make programming so powerful:
* **Variables** and **Types**
* **Conditional Execution** of code paths
* **Collections** and **loops**

On top of these concepts you only need to know some of the **functions/methods** that are available on the **types** you are using.

By the end of this lesson you should be able to **understand what a simple Java program is doing**

## But first - Hello, World!
Before we should write anything else, it's probably a good start to be able to run it!

Every Java program has a `main` method, which is the language's defined starting point.
It's written as:

```java
public static void main(String[] args) {
    // Your implementation here
    System.out.println("Hello, world!");
}
```

There's a few new things introduced here in these 3 lines, you can choose to just accept that this shebang is where the Java program starts.

But here is a description of what's being said anyway **(Do not worry if there's anything you don't understand yet)**:
* `public` is the **access modifier** (who can see this thing).
It says that any other Java file in your project can see and use this function.
This is in contrast to `private` that hides it from any other file.
* `static` says "only one of these things exists, and is shared by everyone using this function".
This lets us use this function without anything else existing (useful for starting a program).
This is in contrast to a non-static thing, which you need to create an `instance` of something to use.
* `void` is the **return type**.
It defines what this function is going to give back to who called it. In this case it is `void` - meaning it doesn't return anything!

The most important part that we're going to use frequently is `System.out.println()` - which prints out its **argument** to the command line/terminal/console.

## Variables and Types
### Variables
Variables act as labeled boxes - enabling you to **store values and refer to them later in your program**.
The value of a variable can be updated later - which is convenient but makes things harder to track.

A variable can defined by following the pattern:
```java
ObjectType nameOfObject = *some value*;
```
or for some concrete examples:
```java
String greeting = "Hello";
Integer myFavouriteNumber = 17;
Boolean isThisJava = true;
```
you can try these out, and print out the values in a `main` method.

### Types
Programming languages provide the fundamental building blocks on which we can build everything else. This includes basic **data types** on which we can build more complicated types. In this course we care about:
* Strings (`String`)
* Numbers (`Integer` and `Double`)
* Booleans (`Boolean`)

#### Strings
You've already seen quite a few `String` variables and examples, they let us represent text in our program e.g:
```java
Integer firstNumber = 1;
Integer secondNumber = 2;
String operator = "+";
String problem = firstNumber + " " + operator + " " + secondNumber + " = ?";
```
Here we have defined a simple math problem by mixing numbers and strings together.
Java lets us do this by providing `+` - which when used with Strings means "Glue these things together to make a bigger String".
Java has also been kind enough to **automatically convert our numbers to Strings**.

#### Numbers
In many programming languages you have to explicitly choose if you want to have a decimal place in your numbers. This means you have **different types for whole and non-whole numbers**:
* `Integer` - for integers (whole numbers both negative and positive)
* `Double` - for floating-point numbers (meaning "double-precision floating point number")
There is also `Long` (an integer that can be even higher/lower) and `Float` (a single-precision floating point number).

Because these are basic types Java provides, Java also lets you do arithmetic on them in a very familiar way, e.g.:
```java
Integer plus = 1 + 2;
Integer minus = 1 - 2;
Integer divide = 1 / 2;
Integer multiply = 1 * 2;
Integer power = 1 ^ 2;
```
These expressions follow BODMAS, and you can even use brackets!

#### Booleans
Booleans are just `true`/`false` or yes/no values. They are often the result of doing some comparison or check in your program.
Java again lets you define booleans as `true` and `false` directly.
```java
Boolean enabled = true;
```

## Conditional Execution
Programming is powerful because we can choose whether to do things or not **based on conditions about data**. This is enabled by the `if` statement:
```java
Boolean condition = true;

if (condition) {
    System.out.println("The condition is true");
} else {
    System.out.println("The condition is false");
}
```

`condition` in the `if`-statement can be replaced with any expression that produces a `Boolean` e.g. `1 + 1 == 2`.
You can extend the `if`-statement with `else if` when you have more than 2 conditions that you want to choose between:
```java
Integer numberToCheck = 5;

if (numberToCheck < 0) {
    System.out.println("The number is too small");
} else if (numberToCheck > 100){
    System.out.println("The number is too large");
} else {
    System.out.println("The number is between 0 and 100");
}
```

## Collections and Loops

Loops let us do the same thing over and over again almost infinitely if we want - without duplicating the code we want to do over and over. There are 2 main types in Java (plus a newer type we won't be covering in detail in this course).

### Collections
A `Collection` is just a data type which holds a bunch of another data type:
```java
List<String> listOfStrings = new ArrayList<>();
Set<Integer> setOfIntegers = new HashSet<>();
Queue<Boolean> queueOfBooleans = new ArrayDeque<>();
```
From the example, you define what sort of type they contain between angled brackets e.g. `Collection<ContainingType>`.

### For-loops
A for-loop essentially says either:
* "for each of the things in this collection, do this code block"
* "for each value in this counter that goes from `x` to `y`, do this code block"

#### For-each
The first example can be defined like this:
```java
List<String> things = Arrays.asList("a", "b", "c");
for (String thing : things) {
    System.out.println(thing);
}
```
which effectively says
> for each `String` `thing` in the `List` containing `String` called `things`, `System.out.println` each `thing`

#### For with counter
In the second example the `for` loop's job is to handle some counter for you:
```java
List<String> things = Arrays.asList("a", "b", "c");
for (Integer counter = 0; counter < things.size(); counter = counter + 1) {
    System.out.println(things.get(counter));
}
```
which effectively says
> I have a `counter` that starts at `0`, and while the `counter` is less than the `size` of `things`, `System.out.println` the element in `things` that is at the position of the value of `counter`.

### While loops
A while loop is much more free (and prone to error as a result). It says "while some condition is true, do this code block".
It is written as:
```java
Boolean condition = true;
while (condition) {
    System.out.println("I'm stuck here forever");
}
```
There is nothing that Java can do to stop you from writing a condition that will never be `false`, meaning you can write loops that have no way of stopping.
It is however very useful in the right contexts e.g. taking user input over and over again.

## Code Structure
A word about how we define the **context** of where we are in a piece of code:

Three different types of brackets are used often in Java, each one has its own purpose:
* `{Braces}` group statements e.g. if, for and declarations e.g. class and methods
* `[Brackets]` let you get an item from an **array**
* `(Parentheses)` control the order of operation as in maths, and are used to give things as parameters to methods/functions

## Lesson Summary
Today we've seen the essentials of java and programming - namely types, variables, and conditional execution.

In your own time, you should write some more examples of each topic we've covered this lesson to become more familiar with Java's basic syntax.

---
[Homepage](../index.md)
