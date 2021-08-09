package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Library {
	
	private int isbn;
	private String author;
	private double price;
	private Category category;
	private int quantity;
	private Date publish_date;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	
	public Library(int isbn, String author, double price, Category category, int quantity, Date publish_date) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.publish_date = publish_date;
	}
	
	public Library(int isbn) {
		super();
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return "[isbn=" + isbn + ", author=" + author + ", price=" + price + ", category=" + category
				+ ", quantity=" + quantity + ", publish_date=" + sdf.format(publish_date) + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("In Library equals");
		if(obj instanceof Library)
			return this.isbn==((Library)obj).isbn;
		return false;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public static void setSdf(SimpleDateFormat sdf) {
		Library.sdf = sdf;
	}
	
	
	
	
	

}
