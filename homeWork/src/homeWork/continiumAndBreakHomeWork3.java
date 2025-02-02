package homeWork;

import java.util.Scanner;


public class continiumAndBreakHomeWork3 {
	  public static void main(String[] args) {
		  
//		  Задание 3: Игра: Найди минимальное число
//		  Задание: Пользователь вводит 5 чисел. Напишите программу, которая:
//
//		  Находит минимальное число среди введенных.
//		  Выводит минимальное число на экран.
		  
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("Введите 5 чисел: ");
	        int min = scanner.nextInt();

	        for (int i = 1; i < 5; i++) {
	            int num = scanner.nextInt();
	            if (num < min) {
	                min = num;
	            }
	        }

	        System.out.println("Самое минимальное число: " + min);
	        
	        scanner.close();
		  
	  }

}
