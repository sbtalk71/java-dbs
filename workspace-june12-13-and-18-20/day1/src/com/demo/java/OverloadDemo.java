package com.demo.java;

public class OverloadDemo {

	public void add() {
		System.out.println("nothing to add");
	}

	/*
	 * public int add(int a, int b) { System.out.println("Add int, int"); return a +
	 * b; }
	 */

	public double add(double a, double b) {
		System.out.println("Add double, double");
		return a + b;
	}

	public float add(int a, float b) {
		System.out.println("Add int, float");
		return a + b;
	}

	public static void main(String[] args) {
		OverloadDemo d = new OverloadDemo();

		d.add();
		d.add(2, 2);
		d.add(2, 2.0f);
		d.add(2.0, 2.0);

	}

}
