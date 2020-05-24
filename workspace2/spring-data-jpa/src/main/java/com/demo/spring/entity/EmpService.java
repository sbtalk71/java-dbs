package com.demo.spring.entity;

import java.lang.reflect.Method;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.EmpDao;

@Service
public class EmpService {

	@Autowired
	private EmpDao dao;

	public String registerEmployee(int id, String name, String loc, double sal) {
		/*
		 * System.out.println(dao.getClass().getName());
		 * 
		 * for(Method m:dao.getClass().getMethods()) { System.out.println(m.getName());
		 * }
		 */
		if(dao.existsById(id)) {
			return "Emp already exists";
		}else {

			dao.save(new Emp(id, name, loc, sal));
			return "success";
		}
		
	}

	public void getEmpInfo(int id) {
		Optional<Emp> o=dao.findById(id);
		if(o.isPresent()) {
			System.out.println(o.get());
		}else {
			System.out.println("Emp Not Found..");
		}
	}

	public void listAllEmps() {
		for (Emp e : dao.findAll()) {
			System.out.println(e);
		}
	}
	
	public void listEmps(double sal1, double sal2) {
		for(Emp e: dao.listAllEmpWithSal(sal1, sal2)) {
			System.out.println(e);
		}
	}
}
