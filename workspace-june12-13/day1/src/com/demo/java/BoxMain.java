package com.demo.java;

import com.demo.java.demo.Box;

public class BoxMain {

	public static void main(String[] args) {
		
		//Box b1=new Box();
		
		/*
		 * b1.length=10; b1.height=20; b1.breadth=5;
		 */
		Box b1=new Box(30,20,10);
		
	double vol=b1.getVolume();
	
	System.out.println(vol);
	
	Box b2=new Box();
	
	System.out.println(b1.getVolume()+" "+b1.getColor());
	
	Box b3=b1;
	
	Box b4=b3;
	b4.getVolume();
	
	
	Box b5=new Box(30,20,10,"blue");
	
	System.out.println(b5.getVolume()+" "+b5.getColor());
	}
	
	
	
}
