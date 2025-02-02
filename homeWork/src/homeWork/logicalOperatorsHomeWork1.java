package homeWork;

import java.util.Scanner;

public class logicalOperatorsHomeWork1 {
	    public static void main(String[] args) {
	    	
	    	  Scanner scanner = new Scanner(System.in);
	          
	         System.out.println("Введите число:");
	          int number = scanner.nextInt();
	          
	         
	          if (number >= 1 && number <= 100) {
	              System.out.println("Число в диапазоне");
	          } else {
	              System.out.println("Число вне диапазона");
	          }
	    	
	    	scanner.close();
	    	
	    	
	    
	        }
	    
}
	
