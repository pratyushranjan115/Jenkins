package com.nagarro.service;

import java.util.List;

import com.nagarro.model.Book;

public interface BookService {	
    List<Book> get(); 
	
	Book get(int id);
	
	void save(Book book);
	
	void delete(int id);

}
