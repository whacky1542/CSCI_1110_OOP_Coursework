/*
 * Author: Alex Johnson
 * Date: 01-09-2020
 * 
 * Writes 100 random integers into a file then reads them back to the console.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_15 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Exercise12_15.txt");
		
		if (file.exists()) {
			System.out.println("File already exists.");
			System.exit(1);
		}
		
		try (PrintWriter output = new PrintWriter(file)) {
			for (int i = 0; i < 100; i++) {
				output.print((int) (Math.random() * 100) + " ");
			}
		}
		
		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				System.out.print(input.nextInt() + " ");
			}
		}
	}
}
