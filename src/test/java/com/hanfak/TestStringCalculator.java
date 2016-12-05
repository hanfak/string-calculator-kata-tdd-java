package com.hanfak;

import org.junit.Before;
import org.junit.Test;

public class TestStringCalculator {
	private StringCalculator calc;

	@Before
	 public void setUp()  {
		 calc = new StringCalculator();
	 }
	
	@Test
	public void canCreateObject() {
		new StringCalculator();
	}
	
	@Test
	public void addMethodExists() {
		calc.add(null);
	}
}
