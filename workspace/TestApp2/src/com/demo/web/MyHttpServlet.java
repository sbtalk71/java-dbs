package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/app")
public class MyHttpServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		config.getServletContext().log("Servlet "+this.getClass().getName()+" is initialized...");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String city=req.getParameter("city");
		
		PrintWriter out=resp.getWriter();
		if(name==null||city==null||(name.equals(""))||city.equals("")) {
			resp.sendRedirect("not-found.html");
		}else {
			if(name.equalsIgnoreCase("shantanu")){
				req.getRequestDispatcher("/s1").forward(req, resp);
			}else {
				req.getRequestDispatcher("/s2").forward(req, resp);
			}
		}
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
