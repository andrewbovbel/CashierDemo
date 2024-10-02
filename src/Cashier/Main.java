package Cashier;

public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		System.out.println("HI");
		
		Book crimeAndPunishment = new Book(20, "Crime and Punishment", "Sad", "Doedovesky");
	
		Book lolz = new Book(20, "Crime and Punishmentt", "Sad", "Doedovesky");

		Book winnie = Catalogue.winnie;
		
		Cart cart = new Cart();
		
		cart.add(crimeAndPunishment);
		cart.add(lolz);
		cart.add(winnie);
		
		Cashier cashier = new Cashier(cart);
		
		System.out.println(cashier.getTotal());


	}

}
