package firstJavaProject;

public class Rectangle {
	
		int width;
	    int height;
	    
	    public Rectangle(int width, int height) {
	        this.width = width;
	        this.height = height;
	    }
	    public int calculate() {
	        return width * height;
	    } 
	   
	    public static void main(String[] args) {
	    	Rectangle rec = new Rectangle(10,8);       
	    	
	         
	         System.out.println("Площадь прямоугольника: " + rec.calculate());
	    }
	    
	}


