package c;

/*
 * Author: Alex Johnson
 * Date: 01-13-2020
 * 
 * Exercise 13-11: Test program for Octagon.
 */

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon o1 = new Octagon(5, "red", true);
		Octagon o2 = (Octagon)o1.clone();
		
		System.out.println("Comparison of octagons: " + o1.compareTo(o2));
	}
}
