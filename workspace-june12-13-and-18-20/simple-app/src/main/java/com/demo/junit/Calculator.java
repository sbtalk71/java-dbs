package com.demo.junit;

public class Calculator {

	private int a;
	private int b;

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public int multiply() {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	private int subtract() {
		return a-b;
	}

	public int testSubtract() {
		// TODO Auto-generated method stub
		return subtract();
	}
}
