# Lesson 5 - Testing your code

After writing your program you need to be able to **prove it does what it's meant to do**.
To achieve this we can write tests in Java that we can run against out program automatically.

There are a few different kinds of tests you can write:
* **Unit tests** cover a single class' functionality.
* **Integration tests** are concerned with verifying that your connection with other services is fine.
* **Acceptance tests** verify that your system as a whole meets the criteria set out by the feature requestor.

We are mostly going to cover unit tests as our creations are relatively small.

## How to unit test software
Suppose we have a `FizzBuzzNumberGenerator` which has one method `getStringForNumber` - which returns the string corresponding to how it should be treated in our FizzBuzz exercise:
* For multiples of three return "Fizz" instead of the number.
* For the multiples of five return "Buzz" instead of the number.
* For numbers which are multiples of both three and five return "FizzBuzz" instead of the number.
* For numbers that don't follow these rules return the number.

Each of these rules about `FizzBuzzGenerator.getStringForNumber` is a test case we can (and should) write to validate that the method works how we expect it to.

### How many tests should I write?
The general rule is: for every possible code branch (e.g. every different path through `if` statements) you will have to write a test.

This is illustrated in the below example, where each `return` statement represents the end of a path in our code.
```java
public String getOneOfTheStrings() {
    if (condition1) {
        if (condition2) {
            return "branch 1";
        } else {
            return "branch 2";
        }
    } else {
        return "branch 3";
    }
}
```

So we need 3 tests:
* `shouldReturnBranch1_WhenCondition1True_AndCondition2True`
* `shouldReturnBranch2_WhenCondition1True_AndCondition2False`
* `shouldReturnBranch3_WhenCondition1False`

## How to write unit tests in Java
The majority of tests in Java are written with the help of a **Testing Library/Framework** - which provides extra functionality that makes writing and running our tests very simple. In addition it enables **automated build tools** to run the tests and **react to whether they fail or not**.

We are going to use [JUnit](https://junit.org/) for this purpose, which is one of the most popular testing frameworks available. The popular alternative is [TestNG](https://testng.org). Both feature mostly the same feature set and a very similar syntax, so you'll be able to use either in the future.

Unit tests are written in a different class to the implementation (usually called `*WhateverTheClassToTestIsCalled*Test`). The structure is not like classes as you expect to write them:
```java
public class FizzBuzzGeneratorTest {

    private FizzBuzzGenerator fizzBuzzGenerator; // your victim variable

    @Before
    public void setup() {
       fizzBuzzGenerator = new FizzBuzzGenerator();
    }

    @Test
    public void shouldReturnNumberWhenNotMultipleOfThreeOrFive() {
        // given (preconditions)
        Integer number = 1;

        // when (perform the action)
        String actual = fizzBuzzGenerator.getStringForNumber(number);

        // then (check values are what you expect)
        assertEquals("1", actual);
    }
}
```
(This example is included in the project)

There are a few new things in this example including **annotations** (`@` - tagged words) which allow you to tag on functionality defined by the annotation to the code its on top of. We have defined:
* `@Before` which makes the method it's assigned to run before every test.
* `@Test` which marks the method it's assigned to as a test.
* `assertEquals` which is an **assertion** which will define whether our test passes or fails. With no assertions a test will pass.
There are many different assert methods provided including `assertTrue`, `assertFalse`, and `assertNotEquals`.

## Exercises
### Exercise 1
Based on the behavior we expect of `FizzBuzzGenerator` - write the remaining unit tests in `FizzBuzzGeneratorTest` to verify it works as expected.

### Exercise 2
Create unit tests for the methods of the `Circle` class you created in the previous lesson.
