package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.spring.app2.EmpDao;
import com.demo.spring.app2.EmpDaoJPAImpl;

@Configuration
@ComponentScan(basePackages = {"com.demo.spring"} )
public class AppConfig {

	@Bean
	public EmpDao jpaBean2() {
		
		return new EmpDaoJPAImpl();
	}
	
}
