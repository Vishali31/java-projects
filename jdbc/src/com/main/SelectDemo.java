package com.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectDemo {

	public static void main(String[] args) {
		
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String userName = "root";
		String password = "admin123";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("connected");
		String sql = "select * from product";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int pid = rs.getInt(1);
			String pname = rs.getString(2);
			int pprice = rs.getInt(3);
			Date pmfd = rs.getDate(4);
			String pcategory = rs.getNString(5);
			System.out.println(pid+" "+pname+" "+pprice+" "+pmfd+" "+pcategory+" ");
		}
		
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


