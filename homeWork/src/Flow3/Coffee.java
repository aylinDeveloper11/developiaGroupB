package Flow3;

public class Coffee {
  boolean isHave = false;
  
  synchronized void put() throws InterruptedException {
	  if (isHave == true) wait(); 
		isHave = true;
		System.out.println("Кофе готов!");
		notify();
	} 
  
  
   synchronized void get() throws InterruptedException {
	   if (isHave == false) wait();
		isHave = false;
		System.err.println("Кофе куплен!");
     	notify();
	}
}
