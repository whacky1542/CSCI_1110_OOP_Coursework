package z;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEvent extends Application {
	@Override
	public void start(Stage primaryStage) {
		HBox pane = new HBox(10); // argument = pixels between each item.
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK"); // Step 1: Create source
		Button btCancel = new Button("Cancel");
		OKHandlerClass handler1 = new OKHandlerClass(); // Step 2: Create event handler
		btOK.setOnAction(handler1); // Step 3: CROSS THE STREAMS!!!
		CancelHandlerClass handler2 = new CancelHandlerClass();
		btCancel.setOnAction(handler2);
		pane.getChildren().addAll(btOK, btCancel);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("HandleEvent");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		System.out.println("Application Launch");
		Application.launch(args);
	}
}

class OKHandlerClass implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		System.out.println("OK button clicked ");
	}
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		System.out.println("Cancel button clicked");
	}
}
