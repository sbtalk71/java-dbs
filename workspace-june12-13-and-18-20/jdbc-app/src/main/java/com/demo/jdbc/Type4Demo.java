package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Type4Demo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root","root");
		
		Statement stmt=conn.createStatement();
		
		//ResultSet rs=stmt.executeQuery("select * from emp");
		ResultSet rs=stmt.executeQuery("select name,empno,salary,address from emp");
		
		while(rs.next()) {
			
			//System.out.println(rs.getInt("EMPNO")+" "+rs.getString("NAME")+" "+rs.getString("ADDRESS")+" "+rs.getDouble("SALARY"));
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
			
		}
		
		

	}

}
