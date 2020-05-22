package com.demo.spring;

import org.springframework.stereotype.Repository;

@Repository
public class Message {

	private String header = "Tea Break";
	private String body = "Tea will arrive late today";

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
