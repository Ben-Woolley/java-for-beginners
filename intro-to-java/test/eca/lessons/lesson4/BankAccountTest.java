package eca.lessons.lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

	@Test
	public void testBankAccountWithConstructor() {
		BankAccount account = new BankAccount("Bob", "100", 100);

		String expectedName = "Bob";
		String expectedAccountNumber = "100";
		Integer expectedBalance = 100;

		assertEquals(expectedName, account.getHolderName());
		assertEquals(expectedAccountNumber, account.getAccNumber());
		assertEquals(expectedBalance, account.getBalance());
	}

	@Test
	public void testBankAccountDepositNegative() {
		BankAccount acc = new BankAccount("foo", "bar", -100);
		Integer expBalance = 0;

		acc.deposit(100);

		assertEquals(expBalance, acc.getBalance());

	}

	@Test
	public void testBankAccountDepositPositive() {
		BankAccount acc = new BankAccount("foo", "bar", 0);
		Integer expBalance = 100;

		acc.deposit(100);

		assertEquals(expBalance, acc.getBalance());
	}

	@Test
	public void testBankAccountDepositNull() {
		BankAccount acc = new BankAccount("foo", "bar", 0);
		Integer expBalance = 0;

		acc.deposit(0);

		assertEquals(expBalance, acc.getBalance());
	}

}