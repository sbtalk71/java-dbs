package com.demo.test;

public class LambdaDemo {

	public static void main(String[] args) {

		DemoInt adder1= new Adder();
		
		DemoInt l1=(a,b)->a+b;
		
		DemoInt l2=(a,b)->a*a+b*b;

	}

}

class Adder implements DemoInt{
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
}