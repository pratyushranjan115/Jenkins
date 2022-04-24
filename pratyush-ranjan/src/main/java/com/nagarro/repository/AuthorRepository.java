package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.model.Author;

public interface AuthorRepository extends JpaRepository<Author,Integer>{
	

}
