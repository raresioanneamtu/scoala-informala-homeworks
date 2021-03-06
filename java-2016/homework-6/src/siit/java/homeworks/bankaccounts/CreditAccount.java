package siit.java.homeworks.bankaccounts;

import java.util.Date;

/**
 * This class extends from BankAccount, its a credit account for a client.
 * 
 * @author Rares Neamtu.
 */
public class CreditAccount extends BankAccount {

	private float credit;
	private float withdrawalCommision;
	private float payBackPenalty;

	/**
	 * This is the constructor.
	 * 
	 * @param accountCreationDate
	 * @param credit
	 * @param withdrawalCommision
	 * @param payBackPenalty
	 */

	public CreditAccount(Date accountCreationDate, float credit, float withdrawalCommision, float payBackPenalty) {
		super(accountCreationDate, 0);
		this.credit = credit;
		balance = credit;
		this.withdrawalCommision = withdrawalCommision;
		this.payBackPenalty = payBackPenalty;
	}

	/**
	 * This method decrease an amount of money from the account with a
	 * withdrawal commission.
	 */
	@Override
	public void withdrawFunds(float amount) throws InsufficientFundsException {
		super.withdrawFunds(amount + amount * withdrawalCommision);
	}

	/**
	 * This method returns the balance.
	 */
	@Override
	public float getBalance(Date balanceDate) {
		// Ideally we should calculate the credit penalty for each and every
		// month, but for the sake of simplicity we will only compute it once.
		float balance = super.getBalance(balanceDate);
		return applyPenalties(balance);
	}

	/**
	 * This method returns the balance with penalties.
	 * 
	 * @param balance
	 * @return
	 */
	private float applyPenalties(float balance) {
		if (credit <= balance) {
			return balance;
		} else {
			return balance - (credit - balance) * payBackPenalty;
		}
	}

}
