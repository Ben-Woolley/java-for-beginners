package eca.exercises.BANK;

public class BankAccount {

    /*
     Create the following properties:
     - accountHolder
     - balance
     - accountNumber
     */

    // Create a constructor, and create getters for these properties


    public void deposit(Double amount) {
        // Implement deposit's functionality - which adds funds to this account

    }

    public void withdraw(Double amount) {
        // Implement withdraw's functionality - which takes funds from this account

    }

    public void compareAccounts(BankAccount otherAccount) {
        // Compare this account to the otherAccount and print a String representing the result

    }

    @Override
    public String toString() {
        // Implement your own toString, make a String that represents the BankAccount effectively and return it
        return "Not implemented";
    }


    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount anotherAccount = new BankAccount();

        System.out.println(myAccount);
        myAccount.withdraw(50.0);
        System.out.println(myAccount);
        myAccount.deposit(500.0);
        System.out.println(myAccount);

        myAccount.compareAccounts(anotherAccount);
    }
}
