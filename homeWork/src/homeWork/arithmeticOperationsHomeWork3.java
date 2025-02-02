package homeWork;

import java.util.Scanner;

public class arithmeticOperationsHomeWork3 {
	public static void main(String[] args) {
		//Задание 3: Напишите программу, которая проверяет, равны ли два числа.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первое число");
		
		int number = scanner.nextInt();
		
		System.out.println("Введите второе число");
		int number2= scanner.nextInt();
		
		System.out.println("Равны ли эти числа");
		 System.out.println(number == number2);
		
		
		 scanner.close();
		 
	}

}
