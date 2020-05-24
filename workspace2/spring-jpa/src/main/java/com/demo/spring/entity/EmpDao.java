package com.demo.spring.entity;

import java.util.List;

public interface EmpDao {

	public String save(Emp e);

	public Emp findById(int empId);

	public List<Emp> findAll();

	public String delete(int id);

	public String update(Emp e);

}
