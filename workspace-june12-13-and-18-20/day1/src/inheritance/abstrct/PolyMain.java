package inheritance.abstrct;

public class PolyMain {

	public static void main(String[] args) {
		Figure ref;
		
		Triangle t=new Triangle(10, 20);
		Rectangle r=new Rectangle(20, 20);
		
		ref=t;
		ref.area();
		
		ref=r;
		
		ref.area();

	}

}
