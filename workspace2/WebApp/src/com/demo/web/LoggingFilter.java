package com.demo.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class LoggingFilter implements Filter {

   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Request logged for "+request.getRemoteAddr());
		String name=request.getParameter("name");
		if(name.equalsIgnoreCase("shantanu")) {
			chain.doFilter(request, response);
		}else {
			response.getWriter().write("You are not allowed...");
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Logging filter initialized..");
	}

	@Override
	public void destroy() {
		
		
	}

}
