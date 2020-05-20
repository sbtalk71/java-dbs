package com.demo.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcFetchDemo {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springdb?useSSL=false", "root", "admin");

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");

		while (rs.next()) {
			int id = rs.getInt("EMPNO");
			String name = rs.getString("NAME");
			String address = rs.getString("ADDRESS");
			double sal = rs.getDouble("SALARY");
			System.out.println(id+" "+name+" "+address+" "+sal);
		}

	}

}
