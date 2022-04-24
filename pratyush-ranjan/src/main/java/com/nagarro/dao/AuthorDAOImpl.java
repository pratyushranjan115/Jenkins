package com.nagarro.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.model.Author;
import com.nagarro.model.Book;

@Repository
public class AuthorDAOImpl implements AuthorDAO {
	
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Author> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Author> query = currentSession.createQuery("from Author",Author.class);
		List<Author> list =  query.getResultList();
		return list;
	}

	@Override
	public Author get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		  Author authorObj=currentSession.get(Author.class,id);
		  return authorObj;
	}

	@Override
	public void save(Author author) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(author);
		
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Author authorObj = currentSession.get(Author.class, id);
		currentSession.delete(authorObj);
		
	}

}
