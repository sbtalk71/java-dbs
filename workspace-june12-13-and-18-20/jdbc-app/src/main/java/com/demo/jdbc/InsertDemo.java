package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pst = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");

			pst = conn.prepareStatement("insert into emp(empno,name,address,salary,doj) values(?,?,?,?,?)");
			pst.setInt(1, 109);
			pst.setString(2, "Kiran");
			pst.setString(3, "Chennai");
			pst.setDouble(4, 89000);
			pst.setString(5, "2019-07-15 10:10:10");

			int count = pst.executeUpdate();

			System.out.println("Rows Inserted : " + count);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Class Not Found...");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
