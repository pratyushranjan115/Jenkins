package com.nagarro.service;

import java.util.List;

import com.nagarro.model.Author;

public interface AuthorService {

    List<Author> get(); 
	
	Author get(int id);
	
	void save(Author author);
	
	void delete(int id);
}
