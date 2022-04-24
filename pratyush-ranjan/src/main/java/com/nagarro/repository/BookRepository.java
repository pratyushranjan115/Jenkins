package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
