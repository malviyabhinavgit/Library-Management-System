package com.library.management.dao;

import java.util.List;

import com.library.management.enums.BOOKSTATUS;
import com.library.management.modal.Book;

public interface IBookDao {
	
	List<Book> getAllBooks();
	Book getBookByBookId(int id);
	Book addBook(Book book);
	List<Book> getAllAvailableBooks();
	List<Book> getBooksByPublisherName();
	List<Book> getBooksByWriterName();
	List<Book> getBooksByBookName(String bookName);
	List<Book> getBooksByStatus(BOOKSTATUS bs);
	

}
