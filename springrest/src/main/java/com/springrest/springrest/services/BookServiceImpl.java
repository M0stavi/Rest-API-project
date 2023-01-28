package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Book;

@Service
public class BookServiceImpl implements BookService {
	
	List<Book> list;
	public BookServiceImpl() {
		list = new ArrayList<>();
		list.add(new Book(101,"HKRB","MZI"));
		list.add(new Book(102,"DPNMT","MZI"));
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Book getBook(long bookId) {
		// TODO Auto-generated method stub
		
		Book b=null;
		for(Book book:list)
		{
			if(book.getId()==bookId)
			{
				b=book;
				break;
			}
		}
		
		return b;
	}

}
