package eca.exercises.BANK;

public class AccountHolder {

    /*
     Create the following properties:
     - account, which is a BankAccount belonging to the AccountHolder
     - phoneNumber
     - postCode
     */


    // Create the constructor and getters


    public void deposit(Double amount) {
        // Deposit amount into the AccountHolder's account

    }

    public void withdraw(Double amount) {
        // Withdraw amount from the AccountHolder's account

    }

    public void transfer(AccountHolder recipient, Double amount) {
        // Transfer amount from this AccountHolder's account to the recipient

    }

    public static void main(String[] args) {
        var bob = new AccountHolder();
        var geoff = new AccountHolder();

        System.out.println(bob); // bob.getAccount().getBalance()
        System.out.println(geoff); // geoff.getAccount().getBalance()

        bob.transfer(geoff, 100.00);

        System.out.println(bob); // bob.getAccount().getBalance()
        System.out.println(geoff); // geoff.getAccount().getBalance()
    }
}
