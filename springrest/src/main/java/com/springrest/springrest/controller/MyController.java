package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Book;
import com.springrest.springrest.services.BookService;

@RestController
public class MyController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/home")
	public String home()
	{
		return "This is homepage";
	}
	
	//get the books
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		return this.bookService.getBooks();
	}
	
	@GetMapping("/books/{bookId}")
	public Book getBook(@PathVariable String bookId) {
		return this.bookService.getBook(Long.parseLong(bookId));
	}

}
