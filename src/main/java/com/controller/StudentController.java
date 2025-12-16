package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBean;
import com.dao.StudentDao;
 

//spring --> StudentController -> memory life cycle -> singleton 
//spring -> spring bean 

@Controller
public class StudentController {

	@Autowired
	StudentDao studentDao;
	
	//url 
	@GetMapping("/is")
	public String openInputStudent() {
		return "InputStudent";//jsp name 
	}
	
	
	@GetMapping("newstudent") // url name
	public String addStudent() {// method name
		return "InputStudent";// jsp
	}
	
	@PostMapping("saveStudent")
	public String saveStudent(@Validated StudentBean studentBean,BindingResult result,Model model) {
		//read all input : form
		//bean 
		//validation 
		if(result.hasErrors() == true ) {
			model.addAttribute("result",result);
			return "InputStudent";
		}
		studentDao.addStudent(studentBean);
		return "PrintStudent";
	}
	
	//open ListStudent.jsp 
	@GetMapping("liststudents")
	public String listStudent(Model model) {
		List<StudentBean> students = studentDao.getAllStudents(); 
		//controller -> jsp -> data send ->
		model.addAttribute("students",students);
		return "ListStudent";
	}
	
	
	
	
	
}
