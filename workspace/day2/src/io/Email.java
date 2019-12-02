package io;

import java.io.Serializable;

public class Email implements Serializable{
	private String toAddress;
	private String fromAddress;
	private String message;

	public Email(String toAddress, String fromAddress, String message) {
		this.toAddress = toAddress;
		this.fromAddress = fromAddress;
		this.message = message;
	}

	public String getMail() {
		return toAddress+" "+message+" "+fromAddress;
	}
}
