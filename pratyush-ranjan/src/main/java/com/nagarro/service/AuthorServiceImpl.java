package com.nagarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.dao.AuthorDAO;
import com.nagarro.model.Author;

@Service
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	private AuthorDAO authorDAO;

	@Transactional
	@Override
	public List<Author> get() {
		return authorDAO.get();
	}
     
	@Transactional
	@Override
	public Author get(int id) {
		 return authorDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Author author) {
		authorDAO.save(author);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		authorDAO.delete(id);
		
	}

}
