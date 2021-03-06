package siit.java.homeworks.bankaccounts;

import java.util.Calendar;
import java.util.Date;

/**
 * This class is the base class for different bank accounts.
 * 
 * @author Rares Neamtu.
 */

public abstract class BankAccount {

	protected float balance;
	protected Date accountCreationDate;
	private float monthlyFee;

	/**
	 * This is the constructor.
	 * 
	 * @param accountCreationDate
	 * @param monthlyFee
	 *            If there are no money in the account, it will be by default 0.
	 */
	public BankAccount(Date accountCreationDate, float monthlyFee) {
		super();
		this.accountCreationDate = accountCreationDate;
		this.monthlyFee = monthlyFee;
	}

	/**
	 * This method adds an amount of money to the accounts balance.
	 * 
	 * @param amount
	 */

	public void addFunds(float amount) {
		balance += amount;
	}

	/**
	 * This method throws an exeption if there are insufficient funds.
	 * 
	 * @param amount
	 * @throws InsufficientFundsException
	 */

	public void withdrawFunds(float amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException();
		}
		balance -= amount;
	}

	/**
	 * This method returns the balance.
	 * 
	 * @param balanceDate
	 * @return
	 */

	public float getBalance(Date balanceDate) {
		return getBalanceWithMonthlyFeesApplied(balanceDate);
	}

	/**
	 * This method returns the balance with monthly fees apllied.
	 * 
	 * @param balanceDate
	 * @return
	 */
	private float getBalanceWithMonthlyFeesApplied(Date balanceDate) {
		Calendar accountCreationTime = Calendar.getInstance();
		accountCreationTime.setTime(accountCreationDate);
		// JANUARY is 0
		int accountCreationMonth = accountCreationTime.get(Calendar.MONTH);
		Calendar balanceTime = Calendar.getInstance();
		balanceTime.setTime(balanceDate);
		int currentMonth = balanceTime.get(Calendar.MONTH);
		return balance - monthlyFee * (currentMonth - accountCreationMonth);
	}

}
