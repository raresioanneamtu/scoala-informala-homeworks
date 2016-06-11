package siit.java.homeworks.bankaccounts;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class SavingsAccountTest {

	@Test
	public void addFunds() {
		Date accountCreationTime = TestUtils.getDate(2016, 1, 1);
		BankAccount savingsAccount = new SavingsAccount(accountCreationTime, 0, 0, 0, 0);
		Date balanceInterogationTime = TestUtils.getDate(2016, 5, 1);
		savingsAccount.addFunds(100);
		assertEquals(960, savingsAccount.getBalance(balanceInterogationTime), 0);
		}

}
