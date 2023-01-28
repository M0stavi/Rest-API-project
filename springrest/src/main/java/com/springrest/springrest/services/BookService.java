package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Book;

public interface BookService {
	
	public List<Book> getBooks();
	
	public Book getBook(long bookId);

}
