package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo2 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
				PreparedStatement pst = conn
						.prepareStatement("insert into emp(empno,name,address,salary) values(?,?,?,?)")) {

			pst.setInt(1, 102);
			pst.setString(2, "Kiran");
			pst.setString(3, "Chennai");
			pst.setDouble(4, 89000);

			int count = pst.executeUpdate();

			System.out.println("Rows Inserted : " + count);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
