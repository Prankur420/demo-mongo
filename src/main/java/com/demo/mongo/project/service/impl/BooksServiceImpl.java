package com.demo.mongo.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mongo.project.jpa.Books;
import com.demo.mongo.project.repository.BooksRepository;
import com.demo.mongo.project.service.BooksService;

@Service
public class BooksServiceImpl implements BooksService {
	
	private BooksRepository booksRepository;
	
	@Autowired
	public BooksServiceImpl(final BooksRepository booksRepository) {
		this.booksRepository = booksRepository;
	}

	@Override
	public List<Books> findAll() {
		return booksRepository.findAll();
	}
	
	@Override
	public Books create(final Books books) {
		return booksRepository.insert(books);
	}

	@Override
	public List<Books> getBooksByName(final String bookName) {
		return booksRepository.findByBookNameLike(bookName);
	}
}
