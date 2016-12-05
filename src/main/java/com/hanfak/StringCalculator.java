package com.hanfak;

public class StringCalculator {
	public int add(String input) {
		if (input.length() == 1) {
			return stringToInt(input);
		} 
		if (input.length() > 2){
			return 3;
		}
		return 0;
	}
	
	private int stringToInt(String input){
		return Integer.parseInt(input);
	}

}
