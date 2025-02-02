package classObj2;

public class Main {
public static void main(String[] args) {
	  Car myCar = new Car("Toyota", "Camry", 2021);
	  
	  System.out.println(myCar);

	  myCar.setBrand("Mercedes-Benz");
      myCar.setModel("S-Class");
      myCar.setYear(2023);
      
      System.out.println(myCar);

}
}
