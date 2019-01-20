# Lesson 1 - Intro, installation and setup

## Lesson Outcomes
This session is for introducing the course and setting up students' machines.
Please feel free to ask any questions during the session.

## Welcome to Java 101!
This course is intended to be an introduction to **programming that happens to be in Java**.
Many of the concepts you learn here are in the vast majority of programming languages out there; each one being a different tool for different jobs!

By the end of this course I hope you will have an awareness or understanding of:
* The fundamental concepts that programming languages feature
* Some basic object-oriented programming concepts

And the ability to:
* Solve problems by "translating english into Java"
* Write small, interactive, multi-file Java programs

## How do programs run on your computer?
Computers understand a fundamental set of instructions - these instructions are however very primitive and way too low-level for everyone to write programs in.
Programming languages sit on top of these primitive instructions and give us a more human-friendly set of tools.

The world now has more programming languages than it knows what to do with - built not only on top of machine code but also on each other.

Each has it's own specialty or programming opinions that makes it the best for certain jobs, for example:
* **C** is a language written originally for building operating systems for computers. It exposes enough of the machine level to let clever people to magic, and dangerous people cause many more bugs.
* **R** specializes in statistical computing
* **Python** is a general-purpose language focusing on readability

These languages end up running on computers in one of two ways:
* The program source code is **compiled** down to machine-understandable code.
    - e.g. C, C++, Java*
* An **interpreter** runs the program that knows how to turn your source into machine-understandable code **while it runs**.
    - e.g. Python, Java*

Java actually does both! Java source is compiled to Java Virtual Machine (JVM) bytecode, which the JVM installed on supported machines can then interpret!

## What is Java?
Java is one of the most popular programming languages used today, it is:
* Object-oriented - You have objects of certain types, that have properties and ways to interact with those properties.
* Class-based - You define the blueprints for objects before you create them.

Java is designed to be runnable everywhere by use of the Java Virtual Machine (JVM). The JVM is written to run on most machines, and Java is compiled (converted) to a language that runs on the JVM. **Write Once, Run Anywhere** is one of the biggest advantages of Java.

Because Java is used everywhere, it's used for many things. It is used across Expedia Group for most of the functionality of our websites. It has also been used to write:
* Simulations
* Video games
* Development tools (like the one we'll be using)
* Android apps (In a sense, they use the same language, but Android doesn't use the JVM)

## Common pitfalls for beginners
As with learning most things, we all make the same mistakes and assumptions, here is a list of what I've noticed while teaching this course.

* **You can refer to the lesson material while doing exercises** - it's not an exam, treat it like you're solving any problem.
* **Lines that dont end in a bracket of some sort must end with a semicolon ;** - this is so Java knows the *expression* you're writing is done.
* **Java is *case sensetive*** - you must match the case and be consistent with your naming, otherwise your program will break!
* **Every open bracket, brace, and parenthesis must have a matching close** - this is how Java knows what context something is happening in. If they're in the wrong place you're likely going to run into problems.
* **If your program is in an unhappy state please ask for help!** - It's much easier for us to fix something as soon as it goes wrong, rather than after you finish writing and it won't compile.

## Setup
Today we are going to get your machine ready for writing, compiling, and running Java programs:
* [Git](https://git-scm.com/downloads)
* [The Java 8 JDK (Java Development Kit)](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* Install IntelliJ IDEA Community edition as per the [Setup Guide](../intellij-setup.md).

We are then together going to **clone/download** the Java for beginners git project and **import** it into IntelliJ.

---
[Homepage](../index.md)
