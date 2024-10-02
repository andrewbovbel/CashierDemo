package Cashier;

import java.util.*;

public class Cart implements Iterable<Book>{
	private List<Book> cart;
	
	public Cart() {
		this.cart = new ArrayList<Book>();
	}
	
	private Boolean contains(Book book) {
		
		for (int i = 0; i < Catalogue.getBooks().length ; i++) {
			if (Catalogue.getBooks()[i].equals(book) ) {
				return true;
			}
		}
		
		return false;
	}
	
	public void add(Book book) {
		if (contains(book)) {
			cart.add(book);
		}
	}
	
	@Override
    public Iterator<Book> iterator() {
        return cart.iterator();  // Returns the iterator for the ArrayList
    }
}
