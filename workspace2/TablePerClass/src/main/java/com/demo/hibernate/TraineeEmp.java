package com.demo.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TRAINEE2")
public class TraineeEmp extends Employee {
	protected String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

}
