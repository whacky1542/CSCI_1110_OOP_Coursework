package c;
/*
 * Author: Alex Johnson
 * Date: 02-06-2020
 * 
 * This program write and reads loans to and from a data file to then calculate the sum of
 * all the loans.
 */

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Exercise17_07 {
	private static File file = new File("Exercise17_07.dat");
	private static ArrayList<Loan> loans = new ArrayList<Loan>();
	private static double sum = 0.0;
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Loan loan1 = new Loan(); // Default: 2.5, 1, 1000
		Loan loan2 = new Loan(3.5, 5, 5000);
		Loan loan3 = new Loan(4.5, 10, 10000);
		
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));) {
			output.writeObject(loan1);
			output.writeObject(loan2);
			output.writeObject(loan3);
		}
		
		outputData();
	}
	
	public static void outputData() throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));) {
			while (true) {
				loans.add((Loan) (input.readObject()));
			}
		}
		catch (EOFException ex) {
			for (int i = 0; i < loans.size(); i++) {
				sum += loans.get(i).getLoanAmount();
			}
			System.out.println("Total loan amount: " + sum);
		}
	}
}
