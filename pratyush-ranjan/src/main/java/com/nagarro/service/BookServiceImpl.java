package com.nagarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.dao.BookDAO;
import com.nagarro.model.Book;

@Service
public class BookServiceImpl implements BookService {
    
	@Autowired
	private BookDAO bookDAO;	
	
	@Transactional
	@Override
	public List<Book> get() {
		return bookDAO.get();
	}
     
	@Transactional
	@Override
	public Book get(int id) {
	   return bookDAO.get(id);		
	}
 
	@Transactional
	@Override
	public void save(Book book) {
		bookDAO.save(book);
	}
 
	@Transactional
	@Override
	public void delete(int id) {
       bookDAO.delete(id);		
	}

}
