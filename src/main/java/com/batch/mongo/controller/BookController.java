package com.batch.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.batch.mongo.model.Book;
import com.batch.mongo.repo.BookRepo;

@RestController
public class BookController {
	
	@Autowired
	private BookRepo bookRepo;
	
	@PostMapping("/addBook")
	public String save(@RequestBody Book book) {
		bookRepo.save(book);
		return "Added Succesfully";
	}
	
	@GetMapping("/get")
	public List<Book> getall(){
		return bookRepo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id ) {
		bookRepo.deleteById(id);
		return "Deleted ";
	}

}
