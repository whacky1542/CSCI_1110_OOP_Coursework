/*
 * Author: Alex Johnson
 * Date: 12-10-2019
 * 
 * Blueprint for account objects.
 */
import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0.0;
	private static double annualInterestRate = 0.0;
	private Date dateCreated = new Date();
	
	public Account() {
	}
	
	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	// Accessor methods:
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	}
	// :Accessor methods
	
	// Mutator methods:
	public void setId(int newId) {
		id = newId;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	// :Mutator methods
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return getMonthlyInterestRate() / 100 * balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}
