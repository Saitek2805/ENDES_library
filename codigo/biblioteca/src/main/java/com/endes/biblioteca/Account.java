package com.endes.biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
	private Integer number;
	private String history;
	private Date opened;
	private AccounState state;
	private BookItem [] borrowed =new BookItem[12];
	private BookItem [] reserved =new BookItem[3];
	
	
}
