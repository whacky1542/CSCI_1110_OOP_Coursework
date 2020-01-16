package a;
/*
 * Author: Alex Johnson
 * Date: 01-15-2020
 * 
 * Tests ClockPane class.
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Test extends Application{
	public void start(Stage primaryStage) {
		ClockPane clock = new ClockPane();
		clock.setSecondHandVisible(false);
		clock.setHour((int) (Math.random() * 12));
		clock.setMinute((int) (Math.round(Math.random()) * 30));
		String time = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		Label lblTime = new Label(time);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblTime);
		BorderPane.setAlignment(lblTime, Pos.TOP_CENTER);
		
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("Clock");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		System.out.println("Launch Application");
		Application.launch(args);
	}
}
