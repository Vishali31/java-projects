package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.utill.DBUtil;

public class StudentsDAO {

	Connection con = null;
	Statement st = null;
	PreparedStatement ps = null;

	public void addStudent(Students student) {
		try {

			con = DBUtil.getMysqlDBConnection();
			st = con.createStatement();

			PreparedStatement preparedStatement = con
					.prepareStatement("INSERT INTO students (stud_id, stud_Name, Age) VALUES (?, ?, ?)");
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setInt(3, student.getAge());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error adding student: " + e.getMessage());
		}

	}

	public Students getStudentById(int studentId) {
		try {
			PreparedStatement preparedStatement = this.con.prepareStatement("SELECT * FROM students WHERE stud_id = ?");
			preparedStatement.setInt(1, studentId);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int id = resultSet.getInt("stud_id");
				String name = resultSet.getString("stud_Name");
				int age = resultSet.getInt("Age");
				return new Students(id, name, age);
			}
		} catch (SQLException e) {
			System.out.println("Error getting student: " + e.getMessage());
		}
		return null;
	}

	public void updateStudent(Students student) {
		try {
			PreparedStatement preparedStatement = con
					.prepareStatement("UPDATE students SET stud_Name = ?, Age = ? WHERE stud_id = ?");
			preparedStatement.setString(1, student.getName());
			preparedStatement.setInt(2, student.getAge());
			preparedStatement.setInt(3, student.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error updating student: " + e.getMessage());
		}
	}

	public void deleteStudent(int studentId) {
		try {
			PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM students WHERE stud_id = ?");
			preparedStatement.setInt(1, studentId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error deleting student: " + e.getMessage());
		}

	}
}
