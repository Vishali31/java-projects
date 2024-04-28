package com.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.service.Calculator;

public class CalculatorTest {
	
	@Test
	void TestSum() {
		
		 Calculator cal = new Calculator();
		 int actualResult = cal.sum(10,20);
		 assertEquals(30,actualResult);
	}

	@Test
	void TestSumWithTwoNegative() {
		
		 Calculator cal = new Calculator();
		 int actualResult = cal.sum(-10,-20);
		 assertEquals(-30,actualResult);
}
}