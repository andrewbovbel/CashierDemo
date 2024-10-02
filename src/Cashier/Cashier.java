package Cashier;

public class Cashier {
	
	private int total = 0;
	
	
	
	public Cashier(Cart cart) {
		for (Book book : cart) {
			total += book.getPrice();
		}
	}
	
	public int getTotal() {
		return total;
	}

}
