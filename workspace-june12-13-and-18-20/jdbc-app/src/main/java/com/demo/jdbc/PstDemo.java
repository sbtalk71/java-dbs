package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PstDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root","root");
		
		PreparedStatement pst=conn.prepareStatement("select empno,name,salary,address from emp where empno=?");
		pst.setInt(1, 100);
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()) {
			
			System.out.println(rs.getInt("EMPNO")+" "+rs.getString("NAME")+" "+rs.getString("ADDRESS")+" "+rs.getDouble("SALARY"));
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
			
		}
		
		

	}

}
