package inheritance;

public class Main3 {
	
	
	public void displayArea(Figure ref) {
		System.out.println(ref.area());
	}

	public static void main(String[] args) {
		Figure ref;
		Triangle t= new Triangle(10, 20);
		Rectangle r = new Rectangle(20, 40);
		
		/*
		 * ref=t; System.out.println(ref.area());
		 * 
		 * ref=r; System.out.println(ref.area());
		 */
		
		Main3 m= new Main3();
		m.displayArea(t);
		m.displayArea(r);
		
		
		
		Figure f=new Figure(20,20) {

			@Override
			public double area() {
				// TODO Auto-generated method stub
				return dim1*dim2/2;
			}
			
		};
		
		System.out.println(f.area());

	}

}
