package b;

/*
 * Author: Y. Daniel Liang
 * Modified by: Alex Johnson
 * Date: 01-15-2020
 * 
 * Modified version of Y. Daniel Liang's ShowPolygon class to instead show
 * specifically a red octagon as a stop sign.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Test extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		StackPane pane = new StackPane();
		ShowPolygon octagon = new ShowPolygon();
		Text stop = new Text("STOP");
		stop.setFont(Font.font(80));
		stop.setFill(Color.WHITE);
		pane.getChildren().addAll(octagon, stop);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("ShowPolygon"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}