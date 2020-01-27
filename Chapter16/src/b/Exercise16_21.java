package b;
/*
 * Author: Alex Johnson
 * Date: 01-27-2020
 * 
 * This application plays an anthem at the end of a user entered timer.
 */

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise16_21 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		TextField tf = new TextField();
		pane.getChildren().add(tf);
		
		EventHandler<ActionEvent> playMusic = e -> {
			Media media = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
			MediaPlayer mediaPlayer = new MediaPlayer(media);
			mediaPlayer.play();
		};
		
		tf.setOnAction(e -> {
			Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), e2 -> tf.setText(Integer.toString(Integer.parseInt(tf.getText()) - 1))));
			animation.setCycleCount(Integer.parseInt(tf.getText()));
			animation.setOnFinished(playMusic);
			animation.play();
		});		
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise16_21");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
