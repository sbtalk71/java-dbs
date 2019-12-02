package com.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator cal;
	
	@Before
	public void init() {
		cal=new Calculator();
		System.out.println("Calculator Created...");
	}
	
	@Test
	public void testAdd() {
		assertEquals(8, cal.add(5,4));
	}
	
	
	@Test
	public void testAdd1() {
		assertEquals(8, cal.add(4,4));
	}
	
	@After
	public void destroy() {
		cal=null;
	}
}
