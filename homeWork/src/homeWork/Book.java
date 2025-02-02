package homeWork;

public class Book {

	String title;   
    String author;  
    int price;
    
    Book(String title,String author, int price) {
    	this.title = title;
    	this.author = author;
    	this.price = price;
    	}
    
    
    public static void main(String[] args) {
   
        Book myBook = new Book("Count of Monte Cristo","Alexandre Dumas père",16);
        
        
        System.out.println("Название: " + myBook.title);
        System.out.println("Автор: " + myBook.author);
        System.out.println("Цена: " + myBook.price);
    }
    
}
