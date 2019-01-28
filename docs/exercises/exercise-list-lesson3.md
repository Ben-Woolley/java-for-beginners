# Exercise list Topic 3

This is the exercise list for [lesson 3](../lessons/lesson3) - __Classes and Methods__

## Circles
### Exercise 1
Create a `Circle` class. The class will have the property `diameter` and must implement the following methods:
* `getArea` - which returns the area of the circle.
* `getCircumference` - which returns the circumference of (distance around) the circle

### Exercise 2
Create a `Product` class. The class will have the properties:
* `name` of the product
* `price` of the product
* `quantity` of the product purchased
* `tax` being a percentage tax that applies to the product on purchase

Then create a `InvoicePrinter` class with a function called `printInvoice` function.
This function will take a `List<Product>` and print a receipt to the console. The receipt must contain:
* Each item's price with and without tax
* A summary at the bottom, with at least the total *with and without tax*

You can enhance the receipt however you want after this, for example you could add:
* Running totals
* Tax percentage/amount on its own for each product
* An argument to add a percentage tip
* ...or anything else you can think of


## Banking
### Exericse 1

* The `Java class` called `BankAccount` is started below. An object of type `BankAccount` represents the basics of a commercial account, it has the following instance variables to hold data:
   - __AccountHolder__ : String -> represents the name of the person who owns the bank account.
   - __Balance__ : Integer -> represents the current balance of the account as an integer (i.e no decimals)
   - __AccountNo__ : String -> represents the number of the account

```java
public class BankAccount {

  private String accountHolder;
  private Integer balance;
  private String accountNumber;

// rest of code goes here

}
```

a) Write a constructor for the class `BankAccount` which takes in two strings and an integer as arguments (for accountHolder, accountNumber and balance, respectively) and instantiates the instance variables to those values.

b) For the following function, based on the method's signature and name, implement its functionality:

```java

public void deposit(Integer amount) {
 // implement deposit function

}

```

c) Write a method called `toString` that returns the details of the bank account as a string, i.e the name of the account holder, name of the bank account and balance


d) Using the following getter methods, create another method that takes a bank account as an argument, and compares two bank accounts. The method should return the name and bank account number of the account with a higher balance

```java

public String getBalance() {
  return this.balance;
}

public String getHolderName() {
  return this.accountHolder;
}

public String getAccNumber() {
  return this.accountNumber;
}

// signature of compare method:
public String compareAccounts(BankAccount compareAccount);

```

e) Test your methods by instantiating two bank accounts in a class with a main method.


### Exercise 2

 Using the class and methods from above, create a class called `AccountHolder`. Your AccountHolder should:

* Have a bank account
* Have a name and contact details (Address/Phone Number etc)
* Have getter and setter methods for all fields
* Have methods used to withdraw and deposit. Note: withdrawal should not be possible if the bank account's balance falls below 0.
* Have a transfer method that takes in an AccountHolder object as an argument and an integer representing the sum to be transfered. That sum will be removed from the "source" account and added to the "destination" account (i.e the account holder who calls the method transfers to the one in the argument). E.g

```java
AccountHolder bob = new AccountHolder(); // assume Bob has $100 in his BankAccount object
AccountHolder alice = new AccountHolder(); // assume Alice has $200 in her BankAccount object
bob.transfer(alice, 100);
bob.getAccountBalance(); // would return $0
alice.getAccountBalance(); // would return $300

// think about constraints accordingly, such as using the transfer method when your bank account is negative.
```


Change the code accordingly in the BankAccount class to reflect your AccountHolder implementation.

* In the `HomeWorkMain.java` class, create two instances of an AccountHolder. Using the two instances you should successfully:
    - be able to get the balance of both account holders' accounts;
    - be able to use the withdraw method on both;
    - be able to use the deposit method on both and get the account balances;
    - be able to transfer money from one account holder to another;

### Tests

The folder `intro-to-java/test/eca/lessons/lesson3/` contains the tests for this exercise. To make sure you get the correct output and your program works as expected, you should run the tests for each exercise in order (`BankAccountTest`, `AccountHolderTest` and then `HomeWorkMainTest`)

