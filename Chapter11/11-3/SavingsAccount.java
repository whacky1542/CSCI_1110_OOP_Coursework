/*
 * Author: Alex Johnson
 * Date: 01-09-2020
 * 
 * A subclass for the class Account that simulates a more specific
 * object known as a savings account.
 */

public class SavingsAccount extends Account {
	private double overdraftLimit;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(int id, double balance, double overdraftLimit) {
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
	
	// super.toString NO WORK. kinda. run test to see for yourself.
	public String toString() {
		return super.toString() + "\n"
				+ "Overdraft limit: " + overdraftLimit;
	}
}
