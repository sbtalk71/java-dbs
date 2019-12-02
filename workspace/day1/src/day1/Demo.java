package day1;

public class Demo {

	public static void main(String[] args) {
		Box b= new Box();
		
		
		Box b1= new Box(10,20,30);
		System.out.println(b1.getColor());
		
		Box b2= new Box(10,20,20,"blue");
		
		System.out.println(b2.getVolume());
		System.out.println(b2.getColor());

	}

}
