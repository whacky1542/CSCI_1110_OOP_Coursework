/*
 * Author: Alex Johnson
 * Date: 01-09-2020
 * 
 * A subclass for the class Account that simulates a more specific
 * object known as a savings account.
 */

public class SavingsAccount extends Account {
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double amount) {
		if (amount <= getBalance())
			super.withdraw(amount);
		else
			System.out.println("Transaction failed.");
	}
	
	public String toString() {
		return super.toString();
	}
}
