package com.demo.lambda;

public class GreetingsDemo {
	
	public static void showGreetings(Greet g) {
		System.out.println(g.getGreetings("Shantanu"));
	}
	
	public static void showGreetings1(Demo g) {
		//System.out.println(g.getGreetings());
	}

	public static void main(String[] args) {
		Greet g= new GoodMorning();
		//System.out.println(g.getGreetings());
		showGreetings(g);
		
		Greet g1=new Greet() {

			@Override
			public String getGreetings(String s) {
				// TODO Auto-generated method stub
				return "Good Evening";
			}
			
		};
		//System.out.println(g1.getGreetings());
		showGreetings(g1);
		
		//Greet g2=()->"good bye for now";
		
		//System.out.println(g2.getGreetings());
		
		showGreetings((s1)->"hello, "+s1);
		
		showGreetings((s)->"Good Night");
		showGreetings((s)->"Good evening");
	}

}

class GoodMorning implements Greet {

	@Override
	public String getGreetings(String s) {
		// TODO Auto-generated method stub
		return "Good Morning";
	}

}
