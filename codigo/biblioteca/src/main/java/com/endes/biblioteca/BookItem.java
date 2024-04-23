package com.endes.biblioteca;

import java.util.List;

public class BookItem extends Book{
	
	
	private String barcode;
	private String tag;
	private Boolean isReferenceOnly;
	private boolean isReserved=false;
	private boolean isBorrowed=false;
	
	public BookItem(String isbn, String title, List<Author> author, String summary, String publisher,
			Integer publication_date, Integer number_of_pages, String language) {
		super(isbn, title, author, summary, publisher, publication_date, number_of_pages, language);
		// TODO Auto-generated constructor stub
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Boolean getIsReferenceOnly() {
		return isReferenceOnly;
	}

	public void setIsReferenceOnly(boolean isReferenceOnly) {
		this.isReferenceOnly = isReferenceOnly;
	}

	public Boolean getIsReserved() {
		return isReserved;
	}

	public void setIsReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	public Boolean getIsBorrowed() {
		return isBorrowed;
	}

	public void setIsBorrowed(Boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}

	
		
	
}
