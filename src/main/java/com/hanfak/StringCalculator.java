package com.hanfak;

public class StringCalculator {
	public int add(String numbers) {
		if (!numbers.isEmpty()) {
			return Integer.parseInt(numbers);
		}
		return 0;
	}
}
