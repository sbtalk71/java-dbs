package com.demo.jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoJdbcImpl implements EmpDao {

	@Override
	public String save(Emp e) {
		int count = 0;
		try {
			PreparedStatement pst = getConnection()
					.prepareStatement("insert into emp(empno,name,address,salary,doj) values(?,?,?,?,?)");
			pst.setInt(1, e.getEmpId());
			pst.setString(2, e.getEmpName());
			pst.setString(3, e.getLocation());
			pst.setDouble(4, e.getSalary());
			pst.setString(5, e.getDoj());

			count = pst.executeUpdate();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		if (count == 1)
			return "Emp inserted";
		else
			return "ERROR";
	}

	@Override
	public Emp findById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> listAll() {
		List<Emp> empList=new ArrayList<Emp>();
		try {
		PreparedStatement pst = getConnection()
				.prepareStatement("select * from emp");
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			empList.add(new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("ADDRESS"), rs.getDouble("SALARY"), 
					rs.getString("DOJ")));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
