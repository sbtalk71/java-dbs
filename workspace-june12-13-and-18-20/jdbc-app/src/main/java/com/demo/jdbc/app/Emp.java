package com.demo.jdbc.app;

public class Emp {

	private int empId;
	private String empName;
	private String location;
	private double salary;
	private String doj;
	
	public Emp() {
		
	}

	public Emp(int empId, String empName, String location, double salary, String doj) {
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.salary = salary;
		this.doj = doj;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	@Override
	public String toString() {
		
		return empId+" "+empName+" "+location+" "+salary+" "+doj;
	}
}
