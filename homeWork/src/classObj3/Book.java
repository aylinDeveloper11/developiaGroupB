package classObj3;

import java.util.Objects;

public class Book {
	 private String title;
	    private String author;
	    private int year;

	    public Book(String title, String author, int year) {
	        this.title = title;
	        this.author = author;
	        this.year = year;
	    }

		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(author, title, year);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return Objects.equals(author, other.author) && Objects.equals(title, other.title) && year == other.year;
		}
	    
	    
	    
	    
}
