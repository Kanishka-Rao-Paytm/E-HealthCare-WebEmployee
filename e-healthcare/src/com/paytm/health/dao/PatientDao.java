package com.paytm.health.dao;


import java.sql.*;
import java.sql.DriverManager;

import com.paytm.health.model.Patient;

public class PatientDao {


	public int registerPatient(Patient patient) throws ClassNotFoundException {
		String insert_query = "insert into Patient values " + "(?,?,?,?,?,?,?,?);";
		int result = 0;
		
		Class.forName("com.mysql.jdbc.cj.Driver");
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb2","root","31081997kanishka,..");
		
				PreparedStatement pst = connection.prepareStatement(insert_query))
		{
			pst.setString(1, patient.getId());
			pst.setString(2, patient.getFullname());
			pst.setString(3, patient.getPhone());
			pst.setString(4, patient.getEmail());
			pst.setString(5, patient.getJobrole());
			
			System.out.println(pst);
			result = pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
			return result;	
				
	}
}


