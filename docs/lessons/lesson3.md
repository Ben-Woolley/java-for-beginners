# Lesson 3 - Classes and methods

## Lesson Outcomes
Today we'll be expanding on Java's capabilities by introducing its **object-oriented** features.
We'll cover:
* **Classes** and **objects**
* **Methods** which act on the **state** of an object

## Classes
So far we've been using Java's built-in types (e.g. `String`, `List`).  In our own applications however, we'll have to represent objects that exist in our domain.

What if I want to represent a `Person`, who has a `name`, `age`, and `height`?
We can do that in Java by defining a `class` - a blueprint from which we can create many different `Person` objects:
```java
public class Person {
    private String name;
    private Integer age;
    private Integer height;

    public Person(String name, Integer age, Integer height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getHeight() {
        return height;
    }
}
```

There are a few new things going on here, so we'll cover them step by step.

### Announcing the class i.e. `public class Person { ... }`
This defines that we're creating a new blueprint/`class` which defines a `Person` - it is `public` meaning anyone anywhere in another file can use this `class`.

### Fields e.g. `private String name;`
A **field/property** of a class is a piece of information that a `Person` holds internally. All fields of an object are the internal **state** of that object.
i.e. `name`, `age`, and `height` are together the state of a `Person`.
In this case it is `private` to stop outside classes from changing a `Person`'s state in ways we don't want.

### Constructor e.g. `public Person(...) { ... }`
The **constructor** is what we call to create new **instances** (actual examples of) a `Person`.
The constructor is always called using the word `new` e.g. `Person bob = new Person("Bob", 37, 180);`.

### Methods e.g. `public String getName() { ... }`
**Methods** are **functions** that interact with the internal state of an object.
In this example what we have are called "**getters**" as all they do is return one of the properties of an object.
Methods are capable of doing pretty much anything, as you have proven in previous exercises.

## Methods
Once again, **methods** are **functions** that interact with the internal state of an object.
Methods are the only way you'll interact with objects, this lets the creator know that the internal state is always valid (and things won't break unexpectedly).

A method is defined as:
```java
public class Something {
    // properties
    // constructor

    public ReturnType methodName(ArgumentType argument1, ArgumentType... arguments) {
        // Do things (may involve internal state)
        return new ReturnType(); // some value of type ReturnType
    }
}
```
Where:
* `ReturnType` is the type of object your method is to return (or `void` if nothing)
* `(ArgumentType ...)` is the arguments - the inputs required for the method to do its job.
e.g. `multiply(Integer value, Integer multiplier)` takes 2 arguments to perform `value * multiplier`.
* `return` is the keyword that says "give this back to the code that called me".

## Exercises
The exercise sheet for this topic can be found [here](../exercises/exercise-list-lesson3).

---
[Homepage](../index.md)
