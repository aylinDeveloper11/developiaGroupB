package Abstraction2;

public class Main {
	 public static void main(String[] args) {
	        CreditCardPayment creditCardPayment = new CreditCardPayment();
	        PayPalPayment payPalPayment = new PayPalPayment();

	        creditCardPayment.pay(130.75);
	        payPalPayment.pay(2134.50);
	    }
}
