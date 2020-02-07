package notes.L3;
/*
 * Summary: When invoking input.readDouble to repeat until there is an error, the error is caught
 * by the catch block with an EOFException.
 */

import java.io.*;

public class DetectEndOfFile {
	public static void main(String[] args) {
		try {
			try (DataOutputStream output = new DataOutputStream(new FileOutputStream("src/notes/L3/test.dat"))) {
				output.writeDouble(4.5);
				output.writeDouble(43.25);
				output.writeDouble(3.2);
			}

			try (DataInputStream input = new DataInputStream(new FileInputStream("src/notes/L3/test.dat"))) {
				while (true)
					System.out.println(input.readDouble());
			}
		} catch (EOFException ex) {
			System.out.println("All data were read");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}