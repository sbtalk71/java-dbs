package com.demo.hibernate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Emp {

	@Id
	@Column(name="EMPNO")
	private int empId;
	
	@Column(name="NAME")
	private String empName;
	
	@Column(name="ADDRESS")
	private String location;
	
	private double salary;
	
	@Embedded
	private Education education;
	
	
	public Emp() {
		
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public Emp(int empId, String empName, String location, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.salary = salary;
		
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

	
	
	@Override
	public String toString() {
		
		return empId+" "+empName+" "+location+" "+salary;
	}
}
