package com.paytm.health.dao;

import java.sql.*;
import java.sql.DriverManager;

import com.paytm.health.model.Employee;

public class EmployeeDao {

	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String insert_query = "insert into Employee values " + "(?,?,?,?,?,?,?,?,?);";
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2","root","31081997kanishka,..");
		
				PreparedStatement pst = connection.prepareStatement(insert_query))
		{
			pst.setString(1, employee.getId());
			pst.setString(2, employee.getFullname());
			pst.setString(3, employee.getPhone());
			pst.setString(4, employee.getEmail());
			pst.setString(5, employee.getJobrole());
			pst.setString(6, employee.getDept());
			
			System.out.println(pst);
			result = pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
			return result;	
				
	}
}
