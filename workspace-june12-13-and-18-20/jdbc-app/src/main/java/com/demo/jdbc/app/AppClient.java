package com.demo.jdbc.app;

public class AppClient {

	public static void main(String[] args) {
		
		EmpDao dao=new EmpDaoJdbcImpl();
		//String resp=dao.save(new Emp(114, "Rakesh", "Delhi", 90000, "2019-03-20 00:00:00"));

		//System.out.println(resp);
		
		//dao.listAll().stream().forEach(e->System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getDoj()));
		dao.listAll().stream().forEach(System.out::println);
	}

}
