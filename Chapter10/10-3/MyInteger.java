/*
 * Author: Alex Johnson
 * Date: 12-11-2019
 * 
 * This class analyzes an integer value. Additionally, it can convert 
 * character arrays and strings to integer values.
 */

public class MyInteger {
	private int value;
	
	public MyInteger(int specifiedValue) {
		value = specifiedValue;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return value % 2 == 0;
	}
	
	public boolean isOdd() {
		return value % 2 == 1;
	}
	
	public boolean isPrime() {
		if (value == 1)
			return false;
		
		for (int i = 2; i <= Math.sqrt(value); i++) {
			if (value % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static boolean isEven(int specifiedValue) {
		return specifiedValue % 2 == 0;
	}
	
	public static boolean isOdd(int specifiedValue) {
		return specifiedValue % 2 == 1;
	}
	
	public static boolean isPrime(int specifiedValue) {
		if (specifiedValue == 1)
			return false;
		
		for (int i = 2; i < Math.sqrt(specifiedValue); i++) {
			if (specifiedValue % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static boolean isEven(MyInteger specifiedValue) {
		return specifiedValue.isEven();
	}
	
	public static boolean isOdd(MyInteger specifiedValue) {
		return specifiedValue.isOdd();
	}
	
	public static boolean isPrime(MyInteger specifiedValue) {
		return specifiedValue.isPrime();
	}
	
	public boolean equals(int specifiedValue) {
		return specifiedValue == value;
	}
	
	public boolean equals(MyInteger specifiedValue) {
		return specifiedValue.value == value;
	}
	
	public static int parseInt(char[] charValues) {
		int sum = 0;
		
		for (int i = 0; i < charValues.length; i++) {
			sum += Character.getNumericValue(charValues[i]) * Math.pow(10, charValues.length - i - 1);
		}
		
		return sum;
	}
	
	public static int parseInt(String s) {
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			sum += Character.getNumericValue(s.charAt(i)) * Math.pow(10, s.length() - i - 1);
		}
		
		return sum;
	}
}
