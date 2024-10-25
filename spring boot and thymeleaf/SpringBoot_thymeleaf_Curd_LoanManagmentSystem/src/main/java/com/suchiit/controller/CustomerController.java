package com.suchiit.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.suchiit.entity.Customer;

import com.suchiit.repo.CustomerRepository;
import com.suchiit.service.CustomerService;

@Controller
public class CustomerController {

	
	
	@Autowired
	private CustomerService service;
	//private CustomerRepository custrepo;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	@GetMapping("customer")
	public String viewCustomerInfo() {
		/*
		 * List<Customer>addCustomers= custrepo.findAll();
		 * model.addAttribute("addCustomers", addCustomers);
		 */	
		return "customer";
	}
	
	@GetMapping("/customer")
	public ModelAndView getAllCustomer() {
		
		List<Customer>list=service.getAllCustomer();
		/*
		 * ModelAndView mv=new ModelAndView();
		 *  mv.setViewName("customerlist");
		 * mv.addObject("Customer", mv);
		 */
		return new ModelAndView("customerlist","customer",list);
	}
	
	@PostMapping("/save")
	public String addCustomers(@ModelAttribute("customer") Customer customer) {
		service.save(customer);
		return "redirect:/customer";
		
	}
	
	@GetMapping("/mycustomer")
	public String getMyCustomer() {
		return "mycustomer";
	}
	
}
