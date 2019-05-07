# Lesson 1 - Describing how to solve problems

## Lesson Outcomes
This session is to introduce the idea of programming as a problem solving tool.  
We'll learn to describe *how to solve problems* in a structured format known as pseudocode.

## What programming isn't
Unfortunately programming doesn't do anything for you on its own.

Every piece of functionality on every computer - from the operating system all the way up to this page being drawn from HTML have all been enabled by someone writing that functionality.

## What programming is
Programming or software development is essentially **writing the general solution to a problem** in a **strongly structured and limited set of keywords**.

So programming doesn't solve your problems for you, it enables you to:
1. use a computer to do the brainwork that you don't want to do yourself
2. on tasks you can figure out the solution to.

### An Exercise
Imagine a person who has no idea how anything works, but can carry out basic instructions.

How would you tell them how to make a cup of tea?

## Pseudocode
Pseudocode is an almost-bridge between normal English statements and a fully functional programming language. It's a way of expressing the logic you want to achieve without having to go straight into writing code.  
It doesn't have a set syntax (defined structure) but does have the key components of most programming languages.

### Our pseudocode syntax
In order to describe solutions to problems, most programming languages provide the following functionality at a minimum.

#### Variables
Variables are for storing values we can refer to and update in our program. In our case we write and set a variable as `set *variableName* to *variableValue*`
```
set myAge to 24
set legalDrinkingAge to 18
if (myAge is greater than or equal to legalDrinkingAge)
  I can drink
else
  I cannot drink
```

#### if-statements
To add *conditional logic*, we make use of if-statements. These let us do one thing or another based on some condition or true/false value.  
You can chain if-statements together if you have more than 2 paths you want to define.
```
if (*some condition*)
  *thing to do if true*
else
  *thing to do if false
```

and examples in-use:
```
if (today is Friday)
  send a team lunch invitation in outlook

if (it is the morning and it is the weekend)
  stay at home and do nothing
else
  go to work

if (the user is the super user)
  user can do anything
else if (the user has admin privileges)
  user can do admin tasks
else
  user has no special permissions
```

#####:boom: Whiteboard quick-fire! :boom:
Write pseudocode for the following:
> If Polly has been good, Santa will give her a toy. If Polly has been bad, Polly's gift will be a lump of coal.

#### for-loops
For loops enable you to do something multiple times, there are 2 varieties:

##### for-each
Lets you do something for each item in a collection.
```
for (each item in a collection)
  *do something with each item
```

e.g.
```
for (each day of the month)
  display the day, weekday, and events on the day
```

#####:boom: Whiteboard quick-fire! :boom:
Write pseudocode for the following:
> Write out a receipt for each item in Santa's sack of presents.

#### for with counter
Provides a counter which you can use for whatever you want. The counter can:
* Start at whatever value
* End at whatever value
* Increment at whatever value (including going down)

```
for (counter from *lowerBound* to *upperBound*)
  *do something for each value in the range
```
or, with a different stepping, meaning the loop only happens on every `n`th value:
```
for (counter from *lowerBound* to *upperBound*, step *stepValue*)
  *do something for each value in the range, at the given stepValue
```

e.g.
```
set weekDays to [Monday,  Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
for (counter from 1 to 7)
  print the counter, next to to it also print weekDays[counter] (the weekday in the counter'th position)
```

#####:boom: Whiteboard quick-fire! :boom:
Write pseudocode for the following:
> Happy Street has house numbers 1-38. Santa wants a list of house numbers printed out so he can tick off each house he's visited.

Extension:
> Santa is feeling lazy so he only wants to visit every *other* house. Print a list with every 2nd house instead.

#### While loop
This is another loop - enabling you to do something many times.  
This one differs in that it depends on any expression that will result in a true/false value.
```
while (*some condition*)
  * do something, for as many times as the condition stays true
```

e.g.
```
set counter to 0
while (counter is less than 10)
  print counter
  set counter to counter + 1
```

#####:boom: Whiteboard quick-fire! :boom:
Write pseudocode for the following:
> Santa doesn't know how many houses are on Long Street but he knows he'll get too tired if he visits too many. He will keep visiting houses until he's visited 108 in total.

### Examples
#### Example 1 - Is it raining?
For example, to decide whether to take out an umbrella today, I'd say
> If it's going to rain then I'd take my umbrella

Which I can write in a more logical way as:
```
if (it is going to rain)
  bring my umbrella
else
  leave it at home
```

#### Example 2 - Are you on the list?
Or to find someone's name in an unsorted list, I'd say
> Go through the list until I see the name I'm looking for

This is a bit harder to translate, but essentially I'm saying
> I would check each item in the list, until I find the name or I've checked the entire list

Which I can now write as:
```
for (each name in the list)
  if (that name matches the one I'm looking for)
    the name is in the list
  else
    continue through the list

if (I go through the whole list without finding the name)
  the name is not in the list
```

and more strictly, but using a *variable*, as:
```
set isInTheList to false
for (each name in the list) do
  if (that name matches the one I'm looking for)
    set isInTheList to true
  else
    continue through the list

if (isInTheList is true)
  the name is in the list
else
  the name is not in the list
```

### Exercises
TBD

---
[Homepage](../index.md)
