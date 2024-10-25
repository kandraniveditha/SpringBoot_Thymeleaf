package com.suchiit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.suchiit.entity.Admin;
import com.suchiit.service.AdminServiceImpl;

@Controller
@SessionAttributes("admin")
public class AdminController {

	@Autowired
	AdminServiceImpl adminservice;
	
	@RequestMapping(value="/adminlist")
	public String getAdminlist(Model model) {
		
		model.addAttribute("admin",adminservice.getAllAdmi());
		
		return "adminlist";
	}
	
	@RequestMapping(value="/addadmin",method=RequestMethod.GET)
	
	public String viewaddAdmin() {
		return "addadmin";
	}
	
	@RequestMapping(value="/addadmin",method=RequestMethod.POST)
	public String addAdmin(@RequestParam String name,@RequestParam String phno,@RequestParam String email) {
		
		Admin admin=new Admin();
		adminservice.addAdmin(admin);
		
		return "redirect:/adminlist";
		
	}
	
	@RequestMapping(value="/deteteadmin",method=RequestMethod.GET)
	public String deleteAdmin(int id) {
		
		adminservice.deleteAdmin(id);
		
		return "redirect:/adminlist";
	}
	
	@RequestMapping(value="/viewupdateadmin",method=RequestMethod.GET)
	public String viewUpdateAdmin(@RequestParam int id,Model model) {
		Admin admin =adminservice.viewAdminUpdate(id);
		model.addAttribute("admin", admin);
		return "updateadmin";
	}
	
	@RequestMapping(value="/viewupdatedmin",method=RequestMethod.POST)
	public String addAdmin(Model model,@RequestParam int adminid,@RequestParam String name,@RequestParam String phno,@RequestParam String email) {
		
		{
			Admin admin=adminservice.viewAdminUpdate(adminid);
			admin.setName(name);
			admin.setPhno(phno);
			admin.setEmail(email);
			adminservice.updateadmin(admin);
			model.addAttribute("admin", admin);
			if(model.getAttribute("admin")!=null) {
				model.addAttribute("message","Your Profile updated successfully");
				
				return "adminprofileupdate";
			}
			else
			{
				return "redirect:/adminlist";
				
			
			}
		}
		
		}
		@RequestMapping(value="/searchadmin",method=RequestMethod.POST)
		public String viewSearchAdmin(Model model,@RequestParam int adminid) {
			Admin admin=adminservice.viewsearchAdmin(adminid);
			model.addAttribute("admin", admin);
			return "searchadmin";
		}
		
	
    @RequestMapping(value="/loginadmin",method=RequestMethod.GET) 
    public String GetLogin() {     
    	
    	return "loginadmin";  
    	}  
    
    @RequestMapping(value="/loginadmin",method=RequestMethod.POST) 
   
    public String checkLogin(Model model,@RequestParam String email,@RequestParam String password) {   
    	
    	Admin admin= adminservice.login(email, password);  
    	if(admin!=null) 
    	{      
    		model.addAttribute("admin", admin);    
    		return "adminpanel"; 
    		}  
    	else { 
    		model.addAttribute("errorMessage", "Invalid Details");
    		return "loginadmin"; 
    		} 
    }
    
    @RequestMapping(value="/register-admin",method=RequestMethod.GET) 
		public String RegisterAdmin() {
    	
    	return "registerAdmin";  
    	} 
    @RequestMapping(value="/register-admin",method=RequestMethod.POST) 
    public String viewRegister(@RequestParam String name,@RequestParam String phno,@RequestParam String email,@RequestParam String password) 
    {          Admin admin=new Admin();   
    adminservice.addAdmin(admin);  
    return "redirect:/login-admin";  
    
    }  
    
    @RequestMapping(value="/adminpanel",method=RequestMethod.GET)
    
    public String viewAdminPanel()
    {  
    	return "adminpanel"; 
    	}  
    
    @RequestMapping(value="/view-adminprofile",method=RequestMethod.GET)
    
    public String viewAdminProfile() 
    
    {    
    	return "adminprofile";  
    	}  
    @RequestMapping(value="/viewadminupdate",method=RequestMethod.GET) 
    public String viewAdminProfileUpdate()
    {  
    		return "adminprofileupdate";
    	}
    }
		

