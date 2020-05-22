package com.demo.spring.app2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.AppConfig;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

		EmpService service=(EmpService)ctx.getBean("empService");
		
		String resp=service.registerEmployee(101,"A", "B", 78000);
		System.out.println(resp);
		
	}

}
