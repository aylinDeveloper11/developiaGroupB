package OOP;

public class Circle implements Shape {
	 private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    
	    public double area() {
	    	return radius * 3.14 * radius;
	    }
	    
	    public double perimeter() {
	        return 2 * 3.14 * radius;    
	    }

}
