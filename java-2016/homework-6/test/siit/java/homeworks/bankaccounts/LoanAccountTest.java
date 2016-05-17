package siit.java.homeworks.bankaccounts;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class LoanAccountTest {

	@Test
	public void loanAccepted_loanPouredIntoRunningAccount() {
		// given
		float installmentsPeriod = 60f;
		float loanAmount = 10000f;
		// when
		Date accountCreationTime = TestUtils.getDate(2016, 1, 1);
		LoanAccount loanAccount = new LoanAccount(accountCreationTime, 10000f, installmentsPeriod, 0.01f);
		RunningAccount runningAccount = new RunningAccount(accountCreationTime, 10f);
		runningAccount.addFunds(loanAccount.balance);
		// then
		assertEquals(loanAmount, runningAccount.getBalance(accountCreationTime), 0);

	}

}
