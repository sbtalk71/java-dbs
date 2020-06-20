package com.demo.jdbc.app;

import java.util.List;

public interface EmpDao {

	public String save(Emp e);
	public Emp findById(int empId);
	public List<Emp> listAll();
}
