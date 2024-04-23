package com.endes.biblioteca;

import java.util.List;

public abstract class Book {
    private String isbn;
    private String title;
    private List<Author> author;
    private List<BookItem> books;
    private String summary;
    private String publisher;
    private Integer publication_date;
    private Integer number_of_pages;
    private String language;
	
    public Book(String isbn, String title, List<Author> author, String summary, String publisher,
			Integer publication_date, Integer number_of_pages, String language) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.summary = summary;
		this.publisher = publisher;
		this.publication_date = publication_date;
		this.number_of_pages = number_of_pages;
		this.language = language;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(Integer publication_date) {
		this.publication_date = publication_date;
	}

	public Integer getNumber_of_pages() {
		return number_of_pages;
	}

	public void setNumber_of_pages(Integer number_of_pages) {
		this.number_of_pages = number_of_pages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
    

    // Constructor, getters y setters aquí
}
