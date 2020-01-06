/*
 * Author: Alex Johnson
 * Date: 01-06-2020
 * 
 * Creates an array of randomly chosen integers that features an exception
 * handling prompt for index elements.
 */
import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100); 
		}
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter an index: ");
			int index = input.nextInt();
			System.out.print("Value at index " + index + ": " + array[index]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
	}
}
