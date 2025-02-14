package OOP;


public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(11);
		Shape rectangle = new Rectangle(7, 2);
		
		System.out.println(circle.area());
        System.out.println(circle.perimeter());

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
	
	}
}

