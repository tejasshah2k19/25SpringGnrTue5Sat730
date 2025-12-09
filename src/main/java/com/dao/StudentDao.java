package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.StudentBean;

@Repository
public class StudentDao {

	@Autowired
	JdbcTemplate stmt;

	public void addStudent(StudentBean student) {

		// insert
		int records = stmt.update("insert into students (firstName,lastName,email,password,age,enrollmentYear) values (?,?,?,?,?,?)",
				student.getFirstName(), student.getLastName(), student.getEmail(), student.getPassword(),student.getAge(),student.getEnrollmentYear());
		System.out.println(records + " inserted....");

	}
}
