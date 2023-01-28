package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Book;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home()
	{
		return "This is homepage";
	}
	
	//get the books
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		
	}

}
