package com.demo.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	@Autowired
	private EmpDao dao;

	public String registerEmployee(int id, String name, String loc, double sal) {
		String resp = dao.save(new Emp(id, name, loc, sal));
		if (resp.equals("success"))
			return "The Employee is registered now";
		else {
			System.out.println(resp);
			return "Emp Could not be registered";
		}
	}

	public void getEmpInfo(int id) {
		System.out.println(dao.findById(id));
	}

	public void listAllEmps() {
		for (Emp e : dao.findAll()) {
			System.out.println(e);
		}
	}
}
