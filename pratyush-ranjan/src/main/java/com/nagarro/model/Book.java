package com.nagarro.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@CrossOrigin
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	@Column(unique = true)
	private int book_code;
	private String book_name;
	private String author;
	private Date date;

	public Book(long id, int book_code, String book_name, String author, Date date) {
		super();
		this.id = id;
		this.book_code = book_code;
		this.book_name = book_name;
		this.author = author;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", book_code=" + book_code + ", book_name=" + book_name + ", author=" + author
				+ ", date=" + date + "]";
	}

	
	public Book()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getBook_code() {
		return book_code;
	}

	public void setBook_code(int book_code) {
		this.book_code = book_code;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
	
	
	

}
