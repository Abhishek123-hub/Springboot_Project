package com.springboot.mvc.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.springboot.mvc.model.Author;


@Repository
	public interface AuthorRepository extends JpaRepository<Author, Long> {

	
  
	}

