/*
 * Author: Alex Johnson
 * Date: 12-16-2019
 * 
 * Simulates an ATM machine using the Account class.
 */

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account[] accounts = new Account[10];
		int id;
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
			accounts[i].setBalance(100);
		}
		
		while (true) {
			do {
				System.out.print("Enter an ID(0-9): ");
				id = input.nextInt();
			} while (id < 0 && id > 9);
			
			mainMenu(accounts[id]);
		}
	}
	
	public static void mainMenu(Account account) {
		Scanner input = new Scanner(System.in);
		int choice;
		
		do {
			System.out.print("Main menu:\n"
					+ "1:check balance\n"
					+ "2:withdraw\n"
					+ "3:deposit\n"
					+ "4:exit\n"
					+ "\n"
					+ "Enter a choice: ");
			choice = input.nextInt();
			
			if (choice == 1)
				System.out.print("Current balance: " + account.getBalance() + "\n");
			else if (choice == 2) {
				System.out.print("Enter an amount to withdraw: ");
				account.withdraw(input.nextDouble());
			}
			else if (choice == 3) {
				System.out.print("Enter an amount to deposit: ");
				account.deposit(input.nextDouble());
			}
		} while (choice != 4);
	}
}
