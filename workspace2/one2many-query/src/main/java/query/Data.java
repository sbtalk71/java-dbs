package query;

public class Data {
	private int empId;
	private String city;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private String name;
	private double salary;

	public Data() {
		// TODO Auto-generated constructor stub
	}

	public Data(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public Data(int empId, String name,String city, double salary) {
		this.empId = empId;
		this.city = city;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", salary=" + salary + "]";
	}

}
