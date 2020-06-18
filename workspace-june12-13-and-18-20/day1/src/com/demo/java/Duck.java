package com.demo.java;

public class Duck {

	static int duckCount;

	
	static {
		System.out.println("The Duck class is loaded");
	}
	
	public Duck() {
		duckCount++;
	}
	
	public static void printName() {
		System.out.println("Name not assigned");
	}
	
	
	
}
