package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Book;
import com.example.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping(value= {"/", "/loadForm"})
	public String loadForm(Model model) {
		
		Book b=new Book();
		model.addAttribute("book", b);
		return "addbook";
	}
	
	@PostMapping(value="/addbook")
	public String handleaddBookBth(@ModelAttribute("book") Book book,Model model)
	{
	boolean isSaved=bookService.saveBook(book);
	String msg="";
	
	if(isSaved){
		msg="Book added SuccessFully";
	}
	else
	{
		msg="Book Added is No Successfully";
	}
	model.addAttribute("msg", msg);
	return "addbook";
	}
	
	@GetMapping("/viewbooks")
		public String viewAllBook(Model model) {
			
		List<Book>booksList=bookService.getAllBooks();
		model.addAttribute("books", booksList);
		return "viewbooks";
		}
	
	@RequestMapping(value="/editstu")
	public String edit(@RequestParam int id, Model model) {
		Book book=bookService.getBookById(id);
		
		model.addAttribute("book", book);
		return "bookeditform";
	}
	
	@PostMapping(value="/editbook")
	public String editsave(@ModelAttribute("book") Book book,Model model) {
		
		System.out.println(book.getBookid()+"Controller");
		boolean isSaved =bookService.updateBook(book);
		String msg="";
		System.out.println("Welcome for updating "+ isSaved);
		
		if(isSaved) {
			msg="Book updated Record Successfully";
		}
		else {
			msg="Book Updated Record is not SuccessFully";
		}
		model.addAttribute("msg", msg);
		return "redirect:/viewbook";
	}
	
	
	public String deleteBookId(@RequestParam("id") Integer id,Model model) {
		
		bookService.deleteBook(id);
		return "redirect:/viewbooks";
				
	}
	
}

