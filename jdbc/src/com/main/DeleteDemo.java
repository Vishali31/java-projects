package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDemo {

	public static void main(String[] args) {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String userName = "root";
		String password = "admin123";
		Connection con = null;
		Scanner sc = new Scanner(System.in);

		try {
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("connected");
			System.out.println("Enter a product Id :");
			int productId = sc.nextInt();
		

			String selectSql = "select prod_id from product where prod_id = " + productId;
			String deleteSql = "delete from product where prod_id = " + productId;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(selectSql);
			if (rs.next()) {
				int drs = st.executeUpdate(deleteSql);
				System.out.println("Product deleted successfully");

			} else {
				System.out.println("Product not found");
			}
		} catch (SQLException e) {
			e.getStackTrace();
		} finally {
			try {

				con.close();
				System.out.println("connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		sc.close();
	}
}
