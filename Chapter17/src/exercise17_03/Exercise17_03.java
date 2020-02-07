package exercise17_03;
/*
 * Author: Alex Johnson
 * Date: 02-06-2020
 * 
 * This program writes 100 random integers to a file then reads them back to find a sum.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise17_03 {
	public static void main(String[] args) throws IOException {
		File file = new File("src/exercise17_03/Exercise17_03.dat");
		int sum = 0;
		
		if (file.exists()) {
			try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file, true));) {
				for (int i = 0; i < 100; i++) {
					output.writeInt(((int) (Math.round(Math.random() * 10))));
					output.write(' ');
				}
			}
		}
		else {
			try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file));) {
				for (int i = 0; i < 100; i++) {
					output.writeInt(((int) (Math.round(Math.random() * 10))));
					output.write(' ');
				}
			}
		}
		
		try (DataInputStream input = new DataInputStream(new FileInputStream(file));) {
			while (true) {
				sum += input.readInt();
				input.skip(1);
			}
		}
		catch (EOFException ex) {
			System.out.println("The sum is: " + sum);
		}
	}
}
