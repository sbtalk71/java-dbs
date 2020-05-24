package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HrController {

	@Autowired
	private RestTemplate rt;

	// URL: http://localhost:8081/hr/get?id=104
	@GetMapping(path = "/hr/get")
	@HystrixCommand(fallbackMethod = "getEmpInfoFallback")
	public ResponseEntity getEmpInfo(@RequestParam("id") int id) {

		System.out.println("Load Balancer Rest Template : "+rt.getClass().getName());
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		HttpEntity requestEntity = new HttpEntity<>(headers);

		ResponseEntity<String> resp1 = rt.exchange("http://emp-service/emp/find/"+id, HttpMethod.GET, requestEntity,
				String.class);

		return resp1;
	}
	
	@GetMapping(path = "/hr/list")
	public ResponseEntity listAll() {

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		HttpEntity requestEntity = new HttpEntity<>(headers);

		ResponseEntity<String> resp1 = rt.exchange("http://emp-service/emp", HttpMethod.GET, requestEntity,
				String.class);

		return resp1;
	}
	
	//Fallback methods
	
	public ResponseEntity getEmpInfoFallback(int id) {
		return ResponseEntity.ok("Service is down, try after some time");
	}
}
