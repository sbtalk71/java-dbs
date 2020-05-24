package com.demo.spring.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.EmpRepository;
import com.demo.spring.entity.Emp;

import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;

@RestController
@Api
public class EmpRestController {

@Autowired
private EmpRepository repo;

	@GetMapping(path="/emp/find/{id}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity getEmpById(@PathVariable("id") int id) {
		Optional<Emp> o=repo.findById(id);
		if(o.isPresent()) {
			return ResponseEntity.ok(o.get());
		}else {
			//return ResponseEntity.status(404).build();
			throw new RuntimeException("Emp Not Found..");
		}
	}
	
	//@RequestMapping(path="/emp/save",method = RequestMethod.POST,produces = MediaType.TEXT_PLAIN_VALUE,
	//		consumes = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping(path="/emp/save",produces = MediaType.TEXT_PLAIN_VALUE,
	consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity saveEmp(@RequestBody Emp e) {
		
		if(repo.existsById(e.getEmpId())) {
			return ResponseEntity.ok("Employee Already Exists...");
		}else {
			repo.save(e);
			return ResponseEntity.ok("Employee Saved...");
		}
	}
	
	@PutMapping(path="/emp/update",produces = MediaType.TEXT_PLAIN_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity updateEmp(@RequestBody Emp e) {
				
					repo.save(e);
					return ResponseEntity.ok("Employee upadated...");
			}
	
	@DeleteMapping(path="/emp/delete",produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity deleteEmp(@RequestParam("id")int empId) {
		if(repo.existsById(empId)) {
			repo.deleteById(empId);
			return ResponseEntity.ok("Employee deleted...");
		}else {
			return ResponseEntity.ok("Employee not found with given id...");
		}
	}
	
	@GetMapping(path="/emp",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity getAll() {
		List<Emp> empList=repo.findAll();
		return ResponseEntity.ok(empList);
	}
	
	//Exception Handlers
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> myExceptionHandler(RuntimeException e){
		
		return ResponseEntity.ok(e.getMessage());
		
	}
}
