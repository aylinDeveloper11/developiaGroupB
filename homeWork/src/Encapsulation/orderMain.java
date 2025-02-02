package Encapsulation;

public class orderMain {
	public static void main(String[] args) {
		  Order order1 = new Order();
	        Order order2 = new Order();
	        Order order3 = new Order();
      
      order1.setDishName("Пицца");
      order1.setOrderId(1);
      order1.setOrderStatus();
      order2.setDishName("Цезарь");
      order2.setOrderId(2);
      order2.setOrderStatus();
      order3.setDishName("Суши");
      order3.setOrderId(3);
      order3.setOrderStatus();

    System.out.println(order1.getDishName() + " " + order1.getOrderId() + " " + order1.getOrderStatus());

      
      

		
	}

}