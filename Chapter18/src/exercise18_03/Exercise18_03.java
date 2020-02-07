package exercise18_03;
/*
 * Author: Alex Johnson
 * Date: 02-07-2020
 * 
 * This program computes the gcd of two integers using recursion!!!
 */

import java.util.Scanner;

public class Exercise18_03 {
	public static void main(String[] args) {
		// Prompt!
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer #1: ");
		int num1 = input.nextInt();
		System.out.print("Enter integer #2: ");
		int num2 = input.nextInt();
		
		// Display!
		System.out.println("The GCD is " + gcd(num1, num2));
	}
	
	public static int gcd(int m, int n) {
		if (m % n == 0)
			return n;
		else
			return gcd(n, m % n);
	}
}
