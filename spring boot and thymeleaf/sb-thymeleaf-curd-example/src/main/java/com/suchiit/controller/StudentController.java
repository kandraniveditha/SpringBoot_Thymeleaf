package com.suchiit.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.suchiit.entity.StudentEntity;
import com.suchiit.repo.StudentRepository;

@Controller
@RequestMapping("/students/")
public class StudentController {

	@Autowired
	private StudentRepository stuRepo;

	@RequestMapping("/loadForm")
	public String loadForm(Model model) {
		
		StudentEntity stu=new StudentEntity();
		model.addAttribute("stu", stu);
		return "addstudent";	
	}
	
	@RequestMapping("list")
	public String viewStudentInfo(Model model) {
	List<StudentEntity>addStudents=	stuRepo.findAll();
		model.addAttribute("addStudents", addStudents);
		
		return "view";
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String addStudents(@Valid StudentEntity student,BindingResult result,Model model)
	{
		if(result.hasErrors()) {
			return "addstudent";
		}
		stuRepo.save(student);
		
		return "redirect:list";
	}
	
	@RequestMapping("edit/{id}")
	public String showEditForm(@PathVariable("id")  long id,Model model) {
		
		//using id get the specific record
	StudentEntity stuEnt=	stuRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Student"));
		model.addAttribute("student", stuEnt);
		
		
		return "editstudent";
		
	}
	
	/*
	 * @RequestMapping(value="update/{id}",method=RequestMethod.POST) public String
	 * updateStudent(@PathVariable long id,@Valid StudentEntity
	 * student,BindingResult result,Model model) { if(result.hasErrors()) {
	 * student.setId(id); return "editstudent"; } stuRepo.save(student);
	 * model.addAttribute("addStudents", stuRepo.findAll());
	 * 
	 * return "view"; }
	 */
	
	@RequestMapping(value="update/{id}",method=RequestMethod.POST)
	public String updateStudent(@PathVariable long id,@Valid StudentEntity student,BindingResult result,Model model)
	{
	if(result.hasErrors())
	{
		student.setId(id);
		return "editstudent";
	}
	stuRepo.save(student);
	//aftr update retive the records carry to view components
	
	List<StudentEntity>addStudents=stuRepo.findAll();
	model.addAttribute("addStudents", addStudents);
	
	return "view";
	}
	
	@RequestMapping("delete/{id}")
	public String deleteStudentForm(@PathVariable("id")  long id,Model model) {
		
		//using id get the specific record
	StudentEntity stuEnt=	stuRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Student"));
	stuRepo.delete(stuEnt);	
	//after delete retrive the data carry to view component
	List<StudentEntity>addStudents=stuRepo.findAll();
	
	model.addAttribute("addStudents", addStudents);
		
		
		return "view";
		
	}
}
