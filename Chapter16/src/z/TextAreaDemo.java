package z;
/*
 * Summary: This application makes use of the DescriptionPane by adding the content
 * to it. Most of the utilization and important stuff is in the DescriptionPane class.
 * This is basically as informative and regular as the main method to launch the
 * application.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

public class TextAreaDemo extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Declare and create a description pane
		DescriptionPane descriptionPane = new DescriptionPane();

		// Set title, text, and image in the description pane
		descriptionPane.setTitle("Canada");
		String description = "The Canadian national flag ...";
		descriptionPane.setImageView(new ImageView("PoggersRight.png"));
		descriptionPane.setDescription(description);

		// Create a scene and place it in the stage
		Scene scene = new Scene(descriptionPane, 450, 200);
		primaryStage.setTitle("TextAreaDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}