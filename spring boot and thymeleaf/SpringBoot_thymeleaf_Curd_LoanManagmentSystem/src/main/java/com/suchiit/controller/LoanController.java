package com.suchiit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.suchiit.entity.Loan;

import com.suchiit.service.LoanService;

@Controller
public class LoanController {

	
	@Autowired
	private LoanService loanservice;
	
	
	@GetMapping("loan")
	public String viewLoanInfo() {
	
		/*
		 * List<Loan>addloans= loanrepo.findAll(); model.addAttribute("addloans",
		 * addloans);
		 */
		
		return "loan";
	}
	
	@GetMapping("/loan")
	public ModelAndView getAllLoan() {
		List<Loan>list=loanservice.getAllLoan();
		return new ModelAndView("loanlist","loan",list);
	}
	
	@PostMapping("/save")
	public String addloans(@ModelAttribute("loan") Loan loan) {
		loanservice.save(loan);
		return "redirect:/";}
	

}
