package notes.L7;
/*
 * Summary: This may not seem like it, but the way these objects (arrays) are read back from the
 * data file is by serialization.
 */

import java.io.*;

public class TestObjectStreamForArray {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		int[] numbers = { 1, 2, 3, 4, 5 };
		String[] strings = { "John", "Susan", "Kim" };

		try ( // Create an output stream for file array.dat
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src/notes/L7/array.dat", true));) {
			// Write arrays to the object output stream
			output.writeObject(numbers);
			output.writeObject(strings);
		}

		try ( // Create an input stream for file array.dat
				ObjectInputStream input = new ObjectInputStream(new FileInputStream("src/notes/L7/array.dat"));) {
			int[] newNumbers = (int[]) (input.readObject());
			String[] newStrings = (String[]) (input.readObject());

			// Display arrays
			for (int i = 0; i < newNumbers.length; i++)
				System.out.print(newNumbers[i] + " ");
			System.out.println();

			for (int i = 0; i < newStrings.length; i++)
				System.out.print(newStrings[i] + " ");
		}
	}
}