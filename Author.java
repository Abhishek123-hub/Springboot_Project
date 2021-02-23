package com.springboot.mvc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AUTHORS")
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long authorid;
	private String authorname;
	private int authornumber;
	private String position;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bookid")
	private Book books;
	
	public Author(String authorname, int authornumber, String position) {
		this.authorname = authorname;
		this.authornumber = authornumber;
		this.position = position;
	}
	
	public Long getAuthorid() {
		return authorid;
	}
	public void setAuthorid(Long authorid) {
		this.authorid = authorid;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getAuthornumber() {
		return authornumber;
	}
	public void setAuthornumber(int authornumber) {
		this.authornumber = authornumber;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public Book getBooks() {
		return books;
	}

	public void setBooks(Book books) {
		this.books = books;
	}

	public Author() {
	}
	
	
}
