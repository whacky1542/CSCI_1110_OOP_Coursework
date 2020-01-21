package b;

import javafx.animation.Animation.Status;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RentagonAnimation extends Application {
	public void start(Stage primaryStage) {
		Rectangle rectangle = new Rectangle(0, 0, 40, 10);
		rectangle.setFill(Color.RED);
		rectangle.setStroke(Color.BLACK);
		
		Polygon pentagon = new Polygon();
		ObservableList<Double> list = pentagon.getPoints();
		
		for (int i = 0; i < 5; i++) {
			list.add(100 * Math.cos(2 * i * Math.PI / 5)); 
			list.add(100 * Math.sin(2 * i * Math.PI / 5));
		}
		
		pentagon.setRotate(-18);
		pentagon.setFill(Color.TRANSPARENT);
		pentagon.setStroke(Color.BLACK);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(5000));
		pt.setPath(pentagon);
		pt.setNode(rectangle);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setInterpolator();
		pt.play();
		
		StackPane pane = new StackPane();
		pane.getChildren().addAll(pentagon, rectangle);
		
		pane.setOnMouseClicked(e -> {
			if (pt.getStatus() == Status.PAUSED)
				pt.play();
			else
				pt.pause();
		});
		
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Rentagon Animation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
