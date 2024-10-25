package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Employee;
import com.example.serviceimpl.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl serviceImpl;
	
	
	@RequestMapping(value= {"/","loadForm"})
	public String loadForm(Model model) 
	{	
		Employee emp=new Employee();
		
		model.addAttribute("emp",emp);
	
		return "employee";
	}
	@RequestMapping("/insert")
	public String handleForm(@ModelAttribute("emp") Employee emp,Model model) {
		
		boolean saveEmployee=serviceImpl.saveEmployee(emp);
		
		String msg="";
		if(saveEmployee) {
			msg="Employee Addd Sucessfully";
		}
		else 
			msg="Failed to Add Employee";
		
		model.addAttribute("msg",msg);
		
		return "employee";
		
	}
	
	@RequestMapping("/viewEmployee")
	public String viewAllEmployees(Model model) {
		
		List<Employee>employeeList=serviceImpl.getAllEmployees();
		model.addAttribute("employees", employeeList);
		return "viewemployee";
		
	}
//	@RequestMapping(value="/editstu")
//	public String edit(@RequestParam int eno,Model model) {
//		
//		Employee emp=serviceImpl.getAllEmployees(eno);
//		model.addAttribute("emp", emp);
//		return "employeeeditform";
//	}
}
