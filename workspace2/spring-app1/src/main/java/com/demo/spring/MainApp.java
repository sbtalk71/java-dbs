package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Mail mail=ctx.getBean(Mail.class);
		
		System.out.println(mail.getMessage().getBody());

	}

}
