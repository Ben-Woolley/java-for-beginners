# Exercise 1: 
Write a program that has 2 Integer variables `a` and `b`, print the result of each of applying addition, subtraction, division, multiplication, and modulus of `a` to `b`.

e.g given a = 10 and b = 2, print:

```java
//print 12 (a+b)
//print 8 (a-b)
//etc
```

# Exercise 2: 
Write a program that prints out the `n` times table in a pretty format e.g

```java
1 X 2 = 2
2 X 2 = 4
...
```

# Exercise 3:
Given a list of integers, find and print the largest, find and print the smallest, find and print a specified value (or null if it doesnt exist)

e.g given the following list of integers `[1,2,3,4,5]` and a specified value m = 3 print:
```java
Min: 1
Max: 3
M: 3
```

# Exercise 4:

Write a program that has 2 Integer variables `a` and `b`, print the result of each of applying equal, greater than, less than, greater than or equal, and less than or equal of `a` to `b`.


e.g given a = 10 and b = 2, print:
```java
a equals b // false
a > b // true
a < b // false
```

# Exercise 5:

Write a Java program and compute the sum of the digits of an integer.

e.g for a number a = 1234, print: `10` (1 + 2 + 3 + 4)

___Hint___: You will need to make use of `.toString()`, and `.split()` on a `String`

# Exercise 6: 

Use `LocalDate` and `LocalTime` to retrieve information about the current date/time. Print out some of their information in a useful way to you (e.g. "Today is 19 October 2018 and the time is 10:30")

You will need to *import* these 2 Classes:

```java
import java.time.LocalDate;
import java.time.LocalTime;
```

# Exercise 7:

Write a Java program to accept a number and check the number is even or not. Output the `Boolean` value of  the result

e.g for a number a = 10 print `true`

# Exercise 8:

Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer

e.g for:
```java
a = 10
b = 5
c = 15
print true (a + b = c)
```
# Exercise 9:

Write a Java program to convert seconds to hour, minute and seconds.

# Exercise 10:

Write a program that swaps the values of two variables.

___Hint___: Easy read integer: 
```java
public Integer readInteger() {
	Integer someInput = Integer.parseInt(new Scanner(System.in).nextLine()); 
	return someInput;
}
```


