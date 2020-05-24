package com.demo.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyRestController {

	@RequestMapping(path="/greet/{param}",method = RequestMethod.GET)
	
	//@GetMapping(path="/greet")
	public String test(@PathVariable("param") String name,@RequestParam("location") String loc) {
		return name+", Hello From Spring Rest Service for "+loc;
	}
	

}

