package com.main.assignmentjdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.utill.DBUtil;

public class Crud {
	
	
	public static void listStudent(Statement st) {
		String readQuery = "SELECT * FROM students";
		ResultSet rs;
		try {
			rs = st.executeQuery(readQuery);
			while (rs.next()) {
				int id = rs.getInt("stud_id");
				String name = rs.getString("stud_Name");
				int age = rs.getInt("Age");
				String grade = rs.getString("Grade");
				System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;

		try {
			 con = DBUtil.getMysqlDBConnection();
			 st = con.createStatement();

			List<Student> studentList = new ArrayList<>();

			Student s1 = new Student();
			s1.setAge(18);
			s1.setGrade("A");
			s1.setId(1001);
			s1.setName("DUCK1");

			Student s2 = new Student();
			s2.setAge(17);
			s2.setGrade("C");
			s2.setId(1005);
			s2.setName("DUCK2");

			Student s3 = new Student();
			s3.setAge(18);
			s3.setGrade("B");
			s3.setId(1002);
			s3.setName("DUCK4");

			Student s4 = new Student();
			s4.setAge(19);
			s4.setGrade("F");
			s4.setId(1004);
			s4.setName("DUCK6");
			
			studentList.add(s1);
			studentList.add(s2);
			studentList.add(s3);
			studentList.add(s4);

			Iterator<Student> r = studentList.iterator();

			String sql = "INSERT INTO students (stud_id, stud_Name, Age, Grade) values(?,?,?,?)";

			ps = con.prepareStatement(sql);
			while (r.hasNext()) {
				Student cur = r.next();
				ps.setInt(1, cur.getId());
				ps.setString(2, cur.getName());
				ps.setInt(3, cur.getAge());
				ps.setString(4, cur.getGrade());
				
				ps.executeUpdate();
			}
		
			System.out.println(studentList.size()+" Student record inserted successfully");

			System.out.println("####################################");

			// Read
			listStudent(st);
			System.out.println("####################################");

			// Update
			String updateQuery = "UPDATE students SET Age = 19 WHERE stud_id = 1001";
			st.executeUpdate(updateQuery);
			System.out.println("Student record updated successfully");
			
			listStudent(st);
			
			System.out.println("####################################");

			// Delete
			String deleteQuery = "DELETE FROM students WHERE stud_id = 1004";
			st.executeUpdate(deleteQuery);
			System.out.println("Student record deleted successfully");
			
			listStudent(st);

		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				ps.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}
	}

}
