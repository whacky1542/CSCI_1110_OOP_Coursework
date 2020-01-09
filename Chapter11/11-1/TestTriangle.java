/*
 * Author: Alex Johnson
 * Date: 01-06-2020
 * 
 * Tests the Triangle class.
 */
import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Triangle triangle = new Triangle();
		
		System.out.print("Enter side1: ");
		triangle.side1 = input.nextDouble();
		
		System.out.print("Enter side2: ");
		triangle.side2 = input.nextDouble();
		
		System.out.print("Enter side3: ");
		triangle.side3 = input.nextDouble();
		
		System.out.print("Enter a color: ");
		triangle.setColor(input.next());
		
		System.out.print("Enter 'true' for filled or 'false' for not filled: ");
		triangle.setFilled(input.nextBoolean());
		
		System.out.print("\n"
				+ "The area is: " + triangle.getArea() + "\n"
				+ "The perimeter is: " + triangle.getPerimeter() + "\n"
				+ "The color is: " + triangle.getColor() + "\n"
				+ "The filled condition is: " + triangle.isFilled());
	}
}
