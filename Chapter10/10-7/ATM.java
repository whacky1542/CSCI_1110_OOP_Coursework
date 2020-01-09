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
		
		int id = 0;
		do {
			System.out.print("Enter an id: ");
			id = input.nextInt();
			if (!isValidId(id))
				System.out.println("Invalid id");
		} while (!isValidId(id));
		
		System.out.println("Main menu:\n"
				+ "1: check balance\n"
				+ "2: withdraw\n"
				+ "3: deposit\n"
				+ "4: exit");
		
		int choice = 0;
		do {
			System.out.print("Enter a choice: ");
			
		} while (!isValidChoice(choice));
	}
	
	public static boolean isValidId(int id) {
		return id >= 0 && id <= 10;
	}
	
	public static boolean isValidChoice(int choice) {
		return choice >= 1 && choice <= 4;
	}
	
	
}
