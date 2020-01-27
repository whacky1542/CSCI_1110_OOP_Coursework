package b;
/*
 * Author: Alex Johnson
 * Date: 01-27-2020
 * 
 * This application plays a neat little animation of a rectangle following
 * the path of a pentagon.
 */
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.Animation.Status;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RentagonAnimation extends Application {
	public void start(Stage primaryStage) {
		// Rectangle
		Rectangle rectangle = new Rectangle(40, 20);
		rectangle.setFill(Color.RED);
		rectangle.setStroke(Color.BLACK);
				
		// Pentagon
		Polygon pentagon = new Polygon();
		ObservableList<Double> list = pentagon.getPoints();
		
		for (int i = 0; i < 5; i++) {
			list.add(200 * Math.cos(2 * i * Math.PI / 5)); 
			list.add(200 * Math.sin(2 * i * Math.PI / 5));
		}
		
		pentagon.setRotate(-18);
		pentagon.setFill(Color.TRANSPARENT);
		pentagon.setStroke(Color.BLACK);
		pentagon.setLayoutY(10);
		
		// Path Transition
		PathTransition pt = new PathTransition(Duration.millis(5000), pentagon, rectangle);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setInterpolator(Interpolator.LINEAR);
		pt.play();
		
		// Fade Transition
		FadeTransition ft = new FadeTransition(Duration.millis(2500), rectangle);
		ft.setFromValue(1.0);
		ft.setToValue(0);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		// Stack Pane
		StackPane pane = new StackPane();
		pane.getChildren().addAll(pentagon, rectangle);
		
		// Event Handling
		pane.setOnMouseClicked(e -> {
			if (pt.getStatus() == Status.PAUSED) {
				pt.play();
				ft.play();
			}
			else {
				pt.pause();
				ft.pause();
			}
		});
		
		// Setting the Stage
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Rentagon Animation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
