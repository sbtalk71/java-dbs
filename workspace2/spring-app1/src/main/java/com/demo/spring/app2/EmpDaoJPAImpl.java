package com.demo.spring.app2;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Emp;

@Repository("jpaBean")
public class EmpDaoJPAImpl implements EmpDao{

	@Override
	public String save(Emp e) {
		
		return "JPA: Saved Emp with Id "+e.getEmpId();
	}

}
