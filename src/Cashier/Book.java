package Cashier;

import java.util.Objects;

public class Book {
	
	private int price;
	private String title;
	private String genre;
    private String author;

	
	public Book(int price, String title, String genre, String author) {
		this.price = price;
		this.title = title;
		this.genre = genre;
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		 if (obj == null || getClass() != obj.getClass()) {  // Check if the object is null or of different class
	            return false;
	     }
		 
		 Book book = (Book) obj;

	        // Check if all the fields are equal
	        return price == book.price &&
	               Objects.equals(title, book.title) &&
	               Objects.equals(genre, book.genre) &&
	               Objects.equals(author, book.author);
	}
	
	
	

}
