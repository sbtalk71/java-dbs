package com.demo.hibernate;

public class Education {
	private String qualification;
	private String university;
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
