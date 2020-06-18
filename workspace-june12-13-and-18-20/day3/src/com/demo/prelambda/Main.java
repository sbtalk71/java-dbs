package com.demo.prelambda;

public class Main {

	public static void main(String[] args) {

		Greeter g = new Greeter();

		MessagePrinter message = new GoodMorning();
		g.greet(message);

//		MessagePrinter goodEvening=new MessagePrinter() {
//			
//			@Override
//			public void print() {
//				System.out.println("Good Evening..");
//				
//			}
//		};

		g.greet(new MessagePrinter() {

			@Override
			public void print() {
				System.out.println("Good Evening..");

			}
		});

		g.greet(()->System.out.println("Good Night.."));
		
		
		MessagePrinter message1=()->System.out.println("Greetings..");
	}

}

class HelloWorld implements MessagePrinter {

	@Override
	public void print() {
		System.out.println("Hello World");

	}

}

class GoodMorning implements MessagePrinter {

	@Override
	public void print() {
		System.out.println("Good Morning");

	}

}
