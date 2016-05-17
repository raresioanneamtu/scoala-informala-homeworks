
package siit.java.homeworks.bankaccounts;

import java.util.Calendar;
import java.util.Date;

/**
 * This class is a child class of BankAccount and it is used to save money with
 * a commission fee for every withdrawal (i.e 0.2%) and it generates interest
 * (i.e 6% / year).
 * 
 * @ Rares Neamtu.
 */
public class SavingsAccount extends BankAccount {

	private float withdrawCommision;
	private float interest;

	/**
	 * This is the constructor.
	 * 
	 * @param accountCreationDate
	 * @param monthlyFee
	 * @param interest
	 * @param withdrawCommision
	 */
	public SavingsAccount(Date accountCreationDate, float monthlyFee, float withdrawalCommision, float interest,
			float withdrawCommision) {
		super(accountCreationDate, monthlyFee);
		this.withdrawCommision = withdrawCommision;
		this.interest = interest;
	}

	/**
	 * This method calculates the monthly withdraw money.
	 * 
	 */
	@Override
	public void withdrawFunds(float amount) throws InsufficientFundsException {
		super.withdrawFunds(amount + amount * withdrawCommision);
	}

	/**
	 * This method brings the money that we own in this account after we deposit
	 * them.
	 */
	public float getBalance(Date balanceDate) {

		float balance = super.getBalance(balanceDate);
		return balance + getBalanceWithYearInterestApplied(balanceDate);

	}

	/**
	 * This method calculates the interest of the SavingAccount.
	 * 
	 * @param balanceDate
	 * @return
	 */
	private float getBalanceWithYearInterestApplied(Date balanceDate) {

		Calendar accountCreationTime = Calendar.getInstance();
		accountCreationTime.setTime(accountCreationDate);
		// JANUARY is 0
		int accountCreationYear = accountCreationTime.get(Calendar.YEAR);
		Calendar balanceTime = Calendar.getInstance();
		balanceTime.setTime(balanceDate);
		int currentYear = balanceTime.get(Calendar.YEAR);
		return balance * interest * (currentYear - accountCreationYear);
	}

}
