package com.example.review2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_details")
public class LibraryProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookid;
	private String bcompany;
	
	 
	public LibraryProduct(int bookid, String bcompany) {
		super();
		this.bookid = bookid;
		this.bcompany = bcompany;
	}


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBcompany() {
		return bcompany;
	}


	public void setBcompany(String bcompany) {
		this.bcompany = bcompany;
	}

	public LibraryProduct()
	{
		
	}

}