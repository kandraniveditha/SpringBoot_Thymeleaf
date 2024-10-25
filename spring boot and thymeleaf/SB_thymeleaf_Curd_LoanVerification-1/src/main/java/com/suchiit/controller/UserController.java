package com.suchiit.controller;

import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suchiit.model.UserEntity;


@Controller
public class UserController {

	@GetMapping("register")
	public String userRegistration(Model model) {
		//Object creation to store form data
		UserEntity user=new UserEntity();
		model.addAttribute("user", user);
		
		List<String>listProfession=Arrays.asList("Developer","Testing","Designing","Operater");
		model.addAttribute("listprofession", listProfession);
		
		List<String>listmaritalstatus=Arrays.asList("Single","Married");
		model.addAttribute("listmaritalstatus", listmaritalstatus);
		return "register-form";
	}
	
	@PostMapping("register/save")
	public String submitForm(@ModelAttribute ("user")UserEntity user, Model model) {
		model.addAttribute("user", user);
		return "user-sucess";
	}
}
