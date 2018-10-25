# Exercise list _Chapter 4_

* This is the exercise list for [lesson 4](https://ben-woolley.github.io/java-for-beginners/calculator/lesson4.html) - __Classes and Methods__

## Exericse 1

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


## Exercise 2

 Using the class and methods from above, create a class called `AccountHolder`. Your AccountHolder should:

* Have a bank account
* Have a name and contact details (Address/Phone Number etc)
* Have getter and setter methods for all fields
* Have methods used to withdraw and deposit. Note: withdrawal should not be possible if the bank account's balance falls below 0.

Change the code accordingly in the BankAccount class to reflect your AccountHolder implementation.

