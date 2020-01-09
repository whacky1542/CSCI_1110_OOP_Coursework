/*
 * Author: Alex Johnson
 * Date: 01-09-2020
 * 
 * Tests the classes Account, SavingsAccount, and CheckingAccount.
 */

public class Test {
	public static void main(String[] args) {
		Account account = new Account(1234, 201.23);
		account.setAnnualInterestRate(2.5);
		System.out.println(account.toString());
		
		SavingsAccount savingsAccount = new SavingsAccount(4321, 5000, 500);
		System.out.println(savingsAccount.toString());
	}
}