# Exercise List Topic 2

This exercise list is to practice the content presented in [lecture 2](../lessons/lesson2)

## Variables and Basic Operators
### Printing Varaibles
In a `main`, define a `String`, `Integer`, and `Boolean` variable.
1. `System.out.println` (print) each of them separately.
2. Print them together in a sentence (which may or may not make sense).

### Math Operations
Write a program that has 2 Integer variables `a` and `b`, print the result of each of applying addition, subtraction, division, multiplication, and modulus of `a` to `b`.

e.g given a = 10 and b = 2, print:

```java
//print 12 (a+b)
//print 8 (a-b)
//etc
```

### Math Comparisons
Write a program that has 2 Integer variables `a` and `b`, print the result of each of applying equal, greater than, less than, greater than or equal, and less than or equal of `a` to `b`.

e.g given a = 10 and b = 2, print:
```java
a equals b // false
a > b // true
a < b // false
```

### OddOrEven
Write a Java program to accept a number and check the number is even or not. Output the `Boolean` value of  the result

e.g for a number a = 10 print `true`

### Sum is equal to Expected
Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer

e.g for:
```java
a = 10
b = 5
c = 15
print true (a + b = c)
```

### Pythagoras Calculation
In a `main`, define 2 `Integer` variables for the `side`s of a right-angled triangle.
Use [Pythagoras' theorem](https://en.wikipedia.org/wiki/Pythagorean_theorem) to calculate the length of the third side and print a message to the console,
such as `A right angle triangle with first side length 1 and second side length 2 has third side length 2.2360679775`.

You will have to use `Math.sqrt()` to get the square root of a value.
This must be **imported** (pulled in from Java) to use, which is done by adding `import java.util.Math;` to the top of your Java file (below the `package`).

## Lists and Loops
### Printing Lists
Make a `List` of the names of your favourite foods (in order of most to least favourite). With this list:
1. Print them out on a line each.
2. Then use it in a sentence e.g. `If I could, I would eat ice cream for every meal`.
3. Then add the rank of each food to the beginning of each line e.g. `1) If I could...`.

### N Times Table
Write a program that prints out the `n` times table in a pretty format e.g

```java
1 X 2 = 2
2 X 2 = 4
...
```

### Searching Lists
Given a list of integers, find and print the largest, find and print the smallest, find and print a specified value (or null if it doesnt exist)

e.g given the following list of integers `[1,2,3,4,5]` and a specified value m = 3 print:
```java
Min: 1
Max: 3
M: 3
```

## Advanced and Extra
### Time Unit Conversion
Write a Java program to convert a number of seconds to hours, minutes and seconds.

### Swap Variable Values
Write a program that swaps the values of two variables.

___Hint___: Easy read integer:
```java
public Integer readInteger() {
	Integer someInput = Integer.parseInt(new Scanner(System.in).nextLine());
	return someInput;
}
```

### Pretty Date/Time
Use `LocalDate` and `LocalTime` to retrieve information about the current date/time. Print out some of their information in a useful way to you (e.g. "Today is 19 October 2018 and the time is 10:30")

You will need to *import* these 2 Classes:

```java
import java.time.LocalDate;
import java.time.LocalTime;
```

### Sum Of Digits
Write a Java program and compute the sum of the digits of an integer.

e.g for a number a = 1234, print: `10` (1 + 2 + 3 + 4)

___Hint___: You will need to make use of `.toString()`, and `.split()` on a `String`

