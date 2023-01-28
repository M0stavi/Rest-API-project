package com.springrest.springrest.entities;

public class Book {
	private long id;
	private String title;
	private String auth;
	public Book(long id, String title, String auth) {
		super();
		this.id = id;
		this.title = title;
		this.auth = auth;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", auth=" + auth + "]";
	}
	
}
