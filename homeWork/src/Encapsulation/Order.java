package Encapsulation;

public class Order {
 private int orderId;
 private String dishName;
 private boolean isCompleted=false;

public int getOrderId() {
    return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}


public String getDishName() {
    return dishName;
}

public void setDishName(String dishName) {
	this.dishName = dishName;
}


public boolean getOrderStatus() {
    return isCompleted;
}

public void setOrderStatus() {
	isCompleted=true;
	
    if (isCompleted) {
		System.out.println("Заказ готов");
	} else {
		System.out.println("Заказ не готов");
	}
}


}
