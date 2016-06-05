package com.library.management.modal;

import java.math.BigInteger;

import com.library.management.enums.BOOKSTATUS;

public class Book {
	private int bookId;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWritterName() {
		return writterName;
	}

	public void setWritterName(String writterName) {
		this.writterName = writterName;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public BigInteger getBookCost() {
		return bookCost;
	}

	public void setBookCost(BigInteger bookCost) {
		this.bookCost = bookCost;
	}

	public BOOKSTATUS getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(BOOKSTATUS bookStatus) {
		this.bookStatus = bookStatus;
	}

	private String bookName;
	private String content;
	private String writterName;
	private Publisher publisher;
	private BigInteger bookCost;
	private BOOKSTATUS bookStatus;

}
