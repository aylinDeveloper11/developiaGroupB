package firstJavaProject;

import java.util.Scanner;

public class scannerLesson2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("введите число");
		
		int number = scanner.nextInt();
		
		System.out.println("введите число");
		int number2= scanner.nextInt();
		
		System.out.println("квадрат 1-го числа");
		number*=number;
		System.out.println(number);

		
		System.out.println("квадрат 2-го числа");
		number2*=number2;
		System.out.println(number2);

		
		System.out.println("сумма");
		
	System.out.println(number+number2);
	

	
		
		
	}
}
