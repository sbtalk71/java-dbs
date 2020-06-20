package com.demo.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Education {
	@Column(name="QUALIFICATION")
	private String qualification;
	
	@Column(name="UNIVERSITY")
	private String university;
	
	@Column(name="PLACE")
	private String place;

	public Education() {
		// TODO Auto-generated constructor stub
	}

	public Education(String qualification, String university, String place) {
		this.qualification = qualification;
		this.university = university;
		this.place = place;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
