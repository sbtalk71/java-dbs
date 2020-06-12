package inheritance.abstrct;

public class Triangle extends Figure{

	
	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
	}
	

	@Override
	public void area() {
		System.out.println("Area of Triangle = "+((dim1*dim2)/2));
		
	}

}
