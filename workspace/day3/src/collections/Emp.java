package collections;

public class Emp {
	private int empId;
	private String name;
	private String city;
	private double salary;

	public Emp(int empId, String name, String city, double salary) {
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public String getDetails() {
		return empId + " " + name + " " + city + " " + salary;
	}

	public int getEmpId() {
		// TODO Auto-generated method stub
		return this.empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
}
