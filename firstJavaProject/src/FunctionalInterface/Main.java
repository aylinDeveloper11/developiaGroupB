package FunctionalInterface;

public class Main {
public static void main(String[] args) {
	Calculator addCalculator = (a,b) -> a + b;
	
	Calculator substractCalculator = (a,b) -> a - b;
	
	Calculator multiplayCalculator = (a,b) -> a * b;
	
	Calculator divideCalculator = (a,b) -> a / b;
	
	System.out.println(addCalculator.calculator(1244, 50));
	System.out.println(divideCalculator.calculator(3857, 235));
	System.out.println(multiplayCalculator.calculator(30, 6));
	System.out.println(substractCalculator.calculator(2, 2));
	    }
   
  }
