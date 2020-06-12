package inheritance.abstrct;

import inheritance.abstrct.Outer.Inner1;
import inheritance.abstrct.Outer.Inner2;

public class NestedClassDemo {

	public static void main(String[] args) {
		Outer o= new Outer();
		
		Inner1 i1=o.new Inner1();
		
		Inner2 i2=new Inner2();
		
		
		Figure f= new Figure(20,40) {
			@Override
			public void area() {
				System.out.println("Area = "+(dim1*dim2));
				
			}
		};
		
		f.area();
	}
}
