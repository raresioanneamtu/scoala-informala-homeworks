package siit.java.homeworks.bankaccounts;

import java.util.Calendar;
import java.util.Date;

/**
 * This class extends from BankAccount, provides to a client a loan.
 * 
 * @author Rares Neamtu.
 *
 */
public class LoanAccount extends BankAccount {

	private float insttalmentMonth;
	private float credit;

	/**
	 * This is the constructor.
	 * 
	 * @param accountCreationDate
	 * @param monthlyFee
	 * @param credit
	 * @param insttalmentMonth
	 */
	public LoanAccount(Date accountCreationDate, float monthlyFee, float credit, float insttalmentMonth) {
		super(accountCreationDate, 0);
		this.credit = credit;
		this.insttalmentMonth = insttalmentMonth;
	}

	/**
	 * Can't make withdrawal operations on this type of acount.
	 */
	@Deprecated
	@Override
	public void withdrawFunds(float amount) throws InsufficientFundsException {
		throw new UnsupportedOperationException();
	}

	/**
	 * This method has a credit interest of 10%.
	 * 
	 * @param credit
	 * @return
	 */
	public float creditWithInterest(float credit) {
		return credit + (credit / 10);
	}

	/**
	 * This method returns the balance.
	 */
	public float getBalance(Date balanceDate) {
		return getBalanceWithInsttalmentForMonthApplied(balanceDate);
	}

	/**
	 * This method returns balance with installment for month applied.
	 * 
	 * @param balanceDate
	 * @return
	 */
	private float getBalanceWithInsttalmentForMonthApplied(Date balanceDate) {
		Calendar accountCreationTime = Calendar.getInstance();
		accountCreationTime.setTime(accountCreationDate);
		// JANUARY is 0
		int accountCreationMonth = accountCreationTime.get(Calendar.MONTH);
		Calendar balanceTime = Calendar.getInstance();
		balanceTime.setTime(balanceDate);
		int currentYear = balanceTime.get(Calendar.MONTH);
		return creditWithInterest(credit) - ((currentYear - accountCreationMonth) * insttalmentMonth);
	}

}
