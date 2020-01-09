/*
 * Author: Alex Johnson
 * Date: 01-09-2020
 * 
 * A subclass for the class Account that simulates a more specific
 * object known as a checking account.
 */

public class CheckingAccount extends Account {
	private double overdraftLimit;
	
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double amount) {
		if (amount <= getBalance() + overdraftLimit)
			super.withdraw(amount);
		else
			System.out.println("Transaction failed.");
	}
	
	public String toString() {
		return super.toString() + "\n"
				+ "Overdraft limit: " + overdraftLimit;
	}
}
