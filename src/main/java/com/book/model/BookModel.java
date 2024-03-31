package com.book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class BookModel {
	@Id
	long bookId;
	String  bookPublishedDate;
	String bookName;
	Double bookPrice;
	String authorName;
	
	
	public BookModel() {
		
	}
	
	public BookModel(long bookId, String bookPublishedDate, String bookName, Double bookPrice, String authorName) {
		super();
		this.bookId = bookId;
		this.bookPublishedDate = bookPublishedDate;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
	}


	public long getBookId() {
		return bookId;
	}


	public void setBookId(long bookId) {
		this.bookId = bookId;
	}


	public String getBookPublishedDate() {
		return bookPublishedDate;
	}


	public void setBookPublishedDate(String bookPublishedDate) {
		this.bookPublishedDate = bookPublishedDate;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public Double getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
	
	
}
