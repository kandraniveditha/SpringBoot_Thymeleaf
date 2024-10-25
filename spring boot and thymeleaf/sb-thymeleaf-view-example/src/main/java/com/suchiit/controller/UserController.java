package com.suchiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.suchiit.model.User;

@Controller
public class UserController {

	@RequestMapping("/")
	public String loadForm() {
		System.out.println("welcome Boss");
		return "index";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user)
	{
		System.out.println(user.getName()+"\t"+user.getPass());
		ModelAndView modelAndview=new ModelAndView();
		
		modelAndview.setViewName("view");
		modelAndview.addObject("user", user);
		
		return modelAndview;
	}
	
	
	
}
