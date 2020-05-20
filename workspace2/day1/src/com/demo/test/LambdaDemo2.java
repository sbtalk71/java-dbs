package com.demo.test;

public class LambdaDemo2 {

	public static void main(String[] args) {
		Thread t1=new Thread(new Worker());
		t1.start();
		
		
		Thread t2=new Thread(()->System.out.println("I am "+Thread.currentThread().getName()));
		t2.start();
	}

}

class Worker implements Runnable{
	@Override
	public void run() {
		System.out.println("I am "+Thread.currentThread().getName());
		
	}
}