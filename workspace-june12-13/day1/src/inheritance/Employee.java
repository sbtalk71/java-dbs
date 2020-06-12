package inheritance;

public class Employee extends Person {

	private double salary;

	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
	
	
	@Override
	public String getDetails() {
		
		return super.getDetails()+" "+salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
}
