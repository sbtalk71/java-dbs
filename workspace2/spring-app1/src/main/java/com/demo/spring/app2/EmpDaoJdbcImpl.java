package com.demo.spring.app2;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Emp;

@Repository
public class EmpDaoJdbcImpl implements EmpDao{

	@Override
	public String save(Emp e) {
		
		return "Saved Emp with Id "+e.getEmpId();
	}

}
