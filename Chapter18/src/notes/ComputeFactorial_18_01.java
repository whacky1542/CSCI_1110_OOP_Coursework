package notes;
/*
 * Summary: For example, the factorial of 4 is 24. Another example would be 3628800 from 10. The effect of recursion
 * is that of exponential repetition.
 */

import java.util.Scanner;

public class ComputeFactorial_18_01 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a nonnegative integer: ");
		int n = input.nextInt();

		// Display factorial
		System.out.println("Factorial of " + n + " is " + factorial(n));
	}

	/** Return the factorial for the specified number */
	public static long factorial(int n) {
		if (n == 0) // Base case
			return 1;
		else
			return n * factorial(n - 1); // Recursive call
	}
}