/*
 * Author: Alex Johnson
 * Date: 01-013-2020
 * 
 * Tests the Triangle and GeometricObject classes by displaying area, perimeter, color,
 * and filled condition.
 */
import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Triangle t1 = new Triangle();
		
		System.out.print("Enter side1: ");
		t1.setSide1(input.nextDouble());
		System.out.print("Enter side2: ");
		t1.setSide2(input.nextDouble());
		System.out.print("Enter side3: ");
		t1.setSide3(input.nextDouble());
		System.out.print("Enter a color: ");
		t1.setColor(input.next());
		System.out.print("Enter filled condition: ");
		t1.setFilled(input.nextBoolean());
		
		System.out.print(t1.toString());
	}
}
