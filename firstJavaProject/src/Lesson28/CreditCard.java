package Lesson28;

public  class  CreditCard implements Payment {
 
	public void pay(double amount) {
     System.out.println("Оплата картой на сумму " + amount);  
  }
 
   public void refund(double amount) {
       System.out.println("Оплата через " + amount);
   }
 
}
