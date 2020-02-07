package notes.L2;
/*
 * Summary: Not much to cover here other than use readUTF to read the names and use readDouble 
 * to read the numbers.
 */

import java.io.*;

public class TestDataStream {
	public static void main(String[] args) throws IOException {
		try ( // Create an output stream for file temp.dat
				DataOutputStream output = new DataOutputStream(new FileOutputStream("src/notes/L2/temp.dat"));) {
			// Write student test scores to the file
			output.writeUTF("John");
			output.writeDouble(85.5);
			output.writeUTF("Jim");
			output.writeDouble(185.5);
			output.writeUTF("George");
			output.writeDouble(105.25);
		}

		try ( // Create an input stream for file temp.dat
				DataInputStream input = new DataInputStream(new FileInputStream("src/notes/L2/temp.dat"));) {
			// Read student test scores from the file
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
		}
	}
}