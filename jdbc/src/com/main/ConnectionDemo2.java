package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo2 {

	public static void main(String[] args) {
		
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String userName = "root";
		String password = "admin123";
		Connection con = null;
		
		try {
			Class.forName(driverClassName);
			System.out.println("Driver loaded");
			
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("connected");
		}
		catch(ClassNotFoundException e) {
			e.getStackTrace();
			
		}catch(SQLException e) {
			e.getStackTrace();
		}
		finally {
			try {
				
				con.close();
				System.out.println("connection closed");
			}catch(SQLException e) {
			e.printStackTrace();
		}
		}

	}
}


