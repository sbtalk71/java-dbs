package com.demo.java.lang;

public class DemoWrappers {

	public static void main(String[] args) {
		
		//primitive to Wrapper --->Boxing
		//Wrapper to Primitive -->Unboxing
		
		Integer x=new Integer(10);
		
		int y=x;
		
		Double d=10.4;
		Float f=12.6f;
		
		
		String s="123";
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		
		//String s1="myname";
		//System.out.println(Integer.parseInt(s1));
		
		
		System.out.println(args[0]);
	}

}
