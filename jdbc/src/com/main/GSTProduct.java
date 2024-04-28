package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GSTProduct {

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
			System.out.println("Enter a Quantity :");
			int quantity = sc.nextInt();

			String selectSql = "select prod_price,prod_name from product where prod_id = " + productId;

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(selectSql);

			if (rs.next()) {
				int prod_price = rs.getInt(1);
				String prod_name = rs.getString(2);

				double price = calculatePrice(prod_price, quantity);
				System.out.println("----------------------------------------------------\n");
				System.out.println("Product Name"+"---------"+"Price"+"--------------"+"Quantity");
				System.out.println(prod_name+"--------------"+prod_price+"------------"+quantity);
				System.out.println("Total price (Including GST%): " + price);
				System.out.println("\n----------------------------------------------------");

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

	static double calculatePrice(int price, int quantity) {

		int total = (price * quantity);

		return (total + (total * 0.05));

	}
}
