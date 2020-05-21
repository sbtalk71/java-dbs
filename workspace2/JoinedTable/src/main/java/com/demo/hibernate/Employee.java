package com.demo.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMP1")
public class Employee extends Person {
protected double salary;

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

}
