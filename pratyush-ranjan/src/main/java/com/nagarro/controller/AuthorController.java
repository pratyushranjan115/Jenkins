package com.nagarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.model.Author;
import com.nagarro.service.AuthorService;

@RestController
@RequestMapping("/api")
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	
	@GetMapping("/author")
	public List<Author> get(){
		return authorService.get();
		
	}
	
	@PostMapping("/author")
	public Author save(@RequestBody Author authorObj) {
		authorService.save(authorObj);
		return authorObj;		
	}
	
	@GetMapping("/author/{id}")
	public Author get(@PathVariable int id){
		Author authorObj = authorService.get(id);
		if(authorObj == null) {
			throw new RuntimeException("Author with id"+id+" is not found");
		}
		return authorObj;				
	}
	
	@DeleteMapping("/author/{id}")
	public String delete(@PathVariable int id) {
		authorService.delete(id);
		return "Author has been deleted with id:"+id;
	}
	
	@PutMapping("/author")
	public Author update(@RequestBody Author authorObj) {
		authorService.save(authorObj);
		return authorObj;
	}

}
