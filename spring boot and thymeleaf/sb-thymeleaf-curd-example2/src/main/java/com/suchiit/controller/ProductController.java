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

import com.suchiit.entity.ProductEntity;
import com.suchiit.repo.ProductRepository;

@Controller
@RequestMapping("/products/")
public class ProductController {

	@Autowired
	private ProductRepository proRepo;

@RequestMapping("loadForm")
    public String loadForm(Model model) {
		
		ProductEntity prt=new ProductEntity();
		model.addAttribute("prt",prt);
        return "addproduct";
    }
	
	@RequestMapping("list")
	public String viewProductInfo(Model model) {
	List<ProductEntity>addProducts=	proRepo.findAll();
		model.addAttribute("addProdducts", addProducts);
		
		return "viewproduct";
	}
    
    @RequestMapping(value="add",method=RequestMethod.POST)
    public String addUser(@Valid ProductEntity product, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addproduct";
        }
        
        proRepo.save(product);
		
		return "redirect:list";
    }
    
    @RequestMapping("edit/{id}")
	public String showEditForm(@PathVariable("id")  long id,Model model) {
		
		//using id get the specific record
	ProductEntity proEnt=proRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Product"));
		model.addAttribute("product", proEnt);
		
		
		return "editproduct";
		
	}
    
    @RequestMapping(value="update/{id}",method=RequestMethod.POST)
	public String updateStudent(@PathVariable long id,@Valid ProductEntity product,BindingResult result,Model model)
	{
	if(result.hasErrors())
	{
		product.setPid(id);
		return "editproduct";
	}
	proRepo.save(product);
	
	List<ProductEntity>addProducts=proRepo.findAll();
	model.addAttribute("addProducts", addProducts);
	
	return "viewproduct";
	}
	
	@RequestMapping("delete/{id}")
	public String deleteStudentForm(@PathVariable("id")  long id,Model model) {	
	ProductEntity proEnt=	proRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Student"));
	proRepo.delete(proEnt);	
	
	List<ProductEntity>addProducts=proRepo.findAll();
	model.addAttribute("addProducts", addProducts);
		return "viewproduct";
		
	}
}
