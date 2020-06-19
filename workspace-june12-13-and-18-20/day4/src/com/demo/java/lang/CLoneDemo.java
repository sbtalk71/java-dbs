package com.demo.java.lang;

public class CLoneDemo implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CLoneDemo cd=new CLoneDemo();
		Object o=cd.clone();
		
		System.out.println(o.getClass().getName());
	}

}
