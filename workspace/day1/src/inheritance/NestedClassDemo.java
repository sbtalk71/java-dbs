package inheritance;

public class NestedClassDemo {

	static class A{
		public void f1() {
			System.out.println("from class A");
		}
		
		public static void f2() {
			System.out.println("from class A");
		}
	}
	
	class B{
		public void f2() {
			System.out.println("from class B");
		}
	}
	
	
	
}
