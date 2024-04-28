package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SearchProduct {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a product Id :");
		int productId = sc.nextInt();
		sc.close();

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root",
				"admin123");
		String sql = "select * from product where prod_id = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String pname = rs.getString(2);
				System.out.println(pname);

			}
		} catch (SQLException e) {
			e.getStackTrace();
		}

	}
}
