package z;
/*
 * Summary: Simple program that creates a file with numbers in it then reads those numbers
 * from the file. try () is useful for auto closing and addressing the throw attributes in the
 * FileOutputStream/FileInputStream classes. temp.dat is put into the project folder.
 */

import java.io.*;

public class TestFileStream {
	public static void main(String[] args) throws IOException {
		try (
				// Create an output stream to the file
				FileOutputStream output = new FileOutputStream("temp.dat");) {
			// Output values to the file
			for (int i = 1; i <= 10; i++)
				output.write(i);
		}

		try (
				// Create an input stream for the file
				FileInputStream input = new FileInputStream("temp.dat");) {
			// Read values from the file
			int value;
			while ((value = input.read()) != -1)
				System.out.print(value + " ");
		}
	}
}