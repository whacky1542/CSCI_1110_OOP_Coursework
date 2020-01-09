/*
 * Author: Alex Johnson
 * Date: 12-15-2019
 * 
 * This class tests the MyInteger class by using each of MyInteger's methods.
 */
public class TestMyInteger {
	public static void main(String[] args) {
		String s = "1";
		MyInteger v1 = new MyInteger(MyInteger.parseInt(s));
		System.out.println("v1 (" + v1.getValue() + ") is even: " + v1.isEven());
		System.out.println("v1 (" + v1.getValue() + ") is even: " + MyInteger.isEven(1));
		System.out.println("v1 (" + v1.getValue() + ") is odd: " + v1.isOdd());
		System.out.println("v1 (" + v1.getValue() + ") is odd: " + MyInteger.isOdd(1));
		System.out.println("v1 (" + v1.getValue() + ") is prime: " + v1.isPrime());
		System.out.println("v1 (" + v1.getValue() + ") is prime: " + MyInteger.isPrime(1));
		
		System.out.println();
		
		char[] charArray = {'1', '2'};
		MyInteger v2 = new MyInteger(MyInteger.parseInt(charArray));
		System.out.println("v2 (" + v2.getValue() + ") is even: " + v2.isEven());
		System.out.println("v2 (" + v2.getValue() + ") is even: " + MyInteger.isEven(12));
		System.out.println("v2 (" + v2.getValue() + ") is odd: " + v2.isOdd());
		System.out.println("v2 (" + v2.getValue() + ") is odd: " + MyInteger.isOdd(12));
		System.out.println("v2 (" + v2.getValue() + ") is prime: " + v2.isPrime());
		System.out.println("v2 (" + v2.getValue() + ") is prime: " + MyInteger.isPrime(12));
		
		System.out.println();
		
		MyInteger v3 = new MyInteger(v1.getValue() + v2.getValue());
		System.out.println("v3 (" + v3.getValue() + ") is even: " + v3.isEven());
		System.out.println("v3 (" + v3.getValue() + ") is even: " + MyInteger.isEven(13));
		System.out.println("v3 (" + v3.getValue() + ") is odd: " + v3.isOdd());
		System.out.println("v3 (" + v3.getValue() + ") is odd: " + MyInteger.isOdd(13));
		System.out.println("v3 (" + v3.getValue() + ") is prime: " + v3.isPrime());
		System.out.println("v3 (" + v3.getValue() + ") is prime: " + MyInteger.isPrime(13));
		
		System.out.println();
		
		MyInteger v4 = new MyInteger(v3.getValue() - v2.getValue());
		System.out.println("v4 (" + v4.getValue() + ") is equal to v3 (" + v3.getValue() + "): " + v4.equals(v3.getValue()));
		System.out.println("v4 (" + v4.getValue() + ") is equal to v2 (" + v2.getValue() + "): " + v4.equals(v2));
		System.out.println("v4 (" + v4.getValue() + ") is equal to v1 (" + v1.getValue() + "): " + v4.equals(v1.getValue()));
		System.out.println("v4 (" + v4.getValue() + ") is equal to v1 (" + v1.getValue() + "): " + v4.equals(v1));
		
		System.out.println();
		
		// Testing myInteger methods
		MyInteger v5 = new MyInteger(51);
		System.out.println("v5 (" + v5.getValue() + ") is even: " + MyInteger.isEven(v5));
		System.out.println("v5 (" + v5.getValue() + ") is odd: " + MyInteger.isOdd(v5));
		System.out.println("v5 (" + v5.getValue() + ") is prime: " + MyInteger.isPrime(v5));
		System.out.println("v5 (" + v5.getValue() + ") is equal to (" + v2.getValue() + "): " + v5.equals(v2));
		MyInteger v6 = new MyInteger(51);
		System.out.println("v5 (" + v5.getValue() + ") is equal to (" + v6.getValue() + "): " + v5.equals(v6));
	}
}
