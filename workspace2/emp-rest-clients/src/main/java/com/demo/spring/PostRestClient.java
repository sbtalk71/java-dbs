package com.demo.spring;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.demo.spring.entity.Emp;

public class PostRestClient {

	public static void main(String[] args) {
	
		RestTemplate rt = new RestTemplate();
		
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept", MediaType.TEXT_PLAIN_VALUE);
		headers.set("Content-Type",MediaType.APPLICATION_JSON_VALUE);
		
		Emp e1=new Emp(125, "Chatur", "Mimbai", 90000);
		
		HttpEntity<Emp> requestEntity=new HttpEntity<Emp>(e1, headers);
		
		ResponseEntity<String> resp=rt.exchange("http://localhost:9080/emp/save", HttpMethod.POST,requestEntity,String.class);
		System.out.println(resp.getBody());

	}

}
