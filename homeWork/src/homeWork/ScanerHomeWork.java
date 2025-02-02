package homeWork;

import java.util.Scanner;

public class ScanerHomeWork {
	public static void main(String[] args) {


		  Scanner input = new Scanner(System.in);
	        
		
	        System.out.println("Введите строку: ");
	       
	        String word = input.nextLine();
		      
	        
	        String trimmed = word.trim();
	        
	        String upperCase = trimmed.toUpperCase();
	        
	        String result = upperCase.replace(" ", "-");
	        
	        System.out.println("Результат: " + result);
	        
	        input.close();
		
		
		
		
		
		
		
		
		
		
	}
}
