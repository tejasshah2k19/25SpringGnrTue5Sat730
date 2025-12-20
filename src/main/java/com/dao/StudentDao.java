package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.StudentBean;

@Repository
public class StudentDao {

	@Autowired // DI : Singleton
	JdbcTemplate stmt;// dependency

	public void addStudent(StudentBean student) {
		// insert
		int records = stmt.update(
				"insert into students (firstName,lastName,email,password,age,enrollmentYear) values (?,?,?,?,?,?)",
				student.getFirstName(), student.getLastName(), student.getEmail(), student.getPassword(),
				student.getAge(), student.getEnrollmentYear());
		System.out.println(records + " inserted....");
	}

	public List<StudentBean> getAllStudents() {
		List<StudentBean> students = stmt.query("select * from students",
				new BeanPropertyRowMapper<>(StudentBean.class));
		return students;
	}

	public void deleteStudentById(Integer studentId) {
//		String deleteQuery = "delete from students where studentId = ? ";
//		stmt.update(deleteQuery,studentId); 
		stmt.update("delete from students where studentId = ?", studentId);

	}

}
