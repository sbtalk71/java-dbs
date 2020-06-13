package day2;

public class Employee extends Person{

	private static final long serialVersionUID = 1L;
	private double salary;

	public Employee() {
		
	}

	public Employee(int id, String name, double salary) {
		super(id,name);
		this.salary = salary;
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

//	@Override
//	public String toString() {
//
//		return super.getId() + " " + super.getName() + " " + salary;
//	}
}
