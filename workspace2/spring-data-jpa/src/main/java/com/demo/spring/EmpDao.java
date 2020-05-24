package com.demo.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.spring.entity.Emp;

public interface EmpDao extends JpaRepository<Emp, Integer> {

	@Query("select e from Emp e where e.salary between ?1 and ?2")
	public List<Emp> listAllEmpWithSal(double sal1, double sal2);
}
