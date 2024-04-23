package com.endes.biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library {
	private String name;
	private String addres;
	private Catalog catalog;
	private List<BookItem> books =new ArrayList<>();
	private Set<Account> account= new HashSet <Account>();
	public void addBook(BookItem bookItem) {
		this.books.add(bookItem);
	}
	
}
