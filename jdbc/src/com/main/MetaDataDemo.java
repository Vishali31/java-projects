package com.main;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


import com.utill.DBUtil;



public class MetaDataDemo {

	public static void main(String[] args) {
		
		String sql = "select * from product";
		
		try(
				
				Connection con = DBUtil.getMysqlDBConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				){
			DatabaseMetaData dbmd = con.getMetaData();
			
			System.out.println("Driver Version :" +dbmd.getDriverVersion());
			System.out.println("userName :" +dbmd.getUserName());
			
			ResultSetMetaData rsMetaData = rs.getMetaData();
			int columnsCount = rsMetaData.getColumnCount();
			System.out.println("columnCount :"+columnsCount);
			
			for(int i = 1;i<=columnsCount;i++) {
				System.out.print(rsMetaData.getColumnName(i)+"  / ");
						
						
			}
			System.out.println();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
