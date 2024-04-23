package com.endes.interfaces;

import com.endes.biblioteca.BookItem;

public interface Search {
	   BookItem searchByTitle(String title);
	   BookItem searchByAuthor(String author);
}
		