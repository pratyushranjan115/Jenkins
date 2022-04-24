package com.nagarro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@CrossOrigin
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String author_name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "BookAuthor_Fid", referencedColumnName = "id")
	private List<Book> book;

	public Author() {

	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", author_name=" + author_name + ", book=" + book + "]";
	}
	
	public Author(String authorname) {
		this.author_name = author_name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	

	
	
	
	
	
	


}
