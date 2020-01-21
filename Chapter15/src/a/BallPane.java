package a;
/*
 * Author: Alex Johnson
 * Date: 01-21-2020
 * 
 * Creates a pane the size of 200 by 200 with a movable circle inside that can't exit the pane.
 */

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class BallPane extends Pane {
	private double radius = 25.0;
	private double x = 100;
	private double y = 100;
	private Circle circle = new Circle(x, y, radius);
	private Rectangle rectangle = new Rectangle(200, 200);
	
	public BallPane() {
		circle.setFill(Color.RED);
		rectangle.setVisible(false);
		rectangle.setX(getWidth() / 2);
		rectangle.setY(getHeight() / 2);
		getChildren().addAll(circle, rectangle);
	}
	
	public void moveUp() {
		if (y > 0 + radius) {
			y -= 1;
			circle.setCenterY(y);
		}
	}
	
	public void moveDown() {
		if (y < getHeight() - radius) {
			y += 1;
			circle.setCenterY(y);
		}
	}
	
	public void moveLeft() {
		if (x > 0 + radius) {
			x -= 1;
			circle.setCenterX(x);
		}
	}
	
	public void moveRight() {
		if (x < getWidth() - radius) {
			x += 1;
			circle.setCenterX(x);
		}
	}
}
