package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalcController {

	@GetMapping("inputcalc")
	public String inputCalc() {
		return "InputCalc";
	}

	@PostMapping("add")
	public String addition(Integer n1,Integer n2,Model model) {
		//read n1 n2 
		Integer ans=n1+n2;
		//Model ui 
		System.out.println(ans);
		//controller -> jsp 
		model.addAttribute("ans",ans); 
		return "OutputCalc"; 
	}
}
