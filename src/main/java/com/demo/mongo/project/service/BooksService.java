package com.demo.mongo.project.service;

import java.util.List;

import com.demo.mongo.project.jpa.Books;

/**
 * Service interface to fetch, create and update the books details
 * 
 * @author prank
 */
public interface BooksService {

	/**
	 * Service implementation to find all the books
	 * 
	 * @return
	 */
	public List<Books> findAll();

	/**
	 * Service implementation to create a document in MongoDb
	 * 
	 * @param books
	 * @return
	 */
	public Books create(final Books books);

	/**
	 * Service Implementation to get books by book name
	 * 
	 * @param bookName
	 * @return
	 */
	List<Books> getBooksByName(final String bookName);
	
}
