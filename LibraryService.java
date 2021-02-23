package com.springboot.mvc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mvc.model.Author;
import com.springboot.mvc.model.Book;

@Service
public class LibraryService {
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	public String addAuthor(){
		
		
		
		Book book =null;
		Author auth=null;
		
		for(int i=1;i<=1000;i++)
		{
		
		book = new Book();
		book.setBookname("Java 12 Fundamentals"+i);
		auth = new Author("AbhishekKumar"+i,i,"Professor"+i);
		//auth.setBooks(book);
		book.setAuthor(auth);
		auth.setBooks(book);
		bookRepository.save(book);
		authorRepository.save(auth);
		}
		return "Saved Successfully";
	}
	
	
	
	
}
