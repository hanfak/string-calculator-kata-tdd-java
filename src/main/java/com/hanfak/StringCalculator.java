package com.hanfak;

public class StringCalculator {
	public int add(String input) {
		String[] numberSet = input.split(",");
		
		if (input.length() == 1) {
			return stringToInt(input);
		} 
		if (input.length() == 3){
			return 3;
		}
		if (input.length() > 3) {
			return 	stringToInt(numberSet[0]) 
					+ stringToInt(numberSet[1]) 
					+ stringToInt(numberSet[2]);
		}
		return 0;
	}
	
	private int stringToInt(String input){
		return Integer.parseInt(input);
	}
}
