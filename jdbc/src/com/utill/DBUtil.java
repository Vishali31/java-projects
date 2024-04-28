package com.utill;
 
	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBUtil {

		public static Connection getMysqlDBConnection() {

			// String driverClassName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/jdbc_db";
			String userName = "root";
			String password = "admin123";
			Connection con = null;

			try {
				con = DriverManager.getConnection(url, userName, password);
				System.out.println("connected");
			} catch (SQLException e) {
				e.getStackTrace();
			} 
			return con;
		}
	}



