package a;
/*
 * Author: Alex Johnson
 * Date: 01-21-2020
 * 
 * Allows the user to move a ball with either the arrow keys or the buttons in the UI.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BallMoveInPlane extends Application {
	private BallPane ballPane = new BallPane();
	
	public void start(Stage primaryStage) {
		HBox hBox = new HBox();
		hBox.setSpacing(5);
		Button left = new Button("Left");
		Button right = new Button("Right");
		Button up = new Button("Up");
		Button down = new Button("Down");
		hBox.getChildren().addAll(left, right, up, down);
		
		left.setOnAction(e -> ballPane.moveLeft());
		right.setOnAction(e -> ballPane.moveRight());
		up.setOnAction(e -> ballPane.moveUp());
		down.setOnAction(e -> ballPane.moveDown());
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(ballPane, hBox);
		
		vBox.setOnKeyPressed(e ->  {
			hBox.setDisable(true);
			if (e.getCode() == KeyCode.LEFT) {
				ballPane.moveLeft();
			} else if (e.getCode() == KeyCode.RIGHT) {
				ballPane.moveRight();
			} else if (e.getCode() == KeyCode.UP) {
				ballPane.moveUp();
			} else if (e.getCode() == KeyCode.DOWN) {
				ballPane.moveDown();
			}
			hBox.setDisable(false);
			ballPane.requestFocus();
		});
		
		Scene scene = new Scene(vBox, 200, 200);
		primaryStage.setTitle("BallMoveInPlane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		ballPane.requestFocus();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
