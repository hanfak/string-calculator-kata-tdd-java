package com.hanfak;

import org.junit.Test;

public class TestStringCalculator {
	@Test
	public void canCreateObject() {
		new StringCalculator();
	}
	
	@Test
	public void addMethodExists() {
		StringCalculator calc = new StringCalculator();
		calc.add(null);
	}
}
