package notes.L5_6;
/*
 * Summary: This program writes the below data to a .dat file.
 * 
 * Side note: To properly date notes that would be sorted by date, you would use this format:
 * YYYY-MM-DD-HH:MM which implements a largest to smallest system with the use of military time.
 * The thing is though, you can simply name notes as entry 1, 2, 3, etc., and put the date as 
 * regular human conventions inside the text.
 * 
 * Side-side note: INFPs are known to be orderly and organized in the areas that they focus on.
 * What ends up happening is a type of procrastination in areas that they got bored of in the 
 * middle of. I wish to avoid this in order to have the benefits of a methodical approach to
 * life's many challenges. I'm trying out this technique of focusing on a mandatory topic as a
 * primary and as a default, but if my mind wanders, I let it. I know this is not 100%
 * efficient, but it allows for a flow state to occur without the consequences of burning out
 * my brain, which would make the rest of the potentially productive day useless.
 */

import java.io.*;

public class TestObjectOutputStream {
	public static void main(String[] args) throws IOException {
		try ( // Create an output stream for file object.dat
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src/notes/L5_6/object.dat"));) {
			// Write a string, double value, and object to the file
			output.writeUTF("John");
			output.writeDouble(85.5);
			output.writeObject(new java.util.Date());
		}
	}
}