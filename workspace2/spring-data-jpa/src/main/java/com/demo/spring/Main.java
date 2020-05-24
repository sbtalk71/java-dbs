package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.entity.EmpService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

		EmpService service=(EmpService)ctx.getBean("empService");
		
		//String resp=service.registerEmployee(123, "Sukirthi", "Kolkata", 76000);
		
		//System.out.println(resp);
		//service.getEmpInfo(1234);
		
		//service.listAllEmps();
		
		service.listEmps(70000, 90000);
	}

}
