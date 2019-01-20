package eca.lessons.lesson3;

public class BankAccount {
	private String accountHolder;
	private Integer balance;
	private String accountNumber;

// rest of code goes here
	public BankAccount(String acc, String accN, int balance) {
		this.accountHolder = acc;
		this.accountNumber = accN;
		this.balance = balance;
	}

	public String getHolderName() {
		return accountHolder;
	}

	public Integer getBalance() {
		return balance;
	}

	public String getAccNumber() {
		return accountNumber;
	}

	public void deposit(Integer sum) { this.balance += sum; }
}
