package c;

/*
 * Author: Alex Johnson
 * Date: 01-13-2020
 * 
 * Exercise 13-11: Class named Octagon that extends GeometricObject and implements
 * the Comparable and Cloneable interfaces.
 */

public class Octagon extends GeometricObject implements Comparable, Cloneable{
	private double side;
	
	public Octagon() {
		
	}
	
	public Octagon(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return ((2 + 4 / Math.sqrt(2)) * side * side);
	}
	
	public double getPerimeter() {
		return side * 8;
	}

	@Override
	public int compareTo(Object o) {
		if (getSide() > ((Octagon)o).getSide())
			return 1;
		else if (getSide() < ((Octagon)o).getSide())
			return -1;
		else
			return 0;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
