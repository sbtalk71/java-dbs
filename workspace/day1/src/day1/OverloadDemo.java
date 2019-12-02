package day1;
class Overload {
	void test() {
		System.out.println("No parameters");
	}

	/*
	 * void test(int a) { System.out.println("a: " + a); }
	 */

	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}
	
	double test(float a) {
		System.out.println("float a: " + a);
		return a * a;
	}

	double test(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}
}

public class OverloadDemo {
	public static void main(String args[]) {
		Overload ob = new Overload();
		double result;
		// call all versions of test()
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		result = ob.test(123.25);
		System.out.println("Result of ob.test(123.25): " + result);
	}
}
