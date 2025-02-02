package homeWork;

import java.util.Scanner;

public class mathLibraryHomeWork2 {

	  public static void main(String[] args) {
//		  Задание 2: Минимум и максимум двух чисел
//		  Условие:
//		  Напишите программу, которая принимает два числа, сравнивает их и выводит:
//
//		  Минимальное из двух чисел.
//		  Максимальное из двух чисел.
		  
		  Scanner scanner = new Scanner(System.in);
		
		  
	        System.out.println("Введите первое число: ");
	        int number1 = scanner.nextInt();
	        System.out.println("Введите второе число: ");
	        int number2 = scanner.nextInt();

	        System.out.println("Максимальное число: " + Math.max(number1, number2));
	        System.out.println("Минимальное число: " + Math.min(number1, number2));

           scanner.close();
	        
		  
	  }
}
