package Cashier;

public class Main {

	public static void main(String[] args) {
		
		Book crimeAndPunishment = new Book(20, "Crime and Punishment", "Sad", "Doedovesky");

		//will not count the book due to misspelled title
		Book invalidBook = new Book(20, "Crime and Punishmentt", "Sad", "Doedovesky");
		Book winnie = Catalogue.winnie;
		Cart cart = new Cart();
		
		cart.add(crimeAndPunishment);
		cart.add(invalidBook);
		cart.add(winnie);
		
		Cashier cashier = new Cashier(cart);
		
		System.out.println(cashier.getTotal());


	}

}
