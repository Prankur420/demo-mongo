package com.demo.mongo.project.jpa;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Document for the books collection in MongoDB
 * 
 * @author prank
 */
@Document("Books")
public class Books implements Serializable {

	private static final long serialVersionUID = 8547455393668864768L;
	
	@Id
	@Field(name = "_id")
	private Integer bookId;
	
	@Field(name = "BookName")
	private String bookName;
	
	@Field(name = "Author")
	private String author;
	
	@Field(name = "YearOfRelease")
	private Integer yearOfRelease;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(final Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(final String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(final String author) {
		this.author = author;
	}

	public Integer getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(final Integer yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
}
