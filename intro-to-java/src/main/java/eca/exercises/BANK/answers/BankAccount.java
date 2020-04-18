package eca.exercises.BANK.answers;

public class BankAccount {

    /*
     Create the following properties:
     - accountHolder
     - balance
     - accountNumber
     */
    private String accountHolder;
    private Double balance;
    private Integer accountNumber;

    public String getAccountHolder() {
        return accountHolder;
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    // Create a constructor, and create getters for these properties
    public BankAccount(String accountHolder, Double balance, Integer accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(Double amount) {
        // Implement deposit's functionality - which adds funds to this account
        balance = balance + amount;

    }

    public void withdraw(Double amount) {
        // Implement withdraw's functionality - which takes funds from this account

        // Create a variable of result of the withdrawal
        Double withdrawResult = balance - amount;

        // Check if withdrawal is possible without going into negative balance
        if (withdrawResult >= 0) {
            balance = withdrawResult;
        } else {
            // If there isn't enough money, reject the request and print
            System.out.println("Unable to withdraw funds");
        }
    }

    public void compareAccounts(BankAccount otherAccount) {
        // Compare this account to the otherAccount and print a String representing the result

        Double difference = balance - otherAccount.getBalance(); // Calculate the difference between the accounts' balances

        // Print both balances with the account holder names, and the difference
        System.out.println(accountHolder + "'s balance: " + balance + " | " + otherAccount.getAccountHolder() + "'s balance: " + otherAccount.getBalance() + " | difference: " + difference);
    }

    @Override
    public String toString() {
        // Implement your own toString, make a String that represents the BankAccount effectively and return it
        return "BankAccount with accountHolder " + accountHolder + ", accountNumber " + accountNumber + ", balance " + balance;
    }


    public static void main(String[] args) {
        var myAccount = new BankAccount("Greg", 1500.0, 1);
        var anotherAccount = new BankAccount("Bob", 300.15, 2);

        System.out.println(myAccount);
        myAccount.withdraw(50.0);
        System.out.println(myAccount);
        myAccount.deposit(500.0);
        System.out.println(myAccount);

        myAccount.compareAccounts(anotherAccount);
    }
}
