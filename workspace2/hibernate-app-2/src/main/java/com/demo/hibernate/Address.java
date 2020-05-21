package com.demo.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	
	private String doorNo;
	
	@Column(name="LOCATION")
	private String city;
	
	private String pinCode;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String doorNo, String city, String pinCode) {
		this.doorNo = doorNo;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}
