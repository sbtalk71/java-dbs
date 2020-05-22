package com.demo.spring.app2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.spring.entity.Emp;

@Service
public class EmpService {

	@Autowired
	@Qualifier("jpaBean2")
	EmpDao dao;
	
	public String registerEmployee(int id,String name,String loc,double sal) {
		String resp=dao.save(new Emp(id, name, loc, sal));
		return resp;
	}
}
