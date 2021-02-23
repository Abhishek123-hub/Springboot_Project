package com.springboot.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mvc.model.Author;
import com.springboot.mvc.model.Book;
import com.springboot.mvc.repository.LibraryService;

@RestController
public class LibraryController {

	@Autowired
	LibraryService service;
	
	@GetMapping("/adddata")
	public String addAuthor(){
		
		return service.addAuthor();
		
	}
	
	
	
}
