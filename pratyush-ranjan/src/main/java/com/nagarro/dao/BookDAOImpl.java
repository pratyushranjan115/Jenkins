package com.nagarro.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.model.Book;

@Repository
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Book> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Book> query = currentSession.createQuery("from Book",Book.class);
		List<Book> list =  query.getResultList();
		return list;
	}

	@Override
	public Book get(int id) {
	  Session currentSession = entityManager.unwrap(Session.class);
	  Book bookObj=currentSession.get(Book.class,id);
	  return bookObj;
		
	}

	@Override
	public void save(Book book) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(book);
		
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Book bookObj = currentSession.get(Book.class, id);
		currentSession.delete(bookObj);
	}

}
