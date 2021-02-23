package com.springboot.mvc.repository;
	import org.springframework.data.jpa.repository.JpaRepository;

	import org.springframework.stereotype.Repository;

    import com.springboot.mvc.model.Book;
@Repository
	public interface BookRepository extends JpaRepository<Book, Long> {

		
	}

