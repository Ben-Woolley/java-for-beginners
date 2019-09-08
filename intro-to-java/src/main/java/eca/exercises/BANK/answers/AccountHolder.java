package eca.exercises.BANK.answers;

public class AccountHolder {

    /*
     Create the following properties:
     - account, which is a BankAccount belonging to the AccountHolder
     - phoneNumber
     - postCode
     */
    private BankAccount account;
    private String phoneNumber;
    private String postCode;

    // Create the constructor and getters
    public AccountHolder(BankAccount account, String phoneNumber, String postCode) {
        this.account = account;
        this.phoneNumber = phoneNumber;
        this.postCode = postCode;
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void deposit(Double amount) {
        // Deposit amount into the AccountHolder's account
        account.deposit(amount);
    }

    public void withdraw(Double amount) {
        // Withdraw amount from the AccountHolder's account
        account.withdraw(amount);
    }

    public void transfer(AccountHolder recipient, Double amount) {
        // Transfer amount from this AccountHolder's account to the recipient

        // Only if the account can afford it
        if (account.getBalance() >= amount) {

            withdraw(amount); // Withdraw the money from myself
            recipient.deposit(amount); // And deposit the same amount to the recipient
        } else {
            System.out.println("Unable to transfer, insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount("Bob", 17582.23, 1);
        BankAccount geoffsAccount = new BankAccount("Geoff", 5030.01, 2);

        AccountHolder bob = new AccountHolder(bobsAccount, "07193869294", "EC1V 4EX");
        AccountHolder geoff = new AccountHolder(geoffsAccount, "07118573273", "EC1V 4AB");

        System.out.println(bob.getAccount().getBalance()); // bob.getAccount().getBalance()
        System.out.println(geoff.getAccount().getBalance()); // geoff.getAccount().getBalance()

        bob.transfer(geoff, 100.00);

        System.out.println(bob.getAccount().getBalance()); // bob.getAccount().getBalance()
        System.out.println(geoff.getAccount().getBalance()); // geoff.getAccount().getBalance()
    }
}
