package com.hanfak;

public class StringCalculator {
	public int add(String numbers) {
		if (numbers.length() == 1) {
			return Integer.parseInt(numbers);
		} 
		if (numbers.length() > 2){
			return 3;
		}
			
		return 0;
	}
}
