package com.abcmart.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

import com.abcmart.dto.Product;
import com.abcmart.utils.DBUtil;


public class ProductDao {

	private static Connection con  = null;

	public Product findproduct(int productId) {

		Connection con = DBUtil.getMysqlDBConnection();
		String sql = "select * from product where prod_id = ?";
		Product product = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		

		try(Connection con1 =  getMysqlDBConnection()) {
			 ps = con1.prepareStatement(sql);
			ps.setInt(1, productId);

			 rs = ps.executeQuery();
			
			if (rs.next()) {
				int pid = rs.getInt(1);
				String pname = rs.getString(2);
				int pprice = rs.getInt(3);
				Date mfd = rs.getDate(4);
				String category = rs.getString(5);

				product = new Product();
				product.setProductId(pid);
				product.setProductName(pname);
				product.setProductPrice(pprice);
				product.setMfd(mfd.toLocalDate());
				product.setCategory(category);
			}
			
		}

		catch (SQLException e) {

			e.printStackTrace();
		
		}

		return product;
	}
	
	private Connection getMysqlDBConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> listProducts() {

		Connection con = DBUtil.getMysqlDBConnection();
		String sql = "select * from product";
		List<Product> products = new ArrayList<Product>();

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				int pid = rs.getInt(1);
				String pname = rs.getString(2);
				int pprice = rs.getInt(3);
				Date mfd = rs.getDate(4);
				String category = rs.getString(5);

				Product product = new Product();
				product.setProductId(pid);
				product.setProductName(pname);
				product.setProductPrice(pprice);
				product.setMfd(mfd.toLocalDate());
				product.setCategory(category);
				
				products.add(product);
				
				
			}
			
		}

		catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return products;
	}
}
