package Repeat;

import java.util.Scanner;

public class mathematicalOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		  System.out.print("Введите первое число: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Введите второе число: ");
	        int num2 = scanner.nextInt();
	        
	        
	       if (num1 > 0 || num2 > 0) {
				 System.out.println("Хотя бы одно из чисел положительное.");
			} else {
	            System.out.println("Оба числа неположительные.");
	        }

	        scanner.close();


	}
}
