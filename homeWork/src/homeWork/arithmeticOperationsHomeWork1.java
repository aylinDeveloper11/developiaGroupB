package homeWork;

import java.util.Scanner;

public class arithmeticOperationsHomeWork1 {
	public static void main(String[] args) {
		
		//Задание 1: Создайте программу, которая возводит введённое число в квадрат и уменьшает результат на 15.
		
		Scanner scanner = new Scanner(System.in);
         System.out.println("Введите число");
		
         int number = scanner.nextInt(); 
         
        System.out.println("Квадрат числа");
 		number*=number;
 		System.out.println(number);

 		
		System.out.println("Итоговый ответ: ");
		
	    System.out.println(number-15);
         
	    scanner.close();
		
		
		
	}
}
