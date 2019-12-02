package inheritance;

import inheritance.NestedClassDemo.A;
import inheritance.NestedClassDemo.B;

public class InnerMain {
	public static void main(String[] args) {
		NestedClassDemo nc = new NestedClassDemo();
		B b = nc.new B();
		A.f2();

	}
}
