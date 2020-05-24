package com.demo.spring;



import java.net.URL;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.demo.spring.entity.Emp;

//@SpringBootApplication
public class EmpRestClientsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EmpRestClientsApplication.class, args);
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> resp= rt.getForEntity("http://localhost:9080/emp/find/123", String.class);
		
		System.out.println(resp.getBody());
		
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		HttpEntity requestEntity=new HttpEntity<>(headers);
		
		ResponseEntity<Emp> resp1=rt.exchange("http://localhost:9080/emp/find/123", HttpMethod.GET, requestEntity, Emp.class);
		
		System.out.println(resp1.getBody());
	
	}

}