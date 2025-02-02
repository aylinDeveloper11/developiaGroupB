package Repeat;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car("Toyota", 84);
		 System.out.println("начальная скорость: " + myCar.speed);

		
		 myCar.accelerate(60);
		 
		 System.out.println("Новая скорость: " + myCar.speed);
		
		
	}
}