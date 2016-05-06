package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//this code is to test out database connection
public class TestJdbc {

	public static void main(String[] args) {
	//SSL=false is used to take off mysql ssl warning	
		String jdbcUrl= "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user= "hbstudent";		
		String pass= "hbstudent";
		try {
			System.out.println("Connection to database:" + jdbcUrl);
			
			Connection myConn=
					DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection Successful");
		}
		catch (Exception exc) {
			exc.printStackTrace();
			}
		}
	}


