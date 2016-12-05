package com.hanfak;

public class StringCalculator {
	public int add(String input) {
		String[] numberSet = input.split(",");
		
		if (input.isEmpty()) {
			return 0;
		} 
		return sumStringArray(numberSet);
	}
	
	private int stringToInt(String input){
		return Integer.parseInt(input);
	}
	
	private int sumStringArray(String[] numberSet) {
		int sum = 0;
		for (String stringNumbers: numberSet) {
			sum += stringToInt(stringNumbers);
		}
		return sum;
	}
}
