package firstJavaProject;

public class objectLesson2 {
	  public static void main(String[] args) {
		  objectLesson1 newBook = new objectLesson1();
		  
		  newBook.title = "Count of Monte Cristo";
		  newBook.author = "Alexandre Dumas père";
		  newBook.year = 1844;
		  
		  System.out.println(newBook.title + " " + newBook.author + " " + newBook.year);
	  }
}
