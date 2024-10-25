package com.example.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.BookEntity;
import com.example.model.Book;
import com.example.repo.BookRepo;
import com.example.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepo daoImpl;
	@Override
	public boolean saveBook(Book book) {
		
		boolean flag=false;
		// TODO Auto-generated method stub
		BookEntity bookEn=new BookEntity();
		/*
		 * System.out.println(book);
		 * 
		 * //copy data from binding objrct to entity object
		 * BeanUtils.copyProperties(book, bookEn); BookEntity
		 * savedEntity=daoImpl.save(bookEn);
		 * 
		 * System.out.println(savedEntity);
		 * return savedEntity.getBookId()!=null;
		 */
		
		bookEn.setBookname(book.getBookname());
		bookEn.setAuthorname(book.getAuthorname());
		bookEn.setBookprice(book.getBookprice());
		
		BookEntity savedEn=daoImpl.save(bookEn);
		
		if(savedEn!=null)
			flag=true;
		
		
		return flag;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<BookEntity> bookDetails=daoImpl.findAll();
		
		List<Book> books=new ArrayList<Book>();
		
		/*
		 * bookdetails.forEach(entity->
		 * 
		 * { Book b=new Book(); BeanUtils.copyProperties(entity, b);
		 * 
		 * books.add(b); } );
		 */
		
		for(BookEntity bookEn: bookDetails) {
			
			Book b=new Book();
			
			b.setBookname(bookEn.getBookname());
			b.setAuthorname(bookEn.getAuthorname());
			b.setBookprice(bookEn.getBookprice());
			
			books.add(b);
		}
		return books;
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		Optional<BookEntity> findById = daoImpl.findById(id);
		BookEntity bookEn=	findById.get();
		
		Book book=new Book();
		BeanUtils.copyProperties(bookEn, book);
		
		return book;
	}

	@Override
	public boolean updateBook(Book st) {
		// TODO Auto-generated method stub
		System.out.println(st.getBookid()+"service Impl");
		Optional<BookEntity> findById = daoImpl.findById(st.getBookid());
		BookEntity bookEn=	findById.get();
		
		BeanUtils.copyProperties(st, bookEn);
		System.out.println(bookEn.getBookid()+"entity");
		
		
		
		
		return daoImpl.save(bookEn)!=null;
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
       daoImpl.deleteById(id);
		
		System.out.println("Given Id is Deleted");
	}

}
