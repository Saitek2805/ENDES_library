package com.endes.biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
	private Integer number;
	private String history;
	private Date opened;
	private AccounState state;
	private List<BookItem> books =new ArrayList<>();
	public void reserveBook() {
		((BookItem) books).setIsReserved(true);
	}
	public void borrowBook() {
		((BookItem) books).setIsBorrowed(true);
	}
	
	
}
