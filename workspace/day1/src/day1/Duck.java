package day1;

public class Duck {
	
	
	static int duckCount = 0;

	public Duck() {
		duckCount++;
	}
	
	
	public static void fun() {
		System.out.println("this is fun....");
	}
	
	public  void fun1() {
		System.out.println("this is fun1....");
	}
	
static {
		
		System.out.println("This is Java class");
		System.out.println("This is first Java class");
		System.out.println("This is static Block...");
		String s=new String("this is a demo");
		System.out.println(s.length());
		
	}
}


class DuckDemo{
	public static void main(String[] args) {
		System.out.println("in Duck Main...");
		/*
		 * Duck d1=new Duck(); Duck d2=new Duck(); Duck d3=new Duck(); Duck d4=new
		 * Duck(); Duck d5=new Duck();
		 * 
		 * System.out.println(Duck.duckCount);
		 */
		 Duck.fun();
		 
	}
}
