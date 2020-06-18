package inheritance.abstrct;

public class Rectangle extends Figure {

	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle = " + (dim1 * dim2));
	}

}
