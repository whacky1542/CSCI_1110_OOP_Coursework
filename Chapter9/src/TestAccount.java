/*
 * Author: Alex Johnson
 * Date: 12-10-2019
 * 
 * Tests an account object.
 */

public class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account(1122, 20000);
		
		a1.setAnnualInterestRate(4.5);
		a1.withdraw(2500);
		a1.deposit(3000);
		
		System.out.println("Account 1:");
		System.out.printf("\tBalance: $%.2f\n", a1.getBalance());
		System.out.println("\tMonthly Interest: $" + (Math.floor(a1.getMonthlyInterest() * 100) / 100));
		System.out.println("\tDate Created: " + a1.getDateCreated());
	}
}
