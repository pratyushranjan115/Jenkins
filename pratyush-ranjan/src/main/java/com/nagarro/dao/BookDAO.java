package com.nagarro.dao;

import java.util.List;

import com.nagarro.model.Book;

public interface BookDAO {

	
	List<Book> get(); 
	
	Book get(int id);
	
	void save(Book book);
	
	void delete(int id);
}
