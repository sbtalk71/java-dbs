package com.demo.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.demo.junit.Calculator;

@RunWith(BlockJUnit4ClassRunner.class)
public class CalculatorTest {

	Calculator cal = null;

	@Before
	public void init() {
		System.out.println("Set up done..");
		cal = new Calculator(2, 4);
	}

	@Test
	public void testAdd() {
		assertEquals(5, cal.add());
	}
	
	@Test
	public void testAdd1() {
		assertEquals(6, cal.add());
	}

	@Test
	public void testMultiply() {
		assertEquals(8, cal.multiply());
	}
	@After
	public void clean() {
		System.out.println("Clean up done..");
		cal = null;
	}

}
