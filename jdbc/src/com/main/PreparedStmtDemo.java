package com.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStmtDemo {

	public static void main(String[] args) {
		
	
				
				String driverClassName = "com.mysql.cj.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/jdbc_db";
				String userName = "root";
				String password = "admin123";
				Connection con = null;
				
				try {
					con = DriverManager.getConnection(url, userName, password);
					System.out.println("connected");
					String sql = "insert into product values(?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setInt(1, 200);
					ps.setString(2, "vivoy");
					ps.setInt(3,456700);
					ps.setDate(4, new Date(2024-04-05));
					ps.setString(5, "ac");
					int noOfRowsEffected = ps.executeUpdate();
					System.out.println("Rows effected :"+noOfRowsEffected );
					
					
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

	


		

	



