package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {

	@GetMapping("/signup")
	public String signup() {

		return "Signup";// jsp name
	}

	@GetMapping("login")
	public String login() {
		return "Login";// jsp name
	}

	@PostMapping("/saveuser")
	public String saveUser(UserBean user,Model model) {
		// read
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		
		model.addAttribute("user",user);
	
		return "PrintData";//jsp -> print 
	}

}
