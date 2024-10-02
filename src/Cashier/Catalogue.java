package Cashier;

public class Catalogue {
	
	public static Book crime = new Book(20, "Crime and Punishment", "Sad", "Doedovesky");
	public static Book nineteen = new Book(10, "1984", "Dystopia", "Orwell");

	public static Book dorian = new Book(10, "Picture of Dorian Gray", "Decadence", "Oscar Wilde");
	public static Book winnie = new Book(15, "Winnie the Pooh", "Family", "Shepard");

	
    public static Book[] getBooks() {
 
        Book[] books = new Book[4];

        books[0] = crime;
        books[1] = nineteen;
        books[2] = dorian;
        books[3] = winnie;
        
        return books;
    }
}
