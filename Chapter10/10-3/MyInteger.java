/*
 * Author: Alex Johnson
 * Date: 12-11-2019
 * 
 * This program is a blueprint for an object that represents an integer value.
 */

public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		value = this.value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return (value % 2 == 0);
	}
	
	public boolean isOdd() {
		return (value % 2 == 1);
	}
	
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static boolean isEven(int value) {
		return (value % 2 == 0);
	}
	
	public static boolean isOdd(int value) {
		return (value % 2 == 1);
	}
	
	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static boolean isEven(MyInteger value) {
		return (value.isEven());
	}
	
	public static boolean isOdd(MyInteger value) {
		return (value.isOdd());
	}
	
	public static boolean isPrime(MyInteger value) {
		return (value.isPrime());
	}
	
	public boolean equals(int value) {
		return (value == this.value);
	}
	
	public boolean equals(MyInteger value) {
		return (value.value == this.value);
	}
	
	public static int parseInt(char[] charValues) {
		int sum = 0;
		
		for (int i = 0; i < charValues.length; i++) {
			sum += Character.getNumericValue(charValues[i]);
		}
		
		return sum;
	}
	
	public static int parseInt(String stringValue) {
		int sum = 0;
		
		for (int i = 0; i < stringValue.length(); i++) {
			sum += Character.getNumericValue(stringValue.charAt(i));
		}
		
		return sum;
	}
}
