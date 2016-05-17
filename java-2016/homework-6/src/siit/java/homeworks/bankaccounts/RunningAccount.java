package siit.java.homeworks.bankaccounts;

import java.util.Date;

/**
 * This class extends from BankAccount. In this account we have the salary and
 * to we can make withdrawals and adds with no comission.
 * 
 * @author Rares Neamtu.
 *
 */
public class RunningAccount extends BankAccount {

	/**
	 * This is a constructor.
	 * 
	 * @param accountCreationDate
	 * @param monthlyFee
	 */
	public RunningAccount(Date accountCreationDate, float monthlyFee) {
		super(accountCreationDate, monthlyFee);
	}

}
