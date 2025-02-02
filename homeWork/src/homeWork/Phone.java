package homeWork;

public class Phone {
	String model;
	String color;
	int price;
	
	  public Phone(String model, String color, int price) {
	        this.model = model;
	        this.color = color;
	        this.price = price;
	    }

	 
	    public Phone(String model, String color) {
	        this.model = model;
	        this.color = color;
	        this.price = 1000; 
	    }
	    
	    
	    
	    public static void main(String[] args) {
	       
	        Phone phone1 = new Phone("Galaxy S24", "Черный", 1200);
	        Phone phone2 = new Phone("iPhone 15", "Белый");

	        System.out.println("Модель: " + phone1.model + ", Цвет: " + phone1.color + ", Цена: " + phone1.price);
	        System.out.println("Модель: " + phone2.model + ", Цвет: " + phone2.color + ", Цена: " + phone2.price);

	    }

}
