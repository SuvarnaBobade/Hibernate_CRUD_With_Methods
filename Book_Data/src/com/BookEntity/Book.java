package com.BookEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name="BookWorld")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String book_name;
	@Column( name="Book_Price")
	private long price;
	private String author_name;

	public Book() {
		
	}

	public Book(int id, String book_name, long price, String author_name) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.price = price;
		this.author_name = author_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", book_name=" + book_name + ", price=" + price + ", author_name=" + author_name
				+ "]";
	}

}
