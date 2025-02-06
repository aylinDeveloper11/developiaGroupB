package classObj3;

public class Main {
	public static void main(String[] args) {
		 Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
	        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
	        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);

	        System.out.println(book1.toString());
	        System.out.println(book2.toString());

	        System.out.println(book1.equals(book2));
	        System.out.println(book1.equals(book3));
		
	}
}
