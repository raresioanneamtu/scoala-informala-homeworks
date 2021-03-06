package siit.java.homeworks.bankaccounts;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class RunningAccountTest {

	@Test
	public void RunningAccountTestWithSalary() {
		// given
		float balance = 0;
		float monthlyFee = 10f;
		float salaryPerMonth = 1000;
		Date accountCreationTime = TestUtils.getDate(2016, 1, 1);
		RunningAccount runningAccount = new RunningAccount(accountCreationTime, monthlyFee);
		runningAccount.addFunds(salaryPerMonth);
		// when
		Date balanceInterogationTime = TestUtils.getDate(2016, 2, 1);
		balance = salaryPerMonth - monthlyFee;
		// then
		assertEquals(balance, runningAccount.getBalance(balanceInterogationTime), 0);
	}

	@Test(expected = InsufficientFundsException.class)
	public void whenTryingToWithdrawMoneyMoreThanBalance_paymentFails() throws Exception {
		// given
		float balance = 1000;
		Date accountCreationTime = TestUtils.getDate(2016, 1, 1);
		RunningAccount runningAccount = new RunningAccount(accountCreationTime, 10f);
		runningAccount.addFunds(balance);
		// when
		runningAccount.withdrawFunds(1100);
	}
}
