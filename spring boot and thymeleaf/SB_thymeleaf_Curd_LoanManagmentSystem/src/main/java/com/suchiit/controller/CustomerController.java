package com.suchiit.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.suchiit.entity.CustomerEntity;
import com.suchiit.service.CustomerServiceImpl;

@Controller
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerServiceImpl custservice;
	
	@RequestMapping(value="/customerlist",method=RequestMethod.GET)
	public String getAllCustomer(Model model) {
		
		model.addAttribute("customers",custservice.getAllCustomer());
		
		return "customerlist";
	}
	
	@RequestMapping(value="/customer",method=RequestMethod.POST)
	public String AddCustomer(@RequestParam String fname,@RequestParam String lname,@RequestParam String email,@RequestParam Date dob,@RequestParam String phnoenum,@RequestParam String gender,@RequestParam String maritalstatus,@RequestParam String profession,@RequestParam String address)
	{
		CustomerEntity cust=new CustomerEntity();
	custservice.addCustomer(cust);
	return "redirect:customerlist";
	}
	
	@RequestMapping(value="/delete-customer",method=RequestMethod.GET)
	public String deleteCustomer(int id) {
		custservice.deleteCustomer(id);
		return "redirect:/customerlist";
	}
	public String viewUpadte(@RequestParam int id,Model model)
	{
		CustomerEntity customer=custservice.viewCustomer(id);
		model.addAttribute("customer", customer);
		return "update";
	}
	
	@RequestMapping(value="/update-customer",method=RequestMethod.POST) 
	public String updatCustomer(Model model,@RequestParam int cid,@RequestParam String fname,@RequestParam String lname,@RequestParam String email,@RequestParam Date dob,@RequestParam String phonenum,@RequestParam String gender,@RequestParam String maritalstatus,@RequestParam String profession,@RequestParam String address) {
		
		CustomerEntity customer=custservice.viewCustomer(Integer.valueOf(cid)); 
		
		customer.setFname(fname);  
		customer.setLname(lname);
		customer.setEmail(email);  
		customer.setDob(dob);   
		customer.setPhonenum(phonenum);
		customer.setGender(gender);
		customer.setMaritalstatus(maritalstatus);
		customer.setProfession(profession);
		customer.setAddress(address); 
		custservice.update(customer);  
		model.addAttribute("customer",customer);  
		
		if(model.getAttribute("customer")!=null)   {  
			model.addAttribute("message", "Your Profile Updated Successfully");  
			
			return "customerprofileupdate";  
			}  
		else 
		{     
			return "redirect:/customerlist";  
			} 
		} 
	
	@RequestMapping(value="/serchcustomer",method=RequestMethod.GET) 
	public String SearchCustomer()
	{       
		return "searchcustomer";   
		} 
	
	@RequestMapping(value="/serchcustomer",method=RequestMethod.POST) 
	public String viewSearchCustomer(Model model,@RequestParam int cid) {
		CustomerEntity cust=custservice.SearchCustomerEntity(cid);
		model.addAttribute("cust", cust);
		return "searchcustomer";
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET) 
	public String Viewindex() {  
		return "Index";  
		}    
	
	@RequestMapping(value="/login-customer",method=RequestMethod.GET)
	public String GetLogin() {      
		return "logincustomer";       
		} 
	
	@RequestMapping(value="/login-customer",method=RequestMethod.POST) 
	public String checkLogin(Model model,@RequestParam String email,@RequestParam String password) 
	{         
		CustomerEntity customer= custservice.login(email, password); 
	
	if(customer!=null)
	{           
		model.addAttribute("customer", customer);
		return "customerpanel";
		}    
	else {    
		model.addAttribute("errorMessage", "Invalid Details"); 
		return "logincustomer";
	}
	}
	@RequestMapping(value="/register-customer",method=RequestMethod.GET)
	public String RegisterCustomer() { 
		return "registerCustomer";  
		
	} 
	@RequestMapping(value="/register-customer",method=RequestMethod.POST)
	public String viewRegister(Model model,@RequestParam int cid,@RequestParam String fname,@RequestParam String lname,@RequestParam String email,@RequestParam Date dob,@RequestParam String phonenum,@RequestParam String gender,@RequestParam String maritalstatus,@RequestParam String profession,@RequestParam String address) 
	{        
		CustomerEntity cust=new CustomerEntity();
		custservice.addCustomer(cust);   
		return "redirect:/login-customer"; 
		
	}     
	
	@RequestMapping(value="/customerpanel",method=RequestMethod.GET)
	public String viewCustomerPanel()
	{   
		return "customerpanel"; 
		}   
	
	@RequestMapping(value="/view-profile",method=RequestMethod.GET)
	public String viewCustomerProfile() 
	{  
		return "customerprofile";  
		} 
	
	@RequestMapping(value="/viewcustomerupdate",method=RequestMethod.GET) 
	public String viewCustomerProfileUpdate()
	{   
		return "customerprofileupdate";
	}
	}

