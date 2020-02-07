package exercise17_14_15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise17_14 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter an input file: ");
		File inputFile = new File(userInput.nextLine());
		
		System.out.print("Enter an output file: ");
		File outputFile = new File(userInput.nextLine());
		
		try (DataInputStream input = new DataInputStream(new FileInputStream(inputFile));) {
			try (DataOutputStream output = new DataOutputStream(new FileOutputStream(outputFile));) {
				while (true) {
					output.writeByte(input.readByte() + 5);
				}
			}
			catch (EOFException ex) {
				
			}
		}
		catch (EOFException ex) {
			
		}
		
		try (DataInputStream input = new DataInputStream(new FileInputStream(outputFile));) {
			while (true) {
				System.out.print(input.readByte());
			}
		}
		catch (EOFException ex) {
			
		}
	}
}
