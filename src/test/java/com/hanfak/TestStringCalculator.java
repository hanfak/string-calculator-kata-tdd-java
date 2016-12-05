package com.hanfak;

import static org.junit.Assert.*;

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
		calc.add("");
	}
	
	@Test
	public void emptyStringReturns0() {
		assertEquals(0, calc.add(""));
	}
	
	@Test 
	public void singleDigitReturnsDigit() {
		assertEquals(1, calc.add("1"));
	}
}
