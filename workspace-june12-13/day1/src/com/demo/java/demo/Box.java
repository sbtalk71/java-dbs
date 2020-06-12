package com.demo.java.demo;

public class Box {

	private int length;
	private int breadth;
	private int height;
	private String color="colorless";

	public Box() {

	}

	public Box(int length, int breadth, int height) {

		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public Box(int length, int breadth, int height, String color) {

		this(length,breadth,height);
		this.color=color;
	}

	public double getVolume() {
		double result = length * breadth * height;
		return result;
	}
	
	public String getColor() {
		
		return this.color;
	}
}
