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
	public void emptyStringReturns0() {
		assertEquals(0, calc.add(""));
	}
	
	@Test 
	public void singleDigitReturnsDigit() {
		assertEquals(1, calc.add("1"));
	}
	
	@Test
	public void twoSingleDigitNumbersReturnsSum() {
		assertEquals(3, calc.add("1,2"));
	}
	
	@Test
	public void nAmountOfSingleDigitsReturnsSum() {
	  assertEquals(6, calc.add("1,2,3"));
	}
}
