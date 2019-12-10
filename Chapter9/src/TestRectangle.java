/*
 * Author: Alex Johnson
 * Date: 12-10-2019
 * 
 * Tests two rectangle objects.
 */

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("Rectangle 1:");
		System.out.println("\tWidth: " + r1.width);
		System.out.println("\tHeight: " + r1.height);
		System.out.println("\tArea: " + r1.getArea());
		System.out.println("\tPerimeter: " + r1.getPerimeter());
		
		System.out.println("Rectangle 2:");
		System.out.println("\tWidth: " + r2.width);
		System.out.println("\tHeight: " + r2.height);
		System.out.println("\tArea: " + r2.getArea());
		System.out.println("\tPerimeter: " + r2.getPerimeter());
	}
}
