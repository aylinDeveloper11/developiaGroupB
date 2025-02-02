package homeWork;

import java.util.Scanner;

public class arithmeticOperationsHomeWork2 {
	public static void main(String[] args) {
		
		//Задание 2 : Напишите программу, которая увеличивает каждое из двух введённых чисел на 7 и выводит их сумму.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первое число");
		
		int number = scanner.nextInt();
		
		System.out.println("Введите второе число");
		int number2= scanner.nextInt();
		
		System.out.println("Увелечение первого числа");
		number+=7;
		System.out.println(number);

		
		System.out.println("Увелечение второго числа");
		number2+=7;
		System.out.println(number2);

		
		System.out.println("Сумма двух увеличённых чисел");
		
	    System.out.println(number+number2);
	

	    scanner.close();
		
		
		
		
		
		
		
	}
}
