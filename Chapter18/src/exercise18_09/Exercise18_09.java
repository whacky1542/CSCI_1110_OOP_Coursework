package exercise18_09;
/*
 * Author: Alex Johnson
 * Date: 02-07-2020
 * 
 * This program uses a recursion method to reverse a word!
 */

import java.util.Scanner;

public class Exercise18_09 {
	private static char holder = ' ';
	private static char[] charArray;
	
	public static void main(String[] args) {
		// Prompt!
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to be reversed: ");
		String s = input.nextLine();
		
		// Display!
		System.out.println("Abra Reversio!: " + reverseDisplay(s));
	}
	
	public static String reverseDisplay(String s) {
		return reverseDisplay(s, 0, s.length() - 1);
	}
	
	public static String reverseDisplay(String s, int start, int end) {
		if (end <= start)
			return s;
		else {
			charArray = s.toCharArray();
			holder = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = holder;
			s = "";
			for (int i = 0; i < charArray.length; i++)
				s += charArray[i];
			return reverseDisplay(s , start + 1, end - 1);
		}
	}
}
