package com.demo.mongo.project.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.mongo.project.jpa.Books;

/**
 * Repository for the books 
 * 
 * @author prank
 */
@Repository
public interface BooksRepository extends MongoRepository<Books, String>{

	/**
	 * Repository method to get books by book name
	 * 
	 * @param author
	 * @return
	 */
	public List<Books> findByBookNameLike(final String bookName);
}
