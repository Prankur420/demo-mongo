package com.demo.mongo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mongo.project.jpa.Books;
import com.demo.mongo.project.service.BooksService;

/**
 * Controller class to fetch to publish data from books
 * 
 * @author prank
 */
@RestController
public class BooksController {
	
	private BooksService booksService;
	
	@Autowired
	public BooksController(final BooksService booksService) {
		this.booksService = booksService;
	}

	/**
	 * Controller method to find all the books from DB
	 * 
	 * @return
	 */
	@GetMapping(value = "/books/findall")
	public ResponseEntity<List<Books>> findAllBooks() {
		return new ResponseEntity<>(booksService.findAll(), HttpStatus.OK);
	}
	
	/**
	 * Controller method to create books document entry in MongoDb
	 * 
	 * @param books
	 * @return
	 */
	@PostMapping(value = "/books/create")
	public ResponseEntity<Books> createNewEntry(@RequestBody final Books books) {
		return new ResponseEntity<>(booksService.create(books),HttpStatus.OK);
	}
	
	/**
	 * Method to fetch books by book name
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping(value = "/books/findbybookname")
	public ResponseEntity<List<Books>> findByBookName(@RequestParam("name") final String name) {
		return new ResponseEntity<>(booksService.getBooksByName(name), HttpStatus.OK);
	}
}
