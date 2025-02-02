package StringBuilder;

public class mainBook {
	public static void main(String[] args) {
		   Book[] books = new Book[3];
		   
		   books[0] = new Book("1984", "Джордж Оруэлл");
		   books[1] = new Book("Убийца жуков", "Чак Паланик");
	       books[2] = new Book("Мастер и Маргарита", "Михаил Булгаков");

	
		   for (int i = 0; i < books.length; i++) {
	            System.out.println(books[i].getBookInfo());
	        }
		   
		   
	}


}
