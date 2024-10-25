package com.example.service;

import java.util.List;

import com.example.model.Book;

public interface BookService {

	public boolean saveBook(Book book);
	public List<Book> getAllBooks();
	
	public Book getBookById(int id);
	public boolean updateBook(Book st);
	
	public void deleteBook(int id);
	
}
