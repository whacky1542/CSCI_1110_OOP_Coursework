package notes.L4;
/*
 * Summary: This program checks if the correct syntax was used, if the source exists, and if
 * the target exists. After that, it sets up a try block, for auto closing of streams, to copy
 * and paste the contents of source to the contents of target. -1 indicates the end of the file.
 * numberOfBytesCopied is an added bonus. r is converted into a primitive type for the sake of
 * the IDE, so casting it as a (byte) is necessary for it to be sent to the target file.
 * 
 * As an INFP, I'm destined to understand the emotions of people to a master level degree.
 * This is okay. That means I can continue on my path of being a video game developer to help
 * people who play them understand their own lives better. That is my role.
 * 
 * Interfaces are useful because they are final, abstract, and publicly static. Basically,
 * they are unbound bases that can be further detailed in the classes that they are implemented
 * in. Additionally, since they are unbound, they're methods and final values can be accessed 
 * from anywhere in any situation. As for the reason why only final values are used, I'm not
 * exactly sure. But, my guess would be that using variables that can be changed from anywhere
 * regardless of the situation is not practical and is bad programming practice.
 */

import java.io.*;

public class Copy {
	/**
	 * Main method
	 * 
	 * @param args[0]
	 *            for sourcefile
	 * @param args[1]
	 *            for target file
	 */
	public static void main(String[] args) throws IOException {
		// Check command-line parameter usage
		if (args.length != 2) {
			System.out.println("Usage: java Copy sourceFile targetfile");
			System.exit(1);
		}

		// Check if source file exists
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(2);
		}

		// Check if target file exists
		File targetFile = new File(args[1]);
		if (targetFile.exists()) {
			System.out.println("Target file " + args[1] + " already exists");
			System.exit(3);
		}

		try (
				// Create an input stream
				BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));

				// Create an output stream
				BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));) {
			// Continuously read a byte from input and write it to output
			int r, numberOfBytesCopied = 0;
			while ((r = input.read()) != -1) {
				output.write((byte) r);
				numberOfBytesCopied++;
			}

			// Display the file size
			System.out.println(numberOfBytesCopied + " bytes copied");
		}
	}
}