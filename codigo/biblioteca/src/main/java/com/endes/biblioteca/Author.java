package com.endes.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String biography;
    private List<Book> written =new ArrayList<Book>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public Author(String name, String biography) {

		this.name = name;
		this.biography = biography;
	}

    // Constructor, getters y setters aquí
    
}
