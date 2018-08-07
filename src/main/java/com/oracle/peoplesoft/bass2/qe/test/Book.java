package com.oracle.peoplesoft.bass2.qe.test;

public class Book {

	public Book() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Book(String bookNo, String title, String author, double price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	private String bookNo;
	private String title;
	private String author;
	private double price;
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}
