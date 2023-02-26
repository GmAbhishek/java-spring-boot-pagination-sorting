package com.example.review2;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "book")
public class Library2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookid;

	  
	private String bookname;
	  
	  
	private String bauthor;
	  
	  
	private String bcategory;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private LibraryProduct product;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public String getBcategory() {
		return bcategory;
	}
	public void setBcategory(String bcategory) {
		this.bcategory = bcategory;
	}
	public LibraryProduct getProduct() {
		return product;
	}
	public void setProduct(LibraryProduct product) {
		this.product = product;
	}
	
	public Library2(int bookid, String bookname, String bauthor, String bcategory, LibraryProduct product) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bauthor = bauthor;
		this.bcategory = bcategory;
		this.product = product;
	}
	@Override
	public String toString() {
		return "Library2 [bookid=" + bookid + ", bookname=" + bookname + ", bauthor=" + bauthor + ", bcategory="
				+ bcategory + "]";
	}
	public Library2()
	{
		
	}

}