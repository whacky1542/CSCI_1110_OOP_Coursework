package a;
/*
 * Author: Alex Johnson
 * Date: 02-05-2020
 * 
 * This program creates and write 100 random numbers to a file called Exercise17_01.txt.
 * If the file is already created, the program instead appends 100 random numbers.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise17_01 {
	public static void main(String[] args) throws IOException {
		File file = new File("Exercise17_01.txt");
		int[] numbers = new int[100];
		for (int i = 0; i < 100; i++)
			numbers[i] = ((int) (Math.round(Math.random() * 10000)));
		
		if (file.exists()) {
			try (FileWriter output = new FileWriter(file, true);) {
				for (int i = 0; i < 100; i++) {
					output.write(String.valueOf(numbers[i]));
					output.write(' ');
				}
			}
		}
		else {
			try (FileWriter output = new FileWriter(file);) {
				for (int i = 0; i < 100; i++) {
					output.write(String.valueOf(numbers[i]));
					output.write(' ');
				}
			}
		}
	}
}
