/*
 * Author: Alex Johnson
 * Date: 12-10-2019
 * 
 * Blueprint for rectangle objects.
 */

public class Rectangle {
	
	public double width = 1.0;
	public double height = 1.0;
	
	public Rectangle() {
	}
	
	public Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return width * 2 + height * 2;
	}
}
