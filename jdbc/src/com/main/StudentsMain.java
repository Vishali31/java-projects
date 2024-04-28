package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.utill.DBUtil;

public class StudentsMain {

	public static void main(String[] args) {

		StudentsDAO studentDAO = new StudentsDAO();

		Students newStudent = new Students(1, "John Doe", 20);
		studentDAO.addStudent(newStudent);

		Students retrievedStudent = studentDAO.getStudentById(1);
		System.out.println(retrievedStudent);

		retrievedStudent.setName("Jane Doe");
		retrievedStudent.setAge(21);
		studentDAO.updateStudent(retrievedStudent);
		Students updated = studentDAO.getStudentById(1);
		System.out.println(updated);

		studentDAO.deleteStudent(1);

	}

}
