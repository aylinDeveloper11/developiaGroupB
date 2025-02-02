package Inheritance;

public class Main {
	  public static void main(String[] args) {
	        Phone phone = new Phone();
	        Laptop laptop = new Laptop();
	        
	        phone.brand = "Samsung";
	        laptop.brand = "Lenovo";
	        
	        phone.turnOn();
	        laptop.turnOn();
	    }
	
	
}
