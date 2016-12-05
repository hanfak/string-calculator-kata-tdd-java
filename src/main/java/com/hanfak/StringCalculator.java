package com.hanfak;

public class StringCalculator {
	public int add(String input) {
		String[] numberSet = input.split(",");
		
		if (input.isEmpty()) {
			return 0;
		} 
		int sum = 0;
		for (String stringNumbers: numberSet) {
			sum += stringToInt(stringNumbers);
		}
		return sum;
	}
	
	private int stringToInt(String input){
		return Integer.parseInt(input);
	}
}
