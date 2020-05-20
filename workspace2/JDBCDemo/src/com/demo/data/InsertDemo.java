package com.demo.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springdb?useSSL=false", "root", "admin");

		PreparedStatement pst=con.prepareStatement("insert into emp(empno,name,address,salary) values(?,?,?,?)");
		
		pst.setInt(1, 103);
		pst.setString(2, "Shikha");
		pst.setString(3, "Kolkata");
		pst.setDouble(4, 76000);
		
		int count=pst.executeUpdate();
		
		System.out.println("Rows inserted : "+count);
				

	}

}
