package com.demo.java.lang;

import java.lang.reflect.Method;

public class Test {

	public void f1() {}
	public void f2() {}
	public void f3() {}
	public void f4() {}
	public void f5() {}
	
	public static void main(String[] args) {
		
		Test t= new Test();
		System.out.println(t.getClass().getName());
		
		Method[] methods=t.getClass().getMethods();
		
		for(Method m:methods) {
			System.out.println(m.getName());
		}
	}

}
