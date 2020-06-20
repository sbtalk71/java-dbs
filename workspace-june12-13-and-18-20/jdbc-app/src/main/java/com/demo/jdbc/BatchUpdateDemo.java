package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdateDemo {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");

			Statement stmt = conn.createStatement();
			conn.setAutoCommit(false);

			stmt.addBatch("insert into emp (empno,name,address,salary) values (103,'Raman','Hyderabad',67000)");
			stmt.addBatch("insert into emp (empno,name,address,salary) values (104,'Tiger','Hyderabad',67000)");
			stmt.addBatch("insert into emp (empno,name,address,salary) values (105,'Arun','Hyderabad',67000)");
			stmt.addBatch("insert into emp (empno,name,address,salary) values (106,'Seema','Hyderabad',67000)");
			stmt.addBatch("insert into emp (empno,name,address,salary) values (107,'Chndra','Hyderabad',67000)");
			stmt.addBatch("insert into emp (empno,name,address,salary) values (108,'Parul','Hyderabad',67000)");
			
			conn.commit();

			int[] count = stmt.executeBatch();
			System.out.println("Transaction success with count "+count.length);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				
				conn.rollback();
				System.out.println("Rolling back Tx");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
				conn.setAutoCommit(true);
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
