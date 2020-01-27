package a;
/*
 * Author: Alex Johnson
 * Date: 01-27-2020
 * 
 * This application simulates moving text! The text can also change colors with radio buttons.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise16_1 extends Application {
	private Text text = new Text(185, 100, "Programming is fun");
	
	@Override
	public void start(Stage primaryStage) {
		// Frame for application
		BorderPane pane = new BorderPane();
		
		// Arrow buttons
		HBox buttonPane = new HBox(25);
		Button btLeft = new Button("<=");
		Button btRight = new Button("=>");
		buttonPane.getChildren().addAll(btLeft, btRight);
		buttonPane.setAlignment(Pos.CENTER);
		pane.setBottom(buttonPane);

		// Moving text
		Pane textPane = new Pane();
		textPane.getChildren().add(text);
		pane.setCenter(textPane);
		
		// Radio buttons
		HBox radioPane = new HBox(25);
		radioPane.setPadding(new Insets(3, 3, 3, 3));
		ToggleGroup group = new ToggleGroup();
		RadioButton rbRed = new RadioButton("Red");
		rbRed.setToggleGroup(group);
		RadioButton rbYellow = new RadioButton("Yellow");
		rbYellow.setToggleGroup(group);
		RadioButton rbBlack = new RadioButton("Black");
		rbBlack.setToggleGroup(group);
		RadioButton rbOrange = new RadioButton("Orange");
		rbOrange.setToggleGroup(group);
		RadioButton rbGreen = new RadioButton("Green");
		rbGreen.setToggleGroup(group);
		radioPane.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
		radioPane.setAlignment(Pos.CENTER);
		pane.setTop(radioPane);

		// Text movement handlers
		btLeft.setOnAction(e -> {
			if (text.getX() > 0)
				text.setX(text.getX() - 5);
		});
		
		btRight.setOnAction(e -> {
			if (text.getX() < pane.getWidth() - 120)
				text.setX(text.getX() + 5);
		});
		
		// Text color handlers
		rbRed.setOnAction(e -> {
			if (rbRed.isSelected()) {
				text.setFill(Color.RED);
			}
		});
		
		rbYellow.setOnAction(e -> {
			if (rbYellow.isSelected()) {
				text.setFill(Color.YELLOW);
			}
		});
		
		rbBlack.setOnAction(e -> {
			if (rbBlack.isSelected()) {
				text.setFill(Color.BLACK);
			}
		});
		
		rbOrange.setOnAction(e -> {
			if (rbOrange.isSelected()) {
				text.setFill(Color.ORANGE);
			}
		});

		rbGreen.setOnAction(e -> {
			if (rbGreen.isSelected()) {
				text.setFill(Color.GREEN);
			}
		});

		// Lights, camera, action!!
		Scene scene = new Scene(pane, 500, 200);
		primaryStage.setTitle("Exercise16_1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
