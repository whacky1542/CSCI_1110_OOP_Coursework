package b;
/*
 * Author: Alex Johnson
 * Date: 01-12-2020
 * 
 * This class represents a triangle object extended from GeometricObject.
 */

public class Triangle extends GeometricObject implements Colorable{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		if (side1 + side2 == side3 || side1 + side3 == side2 || side2 + side3 == side1) {
			System.out.println("Impossible triangle.");
			return 0;
		}
		else {
			double s = (side1 + side2 + side3) / 2;
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		}
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all three sides");
	}
	
	@Override
	public String toString() {
		return "Area: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n" + super.toString();
	}
}
