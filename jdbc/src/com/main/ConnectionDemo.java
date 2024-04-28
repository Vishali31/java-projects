package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String userName = "root";
		String password = "admin123";
		
		Class.forName(driverClassName);
		System.out.println("Driver loaded");
		
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("connected");
		
		con.isClosed();
		System.out.println("connection closed");
			
		}

	}


