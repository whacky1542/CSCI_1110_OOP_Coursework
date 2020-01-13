package colorable;
/*
 * Author: Alex Johnson
 * Date: 01-13-2020
 * 
 * Tests the colorable interface.
 */

public class TestColorable {
	public static void main(String[] args) {
		GeometricObject[] objects = {new Triangle(1, 1, 1, "red", true),
									 new Triangle(2, 2, 2, "red", true),
									 new Triangle(3, 3, 3, "red", true),
									 new Triangle(4, 4, 4, "red", true),
									 new Triangle(5, 5, 5, "red", true)};
		
		for (int i = 0; i < objects.length; i++) {
			System.out.println("t" + (i + 1) + " area: " + objects[i].getArea());
			if (objects[i] instanceof Colorable) {
				System.out.println("t" + (i + 1) + "how to eat: " + (Colorable)objects[i].howToColor());
			}
		}
		
	}
}
