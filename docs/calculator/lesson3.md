# Lesson 3 - The less basic building blocks of programming

## Lesson Outcomes
Today we'll be writing some new Java code ourselves.  
After a quick recap of the previous lesson, we'll:
* expand on Java's supplied **basic operators** to enable you to do more interesting things.
* go over some **coding conventions**
* attempting a basic programmer interview exercise.

By the end of this lesson you should have written your first Java program with output depending on multiple conditions.

## More Operators
### Comparison Operators
We often want to compare two values to trigger an `if` statement. There are plenty of options to use.

* **Equality** can be checked be using `==` e.g. `2 == 3` would return false.
* Checking that two values are **not equal** can be done using `!=` e.g. `2 != 3` would return true.

These work on all types, but there are some specialized for particular types.

#### Arithmetic Comparison
Java provides the regular assortment of number comparison operators that work on the common **number types**:
* `1 < 2` - `1` is less than `2`
* `1 > 2` - `1` is greater than `2`
* `1 <= 2` - `1` is less than or equal to `2`
* `1 >= 2` - `1` is greater than or equal to `2`

### Boolean Operators
Java provides boolean operators that we can use just like arithmetic operators, but just on `Boolean` objects.
The essential operators are AND, OR, and NOT.

#### (inclusive) OR (`||`)
``Boolean trueOrFalse = true || false;``
* If any are `true` the answer is `true`.
* If all are `false`, then the answer is `false`.

|           | `true`  | `false` |
| ---       | ---   | ---   |
| `true`  | `true`  | `true`  |
| `false` | `true`  | `false` |

#### AND (`&&`)
``Boolean trueAndFalse = true && false;``
* If any are `false` the answer is false.
* If all are true, then the answer is true.

|           | `true`  | `false` |
| ---       | ---   | ---   |
| `true`  | `true`  | `false`  |
| `false` | `false`  | `false` |

#### NOT (`!`)
``Boolean notTrue = !true;``
* if `true` then answer is `false`.
* if `false` then the answer is `true`.

So `!true == false`, and `!false == true`

## Coding Conventions
To make everyone's lives easier, programming languages have agreed writing conventions.

The core of which is naming style:
* Variables, function names, and arguments are **lowerCamelCase**
* Classes are **UpperCamelCase**
* Constants are **UNDERSCORE_SEPARATED_ALL_CAPS**

There are also some essential rules that if not followed will cause your pogram to not compile:
* The **class name** must be the same as the **.java file name**
i.e. `public class Calculator { ... }` must exist in `Calculator.java`
* You cannot name variables after **reserved words** e.g. you cannot have a variant `Integer int = 1;` because `int` is reserved by Java.

## Exercises
### Exercise 1
Your first challenge is to complete a classic "FizzBuzz" question used to test if a software developer can actually develop software.
> Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

To do this I'm asking you to create a new class `FizzBuzz` whose `main` method does this when run.

### Exercise 2
Write a program that draws fir trees of width `n`, where `n` is an even number.
The tree will get 2 characters thinner for each line higher it is.
e.g. `drawTree(4)` would draw
```
 /\
/__\
 ||
```
and `drawTree(6)` would draw
```
  /\
 /  \
/____\
  ||
```
---
[Homepage](../index.md)
