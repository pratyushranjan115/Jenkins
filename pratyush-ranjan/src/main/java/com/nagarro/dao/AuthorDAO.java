package com.nagarro.dao;

import java.util.List;

import com.nagarro.model.Author;

public interface AuthorDAO {
	
    List<Author> get(); 
	
	Author get(int id);
	
	void save(Author author);
	
	void delete(int id);

}
