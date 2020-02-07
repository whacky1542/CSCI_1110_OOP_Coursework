package notes.L5_6;
/*
 * Summary: This program reads the data created by TestObjectOutputStream. Keep note that the
 * objects must be read back in the order and type that they were originally put into the file.
 */

import java.io.*;

public class TestObjectInputStream {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		try ( // Create an input stream for file object.dat
				ObjectInputStream input = new ObjectInputStream(new FileInputStream("src/notes/L5_6/object.dat"));) {
			// Read a string, double value, and object from the file
			String name = input.readUTF();
			double score = input.readDouble();
			java.util.Date date = (java.util.Date) (input.readObject());
			System.out.println(name + " " + score + " " + date);
		}
	}
}