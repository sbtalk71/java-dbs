package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Type4Demo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException,ParseException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root","root");
		
		Statement stmt=conn.createStatement();
		
		//ResultSet rs=stmt.executeQuery("select * from emp");
		ResultSet rs=stmt.executeQuery("select name,empno,salary,address,doj from emp");
		
		while(rs.next()) {
			
			//System.out.println(rs.getInt("EMPNO")+" "+rs.getString("NAME")+" "+rs.getString("ADDRESS")+" "+rs.getDouble("SALARY")+
				//	rs.getDate("DOJ"));
			
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
			String doj=rs.getString("DOJ");
			
			SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-DD");
			Date dat=df.parse(doj);
			System.out.println(dat);
			
		}
		
		/*
		 * ResultSetMetaData rsmd=rs.getMetaData();
		 * 
		 * System.out.println(rsmd.getColumnCount()); int x=10;
		 * 
		 * DatabaseMetaData dm=conn.getMetaData();
		 * System.out.println(dm.getDatabaseProductName());
		 */

	}

}
