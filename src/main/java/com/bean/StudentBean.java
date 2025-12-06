package com.bean;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class StudentBean {

	@Pattern(regexp = "[a-zA-Z]+", message = "Please Enter Valid FirstName")
	@NotBlank(message = "Please Enter FirstName")
	private String firstName;

	@NotBlank(message = "Please Enter LastName")
	private String lastName;

	@NotNull(message = "Please Enter Age")
 	@Min(value = 18,message = "18+ can register")
	private Integer age;

	@NotBlank
	private String enrollmentYear;

	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9\\._]+@[a-zA-Z]+\\.[a-zA-Z0-9]{2,4}")
	private String email;

	@NotBlank
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEnrollmentYear() {
		return enrollmentYear;
	}

	public void setEnrollmentYear(String enrollmentYear) {
		this.enrollmentYear = enrollmentYear;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
